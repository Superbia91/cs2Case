package net.superbia.caseopener.loot;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.superbia.caseopener.common.rarity.Rarity;
import net.superbia.caseopener.items.ModeItems;

public class DropEntry {
    public final RegistryObject<Item> item;
    public  final Rarity rarity;
    public final int weight;


    public DropEntry(RegistryObject<Item> item, Rarity rarity, int weight) {
        this.item = item;
        this.rarity = rarity;
        this.weight = weight;
    }
}
