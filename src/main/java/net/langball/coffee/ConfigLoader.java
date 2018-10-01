package net.langball.coffee;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigLoader {
	public static Configuration config;
	private static Logger logger;

	public static int coffee_tree_int;
	public static int blueberry_int;
	 public ConfigLoader(FMLPreInitializationEvent event)
	    {
	        logger = event.getModLog();
	        config = new Configuration(event.getSuggestedConfigurationFile());
	        config.load();
	        load();
	    }

	    public static void load()
	    {
	        logger.info("Started loading config. ");
	        coffee_tree_int = config.get(Configuration.CATEGORY_GENERAL, "Coffee tree Rarity", 2).getInt();
	        blueberry_int = config.get(Configuration.CATEGORY_GENERAL, "Blueberry bush Rarity", 2).getInt();
	        config.save();
	        logger.info("Finished loading config. ");
	    }

	    public static Logger logger()
	    {
	        return logger;
	    }


}
