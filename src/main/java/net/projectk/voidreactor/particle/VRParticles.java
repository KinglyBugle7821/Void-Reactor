package net.projectk.voidreactor.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;

import static net.minecraft.registry.Registries.PARTICLE_TYPE;

public class VRParticles {
    public static final SimpleParticleType NEURON_SYNAPSE_FALLING_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(PARTICLE_TYPE,
                Identifier.of(VoidReactor.MOD_ID, "neuron_synapse_falling_particle"),
                NEURON_SYNAPSE_FALLING_PARTICLE);
    }
}
