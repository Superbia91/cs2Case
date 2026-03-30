package net.superbia.caseopener.loot.pools;

import net.superbia.caseopener.common.rarity.Rarity;
import net.superbia.caseopener.items.ModItems;
import net.superbia.caseopener.loot.DropEntry;

import java.util.List;

public class ChromePool {
    public static final List<DropEntry> DROPS_CHROME = List.of(
            new DropEntry(ModItems.KERAMBIT, Rarity.KNIFE,1),
            new DropEntry(ModItems.BAYONET,Rarity.KNIFE,4),
            new DropEntry(ModItems.M9_BAYONET,Rarity.KNIFE,2),
            new DropEntry(ModItems.FLIP_KNIFE,Rarity.KNIFE,6),
            new DropEntry(ModItems.GUT_KNIFE,Rarity.KNIFE,8));



}
