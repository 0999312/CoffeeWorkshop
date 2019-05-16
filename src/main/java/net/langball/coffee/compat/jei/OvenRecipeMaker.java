package net.langball.coffee.compat.jei;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.langball.coffee.recipes.blocks.OvenRecipes;
import net.minecraft.item.ItemStack;

public final class OvenRecipeMaker {
	  public static List<OvenRecipe> getRecipes(IJeiHelpers helpers)
	  {
	    IStackHelper stackHelper = helpers.getStackHelper();
	    OvenRecipes furnaceRecipes = OvenRecipes.instance();
	    Map<ItemStack, ItemStack> smeltingMap = furnaceRecipes.getSmeltingList();
	    
	    List<OvenRecipe> recipes = new ArrayList();
	    for (Map.Entry<ItemStack, ItemStack> entry : smeltingMap.entrySet())
	    {
	      ItemStack input = (ItemStack)entry.getKey();
	      ItemStack output = (ItemStack)entry.getValue();
	      
	      List<ItemStack> inputs = stackHelper.getSubtypes(input);
	      OvenRecipe recipe = new OvenRecipe(inputs, output);
	      recipes.add(recipe);
	    }
	    return recipes;
	  }
}
