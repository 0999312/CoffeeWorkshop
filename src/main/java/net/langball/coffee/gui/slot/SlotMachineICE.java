package net.langball.coffee.gui.slot;

import net.langball.coffee.block.tileentity.TileEntityCoffeeMachine;
import net.langball.coffee.block.tileentity.TileEntityIcecreamMachine;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotMachineICE extends Slot {
	 public SlotMachineICE(IInventory inventoryIn, int slotIndex, int xPosition, int yPosition)
	    {
	        super(inventoryIn, slotIndex, xPosition, yPosition);
	    }

	    /**
	     * Check if the stack is allowed to be placed in this slot, used for armor slots as well as furnace fuel.
	     */
	    public boolean isItemValid(ItemStack stack)
	    {
	        return TileEntityIcecreamMachine.isItemFuel(stack);
	    }

}
