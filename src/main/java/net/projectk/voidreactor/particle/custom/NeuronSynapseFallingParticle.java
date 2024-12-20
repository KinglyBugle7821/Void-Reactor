package net.projectk.voidreactor.particle.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

public class NeuronSynapseFallingParticle extends SpriteBillboardParticle {
    protected NeuronSynapseFallingParticle(ClientWorld clientWorld, double xCoord, double yCoord, double zCoord,
                                           SpriteProvider spriteSet, double xd, double yd, double zd) {
        super(clientWorld, xCoord, yCoord, zCoord, xd, yd, zd);
        this.velocityMultiplier = 1.0F; // Adjusted velocity multiplier
        this.x = xCoord;
        this.y = yCoord;
        this.z = zCoord;
        this.scale *= 0.75F;
        this.maxAge = 100; // Define the lifespan
        this.setSpriteForAge(spriteSet);

        this.red = 1f;
        this.green = 1f;
        this.blue = 1f;
    }

    @Override
    public void tick() {
        super.tick();
        applyGravity();
        fadeOut(); // Ensure the fade-out logic is smooth
    }

    private void applyGravity() {
        this.velocityY -= 0.001F; // Apply a consistent downward velocity
    }

    private void fadeOut() {
        this.alpha = -(1.0F / maxAge) * age + 1.0F; // Smooth alpha fade-out
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet) {
            this.sprites = spriteSet;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType parameters, ClientWorld level, double x, double y, double z, double dx, double dy, double dz) {
            return new NeuronSynapseFallingParticle(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }
}
