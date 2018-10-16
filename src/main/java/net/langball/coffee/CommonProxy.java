package net.langball.coffee;

import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.block.tileentity.TileEntityLoader;
import net.langball.coffee.compat.TeaStoriesCompatDrinks;
import net.langball.coffee.compat.TeaStoriesCompatRecipes;
import net.langball.coffee.compat.HACRecipeLoader;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.event.EventCoffeeSeeds;
import net.langball.coffee.gui.GuiLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.item.OreDicRegister;
import net.langball.coffee.recipes.MaterialCraftingRecipes;
import net.langball.coffee.recipes.blocks.FuelLoader;
import net.langball.coffee.util.RecipesUtil;
import net.langball.coffee.recipes.DrinksCraftingRecipes;
import net.langball.coffee.recipes.FoodCraftingRecipes;
import net.langball.coffee.recipes.MakingBlackCoffee;
import net.langball.coffee.recipes.MakingTurkeyCoffee;
import net.langball.coffee.world.BlueBerryWorldGen;
import net.langball.coffee.world.CoffeeTreeWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import roito.teastory.TeaStory;

public class CommonProxy {
	
	public static CreativeTabs tab = new CreativeTabs("coffee_workshop") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(DrinksLoader.coffee);
		}
	};
	 public void preInit(FMLPreInitializationEvent event)
	 	{
		 new ConfigLoader(event);
		 new BlockLoader(event);
		 new TileEntityLoader(event);
		 new ItemLoader(event);
		 new DrinksLoader(event);
		 if(Loader.isModLoaded(TeaStory.MODID)) new TeaStoriesCompatDrinks(event);
	     new OreDicRegister();
	    }
	 
    public void init(FMLInitializationEvent event)
    { 
		 new FuelLoader();
			if (ConfigLoader.coffee_tree_int < 0) {
				ConfigLoader.coffee_tree_int = 1;
			}
			if (ConfigLoader.coffee_tree_int > 20) {
				ConfigLoader.coffee_tree_int = 20;
			}
    	GameRegistry.registerWorldGenerator(new CoffeeTreeWorldGen(), 1);
		if (ConfigLoader.blueberry_int < 0) {
			ConfigLoader.blueberry_int = 1;
		}
		if (ConfigLoader.blueberry_int > 20) {
			ConfigLoader.blueberry_int = 20;
		}
	GameRegistry.registerWorldGenerator(new BlueBerryWorldGen(), 2);
    	new GuiLoader();
    	RecipesUtil.addRecipe(DrinksLoader.coffee, new MakingBlackCoffee());
    	MinecraftForge.EVENT_BUS.register(new MakingBlackCoffee());
    	RecipesUtil.addRecipe(DrinksLoader.coffee_turkey, new MakingTurkeyCoffee());
    	MinecraftForge.EVENT_BUS.register(new MakingTurkeyCoffee());
    	MinecraftForge.EVENT_BUS.register(new EventCoffeeSeeds());
    	new MaterialCraftingRecipes();
    	new DrinksCraftingRecipes();
    	new FoodCraftingRecipes();
    	new HACRecipeLoader();
    	if(Loader.isModLoaded(TeaStory.MODID)) new TeaStoriesCompatRecipes();
    }

    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
