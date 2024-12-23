package net.projectk.voidreactor.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;

public class VRTags {
    public static class Blocks {
        public static final TagKey<Block> CELESTIAL_BLOCKS = createTag("celestial_blocks");
        public static final TagKey<Block> REINFORCED_GLASS_BLOCKS = createTag("reinforced_glass_blocks");
        public static final TagKey<Block> REINFORCED_GLASS_BLOCK_PANES = createTag("reinforced_glass_block_panes");
        public static final TagKey<Block> SLATE_BLOCKS = createTag("slate_blocks");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(VoidReactor.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(VoidReactor.MOD_ID, name));
        }
    }
}
