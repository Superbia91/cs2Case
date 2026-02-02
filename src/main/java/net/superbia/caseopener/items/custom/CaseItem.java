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


public class CaseItem extends Item {


    public CaseItem(CaseType caseType, Properties properties) {
        super(properties);

    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player user, InteractionHand hand) {
        ItemStack stack = user.getItemInHand(hand);


        if(world.isClientSide()){
            return InteractionResultHolder.pass(stack);
            //проверка на сервер/клиент
        }

        if(user.getAbilities().instabuild){
            // проверка на креатив
            return InteractionResultHolder.success(stack);
        }else {
            stack.shrink(1);
            user.displayClientMessage(Component.literal("ВЫ ОТКРЫЛИ КЕЙС"),true);
        }

        return InteractionResultHolder.success(stack);



    }

}
