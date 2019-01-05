package net.langball.coffee.recipes;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
				DrinksLoader.coffee,"listAllmilk",new ItemStack(ItemLoader.syrup,1,0)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_cheese, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_cheese,new Object[]{
				DrinksLoader.coffee,"foodCheese",new ItemStack(ItemLoader.syrup,1,0)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_cream, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_cream,new Object[]{
				DrinksLoader.coffee,"listAllheavycream",new ItemStack(ItemLoader.syrup,1,0)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_icecream, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_icecream,new Object[]{
				DrinksLoader.coffee,"listAllicecream",new ItemStack(ItemLoader.syrup,1,0)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.cocoa, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.cocoa,new Object[]{
				DrinksLoader.cup,"foodCocoapowder","listAllmilk"
		}));
		RecipesUtil.addRecipe(DrinksLoader.strong_cocoa, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa,new Object[]{
				DrinksLoader.cocoa,new ItemStack(ItemLoader.materialFood,1,4)
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+DrinksLoader.strong_cocoa.getUnlocalizedName().substring(5)+"_2", new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa,new Object[]{
				DrinksLoader.cup,"foodCocoapowder","listAllmilk",new ItemStack(ItemLoader.materialFood,1,4)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.cocoa_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.cocoa_ice,new Object[]{
				DrinksLoader.cup_glass,"foodCocoapowder","listAllmilk"
		}));
		RecipesUtil.addRecipe(DrinksLoader.strong_cocoa_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa_ice,new Object[]{
				DrinksLoader.cocoa_ice,new ItemStack(ItemLoader.materialFood,1,4)
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+DrinksLoader.strong_cocoa_ice.getUnlocalizedName().substring(5)+"_2", new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.strong_cocoa_ice,new Object[]{
				DrinksLoader.cup_glass,"foodCocoapowder","listAllmilk",new ItemStack(ItemLoader.materialFood,1,4),"listAllwater"
		}));
		
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mochaccino, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mochaccino,new Object[]{
				DrinksLoader.espresso,"listAllmilk",new ItemStack(ItemLoader.materialFood,1,9),new ItemStack(ItemLoader.syrup,1,6),DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_american, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_american,new Object[]{
				DrinksLoader.espresso,"listAllwater",DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_latte, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_latte,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_berry, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_berry,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,3)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_vanilla, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_vanilla,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,2)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_lemon, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_lemon,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,5)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mint, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mint,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,8)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.cocoa_gingerbread, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.cocoa_gingerbread,new Object[]{
				DrinksLoader.cocoa,new ItemStack(ItemLoader.dessert_1,1,8)
		}));
		RecipesUtil.addRecipe(DrinksLoader.cocoa_marshmallow, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.cocoa_marshmallow,new Object[]{
				DrinksLoader.cocoa,new ItemStack(ItemLoader.materialFood,1,12)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_cappuccino, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_cappuccino,new Object[]{
				DrinksLoader.espresso,new ItemStack(ItemLoader.materialFood,1,9),DrinksLoader.cup
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_macchiato, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_macchiato,new Object[]{
				DrinksLoader.espresso,new ItemStack(ItemLoader.materialFood,1,9),new ItemStack(ItemLoader.syrup,1,1),DrinksLoader.cup
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mochaccino_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mochaccino_ice,new Object[]{
				DrinksLoader.espresso,new ItemStack(ItemLoader.materialFood,1,9),new ItemStack(ItemLoader.syrup,1,6),DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,2)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_american_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_american_ice,new Object[]{
				DrinksLoader.espresso,"listAllwater",DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,2)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_latte_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_latte_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,2)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_cappuccino_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_cappuccino_ice,new Object[]{
				DrinksLoader.espresso,new ItemStack(ItemLoader.materialFood,1,9),DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,2)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_macchiato_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_macchiato_ice,new Object[]{
				DrinksLoader.espresso,new ItemStack(ItemLoader.materialFood,1,9),new ItemStack(ItemLoader.syrup,1,1),DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,2)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.freddo, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.freddo,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,2),new ItemStack(ItemLoader.syrup,1,0)
		}));
		RecipesUtil.addRecipe(DrinksLoader.freddo_mocha, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.freddo_mocha,new Object[]{
				DrinksLoader.freddo,new ItemStack(ItemLoader.materialFood,1,9),new ItemStack(ItemLoader.syrup,1,6)
		}));
		RecipesUtil.addRecipe(DrinksLoader.freddo_caramel, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.freddo_caramel,new Object[]{
				DrinksLoader.freddo,new ItemStack(ItemLoader.materialFood,1,9),new ItemStack(ItemLoader.syrup,1,1)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_berry_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_berry_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,3),new ItemStack(ItemLoader.materials,1,2)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_vanilla_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_vanilla_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,2),new ItemStack(ItemLoader.materials,1,2)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_lemon_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_lemon_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,5),new ItemStack(ItemLoader.materials,1,2)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_mint_ice, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_mint_ice,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,8),new ItemStack(ItemLoader.materials,1,2)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.moncheri, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.moncheri,new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,4),new ItemStack(ItemLoader.materialFood,1,9)
		}));
		
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink, new ItemStack(ItemLoader.syrup,1,0));
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_cola, new ItemStack(ItemLoader.syrup,1,1));
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_vanilla, new ItemStack(ItemLoader.syrup,1,2));
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_cherry, new ItemStack(ItemLoader.syrup,1,4));
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_chocolate, new ItemStack(ItemLoader.syrup,1,6));
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_lemon, new ItemStack(ItemLoader.syrup,1,5));
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_apple, new ItemStack(ItemLoader.syrup,1,7));
		RegisterSodaDrinkRecipes(DrinksLoader.soda_drink_berry, new ItemStack(ItemLoader.syrup,1,3));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_soda, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_soda,new Object[]{
				DrinksLoader.espresso,"listAllsodaDrink",new ItemStack(ItemLoader.materials,1,2)
		}));
	}
	private static void RegisterSodaDrinkRecipes(Item soda,ItemStack syrup) {
		RecipesUtil.addRecipe(soda, new ShapelessOreRecipe(new ResourceLocation(""), soda,new Object[]{
				DrinksLoader.cup_glass,"listAllwater",syrup,new ItemStack(ItemLoader.materials,1,8)
		}));
	}
}
