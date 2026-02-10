package net.superbia.caseopener.items.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.superbia.caseopener.common.cases.CaseType;
import net.superbia.caseopener.common.rarity.Rarity;
import net.superbia.caseopener.loot.CaseLootRegistry;
import net.superbia.caseopener.loot.DropEntry;
import net.superbia.caseopener.loot.DropRoller;
import net.superbia.caseopener.sound.CaseSounds;

/**
 * Item кейса.
 *
 * Этот класс отвечает за:
 * - хранение типа кейса (CaseType)
 * - обработку ПКМ по кейсу
 * - получение пула дропа
 * - ролл по весам
 * - выдачу награды игроку
 *
 * ВАЖНО:
 * - логика выполняется только на сервере
 * - GUI здесь нет (прямая выдача предмета)
 * - в будущем будет заменён/расширен GUI-логикой
 */
public class CaseItem extends Item {

    /**
     * Тип кейса (Gamma 2, Kilowatt и т.д.).
     * Используется для получения соответствующего пула дропа
     * из CaseLootRegistry.
     */
    private final CaseType caseType;

    public CaseItem(CaseType caseType, Properties properties) {
        super(properties);
        this.caseType = caseType;
    }

    /**
     * Обработка ПКМ по предмету кейса.
     *
     * Последовательность логики:
     * 1. Проверка client/server
     * 2. Получение ItemStack кейса в руке
     * 3. Проверка наличия пула дропа
     * 4. Проверка креатива
     * 5. Ролл дропа по весам
     * 6. Выдача награды (инвентарь / дроп в мир)
     * 7. Уменьшение количества кейсов
     */
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player user, InteractionHand hand) {

        // ItemStack кейса, по которому игрок кликнул ПКМ.
        // Именно этот стек будет уменьшен при успешном открытии кейса.
        //создание переменной результат DropRoller
        ItemStack stack = user.getItemInHand(hand);
        DropEntry result = DropRoller.giveDropRoll(CaseLootRegistry.giveMeAPoolByCaseType(caseType));

        // Вся логика открытия кейса выполняется только на сервере.
        // Клиенту просто сообщаем, что действие обработано.
        if (world.isClientSide()) {
            return InteractionResultHolder.pass(stack);
        }

        // Получаем пул дропа по типу кейса.
        // Если пул пуст — кейс считается не настроенным.
        if (CaseLootRegistry.giveMeAPoolByCaseType(caseType).isEmpty()) {
            user.displayClientMessage(
                    Component.literal("пул не настроен"),
                    true
            );
        } else {

            // В креативе кейс не расходуется и награда не выдаётся.
            if (user.getAbilities().instabuild) {
                return InteractionResultHolder.success(stack);
            } else {

                // Выполняем ролл по весам и создаём ItemStack награды.
                ItemStack issuedCase = new ItemStack(
                        DropRoller
                                .giveDropRoll(
                                        CaseLootRegistry.giveMeAPoolByCaseType(caseType)
                                )
                                .item
                                .get()
                );
                switch (result.rarity){
                    case KNIFE -> world.playSound(null, user.getX(),user.getY(),user.getZ(),CaseSounds.DROP_KNIFE.get(), SoundSource.PLAYERS, 1f,1f);
                    //TODO add all sounds
                    //TODO GUI+animation
                }
//






                // Уведомляем игрока о полученной награде.
                // Имя берётся из ItemStack (локализовано, корректно для UI).
                user.sendSystemMessage(
                        Component.literal("Вы получили ")
                                .append(issuedCase.getHoverName())
                );

                // Пытаемся добавить награду в инвентарь.
                // Если инвентарь полон — выбрасываем предмет в мир.
                if (!user.getInventory().add(issuedCase)) {


                    user.drop(issuedCase, true);
                }

                // Расходуем один кейс только после успешной логики.
                stack.shrink(1);
            }
        }

        return InteractionResultHolder.success(stack);
    }
}
