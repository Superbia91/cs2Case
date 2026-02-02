package net.superbia.caseopener;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.superbia.caseopener.events.ModCreativeTabs;
import net.superbia.caseopener.items.ModeItems;
import org.slf4j.Logger;

@Mod(CaseOpener.MOD_ID)
public class CaseOpener {

    public static final String MOD_ID = "caseopener";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CaseOpener() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // регистрация вкладки и предметов
        ModCreativeTabs.register(modEventBus);
        ModeItems.register(modEventBus);

        // слушатели
        modEventBus.addListener(this::setup);

        // общий event bus (пока можно оставить)
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
