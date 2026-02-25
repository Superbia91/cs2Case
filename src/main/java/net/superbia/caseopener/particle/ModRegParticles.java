package net.superbia.caseopener.particle;

import net.minecraft.client.particle.Particle;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.superbia.caseopener.CaseOpener;

public class ModRegParticles {
    public static final  DeferredRegister<ParticleType<?>> PARTICLE_TYPE
            = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CaseOpener.MOD_ID);
    public static final RegistryObject<SimpleParticleType> CUSTOM_PARTICLE = PARTICLE_TYPE.register("custom_particle",()-> new SimpleParticleType(true));


    public static void register(IEventBus eventBus) {
        PARTICLE_TYPE.register(eventBus);
    }

}
