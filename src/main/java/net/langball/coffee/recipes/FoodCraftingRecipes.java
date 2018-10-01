package net.langball.coffee.recipes;

import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.minecraftforge.registries.ForgeRegistry;

public class FoodCraftingRecipes {
	public FoodCraftingRecipes() {
		
		GameRegistry.addSmelting(ItemLoader.dough, new ItemStack(Items.BREAD), 0F);
		GameRegistry.addSmelting(ItemLoader.dough_cookie, new ItemStack(Items.COOKIE,8), 0F);
		GameRegistry.addSmelting(ItemLoader.dough_baguette, new ItemStack(ItemLoader.baguette), 0F);
		RecipesUtil.addRecipe(ItemLoader.chocolate_bar, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.chocolate_bar,new Object[]{
				ItemLoader.cocoa_batter,ItemLoader.cocoa_batter,"listAllsugar"
		}));
		registerCakeRecipes(new ItemStack(ItemLoader.cake_sponge_raw), new ItemStack(ItemLoader.cake_sponge_model), new ItemStack(BlockLoader.cake_spongeItem), new Object[]{
				ItemLoader.cake_model,"listAllsugar","listAllegg","listAllegg","listAllegg","listAllsugar","listAllmilk","foodFlour","foodFlour"
		});
		registerCakeRecipes(new ItemStack(ItemLoader.cake_chocolate_raw), new ItemStack(ItemLoader.cake_chocolate_model), new ItemStack(BlockLoader.cake_sponge_chocolateItem), new Object[]{
				ItemLoader.cake_model,"listAllsugar","listAllegg","listAllegg","listAllegg","listAllsugar","listAllmilk","foodFlour","foodCocoapowder"
		});
		registerCakeRecipes(new ItemStack(ItemLoader.cake_carrot_raw), new ItemStack(ItemLoader.cake_carrot_model), new ItemStack(BlockLoader.cake_carrotItem), new Object[]{
				ItemLoader.cake_model,"listAllsugar","listAllegg","listAllegg","listAllsugar",Items.CARROT,"listAllmilk","foodFlour","foodFlour"
		});
		registerCakeRecipes(new ItemStack(ItemLoader.cake_cheese_raw), new ItemStack(ItemLoader.cake_cheese_model), new ItemStack(BlockLoader.cake_cheeseItem), new Object[]{
				ItemLoader.cake_model,"listAllsugar","foodCheese","listAllegg","listAllegg","listAllsugar","listAllmilk","foodFlour","foodCheese"
		});
		registerCakeRecipes(new ItemStack(ItemLoader.cake_redvelvet_raw), new ItemStack(ItemLoader.cake_redvelvet_model), new ItemStack(BlockLoader.cake_redvelvetItem), new Object[]{
				ItemLoader.cake_model,"listAllsugar","listAllegg","listAllegg","listAllegg","dyeRed","listAllmilk","foodFlour","foodFlour"
		});
		RecipesUtil.addRecipe(BlockLoader.cake_schwarzwaldItem, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_schwarzwaldItem,new Object[]{
				BlockLoader.cake_sponge_chocolateItem,ItemLoader.chocolate_chip,"listAllsugar",ItemLoader.cream_chocolate
		}));
		registerCakeRecipes(new ItemStack(ItemLoader.brownie_raw), new ItemStack(ItemLoader.brownie_model), new ItemStack(ItemLoader.brownie,4), new Object[]{
				ItemLoader.cake_model_square,"listAllsugar","listAllegg","listAllegg","foodButter","foodFlour","foodCocoapowder"
		});
		RecipesUtil.addRecipe(ItemLoader.tiramisu_model, new ShapelessOreRecipe(new ResourceLocation(""),ItemLoader.tiramisu_model,new Object[]{
				ItemLoader.cake_model_square,BlockLoader.cake_spongeItem,"foodCheese","foodCheese",DrinksLoader.espresso,"listAllheavycream","foodCocoapowder"
		}));
		RecipesUtil.addRecipe(BlockLoader.tiramisuItem, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.tiramisuItem,new Object[]{
				ItemLoader.tiramisu_model
		}));
		
		RecipesUtil.addRecipe(ItemLoader.D_bar, new ShapelessOreRecipe(new ResourceLocation(""),ItemLoader.D_bar,new Object[]{
				ItemLoader.cocoa_batter,ItemLoader.cocoa_batter,"listAllsugar","foodFlour","foodFlour"
		}));
		RecipesUtil.addRecipe(ItemLoader.mille_feuille, new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.mille_feuille,2),new Object[]{
				ItemLoader.plate_pastry,ItemLoader.plate_pastry,ItemLoader.plate_pastry,"listAllsugar","foodCustard","foodCustard"
		}));
		ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
		for(IRecipe recipe:recipeRegistry){
			if(recipe.getRecipeOutput().getItem()==Items.CAKE){
				recipeRegistry.remove(recipe.getRegistryName());
			}
		}
		RecipesUtil.addRecipe(Items.CAKE, new ShapelessOreRecipe(new ResourceLocation(""),Items.CAKE,new Object[]{
				BlockLoader.cake_spongeItem,"listAllsugar","listAllheavycream","listAllheavycream"
		}));
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.muffin_raw,4), new ItemStack(ItemLoader.muffin), new Object[]{
				ItemLoader.mixing_bowl,"listAllegg","listAllsugar","foodButter","foodFlour","listAllegg"
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.muffin_chocolate_raw,4), new ItemStack(ItemLoader.muffin_chocolate), new Object[]{
				ItemLoader.mixing_bowl,"listAllegg","listAllsugar","foodButter","foodCocoapowder","listAllegg"
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.muffin_berry_raw,4), new ItemStack(ItemLoader.muffin_berry), new Object[]{
				ItemLoader.mixing_bowl,"foodFlour","listAllsugar","foodButter","listAllberry","listAllegg"
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.croissant_raw,2), new ItemStack(ItemLoader.croissant), new Object[]{
				"listAllegg","listAllsugar","foodButter","foodDough"
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.croissant_chocolate_raw,2), new ItemStack(ItemLoader.croissant_chocolate), new Object[]{
				"listAllegg","listAllsugar","foodButter","foodDough","foodChocolatebar"
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.hardtack_raw,4), new ItemStack(ItemLoader.hardtack), new Object[]{
				"plateDough","plateDough"
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.plate_pastry_raw,2), new ItemStack(ItemLoader.plate_pastry), new Object[]{
				ItemLoader.plate_dough_pastry
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.mooncake_raw,2), new ItemStack(ItemLoader.mooncake), new Object[]{
				"listAllseed","listAllseed","listAllsugar","foodDoughPastry",ItemLoader.mooncake_model
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.mooncake_egg_raw,2), new ItemStack(ItemLoader.mooncake_egg), new Object[]{
				"listAllegg","listAllegg","listAllsugar","foodDoughPastry",ItemLoader.mooncake_model
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.mooncake_ham_raw,2), new ItemStack(ItemLoader.mooncake_ham), new Object[]{
				"listAllmeatraw","listAllsugar","foodDoughPastry",ItemLoader.mooncake_model
		});
		registerRaw2CookedRecipes(new ItemStack(ItemLoader.mooncake_fruit_raw,2), new ItemStack(ItemLoader.mooncake_fruit), new Object[]{
				"listAllfruit","listAllfruit","listAllsugar","foodDoughPastry",ItemLoader.mooncake_model
		});
	}
		private static void registerCakeRecipes(ItemStack cake_raw,ItemStack cake_model,ItemStack cake,Object... recipe) {
			RecipesUtil.addRecipe(cake_raw.getItem(), new ShapelessOreRecipe(new ResourceLocation(""),cake_raw,recipe));
			GameRegistry.addSmelting(cake_raw, cake_model, 0F);
			RecipesUtil.addRecipe(cake.getItem(), new ShapelessOreRecipe(new ResourceLocation(""),cake,new Object[]{
					cake_model
			}));
		}
		private static void registerRaw2CookedRecipes(ItemStack cake_raw,ItemStack cake,Object... recipe) {
			RecipesUtil.addRecipe(cake_raw.getItem(), new ShapelessOreRecipe(new ResourceLocation(""),cake_raw,recipe));
			GameRegistry.addSmelting(cake_raw.getItem(), cake, 0F);
			
		}
}
