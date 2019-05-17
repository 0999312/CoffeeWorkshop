package net.langball.coffee.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemKnife extends ItemSword {

	public ItemKnife(String name, int damage) {
		super(ToolMaterial.IRON);
		setUnlocalizedName(name);
		setMaxDamage(damage);
		setMaxStackSize(1);
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		 int dmg = itemStack.getItemDamage();
		 if (dmg < this.getMaxDamage(itemStack))
	        {
			 ItemStack stack = itemStack.copy();
			 stack.setItemDamage(dmg +1);
	         return stack;
	        }else
		return super.getContainerItem(itemStack);
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		  int dmg = stack.getItemDamage();
		  if (dmg < this.getMaxDamage(stack))
	        {
	            return true;
	        }
	        else
	        {
	            return super.hasContainerItem(stack);
	        }
	}
	
}
