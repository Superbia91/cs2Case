package net.superbia.caseopener.loot.pools;

import net.superbia.caseopener.common.rarity.Rarity;
import net.superbia.caseopener.items.ModeItems;
import net.superbia.caseopener.loot.DropEntry;

import java.util.List;

public class KilowattPool {
    public static final List<DropEntry> DROPS = List.of(
            new DropEntry(ModeItems.KUKRI_KNIFE, Rarity.KNIFE,10),
            new DropEntry(ModeItems.FALCHION_KNIFE,Rarity.KNIFE,10),
            new DropEntry(ModeItems.HUNTSMAN_KNIFE,Rarity.KNIFE,10),
            new DropEntry(ModeItems.BOWIE_KNIFE,Rarity.KNIFE,10),
            new DropEntry(ModeItems.SHADOW_DAGGERS,Rarity.KNIFE,10));
}
