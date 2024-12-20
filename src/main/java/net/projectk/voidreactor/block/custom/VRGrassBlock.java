package net.projectk.voidreactor.block.custom;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;

public class VRGrassBlock extends GrassBlock {

    public VRGrassBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
