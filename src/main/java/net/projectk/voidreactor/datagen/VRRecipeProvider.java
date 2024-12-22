package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;
import net.projectk.voidreactor.block.VRBlocks;
import net.projectk.voidreactor.item.VRItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class VRRecipeProvider extends FabricRecipeProvider {
    public VRRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> CELESTIAL_COBBLESTONE = List.of(VRBlocks.CELESTIAL_COBBLESTONE);
        List<ItemConvertible> DARKFIRE_ORE = List.of(VRBlocks.DARKFIRE_ORE);
        List<ItemConvertible> GENERO_ORE = List.of(VRBlocks.GENERO_ORE);
        List<ItemConvertible> RAW_CYMIN = List.of(VRItems.RAW_CYMIN, VRBlocks.CYMIN_ORE);

        offerSmelting(exporter, CELESTIAL_COBBLESTONE, RecipeCategory.MISC, VRBlocks.CELESTIAL_STONE, 0.05f, 200, "celestial_stone");
        offerSmelting(exporter, RAW_CYMIN, RecipeCategory.MISC, VRItems.CYMIN_INGOT, 0.05f, 200, "cymin_ingot");
        offerSmelting(exporter, DARKFIRE_ORE, RecipeCategory.MISC, VRItems.GENERO_PLASMA, 0.05f, 200, "genero_plasma");
        offerSmelting(exporter, GENERO_ORE, RecipeCategory.MISC, VRItems.DARKFIRE_ESSENCE, 0.05f, 200, "darkfire_ingot");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.NEURON_AXON)
                .criterion(hasItem(VRBlocks.NEURON_AXON), conditionsFromItem(VRBlocks.NEURON_AXON))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_neuron_axon"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.NEURON_MYELIN)
                .criterion(hasItem(VRBlocks.NEURON_MYELIN), conditionsFromItem(VRBlocks.NEURON_MYELIN))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_neuron_myelin"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.STRIPPED_NEURON_AXON)
                .criterion(hasItem(VRBlocks.STRIPPED_NEURON_AXON), conditionsFromItem(VRBlocks.STRIPPED_NEURON_AXON))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_stripped_neuron_axon"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.STRIPPED_NEURON_MYELIN)
                .criterion(hasItem(VRBlocks.STRIPPED_NEURON_MYELIN), conditionsFromItem(VRBlocks.STRIPPED_NEURON_MYELIN))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_stripped_neuron_myelin"));

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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, VRItems.CYMIN_NUGGET, 9)
                .input(VRItems.CYMIN_INGOT)
                .criterion(hasItem(VRItems.CYMIN_INGOT), conditionsFromItem(VRItems.CYMIN_INGOT))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cymin_nugget_from_cymin_ingot"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, VRItems.CYMIN_INGOT, 1)
                .input(VRItems.CYMIN_NUGGET, 9)
                .criterion(hasItem(VRItems.CYMIN_NUGGET), conditionsFromItem(VRItems.CYMIN_NUGGET))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cymin_ingot_from_cymin_nugget"));
    }
}
