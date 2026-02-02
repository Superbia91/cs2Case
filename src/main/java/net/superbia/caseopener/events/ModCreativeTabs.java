package net.superbia.caseopener.events;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.superbia.caseopener.CaseOpener;
import net.superbia.caseopener.items.ModeItems;

@Mod.EventBusSubscriber(
        modid = CaseOpener.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CaseOpener.MOD_ID);


    public static final RegistryObject<CreativeModeTab> CASEOPENER_TAB =
            CREATIVE_MODE_TABS.register("caseopener_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModeItems.TAB_ICON.get()))
                            .title(Component.translatable("creativetab.caseopener"))
                            .displayItems((params, output) -> {
                                output.accept(ModeItems.BAYONET.get());
                                output.accept(ModeItems.FLIP_KNIFE.get());
                                output.accept(ModeItems.GUT_KNIFE.get());
                                output.accept(ModeItems.KERAMBIT.get());
                                output.accept(ModeItems.M9_BAYONET.get());
                                output.accept(ModeItems.HUNTSMAN_KNIFE.get());
                                output.accept(ModeItems.FALCHION_KNIFE.get());
                                output.accept(ModeItems.BOWIE_KNIFE.get());
                                output.accept(ModeItems.BUTTERFLY_KNIFE.get());
                                output.accept(ModeItems.SHADOW_DAGGERS.get());
                                output.accept(ModeItems.NAVAJA_KNIFE.get());
                                output.accept(ModeItems.STILETTO_KNIFE.get());
                                output.accept(ModeItems.TALON_KNIFE.get());
                                output.accept(ModeItems.URSUS_KNIFE.get());
                                output.accept(ModeItems.NOMAD_KNIFE.get());
                                output.accept(ModeItems.SKELETON_KNIFE.get());
                                output.accept(ModeItems.PARACORD_KNIFE.get());
                                output.accept(ModeItems.SURVIVAL_KNIFE.get());
                                output.accept(ModeItems.CLASSIC_KNIFE.get());
                                output.accept(ModeItems.KUKRI_KNIFE.get());









                                output.accept(ModeItems.CASE_GAMMA_2.get());
                                output.accept(ModeItems.KILOWATT_CASE.get());


                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}






