package net.Pandarix.betterarcheology.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.core.BlockPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.level.block.state.BlockState;

import javax.swing.text.html.BlockView;

public class ChickenFossilHeadBlock extends FossilBaseHeadBlock {
    private static final VoxelShape CHICKEN_HEAD_SHAPE = Block.createCuboidShape(4, 0, 4, 12, 4, 12);

    public ChickenFossilHeadBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return CHICKEN_HEAD_SHAPE;
    }
}
