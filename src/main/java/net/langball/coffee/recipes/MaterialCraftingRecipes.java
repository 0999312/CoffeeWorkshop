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
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.materials,1,2), 0F);
		}
		GrinderRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.materials,1,3), new ItemStack(ItemLoader.materials,1,4), 0F);
		for(ItemStack coffee_bean : OreDictionary.getOres("foodCocoapowder")){
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.materials,1,7), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllwheat")){
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.materials,1,15), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllgrain")){
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.materials,1,15), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("foodChocolatebar")){
			GrinderRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.materialFood,1,4), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllheavycream")){
			IcecreamMachineRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(ItemLoader.icecream,1,0), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllwater")){
			IcecreamMachineRecipes.instance().addSmeltingRecipe(coffee_bean, new ItemStack(Blocks.ICE), 0F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllmilk")){
			CoffeeMachineRecipes.instance().addSmeltingRecipe(coffee_bean,new ItemStack(ItemLoader.materialFood,1,8), 1F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("ingotIron")){
			RollerRecipes.instance().addSmeltingRecipe(coffee_bean,new ItemStack(ItemLoader.materials,1,11), 1F);
		}
		for(ItemStack coffee_bean : OreDictionary.getOres("foodDough")){
			RollerRecipes.instance().addSmeltingRecipe(coffee_bean,new ItemStack(ItemLoader.materials,1,25), 1F);
		}
		RecipesUtil.addRecipe("dough_pastry", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,1,17),new Object[]{
				"foodDough","foodButter","listAllegg"
		}));
		RollerRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.materials,1,17),new ItemStack(ItemLoader.materials,1,26), 1F);
		RollerRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.materials,1,17), new ItemStack(ItemLoader.materials,1,26), 0F);
		RollerRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.materials,1,19),new ItemStack(ItemLoader.materials,1,27), 1F);	
		GrinderRecipes.instance().addSmeltingRecipe(new ItemStack(BlockLoader.Soda_OreItem),new ItemStack(ItemLoader.materials,4,14), 1F);	
		GrinderRecipes.instance().addSmeltingRecipe(new ItemStack(Blocks.ICE),new ItemStack(ItemLoader.materials,1,9), 0F);
		GrinderRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.coffee_seeds),new ItemStack(ItemLoader.materials,1,0), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materials,1,0), new ItemStack(ItemLoader.materials,1,1), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materials,1,1), new ItemStack(ItemLoader.materials,1,3), 0F);
		GameRegistry.addSmelting(new ItemStack(Items.DYE,1,3), new ItemStack(ItemLoader.materials,1,5), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.materialFood,1,9), new ItemStack(ItemLoader.materialFood,1,11), 1F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.coffee_pot,1,2), new ItemStack(ItemLoader.coffee_pot,1,3), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.coffee_pot,1,5), new ItemStack(ItemLoader.coffee_pot,1,6), 0F);
		CoffeeMachineRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.materials,1,4),new ItemStack(DrinksLoader.espresso), 1F);
		RecipesUtil.addRecipe(DrinksLoader.cup, new ShapedOreRecipe(new ResourceLocation(""), DrinksLoader.cup,new Object[]{
				"W W","W W"," W ",'W',new ItemStack(Blocks.HARDENED_CLAY,1,0)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_instant_box, new ShapedOreRecipe(new ResourceLocation(""), DrinksLoader.coffee_instant_box,new Object[]{
				"WWW","WWW","WWW",'W',new ItemStack(DrinksLoader.coffee_instant)
		}));
		RecipesUtil.addRecipe(DrinksLoader.coffee_instant, new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(DrinksLoader.coffee_instant,9),new Object[]{
				DrinksLoader.coffee_instant_box
		}));
		RecipesUtil.addRecipe(BlockLoader.GingerHouseItem, new ShapedOreRecipe(new ResourceLocation(""), BlockLoader.GingerHouseItem,new Object[]{
				" W ","WWW","WWW",'W',new ItemStack(ItemLoader.materialFood,1,13)
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
		RecipesUtil.addRecipe(ItemLoader.cake_model_plate, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.cake_model_plate,new Object[]{
				"IWI",'I',"plateIron",'W',"ingotIron"
		}));
		RecipesUtil.addRecipe(ItemLoader.cake_model_square, new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.cake_model_square,new Object[]{
				"IWI",'I',"plateIron",'W',ItemLoader.cake_model_plate
		}));
		RecipesUtil.addRecipe("iron_bowl_egg", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.iron_bowl_batter,1,0),new Object[]{
				ItemLoader.iron_bowl,"listAllegg","listAllegg","listAllegg"
		}));
		RecipesUtil.addRecipe(ItemLoader.vanilla_seeds, new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.vanilla_seeds,2),new Object[]{
				ItemLoader.vanilla
		}));
		RecipesUtil.addRecipe("iron_bowl_cheese", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.iron_bowl_batter,1,1),new Object[]{
				ItemLoader.iron_bowl,"foodCheese","foodCheese","listAllheavycream"
		}));
		RecipesUtil.addRecipe(BlockLoader.XmasTreeItem, new ShapelessOreRecipe(new ResourceLocation(""), BlockLoader.XmasTreeItem,new Object[]{
				"treeSapling","treeLeaves","treeLeaves","dye","dye"
		}));
		registerBatterInBowl(new ItemStack(ItemLoader.iron_bowl_batter,1,3), "dustCoffee","iron_bowl_batter_coffee");
		registerBatterInBowl(new ItemStack(ItemLoader.iron_bowl_batter,1,8), "cropPumpkin","iron_bowl_batter_pumpkin");
		registerBatterInBowl(new ItemStack(ItemLoader.iron_bowl_batter,1,10), "dustMatcha","iron_bowl_batter_tea");
		registerBatterInBowl(new ItemStack(ItemLoader.iron_bowl_batter,1,9), "cropCarrot","iron_bowl_batter_carrot");
		registerBatterInBowl(new ItemStack(ItemLoader.iron_bowl_batter,1,4), "listAllberry","iron_bowl_batter_berry");
		registerBatterInBowl(new ItemStack(ItemLoader.iron_bowl_batter,1,5), "foodCocoapowder","iron_bowl_batter_chocolate");
		registerBatterInBowl(new ItemStack(ItemLoader.iron_bowl_batter,1,7), "cropLemon","iron_bowl_batter_lemon");
		registerBatterInBowl(new ItemStack(ItemLoader.iron_bowl_batter,1,6), "dyeRed","iron_bowl_batter_red");
		RecipesUtil.addRecipe(BlockLoader.plateItem, new ShapedOreRecipe(new ResourceLocation(""),BlockLoader.plateItem,new Object[]{
				"   ","WDW"," W ",'W',new ItemStack(Blocks.HARDENED_CLAY,1,0),'D',"dyeWhite"
		}));

		RecipesUtil.addRecipe("gelatin", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,4,13),new Object[]{
				"slimeball","slimeball","dyeWhite"
		}));
		
		RecipesUtil.addRecipe("dough_ginger", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,1,19),new Object[]{
				"foodDough",new ItemStack(ItemLoader.materials,1,12)
		}));
		
		RecipesUtil.addRecipe("spices", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,4,12),new Object[]{
				"listAllspice","cropGinger","cropGinger"
		}));
		
		RecipesUtil.addRecipe(ItemLoader.record_blank, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.record_blank,new Object[]{
				"plateIron","dyeBlack","dyeBlack"
		}));
		RecipesUtil.addRecipe(ItemLoader.kusa_noshi_to_ne, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.kusa_noshi_to_ne,new Object[]{
				ItemLoader.record_blank,"dyeBlack"
		}));
		RecipesUtil.addRecipe(ItemLoader.lazt_lady_kaguya, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.lazt_lady_kaguya,new Object[]{
				ItemLoader.record_blank,"dyeRed"
		}));
		RecipesUtil.addRecipe(ItemLoader.the_grimoire_of_marisa, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.the_grimoire_of_marisa,new Object[]{
				ItemLoader.record_blank,"dyeYellow"
		}));
		RecipesUtil.addRecipe(DrinksLoader.cup_glass, new ShapedOreRecipe(new ResourceLocation(""), DrinksLoader.cup_glass,new Object[]{
				"W W","W W"," G ",'W',"paneGlassColorless",'G',"blockGlassColorless"
		}));
		
		
		RecipesUtil.addRecipe("bag_cloth", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,8,8),new Object[]{
				" D ","DWD"," D ",'W',Blocks.WOOL,'D',"string"
		}));
		
		RecipesUtil.addRecipe("bag", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.bag,4),new Object[]{
				" W ","DWD"," W ",'W',new ItemStack(ItemLoader.materials,1,8),'D',"string"
		}));
		
		RecipesUtil.addRecipe("moka_top", new ShapedOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.coffee_pot,1,0),new Object[]{
				" IB","III","I I",'I',"ingotIron",'B',"dyeBlack"
		}));
		
		RecipesUtil.addRecipe("moka_bottom", new ShapedOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.coffee_pot,1,1),new Object[]{
				" U ","III","UUU",'I',"ingotIron",'U',"stone"
		}));
		RecipesUtil.addRecipe("turkey_coffee_pot", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.coffee_pot,1,4),new Object[]{
				"  U","IYI","III",'I',"ingotIron",'U',"stone",'Y',"dyeYellow"
		}));

		RecipesUtil.addRecipe("moka_pot_unheated", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.coffee_pot,1,2),new Object[]{
				new ItemStack(ItemLoader.coffee_pot,1,0),new ItemStack(ItemLoader.coffee_pot,1,1),"listAllwater","dustCoffee"
		}));
		RecipesUtil.addRecipe("turkey_coffee_pot_unheated", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.coffee_pot,1,5),new Object[]{
				new ItemStack(ItemLoader.coffee_pot,1,4),"listAllwater","dustCoffee","dustCoffee"
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
		
		RecipesUtil.addRecipe("dough", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,1,16),new Object[]{
				ItemLoader.mixing_bowl,"foodFlour","listAllwater","powderBaking"
		}));
		RecipesUtil.addRecipe("dough_bread", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,1,20),new Object[]{
				"foodDough","powderBaking","foodFlour"
		}));
		RecipesUtil.addRecipe("dough_bread_round", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,1,21),new Object[]{
				"foodDough","powderBaking"
		}));
		RecipesUtil.addRecipe("dough_baguette", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,1,22),new Object[]{
				"foodDough","foodDough"
		}));
		RecipesUtil.addRecipe("dough_bagel", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,1,23),new Object[]{
				"foodDough","listAllegg"
		}));
		
		RecipesUtil.addRecipe("dough_toast", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,1,24),new Object[]{
				"foodDough","foodDough","listAllegg"
		}));
		
		RecipesUtil.addRecipe("dough_cookie", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.materials,1,18),new Object[]{
				"foodDough",new ItemStack(ItemLoader.materialFood,1,4)
		}));

		RecipesUtil.addRecipe("yeast", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materials,8,10),new Object[]{
				"listAllmushroom",ItemLoader.mixing_bowl,"listAllsugar"
		}));
		
		RecipesUtil.addRecipe("cream_milk", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.cream,1,0),new Object[]{
				"listAllmilk",ItemLoader.mixing_bowl,"foodVanilla"
		}));
		RecipesUtil.addRecipe("custard", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materialFood,1,7),new Object[]{
				"listAllmilk",ItemLoader.mixing_bowl,"listAllsugar","listAllegg"
		}));
		RecipesUtil.addRecipe("butter", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.materialFood,1,0),new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream"
		}));
		
		RecipesUtil.addRecipe("cheese", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.materialFood,1,1),new Object[]{
				ItemLoader.mixing_bowl,"listAllmilk",new ItemStack(ItemLoader.materials,1,10)
		}));
		
		RecipesUtil.addRecipe("cream_apple", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.cream,1,3),new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","cropApple"
		}));
		RecipesUtil.addRecipe("cream_chocolate", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.cream,1,1),new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","foodCocoapowder"
		}));
		RecipesUtil.addRecipe("cream_melon", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.cream,1,5),new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream",Items.MELON
		}));
		RecipesUtil.addRecipe("cream_coffee", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.cream,1,2),new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","dustCoffee"
		}));
		RecipesUtil.addRecipe("cream_berry", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.cream,1,4),new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","listAllberry"
		}));
		RecipesUtil.addRecipe("cream_lemon", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.cream,1,6),new Object[]{
				ItemLoader.mixing_bowl,"listAllheavycream","cropLemon"
		}));
		for(ItemStack coffee_bean : OreDictionary.getOres("listAllmilk")){
		registerIcecream(new ItemStack(ItemLoader.icecream,1,0),coffee_bean);
		}
		registerIcecream(new ItemStack(ItemLoader.icecream,1,3),new ItemStack(ItemLoader.cream,1,3));
		registerIcecream(new ItemStack(ItemLoader.icecream,1,1),new ItemStack(ItemLoader.cream,1,1));
		registerIcecream(new ItemStack(ItemLoader.icecream,1,6),new ItemStack(ItemLoader.cream,1,6));
		registerIcecream(new ItemStack(ItemLoader.icecream,1,2),new ItemStack(ItemLoader.cream,1,2));
		registerIcecream(new ItemStack(ItemLoader.icecream,1,4),new ItemStack(ItemLoader.cream,1,4));
		registerIcecream(new ItemStack(ItemLoader.icecream,1,5),new ItemStack(ItemLoader.cream,1,5));
		
		registerCookieIcecream(new ItemStack(ItemLoader.cookie_icecream,1,0), new ItemStack(ItemLoader.icecream,1,0),"cookie_icecream_vanilla");
		registerCookieIcecream(new ItemStack(ItemLoader.cookie_icecream,1,3), new ItemStack(ItemLoader.icecream,1,3),"cookie_icecream_apple");
		registerCookieIcecream(new ItemStack(ItemLoader.cookie_icecream,1,1), new ItemStack(ItemLoader.icecream,1,1),"cookie_icecream_chocolate");
		registerCookieIcecream(new ItemStack(ItemLoader.cookie_icecream,1,6), new ItemStack(ItemLoader.icecream,1,6),"cookie_icecream_lemon");
		registerCookieIcecream(new ItemStack(ItemLoader.cookie_icecream,1,2), new ItemStack(ItemLoader.icecream,1,2),"cookie_icecream_coffee");
		registerCookieIcecream(new ItemStack(ItemLoader.cookie_icecream,1,4), new ItemStack(ItemLoader.icecream,1,4),"cookie_icecream_berry");
		registerCookieIcecream(new ItemStack(ItemLoader.cookie_icecream,1,5), new ItemStack(ItemLoader.icecream,1,5),"cookie_icecream_melon");
		
		registerCoffeePlate(BlockLoader.coffeeBlockItem, DrinksLoader.coffee);
		registerCoffeePlate(BlockLoader.cocoaBlockItem, DrinksLoader.cocoa);
		registerCoffeePlate(BlockLoader.coffee_americanBlockItem, DrinksLoader.coffee_american);
		registerCoffeePlate(BlockLoader.coffee_latteBlockItem, DrinksLoader.coffee_latte);
		registerCoffeePlate(BlockLoader.coffee_cappuccinoBlockItem, DrinksLoader.coffee_cappuccino);
		registerCoffeePlate(BlockLoader.coffee_mochaccinoBlockItem, DrinksLoader.coffee_mochaccino);
		registerCoffeePlate(BlockLoader.espressoBlockItem, DrinksLoader.espresso);
		registerCoffeePlate(BlockLoader.coffee_macchiatoBlockItem, DrinksLoader.coffee_macchiato);
		registerCoffeePlate(BlockLoader.strong_cocoaBlockItem, DrinksLoader.strong_cocoa);
		registerCoffeePlate(BlockLoader.coffee_cheeseBlockItem, DrinksLoader.coffee_cheese);
		
		registerCoffeePlate(BlockLoader.coffee_lemonBlockItem, DrinksLoader.coffee_lemon);
		registerCoffeePlate(BlockLoader.coffee_creamBlockItem, DrinksLoader.coffee_cream);
		registerCoffeePlate(BlockLoader.coffee_berryBlockItem, DrinksLoader.coffee_berry);
		registerCoffeePlate(BlockLoader.coffee_vanillaBlockItem, DrinksLoader.coffee_vanilla);
		registerCoffeePlate(BlockLoader.coffee_instantBlockItem, DrinksLoader.coffee_instant);
		
		registerCoffeePlate(BlockLoader.coffee_mintBlockItem, DrinksLoader.coffee_mint);
		registerCoffeePlate(BlockLoader.coffee_icecreamBlockItem, DrinksLoader.coffee_icecream);
		registerCoffeePlate(BlockLoader.cocoa_gingerbreadBlockItem, DrinksLoader.cocoa_gingerbread);
		registerCoffeePlate(BlockLoader.cocoa_marshmallowBlockItem, DrinksLoader.cocoa_marshmallow);
		
		registerBag(BlockLoader.bag_flourItem,new ItemStack(ItemLoader.materials,9,15),"foodFlour",BlockLoader.double_bag_flourItem,"flour");
		registerBag(BlockLoader.bag_coffee_powderItem,new ItemStack(ItemLoader.materials,9,4),"dustCoffee",BlockLoader.double_bag_coffee_powderItem,"coffeePowder");
		registerBag(BlockLoader.bag_cocoaItem,new ItemStack(ItemLoader.materials,9,5),BlockLoader.double_bag_cocoaItem,"cocoa");
		registerBag(BlockLoader.bag_cocoa_powderItem,new ItemStack(ItemLoader.materials,9,6),"foodCocoapowder",BlockLoader.double_bag_cocoa_powderItem,"cocoaPowder");
		registerBag(BlockLoader.bag_sugarItem,new ItemStack(Items.SUGAR),"listAllsugar",BlockLoader.double_bag_sugarItem,"sugar");
		registerBag(BlockLoader.bag_coffee_rawItem,new ItemStack(ItemLoader.materials,9,0),BlockLoader.double_bag_coffee_rawItem,"coffeeRaw");
		registerBag(BlockLoader.bag_coffeeItem,new ItemStack(ItemLoader.materials,9,3),"beanCoffee",BlockLoader.double_bag_coffeeItem,"coffee");
	}
	private static void registerIcecream(ItemStack result,ItemStack icecream) {
		IcecreamMachineRecipes.instance().addSmeltingRecipe(icecream, result, 0F);
	}

	private static void registerCookieIcecream(ItemStack result,ItemStack icecream,String name) {
		RecipesUtil.addRecipe(name, new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				Items.COOKIE,icecream
		}));
	}
	
	private static void registerBag(Item result,ItemStack icecream,Item twobags,String name) {
		ItemStack icecream2 =icecream.copy();
		icecream2.setCount(1);
		RecipesUtil.addRecipe(name+"2bag", new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				
				new ItemStack(ItemLoader.bag),icecream2,icecream2,icecream2,icecream2,icecream2,icecream2,icecream2,icecream2
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+"bag2"+name, new ShapelessOreRecipe(new ResourceLocation(""), icecream,new Object[]{
				result
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+name+"_plus", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(twobags),new Object[]{
				result,result
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+name+"_one", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(result,2),new Object[]{
				twobags
		}));
	}
	
	private static void registerBag(Item result,ItemStack icecream,String ore,Item twobags,String name) {
		RecipesUtil.addRecipe(name+"2bag", new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				new ItemStack(ItemLoader.bag),ore,ore,ore,ore,ore,ore,ore,ore
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+"bag2"+name, new ShapelessOreRecipe(new ResourceLocation(""), icecream,new Object[]{
				result
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+name+"_plus", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(twobags),new Object[]{
				result,result
		}));
		RecipesUtil.addRecipe(CoffeeWork.MODID+"."+name+"_one", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(result,2),new Object[]{
				twobags
		}));
	}
	public static void registerCoffeePlate(Item result,Item icecream) {
		RecipesUtil.addRecipe(result, new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				BlockLoader.plateItem,icecream
		}));
	}

	public static void registerBatterInBowl(ItemStack result,String input,String name) {
		RecipesUtil.addRecipe(name+"_2", new ShapelessOreRecipe(new ResourceLocation(""), result,new Object[]{
				new ItemStack(ItemLoader.iron_bowl_batter,1,2),input
		}));
	}
}
