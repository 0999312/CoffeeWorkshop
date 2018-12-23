package net.langball.coffee.compat;

import ic2.api.recipe.Recipes;
import net.langball.coffee.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ICcompatLoader {
	public ICcompatLoader() {
		Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict("beanCoffee"),null, false,new ItemStack(ItemLoader.coffee_powder,2));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict("foodChocolatebar"),null, false,new ItemStack(ItemLoader.chocolate_chip,2));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(Blocks.ICE)),null, false,new ItemStack(ItemLoader.ice_slag,2));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.cocoa_bean)),null, false,new ItemStack(ItemLoader.cocoa_powder,2));
	
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict("foodDough"), null, false, new ItemStack(ItemLoader.plate_dough,2));
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.dough_pastry)), null, false, new ItemStack(ItemLoader.plate_dough_pastry,2));
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.dough_ginger)), null, false, new ItemStack(ItemLoader.plate_dough_ginger,2));
	}
}
