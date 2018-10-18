package net.langball.coffee.recipes;

import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
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

		registerCakeRecipes(new ItemStack(ItemLoader.cake_cheese_raw), new ItemStack(ItemLoader.cake_cheese_model), new ItemStack(BlockLoader.cake_cheeseItem), new Object[]{
				ItemLoader.cake_model,ItemLoader.iron_bowl_cheese,"baseCake"
		});

		RecipesUtil.addRecipe(BlockLoader.cake_schwarzwaldItem, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_schwarzwaldItem,new Object[]{
				BlockLoader.cake_sponge_chocolateItem,ItemLoader.chocolate_chip,"listAllsugar",ItemLoader.cream_chocolate
		}));
		

		RecipesUtil.addRecipe(BlockLoader.cake_redvelvetItem, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_redvelvetItem,new Object[]{
				BlockLoader.cake_sponge_redvelvetItem,"listAllsugar","foodCheese","foodCheese"
		}));
		
		registerCakeRecipes(new ItemStack(ItemLoader.brownie_raw), new ItemStack(ItemLoader.brownie_model), new ItemStack(ItemLoader.brownie,4), new Object[]{
				ItemLoader.cake_model_square,ItemLoader.iron_bowl_batter_chocolate,ItemLoader.chocolate_chip
		});

		RecipesUtil.addRecipe(ItemLoader.tiramisu_model, new ShapelessOreRecipe(new ResourceLocation(""),ItemLoader.tiramisu_model,new Object[]{
				ItemLoader.cake_model_square,"baseCake","foodCheese",DrinksLoader.espresso,"listAllheavycream","foodCocoapowder"
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
		
		registerCakeRecipes(new ItemStack(ItemLoader.iron_bowl_batter),
				new ItemStack(ItemLoader.cake_sponge_raw), new ItemStack(ItemLoader.cake_sponge_model), new ItemStack(BlockLoader.cake_sponge),
				new ItemStack(ItemLoader.cake_sponge_plate_raw), new ItemStack(ItemLoader.cake_sponge_plate_model), new ItemStack(ItemLoader.cake_sponge_base), 
				new ItemStack(ItemLoader.jiggy_cake_raw), new ItemStack(ItemLoader.jiggy_cake_model), new ItemStack(ItemLoader.jiggy_cake), 
				new ItemStack(ItemLoader.muffin_raw,3), new ItemStack(ItemLoader.muffin), new Object[]{
					ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar"	
				});
		registerCakeRecipes(new ItemStack(ItemLoader.iron_bowl_batter_chocolate),
				new ItemStack(ItemLoader.cake_sponge_chocolate_raw), new ItemStack(ItemLoader.cake_sponge_chocolate_model), new ItemStack(BlockLoader.cake_sponge_chocolate),
				new ItemStack(ItemLoader.cake_sponge_chocolate_plate_raw), new ItemStack(ItemLoader.cake_sponge_chocolate_plate_model), new ItemStack(ItemLoader.cake_sponge_chocolate_base), 
				new ItemStack(ItemLoader.jiggy_cake_chocolate_raw), new ItemStack(ItemLoader.jiggy_cake_chocolate_model), new ItemStack(ItemLoader.jiggy_cake_chocolate), 
				new ItemStack(ItemLoader.muffin_chocolate_raw,3), new ItemStack(ItemLoader.muffin_chocolate), new Object[]{
					ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar", "foodCocoapowder"	
				});
		registerCakeRecipes(new ItemStack(ItemLoader.iron_bowl_batter_coffee),
				new ItemStack(ItemLoader.cake_sponge_coffee_raw), new ItemStack(ItemLoader.cake_sponge_coffee_model), new ItemStack(BlockLoader.cake_sponge_coffee),
				new ItemStack(ItemLoader.cake_sponge_coffee_plate_raw), new ItemStack(ItemLoader.cake_sponge_coffee_plate_model), new ItemStack(ItemLoader.cake_sponge_coffee_base), 
				new ItemStack(ItemLoader.jiggy_cake_coffee_raw), new ItemStack(ItemLoader.jiggy_cake_coffee_model), new ItemStack(ItemLoader.jiggy_cake_coffee), 
				new ItemStack(ItemLoader.muffin_coffee_raw,3), new ItemStack(ItemLoader.muffin_coffee), new Object[]{
					ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar","dustCoffee"	
				});
		registerCakeRecipes(new ItemStack(ItemLoader.iron_bowl_batter_pumpkin),
				new ItemStack(ItemLoader.cake_sponge_pumpkin_raw), new ItemStack(ItemLoader.cake_sponge_pumpkin_model), new ItemStack(BlockLoader.cake_sponge_pumpkin),
				new ItemStack(ItemLoader.cake_sponge_pumpkin_plate_raw), new ItemStack(ItemLoader.cake_sponge_pumpkin_plate_model), new ItemStack(ItemLoader.cake_sponge_pumpkin_base), 
				new ItemStack(ItemLoader.jiggy_cake_pumpkin_raw), new ItemStack(ItemLoader.jiggy_cake_pumpkin_model), new ItemStack(ItemLoader.jiggy_cake_pumpkin), 
				new ItemStack(ItemLoader.muffin_pumpkin_raw,3), new ItemStack(ItemLoader.muffin_pumpkin), new Object[]{
					ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar","cropPumpkin"
				});
		registerCakeRecipes(new ItemStack(ItemLoader.iron_bowl_batter_carrot),
				new ItemStack(ItemLoader.cake_sponge_carrot_raw), new ItemStack(ItemLoader.cake_sponge_carrot_model), new ItemStack(BlockLoader.cake_sponge_carrot),
				new ItemStack(ItemLoader.cake_sponge_carrot_plate_raw), new ItemStack(ItemLoader.cake_sponge_carrot_plate_model), new ItemStack(ItemLoader.cake_sponge_carrot_base), 
				new ItemStack(ItemLoader.jiggy_cake_carrot_raw), new ItemStack(ItemLoader.jiggy_cake_carrot_model), new ItemStack(ItemLoader.jiggy_cake_carrot), 
				new ItemStack(ItemLoader.muffin_carrot_raw,3), new ItemStack(ItemLoader.muffin_carrot), new Object[]{
					ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar","cropCarrot"
				});
		registerCakeRecipes(new ItemStack(ItemLoader.iron_bowl_batter_red),
				new ItemStack(ItemLoader.cake_sponge_redvelvet_raw), new ItemStack(ItemLoader.cake_sponge_redvelvet_model), new ItemStack(BlockLoader.cake_sponge_redvelvet),
				new ItemStack(ItemLoader.cake_sponge_redvelvet_plate_raw), new ItemStack(ItemLoader.cake_sponge_redvelvet_plate_model), new ItemStack(ItemLoader.cake_sponge_redvelvet_base), 
				new ItemStack(ItemLoader.jiggy_cake_redvelvet_raw), new ItemStack(ItemLoader.jiggy_cake_redvelvet_model), new ItemStack(ItemLoader.jiggy_cake_redvelvet), 
				new ItemStack(ItemLoader.muffin_redvelvet_raw,3), new ItemStack(ItemLoader.muffin_redvelvet), new Object[]{
					ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar","dyeRed"
				});
		registerCakeRecipes(new ItemStack(ItemLoader.iron_bowl_batter_lemon),
				new ItemStack(ItemLoader.cake_sponge_lemon_raw), new ItemStack(ItemLoader.cake_sponge_lemon_model), new ItemStack(BlockLoader.cake_sponge_lemon),
				new ItemStack(ItemLoader.cake_sponge_lemon_plate_raw), new ItemStack(ItemLoader.cake_sponge_lemon_plate_model), new ItemStack(ItemLoader.cake_sponge_lemon_base), 
				new ItemStack(ItemLoader.jiggy_cake_lemon_raw), new ItemStack(ItemLoader.jiggy_cake_lemon_model), new ItemStack(ItemLoader.jiggy_cake_lemon), 
				new ItemStack(ItemLoader.muffin_lemon_raw,3), new ItemStack(ItemLoader.muffin_lemon), new Object[]{
					ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar","cropLemon"
				});
		registerCakeRecipes(new ItemStack(ItemLoader.iron_bowl_batter_tea),
				new ItemStack(ItemLoader.cake_sponge_tea_raw), new ItemStack(ItemLoader.cake_sponge_tea_model), new ItemStack(BlockLoader.cake_sponge_tea),
				new ItemStack(ItemLoader.cake_sponge_tea_plate_raw), new ItemStack(ItemLoader.cake_sponge_tea_plate_model), new ItemStack(ItemLoader.cake_sponge_tea_base), 
				new ItemStack(ItemLoader.jiggy_cake_tea_raw), new ItemStack(ItemLoader.jiggy_cake_tea_model), new ItemStack(ItemLoader.jiggy_cake_tea), 
				new ItemStack(ItemLoader.muffin_tea_raw,3), new ItemStack(ItemLoader.muffin_tea), new Object[]{
					ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar","cropTea"
				});
		registerCakeRecipes(new ItemStack(ItemLoader.iron_bowl_batter_berry),
				new ItemStack(ItemLoader.cake_sponge_berry_raw), new ItemStack(ItemLoader.cake_sponge_berry_model), new ItemStack(BlockLoader.cake_sponge_berry),
				new ItemStack(ItemLoader.cake_sponge_berry_plate_raw), new ItemStack(ItemLoader.cake_sponge_berry_plate_model), new ItemStack(ItemLoader.cake_sponge_berry_base), 
				new ItemStack(ItemLoader.jiggy_cake_berry_raw), new ItemStack(ItemLoader.jiggy_cake_berry_model), new ItemStack(ItemLoader.jiggy_cake_berry), 
				new ItemStack(ItemLoader.muffin_berry_raw,3), new ItemStack(ItemLoader.muffin_berry), new Object[]{
					ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar", "listAllberry"	
				});
	}
		private static void registerCakeRecipes(ItemStack cake_raw,ItemStack cake_model,ItemStack cake,Object... recipe) {
			RecipesUtil.addRecipe(cake_raw.getItem(), new ShapelessOreRecipe(new ResourceLocation(""),cake_raw,recipe));
			GameRegistry.addSmelting(cake_raw, cake_model, 0F);
			RecipesUtil.addRecipe(cake.getItem(), new ShapelessOreRecipe(new ResourceLocation(""),cake,new Object[]{
					cake_model
			}));
		}
		private static void registerCakeRecipes(
				ItemStack batter,ItemStack cake_raw,ItemStack cake_model,ItemStack cake,
				ItemStack cake_plate_raw,ItemStack cake_plate_model,ItemStack cake_plate,
				ItemStack jiggycake_raw,ItemStack jiggycake_model,ItemStack jiggycake,
				ItemStack muffin_raw,ItemStack muffin,Object... recipe) {
			RecipesUtil.addRecipe(batter.getItem(), new ShapelessOreRecipe(new ResourceLocation(""),batter,recipe));
			registerCakeRecipes(cake_raw,cake_model,cake,new Object[]{
					ItemLoader.cake_model,batter
			});
			registerCakeRecipes(cake_plate_raw,cake_plate_model,cake_plate,new Object[]{
					ItemLoader.cake_model_plate,batter
			});
			registerCakeRecipes(jiggycake_raw,jiggycake_model,jiggycake,new Object[]{
					ItemLoader.cake_model_square,batter,batter
			});
			registerRaw2CookedRecipes(muffin_raw, muffin, new Object[]{
					batter
			});
		}
		private static void registerRaw2CookedRecipes(ItemStack cake_raw,ItemStack cake,Object... recipe) {
			RecipesUtil.addRecipe(cake_raw.getItem(), new ShapelessOreRecipe(new ResourceLocation(""),cake_raw,recipe));
			GameRegistry.addSmelting(cake_raw.getItem(), cake, 0F);
			
		}
}
