package net.langball.coffee;

import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.compat.TeaStoriesCompatDrinks;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import roito.teastory.TeaStory;

public class ClientProxy extends CommonProxy {
 
	@Override
	    public void preInit(FMLPreInitializationEvent event)
	    {
	        super.preInit(event);
	        ItemLoader.registerRenders();
	        DrinksLoader.registerRenders();
	        if(Loader.isModLoaded(TeaStory.MODID))
	        	TeaStoriesCompatDrinks.registerRenders();
	        BlockLoader.registerRenders();
	    }
	public void initializeItemRenderer() {
		
	}
	    @Override
	    public void init(FMLInitializationEvent event)
	    {
	        super.init(event);
	    }

	    @Override
	    public void postInit(FMLPostInitializationEvent event)
	    {
	        super.postInit(event);
	    }

}
