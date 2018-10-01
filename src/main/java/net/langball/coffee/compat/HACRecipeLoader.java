package net.langball.coffee.compat;

import defeatedcrow.hac.api.recipe.RecipeAPI;
import defeatedcrow.hac.food.FoodInit;
import defeatedcrow.hac.food.recipes.FoodFluidRecipe;
import defeatedcrow.hac.machine.MachineInit;
import defeatedcrow.hac.main.ClimateMain;
import defeatedcrow.hac.main.MainInit;
import net.langball.coffee.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;

public class HACRecipeLoader {
		public HACRecipeLoader() {
			if(Loader.isModLoaded(ClimateMain.MOD_ID)){
				 ItemStack sus = new ItemStack(MachineInit.rotaryBlade, 1, 0);
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.cocoa_powder,2), new ItemStack(ItemLoader.cocoa_powder,1), 0.2F, null, 0.0F, null, sus,new ItemStack(ItemLoader.cocoa_bean));
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.coffee_powder,2), new ItemStack(ItemLoader.coffee_powder,1), 0.2F, null, 0.0F, null, sus,"beanCoffee");
				 FoodFluidRecipe.regBoilrecipe(null, null, 0.0F, new FluidStack(MainInit.coffee, 1000), null, null, false, new FluidStack(FluidRegistry.WATER, 1000), new Object[] { new ItemStack(ItemLoader.coffee_bean, 1, 0) });
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.ice_slag,2), new ItemStack(ItemLoader.ice_slag), 0.2F, null, 0.0F, null, sus,new ItemStack(Blocks.ICE));
				 RecipeAPI.registerCrushers.addRecipe(new ItemStack(ItemLoader.chocolate_chip,2), new ItemStack(ItemLoader.chocolate_chip), 0.2F, null, 0.0F, null, sus,"foodChocolatebar");
			}
		}
}
