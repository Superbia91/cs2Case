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

/**
 * Главный класс мода.
 *
 * Точка входа Forge:
 * - создаётся при загрузке мода
 * - регистрирует все основные системы
 * - подключает event bus’ы
 *
 * Здесь НЕ должна находиться игровая логика.
 * Этот класс отвечает только за инициализацию.
 */
@Mod(CaseOpener.MOD_ID)
public class CaseOpener {

    /**
     * modid мода.
     * Используется:
     * - при регистрации предметов
     * - в ресурсах (assets/caseopener)
     * - в аннотациях Forge
     */
    public static final String MOD_ID = "caseopener";

    /**
     * Логгер мода.
     * Используется для отладки и сообщений в консоль.
     */
    private static final Logger LOGGER = LogUtils.getLogger();

    /**
     * Конструктор мода.
     * Вызывается Forge при загрузке.
     *
     * Здесь происходит:
     * - получение MOD event bus
     * - регистрация предметов
     * - регистрация креативной вкладки
     * - подписка на события жизненного цикла
     */
    public CaseOpener() {

        // MOD event bus — используется для регистрации
        // предметов, вкладок, блоков и других контентных вещей.
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Регистрация креативной вкладки мода
        ModCreativeTabs.register(modEventBus);

        // Регистрация всех предметов мода
        ModeItems.register(modEventBus);

        // Подписка на общий этап инициализации
        modEventBus.addListener(this::setup);

        // Глобальный event bus MinecraftForge.
        // Используется для игровых событий (тик, взаимодействия и т.п.).
        // Сейчас напрямую не используется, но оставлен на будущее.
        MinecraftForge.EVENT_BUS.register(this);
    }

    /**
     * Общий этап инициализации мода.
     *
     * Вызывается на обеих сторонах (client/server).
     * Подходит для:
     * - сетапа сетевых пакетов
     * - общих систем
     *
     * Сейчас пустой, так как core-логика кейсов
     * не требует дополнительной инициализации.
     */
    private void setup(final FMLCommonSetupEvent event) {
    }

    /**
     * Клиентские события мода.
     *
     * Здесь должны находиться ТОЛЬКО client-side вещи:
     * - GUI
     * - рендеры
     * - экраны
     *
     * Сейчас класс пустой и служит заготовкой
     * для будущего GUI кейсов.
     */
    @Mod.EventBusSubscriber(
            modid = MOD_ID,
            bus = Mod.EventBusSubscriber.Bus.MOD,
            value = Dist.CLIENT
    )
    public static class ClientModEvents {

        /**
         * Клиентский этап инициализации.
         *
         * Используется для:
         * - регистрации экранов
         * - привязки GUI к меню
         *
         * Пока не используется.
         */
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }


}
