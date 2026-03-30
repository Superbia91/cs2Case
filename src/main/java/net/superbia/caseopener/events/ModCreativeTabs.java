package net.superbia.caseopener.events;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.superbia.caseopener.CaseOpener;
import net.superbia.caseopener.items.ModItems;

@Mod.EventBusSubscriber(
        modid = CaseOpener.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD
)
//класс для создания отдельной вкладки под мод
public class ModCreativeTabs {
    //регестрируем тип для вкладки
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CaseOpener.MOD_ID);

    //регестрируем вкладку креатива, добавляем название и иконку + все добавляем все предметы
    public static final RegistryObject<CreativeModeTab> CASEOPENER_TAB =
            CREATIVE_MODE_TABS.register("caseopener_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.CASE_GAMMA_2.get()))
                            .title(Component.translatable("creativetab.caseopener"))
                            .displayItems((params, output) -> {
                                output.accept(ModItems.BAYONET.get());
                                output.accept(ModItems.FLIP_KNIFE.get());
                                output.accept(ModItems.GUT_KNIFE.get());
                                output.accept(ModItems.KERAMBIT.get());
                                output.accept(ModItems.M9_BAYONET.get());
                                output.accept(ModItems.HUNTSMAN_KNIFE.get());
                                output.accept(ModItems.FALCHION_KNIFE.get());
                                output.accept(ModItems.BOWIE_KNIFE.get());
                                output.accept(ModItems.BUTTERFLY_KNIFE.get());
                                output.accept(ModItems.SHADOW_DAGGERS.get());
                                output.accept(ModItems.NAVAJA_KNIFE.get());
                                output.accept(ModItems.STILETTO_KNIFE.get());
                                output.accept(ModItems.TALON_KNIFE.get());
                                output.accept(ModItems.URSUS_KNIFE.get());
                                output.accept(ModItems.NOMAD_KNIFE.get());
                                output.accept(ModItems.SKELETON_KNIFE.get());
                                output.accept(ModItems.PARACORD_KNIFE.get());
                                output.accept(ModItems.SURVIVAL_KNIFE.get());
                                output.accept(ModItems.CLASSIC_KNIFE.get());
                                output.accept(ModItems.KUKRI_KNIFE.get());









                                output.accept(ModItems.CASE_GAMMA_2.get());
                                output.accept(ModItems.KILOWATT_CASE.get());
                                output.accept(ModItems.REVOLUTION_CASE.get());
                                output.accept(ModItems.DREAM_NIGHTMARE_CASE.get());
                                output.accept(ModItems.CHROMA_CASE.get());
                                output.accept(ModItems.SPECTRUM_2.get());
                                output.accept(ModItems.HORIZON_CASE.get());


                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}






