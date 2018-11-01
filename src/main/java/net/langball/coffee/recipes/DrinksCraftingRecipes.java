package net.langball.coffee.recipes;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class DrinksCraftingRecipes {
	public DrinksCraftingRecipes() {
		RecipesUtil.addRecipe(DrinksLoader.coffee_milk, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_milk,new Object[]{
				DrinksLoader.coffee,"listAllmilk","listAllsugar"
		}));
		RecipesUtil.addRecipe(DrinksLoader.cocoa, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.cocoa,new Object[]{
				DrinksLoader.cup,"foodCocoapowder","listAllmilk"
		}));
		RecipesUtil.addRecipe(DrinksLoader.strong_cocoa, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa,new Object[]{
				DrinksLoader.cocoa,ItemLoader.chocolate_chip
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+DrinksLoader.strong_cocoa.getUnlocalizedName().substring(5)+"_2", new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa,new Object[]{
				DrinksLoader.cup,"foodCocoapowder","listAllmilk",ItemLoader.chocolate_chip
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.cocoa_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.cocoa_ice,new Object[]{
				DrinksLoader.cup_glass,"foodCocoapowder","listAllmilk","listAllwater"
		}));
		RecipesUtil.addRecipe(DrinksLoader.strong_cocoa_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa_ice,new Object[]{
				DrinksLoader.cocoa_ice,ItemLoader.chocolate_chip,"listAllwater"
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+DrinksLoader.strong_cocoa_ice.getUnlocalizedName().substring(5)+"_2", new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa_ice,new Object[]{
				DrinksLoader.cup_glass,"foodCocoapowder","listAllmilk",ItemLoader.chocolate_chip,"listAllwater"
		}));
		
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mochaccino, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mochaccino,new Object[]{
				DrinksLoader.espresso,"foodCocoapowder","listAllmilk",ItemLoader.milk_form,ItemLoader.chocolate_chip,DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_american, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_american,new Object[]{
				DrinksLoader.espresso,"listAllwater",DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_latte, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_latte,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_cappuccino, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_cappuccino,new Object[]{
				DrinksLoader.espresso,ItemLoader.milk_form,DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_macchiato, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_macchiato,new Object[]{
				DrinksLoader.espresso,ItemLoader.milk_form,"listAllsugar",DrinksLoader.cup
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mochaccino_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mochaccino_ice,new Object[]{
				DrinksLoader.espresso,"foodCocoapowder",ItemLoader.milk_form,ItemLoader.chocolate_chip,DrinksLoader.cup_glass,ItemLoader.ice_slag
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_american_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_american_ice,new Object[]{
				DrinksLoader.espresso,"listAllwater",DrinksLoader.cup_glass,ItemLoader.ice_slag
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_latte_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_latte_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,ItemLoader.ice_slag
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_cappuccino_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_cappuccino_ice,new Object[]{
				DrinksLoader.espresso,ItemLoader.milk_form,DrinksLoader.cup_glass,ItemLoader.ice_slag
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_macchiato_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_macchiato_ice,new Object[]{
				DrinksLoader.espresso,ItemLoader.milk_form,"listAllsugar",DrinksLoader.cup_glass,ItemLoader.ice_slag
		}));
	}
}
