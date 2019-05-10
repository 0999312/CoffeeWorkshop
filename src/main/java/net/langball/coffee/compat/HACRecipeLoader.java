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
import net.minecraft.init.Items;
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
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.materials,2), new ItemStack(ItemLoader.materials,1), 0.2F, null, 0.0F, null, sus,new ItemStack(ItemLoader.coffee_seeds));
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.materials,2,4), new ItemStack(ItemLoader.materials,1,4), 0.2F, null, 0.0F, null, sus,new ItemStack(ItemLoader.materials,1,3));
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.materials,2,2), new ItemStack(ItemLoader.materials,1,2), 0.2F, null, 0.0F, null, sus,"beanCoffee");
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.materials,4,14), new ItemStack(ItemLoader.materials,4,14), 0.5F, null, 0.0F, null, sus,new ItemStack(BlockLoader.Soda_Ore));
				 
				 FoodFluidRecipe.regBoilrecipe(null, null, 0.0F, new FluidStack(MainInit.coffee, 1000), null, null, false, new FluidStack(FluidRegistry.WATER, 1000), new Object[] { new ItemStack(ItemLoader.materials, 1, 1) });
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.materials,2,9), new ItemStack(ItemLoader.materials,1,9), 0.2F, null, 0.0F, null, sus,new ItemStack(Blocks.ICE));
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.materialFood,2,4), new ItemStack(ItemLoader.materialFood,1,4), 0.2F, null, 0.0F, null, sus,"foodChocolatebar");
				 addFoodRecipe(new ItemStack(ItemLoader.jiggy_cake_model,1,9),new ItemStack(ItemLoader.jiggy_cake_raw,1,9));
				 addFoodRecipe(new ItemStack(ItemLoader.dessert_1,1,2),new ItemStack(ItemLoader.dessert_1,1,0));
				 addFoodRecipe(new ItemStack(ItemLoader.dessert_1,1,3),new ItemStack(ItemLoader.dessert_1,1,1));
				 addFoodRecipe(new ItemStack(ItemLoader.dessert_1,1,5),new ItemStack(ItemLoader.dessert_1,1,4));
				 addFoodRecipe(new ItemStack(ItemLoader.model_cake,1,9),new ItemStack(ItemLoader.raw_cake,1,9));
				 addFoodRecipe(new ItemStack(ItemLoader.dessert_1,1,7),new ItemStack(ItemLoader.dessert_1,1,6));
				 addFoodRecipe(new ItemStack(ItemLoader.materialFood,1,11),new ItemStack(ItemLoader.materialFood,1,9));
				 addFoodRecipe(new ItemStack(ItemLoader.materials,1,1),new ItemStack(ItemLoader.materials,1,0));
				 addFoodRecipe(new ItemStack(Items.BREAD),new ItemStack(ItemLoader.materials,1,18));
				 addFoodRecipe(new ItemStack(ItemLoader.bread,1,0),new ItemStack(ItemLoader.materials,1,19));
				 addFoodRecipe(new ItemStack(ItemLoader.bread,1,1),new ItemStack(ItemLoader.materials,1,20));
				 addFoodRecipe(new ItemStack(ItemLoader.bread,1,2),new ItemStack(ItemLoader.materials,1,21));
				 addFoodRecipe(new ItemStack(ItemLoader.bread,1,3),new ItemStack(ItemLoader.materials,1,22));
				 registerCakeRecipes(
							new ItemStack(ItemLoader.model_cake,1,0), new ItemStack(ItemLoader.model_cake,1,0),
							new ItemStack(ItemLoader.cake_plate_raw,1,0), new ItemStack(ItemLoader.cake_plate_model,1,0), 
							new ItemStack(ItemLoader.jiggy_cake_raw,1,0), new ItemStack(ItemLoader.jiggy_cake_model), 
							new ItemStack(ItemLoader.muffin,1,0), new ItemStack(ItemLoader.muffin,1,9)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.model_cake,1,1), new ItemStack(ItemLoader.model_cake,1,1),
							new ItemStack(ItemLoader.cake_plate_raw,1,1), new ItemStack(ItemLoader.cake_plate_model,1,1), 
							new ItemStack(ItemLoader.jiggy_cake_raw,1,1), new ItemStack(ItemLoader.jiggy_cake_model,1,1), 
							new ItemStack(ItemLoader.muffin,1,1), new ItemStack(ItemLoader.muffin,1,10)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.model_cake,1,2), new ItemStack(ItemLoader.model_cake,1,2),
							new ItemStack(ItemLoader.cake_plate_raw,1,2), new ItemStack(ItemLoader.cake_plate_model,1,2), 
							new ItemStack(ItemLoader.jiggy_cake_raw,1,2), new ItemStack(ItemLoader.jiggy_cake_model,1,2), 
							new ItemStack(ItemLoader.muffin,1,2), new ItemStack(ItemLoader.muffin,1,11)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.model_cake,1,3), new ItemStack(ItemLoader.model_cake,1,3),
							new ItemStack(ItemLoader.cake_plate_raw,1,3), new ItemStack(ItemLoader.cake_plate_model,1,3), 
							new ItemStack(ItemLoader.jiggy_cake_raw,1,3), new ItemStack(ItemLoader.jiggy_cake_model,1,3), 
							new ItemStack(ItemLoader.muffin,1,3), new ItemStack(ItemLoader.muffin,1,12)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.model_cake,1,4), new ItemStack(ItemLoader.model_cake,1,4),
							new ItemStack(ItemLoader.cake_plate_raw,1,4), new ItemStack(ItemLoader.cake_plate_model,1,4), 
							new ItemStack(ItemLoader.jiggy_cake_raw,1,4), new ItemStack(ItemLoader.jiggy_cake_model,1,4), 
							new ItemStack(ItemLoader.muffin,1,4), new ItemStack(ItemLoader.muffin,1,13)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.model_cake,1,5), new ItemStack(ItemLoader.model_cake,1,5),
							new ItemStack(ItemLoader.cake_plate_raw,1,5), new ItemStack(ItemLoader.cake_plate_model,1,5), 
							new ItemStack(ItemLoader.jiggy_cake_raw,1,5), new ItemStack(ItemLoader.jiggy_cake_model,1,5), 
							new ItemStack(ItemLoader.muffin,1,5), new ItemStack(ItemLoader.muffin,1,14)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.model_cake,1,6), new ItemStack(ItemLoader.model_cake,1,6),
							new ItemStack(ItemLoader.cake_plate_raw,1,6), new ItemStack(ItemLoader.cake_plate_model,1,6), 
							new ItemStack(ItemLoader.jiggy_cake_raw,1,6), new ItemStack(ItemLoader.jiggy_cake_model,1,6), 
							new ItemStack(ItemLoader.muffin,1,6), new ItemStack(ItemLoader.muffin,1,15)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.model_cake,1,7), new ItemStack(ItemLoader.model_cake,1,7),
							new ItemStack(ItemLoader.cake_plate_raw,1,7), new ItemStack(ItemLoader.cake_plate_model,1,7), 
							new ItemStack(ItemLoader.jiggy_cake_raw,1,7), new ItemStack(ItemLoader.jiggy_cake_model,1,7), 
							new ItemStack(ItemLoader.muffin,1,7), new ItemStack(ItemLoader.muffin,1,16)
							);
					registerCakeRecipes(
							new ItemStack(ItemLoader.model_cake,1,8), new ItemStack(ItemLoader.model_cake,1,8),
							new ItemStack(ItemLoader.cake_plate_raw,1,8), new ItemStack(ItemLoader.cake_plate_model,1,8), 
							new ItemStack(ItemLoader.jiggy_cake_raw,1,8), new ItemStack(ItemLoader.jiggy_cake_model,1,8), 
							new ItemStack(ItemLoader.muffin,1,8), new ItemStack(ItemLoader.muffin,1,17)
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
