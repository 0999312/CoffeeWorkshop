package net.langball.coffee.item;

import defeatedcrow.hac.food.FoodInit;
import defeatedcrow.hac.main.ClimateMain;
import net.langball.coffee.drinks.DrinksLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;
import roito.teastory.TeaStory;
import roito.teastory.item.ItemRegister;

public class OreDicRegister {
	public OreDicRegister() {
	OreDictionary.registerOre("seedCoffee", ItemLoader.coffee_seeds);
	OreDictionary.registerOre("cropCoffee", ItemLoader.coffee_seeds);
	OreDictionary.registerOre("dustCoffee", ItemLoader.coffee_powder);
	OreDictionary.registerOre("beanCoffee", ItemLoader.coffee_bean);
	OreDictionary.registerOre("foodFlour", ItemLoader.flour);
	OreDictionary.registerOre("foodDough", ItemLoader.dough);
	OreDictionary.registerOre("listAllmilk", Items.MILK_BUCKET);
	OreDictionary.registerOre("listAllwater", Items.WATER_BUCKET);
	OreDictionary.registerOre("listAllsugar", Items.SUGAR);
	OreDictionary.registerOre("listAllegg", Items.EGG);
	OreDictionary.registerOre("listAllwheat", Items.WHEAT);
	OreDictionary.registerOre("listAllgrain", Items.WHEAT);
    OreDictionary.registerOre("cropCarrot", Items.CARROT);
    OreDictionary.registerOre("cropPotato", Items.POTATO);
    OreDictionary.registerOre("cropPumpkin", Blocks.PUMPKIN);
    OreDictionary.registerOre("cropWheat", Items.WHEAT);
    OreDictionary.registerOre("cropBeet", Items.BEETROOT);
	OreDictionary.registerOre("bread", ItemLoader.baguette);
	OreDictionary.registerOre("foodBread", ItemLoader.baguette);
	OreDictionary.registerOre("baseCake", ItemLoader.cake_sponge_base);
	OreDictionary.registerOre("baseCake", ItemLoader.cake_sponge_chocolate_base);
	OreDictionary.registerOre("baseCake", ItemLoader.cake_sponge_coffee_base);
	OreDictionary.registerOre("baseCake", ItemLoader.cake_sponge_tea_base);
	OreDictionary.registerOre("baseCake", ItemLoader.cake_sponge_pumpkin_base);
	OreDictionary.registerOre("baseCake", ItemLoader.cake_sponge_redvelvet_base);
	OreDictionary.registerOre("baseCake", ItemLoader.cake_sponge_lemon_base);
	OreDictionary.registerOre("baseCake", ItemLoader.cake_sponge_carrot_base);
	OreDictionary.registerOre("baseCake", ItemLoader.cake_sponge_berry_base);
	OreDictionary.registerOre("foodCocoapowder", ItemLoader.cocoa_powder);
	OreDictionary.registerOre("foodChocolatebar", ItemLoader.chocolate_bar);
    OreDictionary.registerOre("cropApple", Items.APPLE);
    OreDictionary.registerOre("listAllseed", Items.WHEAT_SEEDS);
    OreDictionary.registerOre("listAllseed", Items.BEETROOT_SEEDS);
    OreDictionary.registerOre("listAllseed", Items.PUMPKIN_SEEDS);
    OreDictionary.registerOre("listAllseed", Items.MELON_SEEDS);
    OreDictionary.registerOre("listAllmushroom", Blocks.RED_MUSHROOM);
    OreDictionary.registerOre("listAllmushroom", Blocks.BROWN_MUSHROOM);
    OreDictionary.registerOre("foodButter", ItemLoader.butter);
    OreDictionary.registerOre("foodCheese", ItemLoader.cheese);
    OreDictionary.registerOre("listAllheavycream", ItemLoader.cream_milk);
	OreDictionary.registerOre("foodDoughPastry", ItemLoader.dough_pastry);
    OreDictionary.registerOre("listAllicecream", ItemLoader.icecream_vanilla);
    OreDictionary.registerOre("listAllicecream", ItemLoader.icecream_apple);
    OreDictionary.registerOre("listAllicecream", ItemLoader.icecream_berry);
    OreDictionary.registerOre("listAllicecream", ItemLoader.icecream_chocolate);
    OreDictionary.registerOre("listAllicecream", ItemLoader.icecream_coffee);
    OreDictionary.registerOre("listAllicecream", ItemLoader.icecream_melon);
    OreDictionary.registerOre("listAllicecream", ItemLoader.icecream_lemon);
    OreDictionary.registerOre("listAllmeatraw", Items.BEEF);
    OreDictionary.registerOre("listAllmeatraw", Items.CHICKEN);
    OreDictionary.registerOre("listAllmeatraw", Items.PORKCHOP);
    OreDictionary.registerOre("listAllmeatraw", Items.MUTTON);
    OreDictionary.registerOre("listAllmeatraw", Items.RABBIT);
    OreDictionary.registerOre("listAllfruit", Items.APPLE);
    OreDictionary.registerOre("listAllfruit", Items.MELON);
    OreDictionary.registerOre("foodCustard", ItemLoader.custard);
    OreDictionary.registerOre("listAllfruit", ItemLoader.blue_berry);
    OreDictionary.registerOre("listAllberry", ItemLoader.blue_berry);
    OreDictionary.registerOre("cropBlueberry", ItemLoader.blue_berry);
    OreDictionary.registerOre("listAllfruit", Items.CHORUS_FRUIT);
    OreDictionary.registerOre("plateIron", ItemLoader.plate_iron);
    OreDictionary.registerOre("plateDough", ItemLoader.plate_dough);
    OreDictionary.registerOre("cropVanilla", ItemLoader.vanilla);
    if(Loader.isModLoaded(ClimateMain.MOD_ID)){
    	OreDictionary.registerOre("beanCoffee",new ItemStack(FoodInit.teaLeaves, 1, 0));
    }
	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink);
	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_apple);
	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_berry);
	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_cherry);
	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_chocolate);
	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_cola);
	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_lemon);
	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_vanilla);
	}
	
}
