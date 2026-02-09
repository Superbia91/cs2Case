package net.superbia.caseopener.items;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.superbia.caseopener.CaseOpener;
import net.superbia.caseopener.common.cases.CaseType;
import net.superbia.caseopener.items.custom.CaseItem;
import net.superbia.caseopener.items.custom.KnifeItem;

/**
 * Класс регистрации всех предметов мода.
 *
 * Здесь происходит:
 * - регистрация ножей
 * - регистрация кейсов
 * - настройка общих параметров предметов
 *
 * Этот класс — единственная точка, где Forge "узнаёт",
 * какие Item существуют в моде.
 */
public class ModeItems {

    /**
     * Общие параметры ножей.
     * Используются для всех KnifeItem, чтобы не дублировать значения.
     */
    private static final Tier KNIFE_TIER = Tiers.NETHERITE;
    private static final int KNIFE_DAMAGE_BONUS = 9;
    private static final float KNIFE_ATTACK_SPEED = -1.0f;

    /**
     * Общие свойства ножей.
     * Все ножи:
     * - не стакаются
     * - имеют прочность
     */
    private static Item.Properties knifeProps() {
        return new Item.Properties()
                .stacksTo(1)
                .durability(2500);
    }

    /**
     * DeferredRegister предметов мода.
     * Forge регистрирует все Item отсюда на этапе загрузки.
     */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CaseOpener.MOD_ID);

    // ===== Регистрация ножей =====
    // Все ножи используют KnifeItem и общие параметры выше.

    public static final RegistryObject<Item> KERAMBIT =
            ITEMS.register("kerambit",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> BAYONET =
            ITEMS.register("bayonet",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> FLIP_KNIFE =
            ITEMS.register("flipknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> GUT_KNIFE =
            ITEMS.register("gutknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> M9_BAYONET =
            ITEMS.register("m9bayonet",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> HUNTSMAN_KNIFE =
            ITEMS.register("huntsmanknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> FALCHION_KNIFE =
            ITEMS.register("falchionknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> BOWIE_KNIFE =
            ITEMS.register("bowieknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> BUTTERFLY_KNIFE =
            ITEMS.register("butterflyknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> SHADOW_DAGGERS =
            ITEMS.register("shadowdaggers",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> NAVAJA_KNIFE =
            ITEMS.register("navajaknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> STILETTO_KNIFE =
            ITEMS.register("stilettoknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> TALON_KNIFE =
            ITEMS.register("talonknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> URSUS_KNIFE =
            ITEMS.register("ursusknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> NOMAD_KNIFE =
            ITEMS.register("nomadknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> SKELETON_KNIFE =
            ITEMS.register("skeletonknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> PARACORD_KNIFE =
            ITEMS.register("paracordknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> SURVIVAL_KNIFE =
            ITEMS.register("survivalknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> CLASSIC_KNIFE =
            ITEMS.register("classicknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    public static final RegistryObject<Item> KUKRI_KNIFE =
            ITEMS.register("kukriknife",
                    () -> new KnifeItem(KNIFE_TIER, KNIFE_DAMAGE_BONUS, KNIFE_ATTACK_SPEED, knifeProps()));

    // ===== Регистрация кейсов =====
    // Каждый кейс создаётся через CaseItem и хранит свой CaseType.

    public static final RegistryObject<Item> CASE_GAMMA_2 =
            ITEMS.register("gamma2case",
                    () -> new CaseItem(
                            CaseType.GAMMA_2CASE,
                            new Item.Properties().stacksTo(1).fireResistant()
                    ));

    public static final RegistryObject<Item> KILOWATT_CASE =
            ITEMS.register("kilowatt",
                    () -> new CaseItem(
                            CaseType.KILOWATT_CASE,
                            new Item.Properties().stacksTo(1).fireResistant()
                    ));

    public static final RegistryObject<Item> REVOLUTION_CASE =
            ITEMS.register("revolutoncase",
                    () -> new CaseItem(
                            CaseType.REVOLUTION_CASE,
                            new Item.Properties().stacksTo(1).fireResistant()
                    ));

    public static final RegistryObject<Item> DREAM_NIGHTMARE_CASE =
            ITEMS.register("dreamnightmares",
                    () -> new CaseItem(
                            CaseType.DREAMS_AND_NIGHTMARES_CASE,
                            new Item.Properties().stacksTo(1).fireResistant()
                    ));

    public static final RegistryObject<Item> CHROMA_CASE =
            ITEMS.register("chromecase",
                    () -> new CaseItem(
                            CaseType.CHROMA_CASE,
                            new Item.Properties().stacksTo(1).fireResistant()
                    ));

    public static final RegistryObject<Item> SPECTRUM_2 =
            ITEMS.register("spectrum",
                    () -> new CaseItem(
                            CaseType.SPECTRUM_CASE,
                            new Item.Properties().stacksTo(1).fireResistant()
                    ));

    public static final RegistryObject<Item> HORIZON_CASE =
            ITEMS.register("horizoncase",
                    () -> new CaseItem(
                            CaseType.HORIZON_CASE,
                            new Item.Properties().stacksTo(1).fireResistant()
                    ));

    /**
     * Предмет-иконка для креативной вкладки мода.
     * Не используется в геймплее.
     */

    /**
     * Регистрация предметов в Forge EventBus.
     * Вызывается из основного класса мода.
     */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
