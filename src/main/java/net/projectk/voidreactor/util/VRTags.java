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
