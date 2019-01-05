package net.langball.coffee.compat;

import ic2.api.recipe.Recipes;
import net.langball.coffee.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ICcompatLoader {
	public ICcompatLoader() {
		Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict("beanCoffee"),null, false,new ItemStack(ItemLoader.materials,2,9));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict("foodChocolatebar"),null, false,new ItemStack(ItemLoader.materialFood,2,4));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(Items.SNOWBALL)),null, false,new ItemStack(ItemLoader.materials,1,2));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(Blocks.PACKED_ICE,1)),null, false,new ItemStack(ItemLoader.materials,4,2));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.materials,1,10)),null, false,new ItemStack(ItemLoader.materials,2,11));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.materials,1,11)),null, false,new ItemStack(ItemLoader.materials,1,12));
		
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict("foodDough"), null, false, new ItemStack(ItemLoader.materials,2,18));
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.materials,15)), null, false, new ItemStack(ItemLoader.materials,2,19));
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.materials,17)), null, false, new ItemStack(ItemLoader.materials,2,20));
	}
}
