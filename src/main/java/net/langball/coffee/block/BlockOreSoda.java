package net.langball.coffee.block;

import java.util.Random;

import net.langball.coffee.item.ItemLoader;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockOreSoda extends BlockOre {
	public BlockOreSoda() {
		setHardness(1.5F);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemLoader.soda;
	}
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		 Random rand = world instanceof World ? ((World)world).rand : new Random();
		return MathHelper.getInt(rand, 3, 7);
	}
}
