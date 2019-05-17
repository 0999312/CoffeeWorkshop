package net.langball.coffee.item;

import defeatedcrow.hac.food.FoodInit;
import defeatedcrow.hac.main.ClimateMain;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;

public class OreDicRegister {
	public OreDicRegister() {
	OreDictionary.registerOre("seedCoffee", ItemLoader.coffee_seeds);
	OreDictionary.registerOre("cropCoffee", ItemLoader.coffee_seeds);
	OreDictionary.registerOre("dustCoffee", new ItemStack(ItemLoader.materials,1,2));
	OreDictionary.registerOre("beanCoffee", new ItemStack(ItemLoader.materials,1,1));

	OreDictionary.registerOre("foodFlour", new ItemStack(ItemLoader.materials,1,13));
	OreDictionary.registerOre("foodDough", new ItemStack(ItemLoader.materials,1,14));
	OreDictionary.registerOre("listAllmilk", Items.MILK_BUCKET);
	OreDictionary.registerOre("listAllwater", Items.WATER_BUCKET);
	OreDictionary.registerOre("listAllsugar", Items.SUGAR);
	OreDictionary.registerOre("listAllsugar", new ItemStack(ItemLoader.syrup,1,0));
	OreDictionary.registerOre("listAllegg", Items.EGG);

	OreDictionary.registerOre("foodCaramel", new ItemStack(ItemLoader.materialFood,1,14));
	OreDictionary.registerOre("listAllwheat", Items.WHEAT);
	OreDictionary.registerOre("listAllgrain", Items.WHEAT);
    OreDictionary.registerOre("cropCarrot", Items.CARROT);
    OreDictionary.registerOre("cropPotato", Items.POTATO);
    OreDictionary.registerOre("cropPumpkin", Blocks.PUMPKIN);
    OreDictionary.registerOre("cropWheat", Items.WHEAT);
    OreDictionary.registerOre("cropBeet", Items.BEETROOT);
	OreDictionary.registerOre("baseCake", new ItemStack(ItemLoader.cake_base,1,0));
	OreDictionary.registerOre("baseCake", new ItemStack(ItemLoader.cake_base,1,1));
	OreDictionary.registerOre("baseCake", new ItemStack(ItemLoader.cake_base,1,2));
	OreDictionary.registerOre("baseCake", new ItemStack(ItemLoader.cake_base,1,3));
	OreDictionary.registerOre("baseCake", new ItemStack(ItemLoader.cake_base,1,4));
	OreDictionary.registerOre("baseCake", new ItemStack(ItemLoader.cake_base,1,5));
	OreDictionary.registerOre("baseCake", new ItemStack(ItemLoader.cake_base,1,6));
	OreDictionary.registerOre("baseCake", new ItemStack(ItemLoader.cake_base,1,7));
	OreDictionary.registerOre("baseCake", new ItemStack(ItemLoader.cake_base,1,8));
    OreDictionary.registerOre("listAllbeefraw", Items.BEEF);
    OreDictionary.registerOre("listAllbeefcooked", Items.COOKED_BEEF);
	OreDictionary.registerOre("foodCocoapowder", new ItemStack(ItemLoader.materials,1,4));
	OreDictionary.registerOre("foodChocolatebar", new ItemStack(ItemLoader.materialFood,1,3));
    OreDictionary.registerOre("cropApple", Items.APPLE);
    OreDictionary.registerOre("listAllseed", Items.WHEAT_SEEDS);
    OreDictionary.registerOre("listAllseed", Items.BEETROOT_SEEDS);
    OreDictionary.registerOre("listAllseed", Items.PUMPKIN_SEEDS);
    OreDictionary.registerOre("listAllseed", Items.MELON_SEEDS);
    OreDictionary.registerOre("listAllmushroom", Blocks.RED_MUSHROOM);
    OreDictionary.registerOre("listAllmushroom", Blocks.BROWN_MUSHROOM);
    OreDictionary.registerOre("foodButter", new ItemStack(ItemLoader.materialFood,1,0));
    OreDictionary.registerOre("foodCheese", new ItemStack(ItemLoader.materialFood,1,1));
    OreDictionary.registerOre("listAllheavycream",new ItemStack(ItemLoader.cream,1,0));
	OreDictionary.registerOre("foodDoughPastry", new ItemStack(ItemLoader.materials,1,15));
    OreDictionary.registerOre("listAllicecream", new ItemStack(ItemLoader.icecream,1,0));
    OreDictionary.registerOre("listAllicecream", new ItemStack(ItemLoader.icecream,1,1));
    OreDictionary.registerOre("listAllicecream", new ItemStack(ItemLoader.icecream,1,2));
    OreDictionary.registerOre("listAllicecream", new ItemStack(ItemLoader.icecream,1,3));
    OreDictionary.registerOre("listAllicecream", new ItemStack(ItemLoader.icecream,1,4));
    OreDictionary.registerOre("listAllicecream", new ItemStack(ItemLoader.icecream,1,5));
    OreDictionary.registerOre("listAllicecream", new ItemStack(ItemLoader.icecream,1,6));
    OreDictionary.registerOre("listAllmeatraw", Items.BEEF);
    OreDictionary.registerOre("listAllmeatraw", Items.CHICKEN);
    OreDictionary.registerOre("listAllmeatraw", Items.PORKCHOP);
    OreDictionary.registerOre("listAllmeatraw", Items.MUTTON);
    OreDictionary.registerOre("listAllmeatraw", Items.RABBIT);
    OreDictionary.registerOre("listAllporkraw", Items.PORKCHOP);
    OreDictionary.registerOre("listAllporkcooked", Items.COOKED_PORKCHOP);
    OreDictionary.registerOre("listAllchickenraw", Items.CHICKEN);
    OreDictionary.registerOre("listAllchickencooked", Items.COOKED_CHICKEN);
    OreDictionary.registerOre("listAllfruit", Items.APPLE);
    OreDictionary.registerOre("listAllfruit", Items.MELON);
    OreDictionary.registerOre("foodCustard", new ItemStack(ItemLoader.materialFood,1,7));
    OreDictionary.registerOre("listAllfruit", new ItemStack(ItemLoader.materialFood,1,2));
    OreDictionary.registerOre("listAllberry", new ItemStack(ItemLoader.materialFood,1,2));
    OreDictionary.registerOre("cropBlueberry", new ItemStack(ItemLoader.materialFood,1,2));
    OreDictionary.registerOre("listAllfruit", Items.CHORUS_FRUIT);
    OreDictionary.registerOre("plateIron", new ItemStack(ItemLoader.materials,1,9));
    OreDictionary.registerOre("plateDough", new ItemStack(ItemLoader.materials,1,23));
    OreDictionary.registerOre("plateDoughPastry", new ItemStack(ItemLoader.materials,1,24));
    OreDictionary.registerOre("foodVanilla", ItemLoader.vanilla_seeds);
    if(Loader.isModLoaded(ClimateMain.MOD_ID)){
    	OreDictionary.registerOre("beanCoffee",new ItemStack(FoodInit.teaLeaves, 1, 0));
    }
    OreDictionary.registerOre("dustSoda", new ItemStack(ItemLoader.materials,1,12));
    OreDictionary.registerOre("powderBaking", new ItemStack(ItemLoader.materials,1,12));
    OreDictionary.registerOre("powderBaking", new ItemStack(ItemLoader.materials,1,8));

    OreDictionary.registerOre("cropVanillabean", new ItemStack(ItemLoader.vanilla));
//	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink);
//	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_apple);
//	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_berry);
//	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_cherry);
//	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_chocolate);
//	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_cola);
//	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_lemon);
//	OreDictionary.registerOre("listAllsodaDrink", DrinksLoader.soda_drink_vanilla);
	}
	
}
