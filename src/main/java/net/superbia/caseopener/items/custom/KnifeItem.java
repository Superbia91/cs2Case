package net.superbia.caseopener.items.custom;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;

public class KnifeItem extends SwordItem {

    public KnifeItem(Tier tier, int attackDamageBonus, float attackSpeed, Item.Properties properties) {
        super(tier, attackDamageBonus, attackSpeed, properties);
    }
}
