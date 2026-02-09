package net.superbia.caseopener.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.superbia.caseopener.CaseOpener;

/**
 * Регистрация всех звуков мода CaseOpener.
 * Звуки используются ТОЛЬКО как реакция на события,
 * логика выпадения дропа от них не зависит.
 */
public class CaseSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CaseOpener.MOD_ID);

    // ===== ЗВУКИ КЕЙСОВ =====

    /** Звук начала открытия кейса */
    public static final RegistryObject<SoundEvent> CASE_OPEN =
            register("case_open");

    /** Звук обычного дропа */
    public static final RegistryObject<SoundEvent> DROP_COMMON =
            register("drop_common");

    /** Звук редкого дропа */
    public static final RegistryObject<SoundEvent> DROP_RARE =
            register("drop_rare");

    /** Звук эпического дропа */
    public static final RegistryObject<SoundEvent> DROP_EPIC =
            register("drop_epic");

    /** Звук выпадения ножа */
    public static final RegistryObject<SoundEvent> DROP_KNIFE =
            register("drop_knife");

    // ===== ВСПОМОГАТЕЛЬНЫЕ МЕТОДЫ =====

    /**
     * Регистрирует SoundEvent с указанным именем.
     * Имя ДОЛЖНО совпадать с ключом в sounds.json.
     */
    public static RegistryObject<SoundEvent> register(String name) {
        return SOUND_EVENTS.register(name,
                () -> SoundEvent.createVariableRangeEvent(
                        new ResourceLocation(CaseOpener.MOD_ID, name)
                ));
    }

    /** Регистрация всех звуков в mod event bus */
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
