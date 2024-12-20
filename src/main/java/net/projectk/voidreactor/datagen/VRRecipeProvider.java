package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;
import net.projectk.voidreactor.block.VRBlocks;

import java.util.concurrent.CompletableFuture;

public class VRRecipeProvider extends FabricRecipeProvider {
    public VRRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.NEURON_AXON)
                .criterion(hasItem(VRBlocks.NEURON_AXON), conditionsFromItem(VRBlocks.NEURON_AXON))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_neuron_axon"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_MYELIN, 3)
                .pattern("## ")
                .pattern("## ")
                .input('#', VRBlocks.NEURON_AXON)
                .criterion(hasItem(VRBlocks.NEURON_AXON), conditionsFromItem(VRBlocks.NEURON_AXON))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_myelin_from_neuron_axon"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VRBlocks.NEURON_PLANKS)
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_stairs_from_neuron_planks"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_SLAB, 6)
                .pattern("###")
                .input('#', VRBlocks.NEURON_PLANKS)
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_slab_from_neuron_planks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_BUTTON, 1)
                .input(VRBlocks.NEURON_PLANKS)
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_button_from_neuron_axon"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PRESSURE_PLATE, 1)
                .pattern("## ")
                .input('#', VRBlocks.NEURON_PLANKS)
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_pressure_plate_from_neuron_planks"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_FENCE, 3)
                .pattern("#S#")
                .pattern("#S#")
                .input('#', VRBlocks.NEURON_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_fence_from_neuron_planks"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_FENCE_GATE, 1)
                .pattern("S#S")
                .pattern("S#S")
                .input('#', VRBlocks.NEURON_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_fence_gate_from_neuron_planks"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_DOOR, 3)
                .pattern("## ")
                .pattern("## ")
                .pattern("## ")
                .input('#', VRBlocks.NEURON_PLANKS)
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_door_from_neuron_planks"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.NEURON_PLANKS)
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_trapdoor_from_neuron_planks"));
    }
}
