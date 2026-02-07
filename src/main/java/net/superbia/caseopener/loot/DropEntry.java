package net.superbia.caseopener.loot;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.superbia.caseopener.common.rarity.Rarity;

/**
 * DropEntry — описание одного возможного дропа из кейса.
 *
 * Это data-класс (DTO), который:
 * - не содержит логики
 * - не знает про игроков, мир или кейсы
 * - используется как элемент в пуле дропа
 *
 * DropEntry объединяет:
 * - какой предмет может выпасть
 * - какой у него уровень редкости
 * - с каким весом он участвует в ролле
 */
public class DropEntry {

    /**
     * Предмет, который может выпасть.
     *
     * Хранится как RegistryObject, потому что:
     * - предметы регистрируются через DeferredRegister
     * - гарантируется корректная работа на этапе загрузки
     *
     * При выдаче награды RegistryObject превращается в ItemStack.
     */
    public final RegistryObject<Item> item;

    /**
     * Редкость дропа (COMMON, RARE, EPIC, KNIFE и т.д.).
     *
     * Используется:
     * - для визуального отображения (цвет, текст)
     * - для баланса
     * - в будущем для GUI и анимаций
     */
    public final Rarity rarity;

    /**
     * Вес дропа.
     *
     * Это НЕ процент.
     * Вес используется при ролле дропа:
     * чем больше значение — тем выше шанс выпадения
     * относительно других DropEntry в пуле.
     */
    public final int weight;

    /**
     * Создаёт описание дропа для добавления в пул кейса.
     *
     * Все значения передаются явно,
     * логика выбора выполняется в DropRoller.
     */
    public DropEntry(RegistryObject<Item> item, Rarity rarity, int weight) {
        this.item = item;
        this.rarity = rarity;
        this.weight = weight;
    }
}
