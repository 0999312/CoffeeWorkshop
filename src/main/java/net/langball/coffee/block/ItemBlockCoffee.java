package net.langball.coffee.block;

import net.langball.coffee.CoffeeWork;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockCoffee extends ItemBlock {

	public ItemBlockCoffee(Block block) {
		super(block);
		this.setUnlocalizedName(CoffeeWork.MODID+"."+block.getUnlocalizedName().substring(6+CoffeeWork.MODID.length()));
		this.setRegistryName(block.getUnlocalizedName().substring(6+CoffeeWork.MODID.length())+"_plate");
	}

}
