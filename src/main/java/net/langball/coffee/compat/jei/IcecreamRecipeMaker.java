package net.langball.coffee.compat.jei;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.langball.coffee.recipes.blocks.GrinderRecipes;
import net.langball.coffee.recipes.blocks.IcecreamMachineRecipes;
import net.minecraft.item.ItemStack;

public final class IcecreamRecipeMaker {
	  public static List<IcecreamRecipe> getRecipes(IJeiHelpers helpers)
	  {
	    IStackHelper stackHelper = helpers.getStackHelper();
	    IcecreamMachineRecipes furnaceRecipes = IcecreamMachineRecipes.instance();
	    Map<ItemStack, ItemStack> smeltingMap = furnaceRecipes.getSmeltingList();
	    
	    List<IcecreamRecipe> recipes = new ArrayList();
	    for (Map.Entry<ItemStack, ItemStack> entry : smeltingMap.entrySet())
	    {
	    	
	      ItemStack input = (ItemStack)entry.getKey();
	      ItemStack output = (ItemStack)entry.getValue();
	      
	      List<ItemStack> inputs = stackHelper.getSubtypes(input);
	      IcecreamRecipe recipe = new IcecreamRecipe(inputs, output);
	      recipes.add(recipe);
	    }
	    return recipes;
	  }
}
