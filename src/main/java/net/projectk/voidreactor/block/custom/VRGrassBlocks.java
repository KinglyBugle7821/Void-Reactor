package net.projectk.voidreactor.block.custom;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;

public class VRGrassBlocks extends GrassBlock {

    public VRGrassBlocks(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
