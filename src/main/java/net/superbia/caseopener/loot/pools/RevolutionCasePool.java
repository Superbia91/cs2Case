package net.superbia.caseopener.loot.pools;

import net.superbia.caseopener.common.rarity.Rarity;
import net.superbia.caseopener.items.ModeItems;
import net.superbia.caseopener.loot.DropEntry;

import java.util.List;

public class RevolutionCasePool {
    public static final List<DropEntry> DROPS = List.of(
            new DropEntry(ModeItems.BUTTERFLY_KNIFE, Rarity.KNIFE,1),
            new DropEntry(ModeItems.KERAMBIT, Rarity.KNIFE,1),
            new DropEntry(ModeItems.M9_BAYONET, Rarity.KNIFE,1),
            new DropEntry(ModeItems.SKELETON_KNIFE, Rarity.KNIFE,3),
            new DropEntry(ModeItems.TALON_KNIFE, Rarity.KNIFE,3),
            new DropEntry(ModeItems.HUNTSMAN_KNIFE, Rarity.KNIFE,4),
            new DropEntry(ModeItems.BOWIE_KNIFE, Rarity.KNIFE,5),
            new DropEntry(ModeItems.FALCHION_KNIFE, Rarity.KNIFE,6),
            new DropEntry(ModeItems.SHADOW_DAGGERS, Rarity.KNIFE,7),
            new DropEntry(ModeItems.NAVAJA_KNIFE, Rarity.KNIFE,8)

    );
}
