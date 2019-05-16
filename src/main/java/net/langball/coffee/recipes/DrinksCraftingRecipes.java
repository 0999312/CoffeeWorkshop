package net.langball.coffee.recipes;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.drinks.DrinkCoffee;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class DrinksCraftingRecipes {
	public DrinksCraftingRecipes() {
		RecipesUtil.addRecipe(DrinksLoader.coffee_instant_cup, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_instant_cup,new Object[]{
				DrinksLoader.coffee_instant_cup_unopen,"listAllwater"
		}));
		
		RecipesUtil.addRecipe("coffee_american", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_americano,1,0),new Object[]{
				DrinksLoader.espresso,"listAllwater",DrinksLoader.cup
		}));
		
		RecipesUtil.addRecipe("coffee_american_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_americano_ice,1,0),new Object[]{
		DrinksLoader.espresso,"listAllwater",DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,7)
		}));
		
		RecipesUtil.addRecipe("coffee_american_fruit", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_americano,1,1),new Object[]{
				DrinksLoader.espresso,"listAllwater",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,3)
		}));
		
		RecipesUtil.addRecipe("coffee_american_fruit_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_americano_ice,1,1),new Object[]{
		DrinksLoader.espresso,"listAllwater",DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,7),new ItemStack(ItemLoader.syrup,1,3)
		}));
		
		RecipesUtil.addRecipe("coffee_american_nitro_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_americano_ice,1,2),new Object[]{
		DrinksLoader.espresso,"listAllwater",DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,7),"dustSoda"
		}));
		RecipesUtil.addRecipe("coffee_american_nitro_fruit_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_americano_ice,1,3),new Object[]{
		DrinksLoader.espresso,"listAllwater",DrinksLoader.cup_glass,new ItemStack(ItemLoader.materials,1,7),"dustSoda",new ItemStack(ItemLoader.syrup,1,3)
		}));
		
		RecipesUtil.addRecipe("coffee_latte", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_latte,1,0),new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,0)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_latte_ice,1,0),new Object[]{
		DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,0)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_fruit", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_latte,1,1),new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,3)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_fruit_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_latte_ice,1,1),new Object[]{
		DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,3)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_caramel", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_latte,1,2),new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,1)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_caramel_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_latte_ice,1,2),new Object[]{
		DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,1)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_chocolate", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_latte,1,3),new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,4)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_chocolate_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_latte_ice,1,3),new Object[]{
		DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,4)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_mint", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_latte,1,4),new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,5)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_mint_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_latte_ice,1,4),new Object[]{
		DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,5)
		}));
		
		
		RecipesUtil.addRecipe("coffee_latte_vanilla", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_latte,1,5),new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,2)
		}));
		
		RecipesUtil.addRecipe("coffee_latte_vanilla_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_latte_ice,1,5),new Object[]{
		DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,2)
		}));
		
		RecipesUtil.addRecipe("coffee_cappuccino", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_latte,1,6),new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,1),new ItemStack(ItemLoader.materialFood,1,8)
		}));
		
		RecipesUtil.addRecipe("coffee_cappuccino_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_latte_ice,1,6),new Object[]{
		DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,1),new ItemStack(ItemLoader.materialFood,1,8)
		}));
		
		RecipesUtil.addRecipe("coffee_macchiato", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_latte,1,7),new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,4),new ItemStack(ItemLoader.materialFood,1,8)
		}));
		
		RecipesUtil.addRecipe("coffee_macchiato_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_latte_ice,1,7),new Object[]{
		DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,4),new ItemStack(ItemLoader.materialFood,1,8)
		}));
		
		RecipesUtil.addRecipe("coffee_mochaccino", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_latte,1,8),new Object[]{
				DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,4),new ItemStack(ItemLoader.materialFood,1,8)
		}));
		
		RecipesUtil.addRecipe("coffee_mochaccino_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_latte_ice,1,8),new Object[]{
		DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,4),new ItemStack(ItemLoader.materialFood,1,8)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_coldbrew,1,0),new Object[]{
				new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),DrinksLoader.cup
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_coldbrew_ice,1,0),new Object[]{
		new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),DrinksLoader.cup_glass
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_fruit", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_coldbrew,1,1),new Object[]{
				new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,3)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_fruit_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_coldbrew_ice,1,1),new Object[]{
		new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,3)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_coldbrew,1,2),new Object[]{
				new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,0)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_coldbrew_ice,1,2),new Object[]{
		new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,0)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_fruit", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_coldbrew,1,3),new Object[]{
				new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,3)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_fruit_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_coldbrew_ice,1,3),new Object[]{
		new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,3)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_caramel", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_coldbrew,1,4),new Object[]{
				new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,1)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_caramel_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_coldbrew_ice,1,4),new Object[]{
		new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,1)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_chocolate", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_coldbrew,1,5),new Object[]{
				new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,4)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_chocolate_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_coldbrew_ice,1,5),new Object[]{
		new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,4)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_mint", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_coldbrew,1,6),new Object[]{
				new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,5)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_mint_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_coldbrew_ice,1,6),new Object[]{
		new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,5)
		}));
		
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_vanilla", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_coldbrew,1,7),new Object[]{
				new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,2)
		}));
		
		RecipesUtil.addRecipe("coffee_coldbrew_latte_vanilla_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_coldbrew_ice,1,7),new Object[]{
		new ItemStack(ItemLoader.coldbrew_bottle,1,OreDictionary.WILDCARD_VALUE),"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,2)
		}));
		
		RecipesUtil.addRecipe(DrinksLoader.coffee_instant, new ShapelessOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_instant,new Object[]{
				DrinksLoader.cup,"listAllwater",DrinksLoader.coffee_instant_stick
		}));
		RecipesUtil.addRecipe("cocoa", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_other,1,0),new Object[]{
				DrinksLoader.cup,"listAllmilk","foodCocoapowder","foodCocoapowder",new ItemStack(ItemLoader.syrup,1,0)
		}));
		RecipesUtil.addRecipe("cocoa_strong", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_other,1,1),new Object[]{
				DrinksLoader.cup,"listAllmilk","foodCocoapowder","foodCocoapowder",new ItemStack(ItemLoader.materialFood,1,4),new ItemStack(ItemLoader.syrup,1,0)
		}));
		RecipesUtil.addRecipe("cocoa_ice", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_other_ice,1,0),new Object[]{
				DrinksLoader.cup_glass,"listAllmilk","foodCocoapowder","foodCocoapowder",new ItemStack(ItemLoader.syrup,1,0)
		}));
		RecipesUtil.addRecipe("cocoa_strong_ice", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_other_ice,1,1),new Object[]{
				DrinksLoader.cup_glass,"listAllmilk","foodCocoapowder","foodCocoapowder",new ItemStack(ItemLoader.materialFood,1,4),new ItemStack(ItemLoader.syrup,1,0)
		}));
		
		if(!OreDictionary.getOres("fullSakura").isEmpty()){
			RecipesUtil.addRecipe("coffee_latte_sakura", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(DrinksLoader.coffee_other,1,2),new Object[]{
					DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup,new ItemStack(ItemLoader.syrup,1,0),"fullSakura"
			}));
			
			RecipesUtil.addRecipe("coffee_latte_sakura_ice", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_other_ice,1,2),new Object[]{
			DrinksLoader.espresso,"listAllmilk",DrinksLoader.cup_glass,new ItemStack(ItemLoader.syrup,1,0),"fullSakura"
			}));
		}
		
		RegisterCoffeePlateRecipes(DrinksLoader.coffee_americano, new ItemStack[]{
				new ItemStack(DrinksLoader.coffee_americanoBlock),
				new ItemStack(DrinksLoader.coffee_americano_fruitBlock)
		});
		RegisterCoffeePlateRecipes(DrinksLoader.coffee_americano_ice, new ItemStack[]{
				new ItemStack(DrinksLoader.coffee_americano_iceBlock),
				new ItemStack(DrinksLoader.coffee_americano_ice_fruitBlock),
				new ItemStack(DrinksLoader.coffee_americano_nitro_iceBlock),
				new ItemStack(DrinksLoader.coffee_americano_nitro_ice_fruitBlock)
		});
		
		RegisterCoffeePlateRecipes(DrinksLoader.coffee_latte, new ItemStack[]{
				new ItemStack(DrinksLoader.coffee_latteBlock),
				new ItemStack(DrinksLoader.coffee_latte_fruitBlock),
				new ItemStack(DrinksLoader.coffee_latte_caramelBlock),
				new ItemStack(DrinksLoader.coffee_latte_chocolateBlock),
				new ItemStack(DrinksLoader.coffee_latte_mintBlock),
				new ItemStack(DrinksLoader.coffee_latte_vanillaBlock),
				new ItemStack(DrinksLoader.coffee_cappuccinoBlock),
				new ItemStack(DrinksLoader.coffee_macchiatoBlock),
				new ItemStack(DrinksLoader.coffee_mochaccinoBlock)
		});
		RegisterCoffeePlateRecipes(DrinksLoader.coffee_latte_ice, new ItemStack[]{
				new ItemStack(DrinksLoader.coffee_latte_iceBlock),
				new ItemStack(DrinksLoader.coffee_latte_ice_fruitBlock),
				new ItemStack(DrinksLoader.coffee_latte_ice_caramelBlock),
				new ItemStack(DrinksLoader.coffee_latte_ice_chocolateBlock),
				new ItemStack(DrinksLoader.coffee_latte_ice_mintBlock),
				new ItemStack(DrinksLoader.coffee_latte_ice_vanillaBlock),
				new ItemStack(DrinksLoader.coffee_cappuccino_iceBlock),
				new ItemStack(DrinksLoader.coffee_macchiato_iceBlock),
				new ItemStack(DrinksLoader.coffee_mochaccino_iceBlock)
		});
		
		RegisterCoffeePlateRecipes(DrinksLoader.coffee_coldbrew, new ItemStack[]{
				new ItemStack(DrinksLoader.coffee_coldbrewBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_fruitBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_latteBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_latte_fruitBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_latte_caramelBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_latte_chocolateBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_latte_mintBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_latte_vanillaBlock)
		});
		RegisterCoffeePlateRecipes(DrinksLoader.coffee_coldbrew_ice, new ItemStack[]{
				new ItemStack(DrinksLoader.coffee_coldbrew_iceBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_ice_fruitBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_ice_latteBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_ice_latte_fruitBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_ice_latte_caramelBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_ice_latte_chocolateBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_ice_latte_mintBlock),
				new ItemStack(DrinksLoader.coffee_coldbrew_ice_latte_vanillaBlock)
		});
		MaterialCraftingRecipes.registerCoffeePlate("coffee_instant_plate", new ItemStack(DrinksLoader.coffee_instantBlock), new ItemStack(DrinksLoader.coffee_instant));
	}
	private static void RegisterSodaDrinkRecipes(Item soda,ItemStack syrup) {
		RecipesUtil.addRecipe(soda, new ShapelessOreRecipe(new ResourceLocation(""), soda,new Object[]{
				DrinksLoader.cup_glass,"listAllwater",syrup,"dustSoda"
		}));
	}
	public static void RegisterCoffeePlateRecipes(DrinkCoffee coffee,ItemStack[] plate) {
		for(int i=0;i<coffee.getSubNames().length;i++){
			MaterialCraftingRecipes.registerCoffeePlate(coffee.getSubNames()[i]+"_plate", plate[i], new ItemStack(coffee,1,i));
		}
	}
}
