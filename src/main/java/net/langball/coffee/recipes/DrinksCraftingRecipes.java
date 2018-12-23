package net.langball.coffee.recipes;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class DrinksCraftingRecipes {
	public DrinksCraftingRecipes() {
		RecipesUtil.addRecipe(DrinksLoader.coffee_instant_cup, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_instant_cup,new Object[]{
				DrinksLoader.coffee_instant_cup_unopen,"listAllwater"
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_instant, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_instant,new Object[]{
				DrinksLoader.cup,"listAllwater",DrinksLoader.coffee_instant_stick
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_milk, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_milk,new Object[]{
				DrinksLoader.coffee,"listAllmilk",ItemLoader.syrup_full
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_cheese, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_cheese,new Object[]{
				DrinksLoader.coffee,"foodCheese",ItemLoader.syrup_full
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_cream, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_cream,new Object[]{
				DrinksLoader.coffee,"listAllheavycream",ItemLoader.syrup_full
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_icecream, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_icecream,new Object[]{
				DrinksLoader.coffee,"listAllicecream",ItemLoader.syrup_full
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
				DrinksLoader.cup_glass,"foodCocoapowder","listAllmilk"
		}));
		RecipesUtil.addRecipe(DrinksLoader.strong_cocoa_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa_ice,new Object[]{
				DrinksLoader.cocoa_ice,ItemLoader.chocolate_chip
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+DrinksLoader.strong_cocoa_ice.getUnlocalizedName().substring(5)+"_2", new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa_ice,new Object[]{
				DrinksLoader.cup_glass,"foodCocoapowder","listAllmilk",ItemLoader.chocolate_chip,"listAllwater"
		}));
		
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mochaccino, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mochaccino,new Object[]{
				DrinksLoader.espresso,"listAllmilk",ItemLoader.milk_form,ItemLoader.chocolate_chip,DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_american, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_american,new Object[]{
				DrinksLoader.espresso,"listAllwater",DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_latte, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_latte,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_berry, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_berry,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,ItemLoader.syrup_berry
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_vanilla, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_vanilla,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,ItemLoader.syrup_vanilla
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_lemon, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_lemon,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,ItemLoader.syrup_lemon
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mint, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mint,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,ItemLoader.syrup_mint
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.cocoa_gingerbread, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.cocoa_gingerbread,new Object[]{
				DrinksLoader.cocoa,ItemLoader.ginger_bread
		}));
		RecipesUtil.addRecipe(DrinksLoader.cocoa_marshmallow, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.cocoa_marshmallow,new Object[]{
				DrinksLoader.cocoa,ItemLoader.marshmallow_roast
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_cappuccino, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_cappuccino,new Object[]{
				DrinksLoader.espresso,ItemLoader.milk_form,DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_macchiato, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_macchiato,new Object[]{
				DrinksLoader.espresso,ItemLoader.milk_form,ItemLoader.syrup_brown,DrinksLoader.cup
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mochaccino_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mochaccino_ice,new Object[]{
				DrinksLoader.espresso,ItemLoader.milk_form,ItemLoader.chocolate_chip,DrinksLoader.cup_glass,ItemLoader.ice_slag
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
				DrinksLoader.espresso,ItemLoader.milk_form,ItemLoader.syrup_brown,DrinksLoader.cup_glass,ItemLoader.ice_slag
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.freddo, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.freddo,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,ItemLoader.ice_slag,ItemLoader.syrup_full
		}));
		RecipesUtil.addRecipe(DrinksLoader.freddo_mocha, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.freddo_mocha,new Object[]{
				DrinksLoader.freddo,ItemLoader.milk_form,ItemLoader.chocolate_chip
		}));
		RecipesUtil.addRecipe(DrinksLoader.freddo_caramel, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.freddo_caramel,new Object[]{
				DrinksLoader.freddo,ItemLoader.milk_form,ItemLoader.syrup_brown
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_berry_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_berry_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,ItemLoader.syrup_berry,ItemLoader.ice_slag
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_vanilla_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_vanilla_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,ItemLoader.syrup_vanilla,ItemLoader.ice_slag
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_lemon_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_lemon_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,ItemLoader.syrup_lemon,ItemLoader.ice_slag
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mint_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mint_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,ItemLoader.syrup_mint,ItemLoader.ice_slag
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.moncheri, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.moncheri,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,ItemLoader.syrup_cherry,ItemLoader.milk_form
		}));
		
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink, ItemLoader.syrup_full);
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_cola, ItemLoader.syrup_brown);
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_vanilla, ItemLoader.syrup_vanilla);
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_cherry, ItemLoader.syrup_cherry);
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_chocolate, ItemLoader.syrup_chocolate);
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_lemon, ItemLoader.syrup_lemon);
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_apple, ItemLoader.syrup_apple);
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_berry, ItemLoader.syrup_berry);
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_soda, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_soda,new Object[]{
				DrinksLoader.espresso,"listAllsodaDrink",ItemLoader.ice_slag
		}));
	}
	private static void RegisterSodaDrinkRecipes(Item soda,Item syrup) {
		RecipesUtil.addRecipe(soda, new ShapelessOreRecipe(new ResourceLocation(""), soda,new Object[]{
				DrinksLoader.cup_glass,"listAllwater",syrup,ItemLoader.soda
		}));
	}
}
