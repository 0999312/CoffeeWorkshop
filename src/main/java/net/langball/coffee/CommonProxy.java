package net.langball.coffee;

import defeatedcrow.hac.main.ClimateMain;
import ic2.core.IC2;
import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.block.tileentity.TileEntityLoader;
import net.langball.coffee.compat.TeaStoriesCompatDrinks;
import net.langball.coffee.compat.TeaStoriesCompatRecipes;
import net.langball.coffee.compat.HACRecipeLoader;
import net.langball.coffee.compat.ICcompatLoader;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.effect.PotionLoader;
import net.langball.coffee.gui.GuiLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.item.OreDicRegister;
import net.langball.coffee.recipes.MaterialCraftingRecipes;
import net.langball.coffee.recipes.SyrupCraftingRecipes;
import net.langball.coffee.recipes.blocks.FuelLoader;
import net.langball.coffee.villager.VillagerLoader;
import net.langball.coffee.recipes.DrinksCraftingRecipes;
import net.langball.coffee.recipes.FoodCraftingRecipes;
import net.langball.coffee.world.WorldGenLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import roito.teastory.TeaStory;

public class CommonProxy {
	
	public static CreativeTabs tab = new CreativeTabs("coffee_workshop") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(DrinksLoader.cup);
		}
	};
	 public void preInit(FMLPreInitializationEvent event)
	 	{
		 new ConfigLoader(event);
		 new PotionLoader(event);
		 new BlockLoader(event);
		 new TileEntityLoader(event);
		 new DrinksLoader(event);
		 if(Loader.isModLoaded(TeaStory.MODID)) new TeaStoriesCompatDrinks(event);
		 new ItemLoader(event);
	     new OreDicRegister();
	    }
	 
    public void init(FMLInitializationEvent event)
    { 
		new FuelLoader();
		new WorldGenLoader();
    	new GuiLoader();
    	new MaterialCraftingRecipes();
    	new DrinksCraftingRecipes();
    	new FoodCraftingRecipes();
    	SyrupCraftingRecipes.init();
    	if(Loader.isModLoaded(ClimateMain.MOD_ID)) new HACRecipeLoader();
    	if(Loader.isModLoaded(TeaStory.MODID)) new TeaStoriesCompatRecipes();
		if(Loader.isModLoaded(IC2.MODID)) new ICcompatLoader();
    }

    public void postInit(FMLPostInitializationEvent event)
    {
    	new VillagerLoader();
    }
}
