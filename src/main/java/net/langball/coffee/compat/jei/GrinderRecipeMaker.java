package net.langball.coffee.compat.jei;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.langball.coffee.recipes.blocks.GrinderRecipes;
import net.minecraft.item.ItemStack;

public final class GrinderRecipeMaker {
	  public static List<GrinderRecipe> getRecipes(IJeiHelpers helpers)
	  {
	    IStackHelper stackHelper = helpers.getStackHelper();
	    GrinderRecipes furnaceRecipes = GrinderRecipes.instance();
	    Map<ItemStack, ItemStack> smeltingMap = furnaceRecipes.getSmeltingList();
	    
	    List<GrinderRecipe> recipes = new ArrayList<GrinderRecipe>();
	    for (Map.Entry<ItemStack, ItemStack> entry : smeltingMap.entrySet())
	    {
	      ItemStack input = (ItemStack)entry.getKey();
	      ItemStack output = (ItemStack)entry.getValue();
	      
	      List<ItemStack> inputs = stackHelper.getSubtypes(input);
	      GrinderRecipe recipe = new GrinderRecipe(inputs, output);
	      recipes.add(recipe);
	    }
	    return recipes;
	  }
}
