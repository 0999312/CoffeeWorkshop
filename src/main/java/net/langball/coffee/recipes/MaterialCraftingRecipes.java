package net.langball.coffee.recipes;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.ConfigLoader;
import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.recipes.blocks.CoffeeMachineRecipes;
import net.langball.coffee.recipes.blocks.GrinderRecipes;
import net.langball.coffee.recipes.blocks.IcecreamMachineRecipes;
import net.langball.coffee.recipes.blocks.RollerRecipes;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.minecraftforge.registries.ForgeRegistry;

public class MaterialCraftingRecipes {
	public MaterialCraftingRecipes() {

		for(ItemStack coffee_bean : OreDictionary.getOres("beanCoffee")){
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.coffee_powder), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("foodCocoapowder")){
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.cocoa_batter), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllwheat")){
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.flour), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllgrain")){
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.flour), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("foodChocolatebar")){
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.chocolate_chip), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllheavycream")){
			IcecreamMachineRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.icecream_vanilla), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllwater")){
			IcecreamMachineRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(Blocks.ICE), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllmilk")){
			CoffeeMachineRecipes.instance().addSmeltingRecipe(coffee_bean,new ItemStack(ItemLoader.milk_form), 1F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("ingotIron")){
			RollerRecipes.instance().addSmeltingRecipe(coffee_bean,new ItemStack(ItemLoader.plate_iron), 1F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("foodDough")){
			RollerRecipes.instance().addSmeltingRecipe(coffee_bean,new ItemStack(ItemLoader.plate_dough), 1F);
		}
		RecipesUtil.addRecipe(ItemLoader.dough_pastry, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.dough_pastry,new Object[]{
				"foodDough","foodButter","listAllegg"
		}));
		RollerRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.dough_pastry),new ItemStack(ItemLoader.plate_dough_pastry), 1F);
			GrinderRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.cocoa_bean), new ItemStack(ItemLoader.cocoa_powder), 0F);
			
			GrinderRecipes.instance().addSmeltingRecipe(new ItemStack(Blocks.ICE), new ItemStack(ItemLoader.ice_slag), 0F);
			GameRegistry.addSmelting(ItemLoader.coffee_bean_raw, new ItemStack(ItemLoader.coffee_bean), 0F);
			GameRegistry.addSmelting(new ItemStack(Items.DYE,1,3), new ItemStack(ItemLoader.cocoa_bean), 0F);
			
			GameRegistry.addSmelting(ItemLoader.moka_pot_unheated, new ItemStack(ItemLoader.moka_pot_heated), 0F);
			GameRegistry.addSmelting(ItemLoader.turkey_coffee_pot_unheated, new ItemStack(ItemLoader.turkey_coffee_pot_heated), 0F);
			CoffeeMachineRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.coffee_powder),new ItemStack(DrinksLoader.espresso), 1F);
		RecipesUtil.addRecipe(DrinksLoader.cup, new ShapedOreRecipe(new ResourceLocation(""), DrinksLoader.cup,new Object[]{
				"W W","W W"," W ",'W',new ItemStack(Blocks.CONCRETE,1,0)
		}));
		RecipesUtil.addRecipe(ItemLoader.cake_model, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.cake_model,new Object[]{
				" I ","IWI"," I ",'I',"ingotIron",'W',"plateIron"
		}));
		RecipesUtil.addRecipe(ItemLoader.mixing_bowl, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.mixing_bowl,new Object[]{
				 "I I"," W ",'I',"ingotIron",'W',"plateIron"
		}));
		RecipesUtil.addRecipe(ItemLoader.iron_bowl, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.iron_bowl,new Object[]{
				 "I I","W W"," W ",'I',"ingotIron",'W',"plateIron"
		}));
		RecipesUtil.addRecipe(ItemLoader.mooncake_model, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.mooncake_model,new Object[]{
				 "IWI",'I',"ingotIron",'W',"plateIron"
		}));
		RecipesUtil.addRecipe(ItemLoader.cake_model_square, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.cake_model_square,new Object[]{
				"III","IWI","III",'I',"ingotIron",'W',"plateIron"
		}));
		RecipesUtil.addRecipe(ItemLoader.iron_bowl_egg, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.iron_bowl_egg,new Object[]{
				ItemLoader.iron_bowl,"listAllegg","listAllegg","listAllegg"
		}));
		RecipesUtil.addRecipe(ItemLoader.iron_bowl_cheese, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.iron_bowl_cheese,new Object[]{
				ItemLoader.iron_bowl,"foodCheese","foodCheese","listAllheavycream"
		}));
		
		RecipesUtil.addRecipe(ItemLoader.iron_bowl_batter, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.iron_bowl_batter,new Object[]{
				ItemLoader.iron_bowl,ItemLoader.iron_bowl_egg,"listAllmilk","foodFlour","foodFlour","listAllsugar"
		}));
		registerBatterInBowl(ItemLoader.iron_bowl_batter_berry, "listAllberry");
		registerBatterInBowl(ItemLoader.iron_bowl_batter_chocolate, "foodCocoapowder");
		registerBatterInBowl(ItemLoader.iron_bowl_batter_lemon, "cropLemon");
		registerBatterInBowl(ItemLoader.iron_bowl_batter_red, "dyeRed");
		RecipesUtil.addRecipe(BlockLoader.plateItem, new ShapedOreRecipe(new ResourceLocation(""),BlockLoader.plateItem,new Object[]{
				"   ","WDW"," W ",'W',new ItemStack(Blocks.CONCRETE,1,0),'D',"dyeWhite"
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+ItemLoader.coffee_bean_raw.getUnlocalizedName().substring(5)+"_2", new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.coffee_bean_raw,new Object[]{
				"cropCoffee","listAllwater"
		}));
		RecipesUtil.addRecipe(DrinksLoader.cup_glass, new ShapedOreRecipe(new ResourceLocation(""), DrinksLoader.cup_glass,new Object[]{
				"W W","W W"," G ",'W',"paneGlassColorless",'G',"blockGlassColorless"
		}));

		RecipesUtil.addRecipe(ItemLoader.bag, new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.bag,8),new Object[]{
				" D "," W "," D ",'W',Blocks.WOOL,'D',"string"
		}));
		
		RecipesUtil.addRecipe(ItemLoader.moka_top, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.moka_top,new Object[]{
				" IB","III","I I",'I',"ingotIron",'B',"dyeBlack"
		}));
		
		RecipesUtil.addRecipe(ItemLoader.moka_bottom, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.moka_bottom,new Object[]{
				" U ","III","UUU",'I',"ingotIron",'U',"stone"
		}));
		RecipesUtil.addRecipe(ItemLoader.turkey_coffee_pot, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.turkey_coffee_pot,new Object[]{
				"  U","IYI","III",'I',"ingotIron",'U',"stone",'Y',"dyeYellow"
		}));

		RecipesUtil.addRecipe(ItemLoader.moka_pot_unheated, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.moka_pot_unheated,new Object[]{
				ItemLoader.moka_top,ItemLoader.moka_bottom,"listAllwater","dustCoffee"
		}));
		RecipesUtil.addRecipe(ItemLoader.turkey_coffee_pot_unheated, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.turkey_coffee_pot_unheated,new Object[]{
				ItemLoader.turkey_coffee_pot,"listAllwater","dustCoffee","dustCoffee"
		}));
		RecipesUtil.addRecipe(BlockLoader.GrinderItem, new ShapedOreRecipe(new ResourceLocation(""), BlockLoader.GrinderItem,new Object[]{
				"LLL","ISI","LHL",'I',"ingotIron",'L',"logWood",'S',"stone",'H',Blocks.FURNACE
		}));
		
		RecipesUtil.addRecipe(BlockLoader.RollerItem, new ShapedOreRecipe(new ResourceLocation(""), BlockLoader.RollerItem,new Object[]{
				"LIL","IHI","LIL",'I',"ingotIron",'L',"logWood",'H',Blocks.FURNACE
		}));
		
		RecipesUtil.addRecipe(BlockLoader.Coffee_MachineItem, new ShapedOreRecipe(new ResourceLocation(""), BlockLoader.Coffee_MachineItem,new Object[]{
				"III","ISI","LHL",'I',"plateIron",'L',"blockRedstone",'S',"stone",'H',"listAllwater"
		}));
		
		RecipesUtil.addRecipe(BlockLoader.Icecream_MachineItem, new ShapedOreRecipe(new ResourceLocation(""), BlockLoader.Icecream_MachineItem,new Object[]{
				"LLL","ISI","LHL",'I',"blockIron",'L',"logWood",'S',"stone",'H',Blocks.SNOW
		}));
		
		RecipesUtil.addRecipe(ItemLoader.dough, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.dough,new Object[]{
				ItemLoader.mixing_bowl,"foodFlour","listAllwater",ItemLoader.yeast
		}));
		RecipesUtil.addRecipe(ItemLoader.dough_baguette, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.dough_baguette,new Object[]{
				"foodDough","foodDough"
		}));
		RecipesUtil.addRecipe(ItemLoader.dough_cookie, new ShapelessOreRecipe(new ResourceLocation(""),ItemLoader.dough_cookie,new Object[]{
				"foodDough",ItemLoader.chocolate_chip
		}));

		RecipesUtil.addRecipe(ItemLoader.yeast, new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.yeast,4),new Object[]{
				"listAllmushroom","listAllmushroom",ItemLoader.mixing_bowl,"listAllsugar"
		}));
		
		RecipesUtil.addRecipe(ItemLoader.cream_milk, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.cream_milk,new Object[]{
				"listAllmilk",ItemLoader.mixing_bowl,"listAllsugar"
		}));
		RecipesUtil.addRecipe(ItemLoader.custard, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.custard,new Object[]{
				"listAllmilk",ItemLoader.mixing_bowl,"listAllsugar","listAllegg"
		}));
		RecipesUtil.addRecipe(ItemLoader.butter, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.butter,new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream"
		}));
		
		RecipesUtil.addRecipe(ItemLoader.cheese, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.cheese,new Object[]{
				ItemLoader.mixing_bowl,"listAllmilk",ItemLoader.yeast
		}));
		
		RecipesUtil.addRecipe(ItemLoader.cream_apple, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.cream_apple,new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","cropApple"
		}));
		RecipesUtil.addRecipe(ItemLoader.cream_chocolate, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.cream_chocolate,new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","foodCocoapowder"
		}));
		RecipesUtil.addRecipe(ItemLoader.cream_melon, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.cream_melon,new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream",Items.MELON
		}));
		RecipesUtil.addRecipe(ItemLoader.cream_coffee, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.cream_coffee,new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","dustCoffee"
		}));
		RecipesUtil.addRecipe(ItemLoader.cream_berry, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.cream_berry,new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","listAllberry"
		}));
		RecipesUtil.addRecipe(ItemLoader.cream_lemon, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.cream_lemon,new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","cropLemon"
		}));
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllmilk")){
		registerIcecream(new ItemStack(ItemLoader.icecream_vanilla),coffee_bean);
		}
		registerIcecream(new ItemStack(ItemLoader.icecream_apple),ItemLoader.cream_apple);
		registerIcecream(new ItemStack(ItemLoader.icecream_chocolate),ItemLoader.cream_chocolate);
		registerIcecream(new ItemStack(ItemLoader.icecream_lemon),ItemLoader.cream_lemon);
		registerIcecream(new ItemStack(ItemLoader.icecream_coffee),ItemLoader.cream_coffee);
		registerIcecream(new ItemStack(ItemLoader.icecream_berry),ItemLoader.cream_berry);
		registerIcecream(new ItemStack(ItemLoader.icecream_melon),ItemLoader.cream_melon);
		
		registerCookieIcecream(ItemLoader.cookie_icecream_vanilla, ItemLoader.icecream_vanilla);
		registerCookieIcecream(ItemLoader.cookie_icecream_apple, ItemLoader.icecream_apple);
		registerCookieIcecream(ItemLoader.cookie_icecream_chocolate, ItemLoader.icecream_chocolate);
		registerCookieIcecream(ItemLoader.cookie_icecream_lemon, ItemLoader.icecream_lemon);
		registerCookieIcecream(ItemLoader.cookie_icecream_coffee, ItemLoader.icecream_coffee);
		registerCookieIcecream(ItemLoader.cookie_icecream_berry, ItemLoader.icecream_berry);
		registerCookieIcecream(ItemLoader.cookie_icecream_melon, ItemLoader.icecream_melon);
		
		registerCoffeePlate(BlockLoader.coffeeBlockItem, DrinksLoader.coffee);
		registerCoffeePlate(BlockLoader.cocoaBlockItem, DrinksLoader.cocoa);
		registerCoffeePlate(BlockLoader.coffee_americanBlockItem, DrinksLoader.coffee_american);
		registerCoffeePlate(BlockLoader.coffee_latteBlockItem, DrinksLoader.coffee_latte);
		registerCoffeePlate(BlockLoader.coffee_cappuccinoBlockItem, DrinksLoader.coffee_cappuccino);
		registerCoffeePlate(BlockLoader.coffee_mochaccinoBlockItem, DrinksLoader.coffee_mochaccino);
		registerCoffeePlate(BlockLoader.espressoBlockItem, DrinksLoader.espresso);
		registerCoffeePlate(BlockLoader.coffee_macchiatoBlockItem, DrinksLoader.coffee_macchiato);
		registerCoffeePlate(BlockLoader.strong_cocoaBlockItem, DrinksLoader.strong_cocoa);
		
		registerBag(BlockLoader.bag_flourItem,ItemLoader.flour,"foodFlour",BlockLoader.double_bag_flourItem);
		registerBag(BlockLoader.bag_coffee_powderItem,ItemLoader.coffee_powder,"dustCoffee",BlockLoader.double_bag_coffee_powderItem);
		registerBag(BlockLoader.bag_cocoaItem,ItemLoader.cocoa_bean,BlockLoader.double_bag_cocoaItem);
		registerBag(BlockLoader.bag_cocoa_powderItem,ItemLoader.cocoa_powder,"foodCocoapowder",BlockLoader.double_bag_cocoa_powderItem);
		registerBag(BlockLoader.bag_sugarItem,Items.SUGAR,"listAllsugar",BlockLoader.double_bag_sugarItem);
		registerBag(BlockLoader.bag_coffee_rawItem,ItemLoader.coffee_bean_raw,BlockLoader.double_bag_coffee_rawItem);
		registerBag(BlockLoader.bag_coffeeItem,ItemLoader.coffee_bean,"beanCoffee",BlockLoader.double_bag_coffeeItem);
	}
	private static void registerIcecream(ItemStack result,ItemStack icecream) {
		IcecreamMachineRecipes.instance().addSmeltingRecipe(icecream, result, 0F);
	}
	private static void registerIcecream(ItemStack result,Item icecream) {
		IcecreamMachineRecipes.instance().addSmelting(icecream, result, 0F);
	}
	private static void registerCookieIcecream(Item result,Item icecream) {
		RecipesUtil.addRecipe(result, new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				Items.COOKIE,icecream
		}));
	}
	
	private static void registerBag(Item result,Item icecream,Item twobags) {
		RecipesUtil.addRecipe(result, new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				ItemLoader.bag,icecream,icecream,icecream,icecream,icecream,icecream,icecream,icecream
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+"bag2"+result.getRegistryName().getResourcePath(), new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(icecream,8),new Object[]{
				result
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+result.getRegistryName().getResourcePath()+"_plus", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(twobags),new Object[]{
				result,result
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+result.getRegistryName().getResourcePath()+"_one", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(result,2),new Object[]{
				twobags
		}));
	}
	
	private static void registerBag(Item result,Item icecream,String ore,Item twobags) {
		RecipesUtil.addRecipe(result, new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				ItemLoader.bag,ore,ore,ore,ore,ore,ore,ore,ore
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+"bag2"+icecream.getRegistryName().getResourcePath(), new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(icecream,8),new Object[]{
				result
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+result.getRegistryName().getResourcePath()+"_plus", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(twobags),new Object[]{
				result,result
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+result.getRegistryName().getResourcePath()+"_one", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(result,2),new Object[]{
				twobags
		}));
	}
	public static void registerCoffeePlate(Item result,Item icecream) {
		RecipesUtil.addRecipe(result, new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				BlockLoader.plateItem,icecream
		}));
	}
	public static void registerBatterInBowl(Item result,Item input) {
		RecipesUtil.addRecipe(result, new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				ItemLoader.iron_bowl_batter,input
		}));
	}
	public static void registerBatterInBowl(Item result,String input) {
		RecipesUtil.addRecipe(result, new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				ItemLoader.iron_bowl_batter,input
		}));
	}
}
