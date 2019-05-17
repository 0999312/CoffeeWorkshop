package net.langball.coffee.compat.jei;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.langball.coffee.recipes.blocks.RollerRecipes;
import net.minecraft.item.ItemStack;

public final class RollerRecipeMaker {
	  public static List<RollerRecipe> getRecipes(IJeiHelpers helpers)
	  {
	    IStackHelper stackHelper = helpers.getStackHelper();
	    RollerRecipes furnaceRecipes = RollerRecipes.instance();
	    Map<ItemStack, ItemStack> smeltingMap = furnaceRecipes.getSmeltingList();
	    
	    List<RollerRecipe> recipes = new ArrayList<RollerRecipe>();
	    for (Map.Entry<ItemStack, ItemStack> entry : smeltingMap.entrySet())
	    {
	      ItemStack input = (ItemStack)entry.getKey();
	      ItemStack output = (ItemStack)entry.getValue();
	      
	      List<ItemStack> inputs = stackHelper.getSubtypes(input);
	      RollerRecipe recipe = new RollerRecipe(inputs, output);
	      recipes.add(recipe);
	    }
	    return recipes;
	  }
}
