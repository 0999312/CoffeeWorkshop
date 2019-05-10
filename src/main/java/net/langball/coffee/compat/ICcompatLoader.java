package net.langball.coffee.compat;

import ic2.api.recipe.Recipes;
import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ICcompatLoader {
	public ICcompatLoader() {
		Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict("beanCoffee"),null, false,new ItemStack(ItemLoader.materials,2,2));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.materials,1,1)),null, false,new ItemStack(ItemLoader.materials,2,2));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict("foodChocolatebar"),null, false,new ItemStack(ItemLoader.materialFood,2,4));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(Items.SNOWBALL)),null, false,new ItemStack(ItemLoader.materials,1,7));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(Blocks.PACKED_ICE,1)),null, false,new ItemStack(ItemLoader.materials,4,7));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.materials,1,3)),null, false,new ItemStack(ItemLoader.materials,2,4));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.coffee_seeds)),null, false,new ItemStack(ItemLoader.materials,2,0));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.materials,1,4)),null, false,new ItemStack(ItemLoader.materials,1,5));
		Recipes.macerator.addRecipe(Recipes.inputFactory.forStack(new ItemStack(BlockLoader.Soda_Ore)),null, false,new ItemStack(ItemLoader.materials,8,14));

		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict("foodDough"), null, false, new ItemStack(ItemLoader.materials,2,25));
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.materials,1,15)), null, false, new ItemStack(ItemLoader.materials,2,24));
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(new ItemStack(ItemLoader.materials,1,17)), null, false, new ItemStack(ItemLoader.materials,2,25));
	}
}
