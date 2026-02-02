package net.superbia.caseopener.loot.pools;

import net.superbia.caseopener.common.rarity.Rarity;
import net.superbia.caseopener.items.ModeItems;
import net.superbia.caseopener.loot.DropEntry;

import java.util.List;

public class Gamma2Pool {
    public static final List<DropEntry> DROPS = List.of(
            new DropEntry(ModeItems.KERAMBIT, Rarity.COMMON,10),
            new DropEntry(ModeItems.BAYONET,Rarity.RARE,20),
            new DropEntry(ModeItems.BUTTERFLY_KNIFE,Rarity.COMMON,5)
    );

}
