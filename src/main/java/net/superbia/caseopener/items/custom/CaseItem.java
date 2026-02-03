package net.superbia.caseopener.items.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.superbia.caseopener.common.cases.CaseType;
import net.superbia.caseopener.loot.CaseLootRegistry;
import net.superbia.caseopener.loot.DropEntry;

import java.util.List;
import java.util.Map;


public class CaseItem extends Item {
    private final CaseType caseType;

    public CaseItem(CaseType caseType, Properties properties) {
        super(properties);
        this.caseType = caseType;
        // CaseItem хранит CaseType и использует в use

    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player user, InteractionHand hand) {
        ItemStack stack = user.getItemInHand(hand);

        if(world.isClientSide()){
            return InteractionResultHolder.pass(stack);
            //проверка на сервер/клиент
        }


        if(CaseLootRegistry.giveMeAPoolByCaseType(caseType).isEmpty()) {
            user.displayClientMessage(Component.literal("пусто"), true);

        }else{

            if(user.getAbilities().instabuild){
                // проверка на креатив
                return InteractionResultHolder.success(stack);
            }else {
                stack.shrink(1);
                user.displayClientMessage(Component.literal("ВЫ ОТКРЫЛИ КЕЙС"),true);


            }



            user.displayClientMessage(Component.literal("не пусто"+ CaseLootRegistry.giveMeAPoolByCaseType(caseType).size()),true);
        }







        return InteractionResultHolder.success(stack);







    }

}
