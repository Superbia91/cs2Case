package net.superbia.caseopener.loot.pools;

import net.superbia.caseopener.common.rarity.Rarity;
import net.superbia.caseopener.items.ModeItems;
import net.superbia.caseopener.loot.DropEntry;

import java.util.List;

public class ChromePool {
    public static final List<DropEntry> DROPS_CHROME = List.of(
            new DropEntry(ModeItems.KERAMBIT, Rarity.KNIFE,1),
            new DropEntry(ModeItems.BAYONET,Rarity.KNIFE,4),
            new DropEntry(ModeItems.M9_BAYONET,Rarity.KNIFE,2),
            new DropEntry(ModeItems.FLIP_KNIFE,Rarity.KNIFE,6),
            new DropEntry(ModeItems.GUT_KNIFE,Rarity.KNIFE,8));



}
