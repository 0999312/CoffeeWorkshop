package net.langball.coffee.item;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.CommonProxy;
import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.util.JSON_Creator;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.ForgeRegistry;

public class ItemLoader {
	public static Item coffee_seeds = new SeedCoffee();
	
	public static Item moka_top = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"moka_top").setMaxStackSize(1);
	public static Item moka_bottom = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"moka_bottom").setMaxStackSize(1);
	public static Item moka_pot_unheated = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"moka_pot_unheated").setMaxStackSize(1);
	public static Item moka_pot_heated = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"moka_pot_heated").setMaxStackSize(1);
	
	public static Item turkey_coffee_pot = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"turkey_coffee_pot").setMaxStackSize(1);
	public static Item turkey_coffee_pot_unheated = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"turkey_coffee_pot_unheated").setMaxStackSize(1);
	public static Item turkey_coffee_pot_heated = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"turkey_coffee_pot_heated").setMaxStackSize(1);
	
	public static Item coffee_bean_raw = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_bean_raw");
	public static Item coffee_bean = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_bean");
	public static Item ice_slag = new ItemFood(0, false).setUnlocalizedName(CoffeeWork.MODID+"."+"ice_slag");
	public static Item bag = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"bag");
	public static Item coffee_powder = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_powder");
	public static Item cocoa_bean = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cocoa_bean");
	public static Item cocoa_powder = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cocoa_powder");
	public static Item cocoa_batter = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cocoa_batter");
	public static Item flour = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"flour");
	public static Item dough = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"dough");
	public static Item dough_pastry = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"dough_pastry");
	public static Item dough_cookie = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"dough_cookie");
	public static Item dough_baguette = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"dough_baguette");
	
	public static Item plate_dough = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"plate_dough");
	public static Item plate_iron = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"plate_iron");
	public static Item plate_dough_pastry = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"plate_dough_pastry");
	
	public static Item chocolate_bar = new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"chocolate_bar");
	public static Item chocolate_chip = new ItemFood(1, false).setUnlocalizedName(CoffeeWork.MODID+"."+"chocolate_chip");
	public static Item baguette = new ItemFood(7,false).setUnlocalizedName(CoffeeWork.MODID+"."+"baguette");
	public static Item icecream_vanilla=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"icecream_vanilla");
	public static Item icecream_chocolate=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"icecream_chocolate");
	public static Item icecream_coffee=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"icecream_coffee");
	public static Item icecream_apple=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"icecream_apple");
	public static Item icecream_berry=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"icecream_berry");
	public static Item icecream_melon=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"icecream_melon");
	public static Item icecream_lemon=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"icecream_lemon");
	
	public static Item cream_milk=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cream_milk");
	public static Item cream_chocolate=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cream_chocolate");
	public static Item cream_coffee=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cream_coffee");
	public static Item cream_apple=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cream_apple");
	public static Item cream_berry=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cream_berry");
	public static Item cream_melon=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cream_melon");
	public static Item cream_lemon=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cream_lemon");
	public static Item custard=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"custard");
	public static Item milk_form=new ItemFood(1, false).setUnlocalizedName(CoffeeWork.MODID+"."+"milk_form");
	
	public static Item cookie_icecream_vanilla=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cookie_icecream_vanilla");
	public static Item cookie_icecream_chocolate=new ItemFood(8, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cookie_icecream_chocolate");
	public static Item cookie_icecream_coffee=new ItemFood(8, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cookie_icecream_coffee");
	public static Item cookie_icecream_apple=new ItemFood(8, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cookie_icecream_apple");
	public static Item cookie_icecream_berry=new ItemFood(8, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cookie_icecream_berry");
	public static Item cookie_icecream_melon=new ItemFood(8, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cookie_icecream_melon");
	public static Item cookie_icecream_lemon=new ItemFood(8, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cookie_icecream_lemon");
	

	public static Item brownie=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"brownie");
	public static Item D_bar=new ItemFood(6,6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"field_ration_d");
	public static Item muffin=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin");
	public static Item muffin_chocolate=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_chocolate");
	public static Item muffin_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_raw");
	public static Item muffin_chocolate_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_chocolate_raw");
	public static Item muffin_berry=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_berry");
	public static Item muffin_berry_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_berry_raw");
	public static Item muffin_redvelvet=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_redvelvet");
	public static Item muffin_redvelvet_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_redvelvet_raw");
	public static Item muffin_lemon=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_lemon");
	public static Item muffin_lemon_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_lemon_raw");
	public static Item butter=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"butter");
	public static Item cheese=new ItemFood(3, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cheese");
	
	public static Item cake_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_model").setMaxStackSize(1);
	public static Item cake_model_square = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_model_square").setMaxStackSize(1);
	public static Item cake_sponge_raw = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_raw").setMaxStackSize(1);
	public static Item cake_chocolate_raw = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_chocolate_raw").setMaxStackSize(1);
	public static Item cake_cheese_raw = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_cheese_raw").setMaxStackSize(1);
	public static Item cake_sponge_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_chocolate_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_chocolate_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_cheese_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_cheese_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item brownie_raw = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"brownie_raw").setMaxStackSize(1);
	public static Item brownie_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"brownie_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item tiramisu_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"tiramisu_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	
	public static Item cake_carrot_raw = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_carrot_raw").setMaxStackSize(1);
	public static Item cake_carrot_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_carrot_model").setMaxStackSize(1).setContainerItem(cake_model);
	
	public static Item cake_redvelvet_raw = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_redvelvet_raw").setMaxStackSize(1);
	public static Item cake_redvelvet_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_redvelvet_model").setMaxStackSize(1).setContainerItem(cake_model);
	
	public static Item croissant_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"croissant_raw");
	public static Item croissant_chocolate_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"croissant_chocolate_raw");
	public static Item croissant=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"croissant");
	public static Item croissant_chocolate=new ItemFood(8, false).setUnlocalizedName(CoffeeWork.MODID+"."+"croissant_chocolate");

	public static Item hardtack_raw=new ItemFood(1, false).setUnlocalizedName(CoffeeWork.MODID+"."+"hardtack_raw");
	public static Item plate_pastry_raw=new ItemFood(1, false).setUnlocalizedName(CoffeeWork.MODID+"."+"plate_pastry_raw");
	public static Item hardtack=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"hardtack");
	public static Item plate_pastry=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"plate_pastry");
	public static Item mille_feuille=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"mille_feuille");
	
	public static Item mixing_bowl = new ItemCooker().setUnlocalizedName(CoffeeWork.MODID+"."+"mixing_bowl");
	public static Item yeast = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"yeast");
	
	public static Item mooncake_model = new ItemCooker().setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake_model");
	public static Item mooncake_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake_raw");
	public static Item mooncake_egg_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake_egg_raw");
	public static Item mooncake_ham_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake_ham_raw");
	public static Item mooncake_fruit_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake_fruit_raw");
	public static Item mooncake=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake");
	public static Item mooncake_egg=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake_egg");
	public static Item mooncake_ham=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake_ham");
	public static Item mooncake_fruit=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake_fruit");
	
	public static Item blue_berry=new ItemFood(1, false).setUnlocalizedName(CoffeeWork.MODID+"."+"blueberry");
	
	public static Item iron_bowl = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl").setMaxStackSize(1);
	public static Item iron_bowl_egg = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_egg").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_cheese = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_cheese").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_berry = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_berry").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_chocolate = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_chocolate").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_red = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_red").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_lemon = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_lemon").setMaxStackSize(1).setContainerItem(iron_bowl);

	public static Item jiggy_cake_raw = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_raw").setMaxStackSize(1);
	public static Item jiggy_cake_chocolate_raw = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_chocolate_raw").setMaxStackSize(1);
	public static Item jiggy_cake_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake_chocolate_model = new ItemMaterial().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_chocolate_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake");
	public static Item jiggy_cake_chocolate=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_chocolate");
	
	public static Item cake_sponge_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_base");
	public static Item cake_sponge_chocolate_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_chocolate_base");
	public ItemLoader(FMLPreInitializationEvent event) {

		//cooker
		register(mixing_bowl);
		register(mooncake_model);
		
		//material
		register(plate_iron);
		register(bag);
		register(moka_top);
		register(moka_bottom);
		register(moka_pot_unheated);
		register(moka_pot_heated);
		register(turkey_coffee_pot);
		register(turkey_coffee_pot_unheated);
		register(turkey_coffee_pot_heated);
		register(milk_form);
		register(coffee_seeds);
		register(blue_berry);
		register(coffee_bean_raw);
		register(coffee_bean);
		register(coffee_powder);
		register(cocoa_bean);
		register(cocoa_powder);
		register(cocoa_batter);
		register(ice_slag);
		register(yeast);
		register(flour);
		register(dough);
		register(dough_cookie);
		register(dough_baguette);
		register(dough_pastry);

		register(plate_dough);
		register(plate_dough_pastry);
		register(chocolate_bar);
		register(chocolate_chip);
		register(cream_milk);
		register(cream_chocolate);
		register(cream_coffee);
		register(cream_apple);
		register(cream_berry);
		register(cream_melon);
		register(cream_lemon);
		register(butter);
		register(cheese);
		register(custard);
		
		register(iron_bowl);
		register(iron_bowl_egg);
		register(iron_bowl_cheese);
		register(iron_bowl_batter);
		register(iron_bowl_batter_berry);
		register(iron_bowl_batter_chocolate);
		register(iron_bowl_batter_red);
		register(iron_bowl_batter_lemon);
		//foods
		register(icecream_vanilla);
		register(icecream_chocolate);
		register(icecream_coffee);
		register(icecream_apple);
		register(icecream_berry);
		register(icecream_melon);
		register(icecream_lemon);
		register(cookie_icecream_vanilla);
		register(cookie_icecream_chocolate);
		register(cookie_icecream_coffee);
		register(cookie_icecream_apple);
		register(cookie_icecream_berry);
		register(cookie_icecream_melon);
		register(cookie_icecream_lemon);
		
		register(cake_model);
		register(cake_model_square);
		register(cake_sponge_raw);
		register(cake_chocolate_raw);
		register(cake_cheese_raw);
		register(cake_carrot_raw);
		register(cake_redvelvet_raw);
		register(cake_sponge_model);
		register(cake_chocolate_model);
		register(cake_cheese_model);
		register(cake_carrot_model);
		register(cake_redvelvet_model);
		register(brownie_raw);
		register(brownie_model);
		register(tiramisu_model);
		register(jiggy_cake_raw);
		register(jiggy_cake_chocolate_raw);
		register(jiggy_cake_model);
		register(jiggy_cake_chocolate_model);
		register(jiggy_cake);
		register(jiggy_cake_chocolate);
		register(cake_sponge_base);
		register(cake_sponge_chocolate_base);
		register(baguette);
		register(hardtack_raw);
		register(hardtack);
		register(plate_pastry_raw);
		register(plate_pastry);
		register(mille_feuille);
		register(muffin_raw);
		register(muffin_berry_raw);
		register(muffin_chocolate_raw);
		register(muffin_redvelvet_raw);
		register(muffin_lemon_raw);
		register(muffin);
		register(muffin_berry);
		register(muffin_chocolate);
		register(muffin_redvelvet);
		register(muffin_lemon);

		register(croissant_raw);
		register(croissant_chocolate_raw);
		register(croissant);
		register(croissant_chocolate);

		register(brownie);
		register(D_bar);
		//mooncakes
		register(mooncake_raw);
		register(mooncake_egg_raw);
		register(mooncake_ham_raw);
		register(mooncake_fruit_raw);
		register(mooncake);
		register(mooncake_egg);
		register(mooncake_ham);
		register(mooncake_fruit);
	}
	@SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
		registerRender(jiggy_cake_raw);
		registerRender(jiggy_cake_chocolate_raw);
		registerRender(jiggy_cake_model);
		registerRender(jiggy_cake_chocolate_model);
		registerRender(jiggy_cake);
		registerRender(jiggy_cake_chocolate);
		registerRender(cake_sponge_base);
		registerRender(cake_sponge_chocolate_base);
		registerRender(iron_bowl);
		registerRender(iron_bowl_egg);
		registerRender(iron_bowl_cheese);
		registerRender(iron_bowl_batter);
		registerRender(iron_bowl_batter_berry);
		registerRender(iron_bowl_batter_chocolate);
		registerRender(iron_bowl_batter_red);
		registerRender(iron_bowl_batter_lemon);
		registerRender(muffin_lemon);
		registerRender(muffin_lemon_raw);
		registerRender(muffin_redvelvet);
		registerRender(muffin_redvelvet_raw);
		
		registerRender(dough_pastry);
		registerRender(hardtack_raw);
		registerRender(hardtack);
		registerRender(plate_pastry_raw);
		registerRender(plate_pastry);
		registerRender(mille_feuille);
		
		registerRender(mooncake_model);
		registerRender(mooncake_raw);
		registerRender(mooncake_egg_raw);
		registerRender(mooncake);
		registerRender(mooncake_egg);
		registerRender(mooncake_ham_raw);
		registerRender(mooncake_fruit_raw);
		registerRender(mooncake_ham);
		registerRender(mooncake_fruit);
		registerRender(blue_berry);
		registerRender(plate_iron);
		registerRender(plate_dough);
		registerRender(plate_dough_pastry);
		
		registerRender(muffin_berry);
		registerRender(muffin_berry_raw);
		registerRender(mixing_bowl);
		registerRender(yeast);
		registerRender(cake_model);
		registerRender(cake_model_square);
		registerRender(cake_sponge_raw);
		registerRender(cake_chocolate_raw);
		registerRender(cake_cheese_raw);
		registerRender(cake_sponge_model);
		registerRender(cake_chocolate_model);
		registerRender(cake_cheese_model);
		registerRender(brownie_raw);
		registerRender(brownie_model);
		registerRender(tiramisu_model);
		registerRender(butter);
		registerRender(cheese);
		registerRender(cake_carrot_raw);
		registerRender(cake_carrot_model);
		registerRender(croissant_raw);
		registerRender(croissant);
		registerRender(croissant_chocolate_raw);
		registerRender(croissant_chocolate);
		registerRender(cake_redvelvet_raw);
		registerRender(cake_redvelvet_model);
		registerRender(D_bar);
		registerRender(brownie);
		
		registerRender(muffin_raw);
		registerRender(muffin_chocolate_raw);
		registerRender(muffin);
		registerRender(muffin_chocolate);
		
		registerRender(turkey_coffee_pot);
		registerRender(turkey_coffee_pot_unheated);
		registerRender(turkey_coffee_pot_heated);
		registerRender(bag);
		registerRender(coffee_bean_raw);
		registerRender(moka_top);
		registerRender(moka_bottom);
		registerRender(moka_pot_unheated);
		registerRender(moka_pot_heated);
		registerRender(milk_form);
		registerRender(ice_slag);
		registerRender(cream_milk);
		registerRender(cream_chocolate);
		registerRender(cream_coffee);
		registerRender(cream_apple);
		registerRender(cream_berry);
		registerRender(cream_melon);
		registerRender(cream_lemon);
		
		registerRender(icecream_vanilla);
		registerRender(icecream_chocolate);
		registerRender(icecream_coffee);
		registerRender(icecream_apple);
		registerRender(icecream_berry);
		registerRender(icecream_melon);
		registerRender(icecream_lemon);
		
		registerRender(cookie_icecream_vanilla);
		registerRender(cookie_icecream_chocolate);
		registerRender(cookie_icecream_coffee);
		registerRender(cookie_icecream_apple);
		registerRender(cookie_icecream_berry);
		registerRender(cookie_icecream_melon);
		registerRender(cookie_icecream_lemon);
		
		registerRender(dough_cookie);
		registerRender(custard);
        registerRender(coffee_seeds);
        registerRender(coffee_bean);
        registerRender(coffee_powder);
        registerRender(cocoa_bean);
        registerRender(cocoa_powder);
        registerRender(cocoa_batter);
        registerRender(chocolate_bar);
        registerRender(chocolate_chip);
        registerRender(baguette);
        registerRender(flour);
        registerRender(dough);
        registerRender(dough_baguette);
    }
	private static void register(Item item)
    {
		item.setCreativeTab(CommonProxy.tab);
        ForgeRegistries.ITEMS.register(item.setRegistryName(item.getUnlocalizedName().substring(5+CoffeeWork.MODID.length()+1)));
    }
	@SideOnly(Side.CLIENT)
    private static void registerRender(Item item,String textureName)
    {
		JSON_Creator.genItem(item.getRegistryName().toString().substring(11), textureName, "json_create");
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
	@SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}
