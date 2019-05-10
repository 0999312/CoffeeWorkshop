package net.langball.coffee.compat;

import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.recipes.MaterialCraftingRecipes;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import roito.teastory.item.ItemRegister;

public class TeaStoriesCompatRecipes {
	public TeaStoriesCompatRecipes() {
		RecipesUtil.addRecipe("green_tea_ice",new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(TeaStoriesCompatDrinks.tea_ice_drinks,1,0),new Object[]{
				DrinksLoader.cup_glass,"listAllwater",new ItemStack(ItemLoader.materials,1,7),ItemRegister.green_tea_bag
		}));
		RecipesUtil.addRecipe("black_tea_ice",new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(TeaStoriesCompatDrinks.tea_ice_drinks,1,1),new Object[]{
				DrinksLoader.cup_glass,"listAllwater",new ItemStack(ItemLoader.materials,1,7),ItemRegister.black_tea_bag
		}));
		RecipesUtil.addRecipe("milk_tea_ice",new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(TeaStoriesCompatDrinks.tea_ice_drinks,1,2),new Object[]{
				DrinksLoader.cup_glass,"listAllsugar","listAllmilk",new ItemStack(ItemLoader.materials,1,7),ItemRegister.black_tea_bag
		}));
		RecipesUtil.addRecipe("mandarin_ice_drink",new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(TeaStoriesCompatDrinks.tea_ice_drinks,1,3),new Object[]{
				DrinksLoader.cup_glass,"listAllmilk","listAllsugar",ItemRegister.black_tea_bag,DrinksLoader.espresso,new ItemStack(ItemLoader.materials,1,7)
		}));
		
		RecipesUtil.addRecipe("green_tea",new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(TeaStoriesCompatDrinks.tea_drinks,1,0),new Object[]{
				DrinksLoader.cup,"listAllwater",ItemRegister.green_tea_bag
		}));
		RecipesUtil.addRecipe("black_tea",new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(TeaStoriesCompatDrinks.tea_drinks,1,1),new Object[]{
				DrinksLoader.cup,"listAllwater",ItemRegister.black_tea_bag
		}));
		RecipesUtil.addRecipe("milk_tea",new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(TeaStoriesCompatDrinks.tea_drinks,1,2),new Object[]{
				DrinksLoader.cup,"listAllmilk","listAllsugar",ItemRegister.black_tea_bag
		}));
		RecipesUtil.addRecipe("mandarin_drink",new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(TeaStoriesCompatDrinks.tea_drinks,1,3),new Object[]{
				DrinksLoader.cup,"listAllmilk","listAllsugar",ItemRegister.black_tea_bag,DrinksLoader.espresso
		}));
		
		MaterialCraftingRecipes.registerCoffeePlate("green_tea_block",new ItemStack(TeaStoriesCompatDrinks.green_teaBlock), new ItemStack(TeaStoriesCompatDrinks.tea_drinks,1,0));
		MaterialCraftingRecipes.registerCoffeePlate("black_tea_block",new ItemStack(TeaStoriesCompatDrinks.black_teaBlock), new ItemStack(TeaStoriesCompatDrinks.tea_drinks,1,1));
		MaterialCraftingRecipes.registerCoffeePlate("milk_tea_block",new ItemStack(TeaStoriesCompatDrinks.milk_teaBlock), new ItemStack(TeaStoriesCompatDrinks.tea_drinks,1,2));
		MaterialCraftingRecipes.registerCoffeePlate("mandarin_drink_block",new ItemStack(TeaStoriesCompatDrinks.mandarin_drinkBlock), new ItemStack(TeaStoriesCompatDrinks.tea_drinks,1,3));

		MaterialCraftingRecipes.registerCoffeePlate("green_tea_ice_block",new ItemStack(TeaStoriesCompatDrinks.green_tea_iceBlock), new ItemStack(TeaStoriesCompatDrinks.tea_ice_drinks,1,0));
		MaterialCraftingRecipes.registerCoffeePlate("black_tea_ice_block",new ItemStack(TeaStoriesCompatDrinks.black_tea_iceBlock), new ItemStack(TeaStoriesCompatDrinks.tea_ice_drinks,1,1));
		MaterialCraftingRecipes.registerCoffeePlate("milk_tea_ice_block",new ItemStack(TeaStoriesCompatDrinks.milk_tea_iceBlock), new ItemStack(TeaStoriesCompatDrinks.tea_ice_drinks,1,2));
		MaterialCraftingRecipes.registerCoffeePlate("mandarin_drink_ice_block",new ItemStack(TeaStoriesCompatDrinks.mandarin_drink_iceBlock), new ItemStack(TeaStoriesCompatDrinks.tea_ice_drinks,1,3));

	}
}
