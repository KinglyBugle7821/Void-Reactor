package net.projectk.voidreactor.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.*;
import net.projectk.voidreactor.VoidReactor;
import net.projectk.voidreactor.block.VRBlocks;

public class VRConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> NEURON_KEY = registerKey("neuron");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, NEURON_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(VRBlocks.NEURON_AXON), // Trunk block
                new StraightTrunkPlacer(5, 2, 3),            // Trunk height and randomness
                BlockStateProvider.of(VRBlocks.NEURON_SYNAPSE), // Foliage block
                new BlobFoliagePlacer(
                        ConstantIntProvider.create(2),       // Foliage radius (horizontal spread)
                        ConstantIntProvider.create(0),       // Offset from trunk
                        3),                                  // Total height of the foliage
                new TwoLayersFeatureSize(2, 2, 2))           // Bottom foliage = 2, top foliage = 2
                .dirtProvider(BlockStateProvider.of(VRBlocks.CELESTIAL_DIRT)) // Dirt block
                .build());
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(VoidReactor.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
     context.register(key, new ConfiguredFeature<>(feature, configuration)) ;
    }
}