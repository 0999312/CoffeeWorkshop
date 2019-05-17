package net.langball.coffee.compat.jei;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.gui.ContainerGrinder;
import net.langball.coffee.gui.ContainerIcecreamMachine;
import net.langball.coffee.gui.ContainerOven;
import net.langball.coffee.gui.ContainerRoller;
import net.langball.coffee.gui.GuiGrinder;
import net.langball.coffee.gui.GuiIcecreamMachine;
import net.langball.coffee.gui.GuiOven;
import net.langball.coffee.gui.GuiRoller;
import net.minecraft.item.ItemStack;

@JEIPlugin
public class JEICompat implements IModPlugin {
	@Override
	public void register(IModRegistry registry) {
		IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		IRecipeTransferRegistry recipeTransferRegistry = registry.getRecipeTransferRegistry();
		registry.addRecipes(GrinderRecipeMaker.getRecipes(jeiHelpers),"coffeework.grinder");
		registry.addRecipes(IcecreamRecipeMaker.getRecipes(jeiHelpers),"coffeework.icecream_machine");
		registry.addRecipes(RollerRecipeMaker.getRecipes(jeiHelpers),"coffeework.roller");
		registry.addRecipes(OvenRecipeMaker.getRecipes(jeiHelpers),"coffeework.oven");
		registry.addRecipeClickArea(GuiGrinder.class, 78, 32, 28, 23,"coffeework.grinder");
		registry.addRecipeClickArea(GuiIcecreamMachine.class, 75, 21, 32, 30,"coffeework.icecream_machine");
		registry.addRecipeClickArea(GuiRoller.class, 78, 32, 28, 23,"coffeework.roller");
		registry.addRecipeClickArea(GuiOven.class, 78, 32, 28, 23,"coffeework.oven");
		recipeTransferRegistry.addRecipeTransferHandler(ContainerGrinder.class,"coffeework.grinder", 0, 1, 3, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerIcecreamMachine.class,"coffeework.icecream_machine", 0, 1, 3, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerRoller.class,"coffeework.roller", 0, 1, 3, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerOven.class,"coffeework.oven", 0, 1, 3, 36);
		registry.addRecipeCatalyst(new ItemStack(BlockLoader.Grinder),"coffeework.grinder");
		registry.addRecipeCatalyst(new ItemStack(BlockLoader.Icecream_Machine),"coffeework.icecream_machine");
		registry.addRecipeCatalyst(new ItemStack(BlockLoader.Roller),"coffeework.roller");
		registry.addRecipeCatalyst(new ItemStack(BlockLoader.Oven),"coffeework.oven");
	}
	
	public void registerCategories(IRecipeCategoryRegistration registry) {
		registry.addRecipeCategories(new IRecipeCategory[]{
				new CategoryGrinder(registry.getJeiHelpers().getGuiHelper()),
				new CategoryIcecreamMaking(registry.getJeiHelpers().getGuiHelper()),
				new CategoryRoller(registry.getJeiHelpers().getGuiHelper()),
				new CategoryOven(registry.getJeiHelpers().getGuiHelper())
		}
	);
		
	}
	
}
