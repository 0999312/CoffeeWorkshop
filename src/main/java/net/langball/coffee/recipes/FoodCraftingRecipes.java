package net.langball.coffee.recipes;

import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.recipes.blocks.IcecreamMachineRecipes;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.minecraftforge.registries.ForgeRegistry;

public class FoodCraftingRecipes {
	public FoodCraftingRecipes() {
		
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materials,1,18), new ItemStack(Items.BREAD), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materials,1,17), new ItemStack(ItemLoader.dessert_1,8,8), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materials,1,16), new ItemStack(Items.COOKIE,8), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materials,1,19), new ItemStack(ItemLoader.bread,1,0), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materials,1,20), new ItemStack(ItemLoader.bread,1,1), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materials,1,21), new ItemStack(ItemLoader.bread,1,2), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materials,1,22), new ItemStack(ItemLoader.bread,1,3), 0F);
		
		RecipesUtil.addRecipe("chocolate_bar", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materialFood,1,3),new Object[]{
				new ItemStack(ItemLoader.materials,1,5),new ItemStack(ItemLoader.materials,1,5),"listAllsugar"
		}));

		registerCakeRecipes("cheese",new ItemStack(ItemLoader.raw_cake,1,9), new ItemStack(ItemLoader.model_cake,1,10), new ItemStack(BlockLoader.cake_cheese), new Object[]{
				ItemLoader.cake_model,new ItemStack(ItemLoader.iron_bowl_batter,1,1),"baseCake"
		});

		RecipesUtil.addRecipe(BlockLoader.cake_schwarzwald, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_schwarzwald,new Object[]{
				BlockLoader.cake_sponge_chocolate,new ItemStack(ItemLoader.syrup,1,4),"listAllsugar",new ItemStack(ItemLoader.cream,1,1)
		}));
		
		RecipesUtil.addRecipe(BlockLoader.cake_coffee, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_coffee,new Object[]{
				BlockLoader.cake_sponge_coffee,"listAllheavycream","listAllsugar","dustCoffee"
		}));
		
		RecipesUtil.addRecipe(BlockLoader.cake_harvest, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_harvest,new Object[]{
				BlockLoader.cake_sponge_pumpkin,"listAllheavycream","listAllsugar","cropCarrot"
		}));
		RecipesUtil.addRecipe(BlockLoader.cake_harvest.getRegistryName().toString()+"_2", new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_harvest,new Object[]{
				BlockLoader.cake_sponge_carrot,"listAllheavycream","listAllsugar","cropCarrot"
		}));
		
		RecipesUtil.addRecipe(BlockLoader.cake_berry, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_berry,new Object[]{
				BlockLoader.cake_sponge_berry,"listAllheavycream","listAllsugar","listAllfruit"
		}));
		
		RecipesUtil.addRecipe(BlockLoader.cake_lemon, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_lemon,new Object[]{
				BlockLoader.cake_sponge_lemon,"listAllheavycream","listAllsugar",new ItemStack(ItemLoader.syrup,1,5)
		}));
		
		RecipesUtil.addRecipe(BlockLoader.cake_redvelvet, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.cake_redvelvet,new Object[]{
				BlockLoader.cake_sponge_redvelvet,"listAllsugar","listAllheavycream","foodCheese"
		}));
		
		registerCakeRecipes("brownie",new ItemStack(ItemLoader.jiggy_cake_raw,1,9), new ItemStack(ItemLoader.jiggy_cake_model,1,9), new ItemStack(ItemLoader.materialFood,4,5), new Object[]{
				ItemLoader.cake_model_square,new ItemStack(ItemLoader.iron_bowl_batter,1,5),new ItemStack(ItemLoader.materialFood,1,4)
		});

		RecipesUtil.addRecipe("tiramisu_model", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.jiggy_cake_model,1,10),new Object[]{
				ItemLoader.cake_model_square,"baseCake","foodCheese",DrinksLoader.espresso,"listAllheavycream","foodCocoapowder"
		}));
		RecipesUtil.addRecipe(BlockLoader.tiramisu, new ShapelessOreRecipe(new ResourceLocation(""),BlockLoader.tiramisu,new Object[]{
				new ItemStack(ItemLoader.jiggy_cake_model,1,10)
		}));

		RecipesUtil.addRecipe("D_bar", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.materialFood,1,6),new Object[]{
				new ItemStack(ItemLoader.materials,1,5),new ItemStack(ItemLoader.materials,1,5),"listAllsugar","foodFlour","foodFlour"
		}));
		RecipesUtil.addRecipe("mille_feuille", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.dessert_1,2,11),new Object[]{
				new ItemStack(ItemLoader.dessert_1,1,7),new ItemStack(ItemLoader.dessert_1,1,7),new ItemStack(ItemLoader.dessert_1,1,7),"listAllsugar","foodCustard","foodCustard"
		}));
		ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
		for(IRecipe recipe:recipeRegistry){
			if(recipe.getRecipeOutput().getItem()==Items.CAKE){
				recipeRegistry.remove(recipe.getRegistryName());
			}
		}
		RecipesUtil.addRecipe(Items.CAKE, new ShapelessOreRecipe(new ResourceLocation(""),Items.CAKE,new Object[]{
				BlockLoader.cake_sponge,"listAllsugar","listAllheavycream","listAllfruit"
		}));
		
		RecipesUtil.addRecipe("sandwich_blt", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.sandwich,2,0),new Object[]{
				Items.BREAD,"listAllporkcooked","cropLettuce","cropTomato"
		}));
		
		RecipesUtil.addRecipe("sandwich_club", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.sandwich,2,1),new Object[]{
				Items.BREAD,"listAllporkcooked","listAllchickencooked","listAllgreenveggie"
		}));
		
		RecipesUtil.addRecipe("sandwich_blt_large", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.sandwich,2,2),new Object[]{
				new ItemStack(ItemLoader.bread,1,1),"listAllporkcooked","cropLettuce","cropTomato"
		}));
		
		RecipesUtil.addRecipe("sandwich_club_large", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.sandwich,2,3),new Object[]{
				new ItemStack(ItemLoader.bread,1,1),"listAllporkcooked","listAllchickencooked","listAllgreenveggie"
		}));
		
		RecipesUtil.addRecipe("sandwich_bacon_egg", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.sandwich,2,4),new Object[]{
				new ItemStack(ItemLoader.bread,1,3),"listAllporkcooked","listAllegg"
		}));
		
		RecipesUtil.addRecipe("sandwich_beef_cheese", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.sandwich,2,5),new Object[]{
				new ItemStack(ItemLoader.bread,1,0),"listAllbeefcooked","listAllgreenveggie","foodCheese"
		}));
		
		RecipesUtil.addRecipe("sandwich_ham_cheese", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.sandwich,2,6),new Object[]{
				new ItemStack(ItemLoader.bread,1,2),"listAllporkcooked","foodCheese","listAllgreenveggie"
		}));

		registerRaw2CookedRecipes("croissant",new ItemStack(ItemLoader.dessert_1,2,0), new ItemStack(ItemLoader.dessert_1,1,2), new Object[]{
				"listAllegg","listAllsugar","foodButter","foodDough"
		});
		registerRaw2CookedRecipes("croissant_chocolate",new ItemStack(ItemLoader.dessert_1,2,1), new ItemStack(ItemLoader.dessert_1,1,3), new Object[]{
				"listAllegg","listAllsugar","foodButter","foodDough","foodChocolatebar"
		});
		registerRaw2CookedRecipes("hardtack",new ItemStack(ItemLoader.dessert_1,4,4), new ItemStack(ItemLoader.dessert_1,1,5), new Object[]{
				"plateDough","powderBaking"
		});
		registerRaw2CookedRecipes("plate_pastry",new ItemStack(ItemLoader.dessert_1,4,6), new ItemStack(ItemLoader.dessert_1,4,7), new Object[]{
				new ItemStack(ItemLoader.materials,1,24)
		});
		registerRaw2CookedRecipes("mooncake",new ItemStack(ItemLoader.mooncake,2,0), new ItemStack(ItemLoader.mooncake,1,4), new Object[]{
				"listAllseed","listAllseed","listAllsugar","foodDoughPastry",ItemLoader.mooncake_model
		});
		registerRaw2CookedRecipes("mooncake_egg",new ItemStack(ItemLoader.mooncake,2,1), new ItemStack(ItemLoader.mooncake,1,5), new Object[]{
				"listAllegg","listAllegg","listAllsugar","foodDoughPastry",ItemLoader.mooncake_model
		});
		registerRaw2CookedRecipes("mooncake_ham",new ItemStack(ItemLoader.mooncake,2,2), new ItemStack(ItemLoader.mooncake,1,6), new Object[]{
				"listAllmeatraw","listAllsugar","foodDoughPastry",ItemLoader.mooncake_model
		});
		registerRaw2CookedRecipes("mooncake_fruit",new ItemStack(ItemLoader.mooncake,2,3), new ItemStack(ItemLoader.mooncake,1,7), new Object[]{
				"listAllfruit","listAllfruit","listAllsugar","foodDoughPastry",ItemLoader.mooncake_model
		});
		registerRaw2CookedRecipes("ginger_bread_man",new ItemStack(ItemLoader.dessert_1,4,9), new ItemStack(ItemLoader.dessert_1,1,10), new Object[]{
				new ItemStack(ItemLoader.materials,1,18),new ItemStack(ItemLoader.materials,1,18)
		});
		registerRaw2CookedRecipes("marshmallow",new ItemStack(ItemLoader.materialFood,8,9), new ItemStack(ItemLoader.materialFood,1,11), new Object[]{
				"listAllsugar","listAllsugar","listAllsugar",new ItemStack(ItemLoader.materials,1,11)
		});
		RecipesUtil.addRecipe("smore", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.materialFood,2,12),new Object[]{
				new ItemStack(ItemLoader.dessert_1,1,5),new ItemStack(ItemLoader.dessert_1,1,5),new ItemStack(ItemLoader.materialFood,1,11),"foodChocolatebar"
		}));
		RecipesUtil.addRecipe("marshmallow_chocolate", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.materialFood,2,10),new Object[]{
				new ItemStack(ItemLoader.materialFood,1,11),"foodCocoapowder","listAllmilk"
		}));
		registerCakeRecipes("cake_sponge",new ItemStack(ItemLoader.iron_bowl_batter,1,2),
				new ItemStack(ItemLoader.raw_cake,1,0), new ItemStack(ItemLoader.model_cake,1,0), new ItemStack(BlockLoader.cake_sponge),
				new ItemStack(ItemLoader.cake_plate_raw,1,0), new ItemStack(ItemLoader.cake_plate_model,1,0), new ItemStack(ItemLoader.cake_base,1,0), 
				new ItemStack(ItemLoader.jiggy_cake_raw,1,0), new ItemStack(ItemLoader.jiggy_cake_model,1,0), new ItemStack(ItemLoader.jiggy_cake,2,0), 
				new ItemStack(ItemLoader.muffin,3,0), new ItemStack(ItemLoader.muffin,1,9),new ItemStack(ItemLoader.cake_roll,1,0), new Object[]{
					new ItemStack(ItemLoader.iron_bowl_batter,1,0),"listAllmilk","foodFlour","foodFlour","listAllsugar"	
				});
		registerCakeRecipes("cake_sponge_chocolate",new ItemStack(ItemLoader.iron_bowl_batter,1,5),
				new ItemStack(ItemLoader.raw_cake,1,1), new ItemStack(ItemLoader.model_cake,1,1), new ItemStack(BlockLoader.cake_sponge_chocolate),
				new ItemStack(ItemLoader.cake_plate_raw,1,1), new ItemStack(ItemLoader.cake_plate_model,1,1), new ItemStack(ItemLoader.cake_base,1,1), 
				new ItemStack(ItemLoader.jiggy_cake_raw,1,1), new ItemStack(ItemLoader.jiggy_cake_model,1,2), new ItemStack(ItemLoader.jiggy_cake,2,1), 
				new ItemStack(ItemLoader.muffin,3,1), new ItemStack(ItemLoader.muffin,1,10),new ItemStack(ItemLoader.cake_roll,1,1), new Object[]{
					new ItemStack(ItemLoader.iron_bowl_batter,1,0),"listAllmilk","foodFlour","foodFlour","listAllsugar", "foodCocoapowder"	
				});
		registerCakeRecipes("cake_sponge_coffee",new ItemStack(ItemLoader.iron_bowl_batter,1,3),
				new ItemStack(ItemLoader.raw_cake,1,2), new ItemStack(ItemLoader.model_cake,1,2), new ItemStack(BlockLoader.cake_sponge_coffee),
				new ItemStack(ItemLoader.cake_plate_raw,1,2), new ItemStack(ItemLoader.cake_plate_model,1,2), new ItemStack(ItemLoader.cake_base,1,2), 
				new ItemStack(ItemLoader.jiggy_cake_raw,1,2), new ItemStack(ItemLoader.jiggy_cake_model,1,2), new ItemStack(ItemLoader.jiggy_cake,2,2), 
				new ItemStack(ItemLoader.muffin,3,2), new ItemStack(ItemLoader.muffin,1,11),new ItemStack(ItemLoader.cake_roll,1,2), new Object[]{
					new ItemStack(ItemLoader.iron_bowl_batter,1,0),"listAllmilk","foodFlour","foodFlour","listAllsugar","dustCoffee"	
				});
		registerCakeRecipes("cake_sponge_pumpkin",new ItemStack(ItemLoader.iron_bowl_batter,1,8),
				new ItemStack(ItemLoader.raw_cake,1,4), new ItemStack(ItemLoader.model_cake,1,4), new ItemStack(BlockLoader.cake_sponge_pumpkin),
				new ItemStack(ItemLoader.cake_plate_raw,1,4), new ItemStack(ItemLoader.cake_plate_model,1,4), new ItemStack(ItemLoader.cake_base,1,4), 
				new ItemStack(ItemLoader.jiggy_cake_raw,1,4), new ItemStack(ItemLoader.jiggy_cake_model,1,4), new ItemStack(ItemLoader.jiggy_cake,2,4), 
				new ItemStack(ItemLoader.muffin,3,4), new ItemStack(ItemLoader.muffin,1,13),new ItemStack(ItemLoader.cake_roll,1,4), new Object[]{
					new ItemStack(ItemLoader.iron_bowl_batter,1,0),"listAllmilk","foodFlour","foodFlour","listAllsugar","cropPumpkin"
				});
		registerCakeRecipes("cake_sponge_carrot",new ItemStack(ItemLoader.iron_bowl_batter,1,9),
				new ItemStack(ItemLoader.raw_cake,1,3), new ItemStack(ItemLoader.model_cake,1,3), new ItemStack(BlockLoader.cake_sponge_carrot),
				new ItemStack(ItemLoader.cake_plate_raw,1,3), new ItemStack(ItemLoader.cake_plate_model,1,3), new ItemStack(ItemLoader.cake_base,1,3), 
				new ItemStack(ItemLoader.jiggy_cake_raw,1,3), new ItemStack(ItemLoader.jiggy_cake_model,1,3), new ItemStack(ItemLoader.jiggy_cake,2,3), 
				new ItemStack(ItemLoader.muffin,3,3), new ItemStack(ItemLoader.muffin,1,12),new ItemStack(ItemLoader.cake_roll,1,3), new Object[]{
					new ItemStack(ItemLoader.iron_bowl_batter,1,0),"listAllmilk","foodFlour","foodFlour","listAllsugar","cropCarrot"
				});
		registerCakeRecipes("cake_sponge_redvelvet",new ItemStack(ItemLoader.iron_bowl_batter,1,6),
				new ItemStack(ItemLoader.raw_cake,1,5), new ItemStack(ItemLoader.model_cake,1,5), new ItemStack(BlockLoader.cake_sponge_redvelvet),
				new ItemStack(ItemLoader.cake_plate_raw,1,5), new ItemStack(ItemLoader.cake_plate_model,1,5), new ItemStack(ItemLoader.cake_base,1,5), 
				new ItemStack(ItemLoader.jiggy_cake_raw,1,5), new ItemStack(ItemLoader.jiggy_cake_model,1,5), new ItemStack(ItemLoader.jiggy_cake,2,5), 
				new ItemStack(ItemLoader.muffin,3,5), new ItemStack(ItemLoader.muffin,1,14),new ItemStack(ItemLoader.cake_roll,1,5), new Object[]{
					new ItemStack(ItemLoader.iron_bowl_batter,1,0),"listAllmilk","foodFlour","foodFlour","listAllsugar","dyeRed"
				});
		registerCakeRecipes("cake_sponge_lemon",new ItemStack(ItemLoader.iron_bowl_batter,1,7),
				new ItemStack(ItemLoader.raw_cake,1,6), new ItemStack(ItemLoader.model_cake,1,6), new ItemStack(BlockLoader.cake_sponge_lemon),
				new ItemStack(ItemLoader.cake_plate_raw,1,6), new ItemStack(ItemLoader.cake_plate_model,1,6), new ItemStack(ItemLoader.cake_base,1,6), 
				new ItemStack(ItemLoader.jiggy_cake_raw,1,6), new ItemStack(ItemLoader.jiggy_cake_model,1,6), new ItemStack(ItemLoader.jiggy_cake,2,6), 
				new ItemStack(ItemLoader.muffin,3,6), new ItemStack(ItemLoader.muffin,1,15),new ItemStack(ItemLoader.cake_roll,1,6), new Object[]{
					new ItemStack(ItemLoader.iron_bowl_batter,1,0),"listAllmilk","foodFlour","foodFlour","listAllsugar","cropLemon"
				});
		registerCakeRecipes("cake_sponge_tea",new ItemStack(ItemLoader.iron_bowl_batter,1,10),
				new ItemStack(ItemLoader.raw_cake,1,7), new ItemStack(ItemLoader.model_cake,1,7), new ItemStack(BlockLoader.cake_sponge_tea),
				new ItemStack(ItemLoader.cake_plate_raw,1,7), new ItemStack(ItemLoader.cake_plate_model,1,7), new ItemStack(ItemLoader.cake_base,1,7), 
				new ItemStack(ItemLoader.jiggy_cake_raw,1,7), new ItemStack(ItemLoader.jiggy_cake_model,1,7), new ItemStack(ItemLoader.jiggy_cake,2,7), 
				new ItemStack(ItemLoader.muffin,3,7), new ItemStack(ItemLoader.muffin,1,16),new ItemStack(ItemLoader.cake_roll,1,7), new Object[]{
					new ItemStack(ItemLoader.iron_bowl_batter,1,0),"listAllmilk","foodFlour","foodFlour","listAllsugar","cropTea"
				});
		registerCakeRecipes("cake_sponge_berry",new ItemStack(ItemLoader.iron_bowl_batter,1,4),
				new ItemStack(ItemLoader.raw_cake,1,8), new ItemStack(ItemLoader.model_cake,1,8), new ItemStack(BlockLoader.cake_sponge_berry),
				new ItemStack(ItemLoader.cake_plate_raw,1,8), new ItemStack(ItemLoader.cake_plate_model,1,8), new ItemStack(ItemLoader.cake_base,1,8), 
				new ItemStack(ItemLoader.jiggy_cake_raw,1,8), new ItemStack(ItemLoader.jiggy_cake_model,1,8), new ItemStack(ItemLoader.jiggy_cake,2,8), 
				new ItemStack(ItemLoader.muffin,3,8), new ItemStack(ItemLoader.muffin,1,17),new ItemStack(ItemLoader.cake_roll,1,8), new Object[]{
					new ItemStack(ItemLoader.iron_bowl_batter,1,0),"listAllmilk","foodFlour","foodFlour","listAllsugar", "listAllberry"	
				});
		registerMousseRecipes("mousse_berry",new ItemStack(ItemLoader.raw_cake,1,10),new ItemStack(ItemLoader.model_cake,1,10), new ItemStack(BlockLoader.mousse_berry), new Object[]{
				"listAllmilk","listAllmilk","listAllegg","listAllegg",new ItemStack(ItemLoader.materials,1,11),ItemLoader.cake_model,"listAllberry"
		});
		registerMousseRecipes("mousse_chocolate",new ItemStack(ItemLoader.raw_cake,1,11),new ItemStack(ItemLoader.model_cake,1,11), new ItemStack(BlockLoader.mousse_chocolate), new Object[]{
				"listAllmilk","listAllmilk","listAllegg","listAllegg",new ItemStack(ItemLoader.materials,1,11),ItemLoader.cake_model,"foodCocoapowder"
		});
		registerMousseRecipes("mousse_lemon",new ItemStack(ItemLoader.raw_cake,1,12),new ItemStack(ItemLoader.model_cake,1,12), new ItemStack(BlockLoader.mousse_lemon), new Object[]{
				"listAllmilk","listAllmilk","listAllegg","listAllegg",new ItemStack(ItemLoader.materials,1,11),ItemLoader.cake_model,"cropLemon"
		});
		registerMousseRecipes("mousse_coffee",new ItemStack(ItemLoader.raw_cake,1,13),new ItemStack(ItemLoader.model_cake,1,13), new ItemStack(BlockLoader.mousse_coffee), new Object[]{
				"listAllmilk","listAllmilk","listAllegg","listAllegg",new ItemStack(ItemLoader.materials,1,11),ItemLoader.cake_model,"dustCoffee"
		});
	}
		private static void registerCakeRecipes(String fav,ItemStack cake_raw,ItemStack cake_model,ItemStack cake,Object... recipe) {
			RecipesUtil.addRecipe("cake_raw_"+fav, new ShapelessOreRecipe(new ResourceLocation(""),cake_raw,recipe));
			GameRegistry.addSmelting(cake_raw, cake_model, 0F);
			RecipesUtil.addRecipe("cake_"+fav, new ShapelessOreRecipe(new ResourceLocation(""),cake,new Object[]{
					cake_model
			}));
		}
		private static void registerCakeRecipes(String fav,
				ItemStack batter,ItemStack cake_raw,ItemStack cake_model,ItemStack cake,
				ItemStack cake_plate_raw,ItemStack cake_plate_model,ItemStack cake_plate,
				ItemStack jiggycake_raw,ItemStack jiggycake_model,ItemStack jiggycake,
				ItemStack muffin_raw,ItemStack muffin,ItemStack cake_roll,Object... recipe) {
			RecipesUtil.addRecipe("batter"+fav, new ShapelessOreRecipe(new ResourceLocation(""),batter,recipe));
			registerCakeRecipes(fav,cake_raw,cake_model,cake,new Object[]{
					ItemLoader.cake_model,batter
			});
			registerCakeRecipes(fav+"_plate",cake_plate_raw,cake_plate_model,cake_plate,new Object[]{
					ItemLoader.cake_model_plate,batter
			});
			registerCakeRecipes(fav+"_jiggy",jiggycake_raw,jiggycake_model,jiggycake,new Object[]{
					ItemLoader.cake_model_square,batter,batter
			});
			registerRaw2CookedRecipes("muffin_"+fav,muffin_raw, muffin, new Object[]{
					batter
			});
			RecipesUtil.addRecipe("cake_roll_"+fav, new ShapelessOreRecipe(new ResourceLocation(""),cake_roll,new Object[]{
					cake_plate,"listAllheavycream"
			}));
		}
		private static void registerRaw2CookedRecipes(String name,ItemStack cake_raw,ItemStack cake,Object... recipe) {
			RecipesUtil.addRecipe(name+"_raw", new ShapelessOreRecipe(new ResourceLocation(""),cake_raw,recipe));
			ItemStack copy = cake_raw.copy();
			copy.setCount(1);
			GameRegistry.addSmelting(copy, cake, 0F);
		}
		private static void registerMousseRecipes(String name,ItemStack cake_raw,ItemStack cake_model,ItemStack cake,Object... recipe) {
			RecipesUtil.addRecipe(name+"_raw", new ShapelessOreRecipe(new ResourceLocation(""),cake_raw,recipe));
			IcecreamMachineRecipes.instance().addSmeltingRecipe(cake_raw, cake_model, 0F);
			RecipesUtil.addRecipe(cake.getItem(), new ShapelessOreRecipe(new ResourceLocation(""),cake,new Object[]{
					cake_model
			}));
		}
}
