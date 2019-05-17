package net.langball.coffee.block;

import java.util.Random;

import net.langball.coffee.item.ItemLoader;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOreSoda extends BlockOre {
	public BlockOreSoda() {
		setHardness(1.5F);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemLoader.materials;
	}
	@Override
	public int damageDropped(IBlockState state) {
		return 12;
	}
    public int quantityDropped(Random random)
    {
        return  4 + random.nextInt(5);
    }
}
