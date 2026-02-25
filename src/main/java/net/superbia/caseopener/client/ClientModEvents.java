package net.superbia.caseopener.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.superbia.caseopener.particle.KnifeParticle;
import net.superbia.caseopener.particle.ModRegParticles;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerParticle(RegisterParticleProvidersEvent event){
        event.registerSpriteSet(ModRegParticles.CUSTOM_PARTICLE.get(), KnifeParticle.Provider::new);
    }

}
