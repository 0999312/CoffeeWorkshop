package net.langball.coffee.compat;

import defeatedcrow.hac.api.climate.DCHeatTier;
import defeatedcrow.hac.api.climate.DCHumidity;
import defeatedcrow.hac.api.recipe.RecipeAPI;
import defeatedcrow.hac.core.climate.recipe.ClimateSmelting;
import defeatedcrow.hac.food.FoodInit;
import defeatedcrow.hac.food.recipes.FoodFluidRecipe;
import defeatedcrow.hac.machine.MachineInit;
import defeatedcrow.hac.main.ClimateMain;
import defeatedcrow.hac.main.MainInit;
import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class HACRecipeLoader {
		public HACRecipeLoader() {
			if(Loader.isModLoaded(ClimateMain.MOD_ID)){
				 ItemStack sus = new ItemStack(MachineInit.rotaryBlade, 1, 0);
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.cocoa_powder,2), new ItemStack(ItemLoader.cocoa_powder,1), 0.2F, null, 0.0F, null, sus,new ItemStack(ItemLoader.cocoa_bean));
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.coffee_powder,2), new ItemStack(ItemLoader.coffee_powder,1), 0.2F, null, 0.0F, null, sus,"beanCoffee");
				 FoodFluidRecipe.regBoilrecipe(null, null, 0.0F, new FluidStack(MainInit.coffee, 1000), null, null, false, new FluidStack(FluidRegistry.WATER, 1000), new Object[] { new ItemStack(ItemLoader.coffee_bean, 1, 0) });
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.ice_slag,2), new ItemStack(ItemLoader.ice_slag), 0.2F, null, 0.0F, null, sus,new ItemStack(Blocks.ICE));
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.chocolate_chip,2), new ItemStack(ItemLoader.chocolate_chip), 0.2F, null, 0.0F, null, sus,"foodChocolatebar");
				 addFoodRecipe(new ItemStack(ItemLoader.brownie_model),new ItemStack(ItemLoader.brownie_raw));
				 addFoodRecipe(new ItemStack(ItemLoader.croissant),new ItemStack(ItemLoader.croissant_raw));
				 addFoodRecipe(new ItemStack(ItemLoader.croissant_chocolate),new ItemStack(ItemLoader.croissant_chocolate_raw));
				 addFoodRecipe(new ItemStack(ItemLoader.hardtack),new ItemStack(ItemLoader.hardtack_raw));
				 addFoodRecipe(new ItemStack(ItemLoader.cake_cheese_model),new ItemStack(ItemLoader.cake_cheese_raw));
				 addFoodRecipe(new ItemStack(ItemLoader.plate_pastry),new ItemStack(ItemLoader.plate_pastry_raw));
				 addFoodRecipe(new ItemStack(ItemLoader.coffee_bean),new ItemStack(ItemLoader.coffee_bean_raw));
				 addFoodRecipe(new ItemStack(ItemLoader.baguette),new ItemStack(ItemLoader.dough_baguette));
				 registerCakeRecipes(
							new ItemStack(ItemLoader.cake_sponge_raw), new ItemStack(ItemLoader.cake_sponge_model),
							new ItemStack(ItemLoader.cake_sponge_plate_raw), new ItemStack(ItemLoader.cake_sponge_plate_model), 
							new ItemStack(ItemLoader.jiggy_cake_raw), new ItemStack(ItemLoader.jiggy_cake_model), 
							new ItemStack(ItemLoader.muffin_raw), new ItemStack(ItemLoader.muffin)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.cake_sponge_chocolate_raw), new ItemStack(ItemLoader.cake_sponge_chocolate_model),
							new ItemStack(ItemLoader.cake_sponge_chocolate_plate_raw), new ItemStack(ItemLoader.cake_sponge_chocolate_plate_model),
							new ItemStack(ItemLoader.jiggy_cake_chocolate_raw), new ItemStack(ItemLoader.jiggy_cake_chocolate_model),
							new ItemStack(ItemLoader.muffin_chocolate_raw), new ItemStack(ItemLoader.muffin_chocolate));
					registerCakeRecipes(
							new ItemStack(ItemLoader.cake_sponge_coffee_raw), new ItemStack(ItemLoader.cake_sponge_coffee_model),
							new ItemStack(ItemLoader.cake_sponge_coffee_plate_raw), new ItemStack(ItemLoader.cake_sponge_coffee_plate_model),
							new ItemStack(ItemLoader.jiggy_cake_coffee_raw), new ItemStack(ItemLoader.jiggy_cake_coffee_model),
							new ItemStack(ItemLoader.muffin_coffee_raw), new ItemStack(ItemLoader.muffin_coffee)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.cake_sponge_pumpkin_raw), new ItemStack(ItemLoader.cake_sponge_pumpkin_model),
							new ItemStack(ItemLoader.cake_sponge_pumpkin_plate_raw), new ItemStack(ItemLoader.cake_sponge_pumpkin_plate_model),
							new ItemStack(ItemLoader.jiggy_cake_pumpkin_raw), new ItemStack(ItemLoader.jiggy_cake_pumpkin_model),
							new ItemStack(ItemLoader.muffin_pumpkin_raw), new ItemStack(ItemLoader.muffin_pumpkin));
					registerCakeRecipes(
							new ItemStack(ItemLoader.cake_sponge_carrot_raw), new ItemStack(ItemLoader.cake_sponge_carrot_model), 
							new ItemStack(ItemLoader.cake_sponge_carrot_plate_raw), new ItemStack(ItemLoader.cake_sponge_carrot_plate_model), 
							new ItemStack(ItemLoader.jiggy_cake_carrot_raw), new ItemStack(ItemLoader.jiggy_cake_carrot_model),
							new ItemStack(ItemLoader.muffin_carrot_raw), new ItemStack(ItemLoader.muffin_carrot)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.cake_sponge_redvelvet_raw), new ItemStack(ItemLoader.cake_sponge_redvelvet_model),
							new ItemStack(ItemLoader.cake_sponge_redvelvet_plate_raw), new ItemStack(ItemLoader.cake_sponge_redvelvet_plate_model),
							new ItemStack(ItemLoader.jiggy_cake_redvelvet_raw), new ItemStack(ItemLoader.jiggy_cake_redvelvet_model),
							new ItemStack(ItemLoader.muffin_redvelvet_raw), new ItemStack(ItemLoader.muffin_redvelvet)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.cake_sponge_lemon_raw), new ItemStack(ItemLoader.cake_sponge_lemon_model),
							new ItemStack(ItemLoader.cake_sponge_lemon_plate_raw), new ItemStack(ItemLoader.cake_sponge_lemon_plate_model),
							new ItemStack(ItemLoader.jiggy_cake_lemon_raw), new ItemStack(ItemLoader.jiggy_cake_lemon_model),
							new ItemStack(ItemLoader.muffin_lemon_raw), new ItemStack(ItemLoader.muffin_lemon)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.cake_sponge_tea_raw), new ItemStack(ItemLoader.cake_sponge_tea_model),
							new ItemStack(ItemLoader.cake_sponge_tea_plate_raw), new ItemStack(ItemLoader.cake_sponge_tea_plate_model),
							new ItemStack(ItemLoader.jiggy_cake_tea_raw), new ItemStack(ItemLoader.jiggy_cake_tea_model),
							new ItemStack(ItemLoader.muffin_tea_raw), new ItemStack(ItemLoader.muffin_tea)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.cake_sponge_berry_raw), new ItemStack(ItemLoader.cake_sponge_berry_model),
							new ItemStack(ItemLoader.cake_sponge_berry_plate_raw), new ItemStack(ItemLoader.cake_sponge_berry_plate_model),
							new ItemStack(ItemLoader.jiggy_cake_berry_raw), new ItemStack(ItemLoader.jiggy_cake_berry_model),
							new ItemStack(ItemLoader.muffin_berry_raw), new ItemStack(ItemLoader.muffin_berry)
							);
			} 
		}
		 private static void addFoodRecipe(ItemStack in, ItemStack out)
		  {
		    ClimateSmelting r = new ClimateSmelting(in, null, DCHeatTier.OVEN, DCHumidity.DRY, null, 0.0F, false, out);
		    r.requiredHeat().add(DCHeatTier.SMELTING);
		    r.requiredHum().add(DCHumidity.NORMAL);
		    r.requiredHum().add(DCHumidity.WET);
		    r.setProceedAsDropItem();
		    RecipeAPI.registerSmelting.addRecipe(r);
		  }
		 private static void registerCakeRecipes(
				    ItemStack cake_raw,ItemStack cake_model,
					ItemStack cake_plate_raw,ItemStack cake_plate_model,
					ItemStack jiggycake_raw,ItemStack jiggycake_model,
					ItemStack muffin_raw,ItemStack muffin) {

			 addFoodRecipe(cake_model,cake_raw);
			 addFoodRecipe(cake_plate_model,cake_plate_raw);
			 addFoodRecipe(jiggycake_model,jiggycake_raw);
			 addFoodRecipe(muffin,muffin_raw);
				}
}
