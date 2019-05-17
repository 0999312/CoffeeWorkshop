package net.langball.coffee.recipes;

import net.langball.coffee.drinks.DrinkCoffee;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeShaplessOreNbt extends ShapelessOreRecipe {

	public RecipeShaplessOreNbt(ResourceLocation group, ItemStack result, Object[] recipe) {
		super(group, result, recipe);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean matches(InventoryCrafting inv, World world) {
		boolean result = super.matches(inv, world);
		boolean resultcoffee = false ;
		 for(int idx = 0; idx < inv.getSizeInventory(); idx++){
             ItemStack curIs = inv.getStackInSlot(idx);
             if(!curIs.isEmpty()
                     && curIs.getItem() instanceof DrinkCoffee
                     && curIs.hasTagCompound()){
            	 if(DrinkCoffee.cup_amount.get(RecipesUtil.getItemTagCompound(curIs))==0)
            		 resultcoffee = true;
             }
		 }
		return resultcoffee&&result;
	}
	
}
