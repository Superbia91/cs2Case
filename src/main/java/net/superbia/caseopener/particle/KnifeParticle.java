package net.superbia.caseopener.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

public class KnifeParticle extends TextureSheetParticle {

    protected KnifeParticle(ClientLevel level,
                            double x, double y, double z,
                            double xSpeed, double ySpeed, double zSpeed,
                            SpriteSet spriteSet) {
        super(level, x, y, z, xSpeed, ySpeed, zSpeed);

        this.friction = 0.98f;
        this.lifetime = 80;

        // можно тут, но лучше также обновлять в tick()
        this.setSpriteFromAge(spriteSet);
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType type,
                                                 ClientLevel level,
                                                 double x, double y, double z,
                                                 double xSpeed, double ySpeed, double zSpeed) {
            return new KnifeParticle(level, x, y, z, xSpeed, ySpeed, zSpeed, spriteSet);
        }
    }
}