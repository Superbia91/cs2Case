package net.superbia.caseopener.loot.pools;

import net.superbia.caseopener.common.rarity.Rarity;
import net.superbia.caseopener.items.ModItems;
import net.superbia.caseopener.loot.DropEntry;

import java.util.List;

public class RevolutionCasePool {
    public static final List<DropEntry> DROPS = List.of(
            new DropEntry(ModItems.BUTTERFLY_KNIFE, Rarity.KNIFE,1),
            new DropEntry(ModItems.KERAMBIT, Rarity.KNIFE,1),
            new DropEntry(ModItems.M9_BAYONET, Rarity.KNIFE,1),
            new DropEntry(ModItems.SKELETON_KNIFE, Rarity.KNIFE,3),
            new DropEntry(ModItems.TALON_KNIFE, Rarity.KNIFE,3),
            new DropEntry(ModItems.HUNTSMAN_KNIFE, Rarity.KNIFE,4),
            new DropEntry(ModItems.BOWIE_KNIFE, Rarity.KNIFE,5),
            new DropEntry(ModItems.FALCHION_KNIFE, Rarity.KNIFE,6),
            new DropEntry(ModItems.SHADOW_DAGGERS, Rarity.KNIFE,7),
            new DropEntry(ModItems.NAVAJA_KNIFE, Rarity.KNIFE,8)

    );
}
