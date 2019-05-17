package net.langball.coffee.recipes.blocks;

import net.langball.coffee.block.tileentity.TileEntityIcecreamMachine;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FuelLoader {
	public FuelLoader() {
		TileEntityIcecreamMachine.IceFuelReg.put(new ItemStack(Items.SNOWBALL), 100);
		TileEntityIcecreamMachine.IceFuelReg.put(new ItemStack(Blocks.ICE), 200);
		TileEntityIcecreamMachine.IceFuelReg.put(new ItemStack(Blocks.FROSTED_ICE), 400);
		TileEntityIcecreamMachine.IceFuelReg.put(new ItemStack(Blocks.PACKED_ICE), 200);
	}
}
