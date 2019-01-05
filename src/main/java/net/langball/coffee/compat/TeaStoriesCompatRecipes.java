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
		RecipesUtil.addRecipe(TeaStoriesCompatDrinks.green_tea_ice,new ShapelessOreRecipe(new ResourceLocation(""), TeaStoriesCompatDrinks.green_tea_ice,new Object[]{
				DrinksLoader.cup_glass,"listAllwater",new ItemStack(ItemLoader.materials,1,2),ItemRegister.green_tea_bag
		}));
		RecipesUtil.addRecipe(TeaStoriesCompatDrinks.black_tea_ice,new ShapelessOreRecipe(new ResourceLocation(""), TeaStoriesCompatDrinks.black_tea_ice,new Object[]{
				DrinksLoader.cup_glass,"listAllwater",new ItemStack(ItemLoader.materials,1,2),ItemRegister.black_tea_bag
		}));
		RecipesUtil.addRecipe(TeaStoriesCompatDrinks.milk_tea_ice,new ShapelessOreRecipe(new ResourceLocation(""), TeaStoriesCompatDrinks.milk_tea_ice,new Object[]{
				DrinksLoader.cup_glass,"listAllsugar","listAllmilk",new ItemStack(ItemLoader.materials,1,2),ItemRegister.black_tea_bag
		}));
		RecipesUtil.addRecipe(TeaStoriesCompatDrinks.milk_tea,new ShapelessOreRecipe(new ResourceLocation(""), TeaStoriesCompatDrinks.milk_tea,new Object[]{
				DrinksLoader.cup,"listAllmilk","listAllsugar",ItemRegister.black_tea_bag
		}));
		RecipesUtil.addRecipe(TeaStoriesCompatDrinks.mandarin_drink,new ShapelessOreRecipe(new ResourceLocation(""), TeaStoriesCompatDrinks.mandarin_drink,new Object[]{
				DrinksLoader.cup,"listAllmilk","listAllsugar",ItemRegister.black_tea_bag,DrinksLoader.espresso
		}));
		MaterialCraftingRecipes.registerCoffeePlate(TeaStoriesCompatDrinks.milk_teaBlockItem, TeaStoriesCompatDrinks.milk_tea);
		MaterialCraftingRecipes.registerCoffeePlate(TeaStoriesCompatDrinks.mandarin_drinkBlockItem, TeaStoriesCompatDrinks.mandarin_drink);
	}
}
