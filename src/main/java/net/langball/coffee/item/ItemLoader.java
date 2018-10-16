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
	
	public static Item coffee_bean_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_bean_raw");
	public static Item coffee_bean = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_bean");
	public static Item ice_slag = new ItemFood(0, false).setUnlocalizedName(CoffeeWork.MODID+"."+"ice_slag");
	public static Item bag = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"bag");
	public static Item coffee_powder = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_powder");
	public static Item cocoa_bean = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cocoa_bean");
	public static Item cocoa_powder = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cocoa_powder");
	public static Item cocoa_batter = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cocoa_batter");
	public static Item flour = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"flour");
	public static Item dough = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"dough");
	public static Item dough_pastry = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"dough_pastry");
	public static Item dough_cookie = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"dough_cookie");
	public static Item dough_baguette = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"dough_baguette");
	
	public static Item plate_dough = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"plate_dough");
	public static Item plate_iron = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"plate_iron");
	public static Item plate_dough_pastry = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"plate_dough_pastry");
	
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
	
	public static Item butter=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"butter");
	public static Item cheese=new ItemFood(3, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cheese");
	
	public static Item cake_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_model").setMaxStackSize(1);
	public static Item cake_model_square = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_model_square").setMaxStackSize(1);
	public static Item cake_model_plate = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_model_plate").setMaxStackSize(1);
	
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
	public static Item yeast = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"yeast");
	
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
	
	public static Item iron_bowl = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl").setMaxStackSize(1);
	public static Item iron_bowl_egg = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_egg").setMaxStackSize(1);
	public static Item iron_bowl_cheese = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_cheese").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_coffee = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_coffee").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_berry = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_berry").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_chocolate = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_chocolate").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_red = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_red").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_lemon = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_lemon").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_pumpkin = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_pumpkin").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_carrot = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_carrot").setMaxStackSize(1).setContainerItem(iron_bowl);
	public static Item iron_bowl_batter_tea = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl_batter_tea").setMaxStackSize(1).setContainerItem(iron_bowl);
	
	public static Item cake_sponge_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_raw").setMaxStackSize(1);
	public static Item cake_sponge_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_sponge_plate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_plate_raw").setMaxStackSize(1);
	public static Item cake_sponge_plate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_plate_model").setMaxStackSize(1).setContainerItem(cake_model_plate);
	public static Item cake_sponge_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_base");
	public static Item jiggy_cake_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_raw").setMaxStackSize(1);
	public static Item jiggy_cake_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake");
	public static Item muffin_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_raw");
	public static Item muffin=new ItemFood(4, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin");
	
	public static Item cake_sponge_chocolate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_chocolate_raw").setMaxStackSize(1);
	public static Item cake_sponge_chocolate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_chocolate_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_sponge_chocolate_plate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_chocolate_plate_raw").setMaxStackSize(1);
	public static Item cake_sponge_chocolate_plate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_chocolate_plate_model").setMaxStackSize(1).setContainerItem(cake_model_plate);
	public static Item cake_sponge_chocolate_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_chocolate_base");
	public static Item jiggy_cake_chocolate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_chocolate_raw").setMaxStackSize(1);
	public static Item jiggy_cake_chocolate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_chocolate_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake_chocolate=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_chocolate");
	public static Item muffin_chocolate_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_chocolate_raw");
	public static Item muffin_chocolate=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_chocolate");
	
	public static Item cake_sponge_coffee_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_coffee_raw").setMaxStackSize(1);
	public static Item cake_sponge_coffee_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_coffee_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_sponge_coffee_plate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_coffee_plate_raw").setMaxStackSize(1);
	public static Item cake_sponge_coffee_plate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_coffee_plate_model").setMaxStackSize(1).setContainerItem(cake_model_plate);
	public static Item cake_sponge_coffee_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_coffee_base");
	public static Item jiggy_cake_coffee_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_coffee_raw").setMaxStackSize(1);
	public static Item jiggy_cake_coffee_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_coffee_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake_coffee=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_coffee");
	public static Item muffin_coffee_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_coffee_raw");
	public static Item muffin_coffee=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_coffee");
	
	public static Item cake_sponge_carrot_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_carrot_raw").setMaxStackSize(1);
	public static Item cake_sponge_carrot_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_carrot_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_sponge_carrot_plate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_carrot_plate_raw").setMaxStackSize(1);
	public static Item cake_sponge_carrot_plate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_carrot_plate_model").setMaxStackSize(1).setContainerItem(cake_model_plate);
	public static Item cake_sponge_carrot_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_carrot_base");
	public static Item jiggy_cake_carrot_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_carrot_raw").setMaxStackSize(1);
	public static Item jiggy_cake_carrot_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_carrot_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake_carrot=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_carrot");
	public static Item muffin_carrot_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_carrot_raw");
	public static Item muffin_carrot=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_carrot");
	
	public static Item cake_sponge_pumpkin_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_pumpkin_raw").setMaxStackSize(1);
	public static Item cake_sponge_pumpkin_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_pumpkin_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_sponge_pumpkin_plate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_pumpkin_plate_raw").setMaxStackSize(1);
	public static Item cake_sponge_pumpkin_plate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_pumpkin_plate_model").setMaxStackSize(1).setContainerItem(cake_model_plate);
	public static Item cake_sponge_pumpkin_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_pumpkin_base");
	public static Item jiggy_cake_pumpkin_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_pumpkin_raw").setMaxStackSize(1);
	public static Item jiggy_cake_pumpkin_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_pumpkin_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake_pumpkin=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_pumpkin");
	public static Item muffin_pumpkin_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_pumpkin_raw");
	public static Item muffin_pumpkin=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_pumpkin");
	
	public static Item cake_sponge_redvelvet_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_redvelvet_raw").setMaxStackSize(1);
	public static Item cake_sponge_redvelvet_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_redvelvet_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_sponge_redvelvet_plate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_redvelvet_plate_raw").setMaxStackSize(1);
	public static Item cake_sponge_redvelvet_plate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_redvelvet_plate_model").setMaxStackSize(1).setContainerItem(cake_model_plate);
	public static Item cake_sponge_redvelvet_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_redvelvet_base");
	public static Item jiggy_cake_redvelvet_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_redvelvet_raw").setMaxStackSize(1);
	public static Item jiggy_cake_redvelvet_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_redvelvet_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake_redvelvet=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_redvelvet");
	public static Item muffin_redvelvet_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_redvelvet_raw");
	public static Item muffin_redvelvet=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_redvelvet");
	
	public static Item cake_sponge_lemon_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_lemon_raw").setMaxStackSize(1);
	public static Item cake_sponge_lemon_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_lemon_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_sponge_lemon_plate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_lemon_plate_raw").setMaxStackSize(1);
	public static Item cake_sponge_lemon_plate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_lemon_plate_model").setMaxStackSize(1).setContainerItem(cake_model_plate);
	public static Item cake_sponge_lemon_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_lemon_base");
	public static Item jiggy_cake_lemon_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_lemon_raw").setMaxStackSize(1);
	public static Item jiggy_cake_lemon_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_lemon_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake_lemon=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_lemon");
	public static Item muffin_lemon_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_lemon_raw");
	public static Item muffin_lemon=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_lemon");
	
	public static Item cake_sponge_tea_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_tea_raw").setMaxStackSize(1);
	public static Item cake_sponge_tea_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_tea_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_sponge_tea_plate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_tea_plate_raw").setMaxStackSize(1);
	public static Item cake_sponge_tea_plate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_tea_plate_model").setMaxStackSize(1).setContainerItem(cake_model_plate);
	public static Item cake_sponge_tea_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_tea_base");
	public static Item jiggy_cake_tea_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_tea_raw").setMaxStackSize(1);
	public static Item jiggy_cake_tea_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_tea_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake_tea=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_tea");
	public static Item muffin_tea_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_tea_raw");
	public static Item muffin_tea=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_tea");
	
	public static Item cake_sponge_berry_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_berry_raw").setMaxStackSize(1);
	public static Item cake_sponge_berry_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_berry_model").setMaxStackSize(1).setContainerItem(cake_model);
	public static Item cake_sponge_berry_plate_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_berry_plate_raw").setMaxStackSize(1);
	public static Item cake_sponge_berry_plate_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_berry_plate_model").setMaxStackSize(1).setContainerItem(cake_model_plate);
	public static Item cake_sponge_berry_base=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"cake_sponge_berry_base");
	public static Item jiggy_cake_berry_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_berry_raw").setMaxStackSize(1);
	public static Item jiggy_cake_berry_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_berry_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item jiggy_cake_berry=new ItemFood(5, false).setUnlocalizedName(CoffeeWork.MODID+"."+"jiggy_cake_berry");
	public static Item muffin_berry_raw=new ItemFood(2, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_berry_raw");
	public static Item muffin_berry=new ItemFood(6, false).setUnlocalizedName(CoffeeWork.MODID+"."+"muffin_berry");
	
	public static Item cake_cheese_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_cheese_raw").setMaxStackSize(1);
	public static Item cake_cheese_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_cheese_model").setMaxStackSize(1).setContainerItem(cake_model);
	
	public static Item brownie_raw = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"brownie_raw").setMaxStackSize(1);
	public static Item brownie_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"brownie_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	public static Item tiramisu_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"tiramisu_model").setMaxStackSize(1).setContainerItem(cake_model_square);
	
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
		register(iron_bowl_batter_chocolate);
		register(iron_bowl_batter_coffee);
		register(iron_bowl_batter_pumpkin);
		register(iron_bowl_batter_carrot);
		register(iron_bowl_batter_red);
		register(iron_bowl_batter_lemon);
		register(iron_bowl_batter_berry);
		register(iron_bowl_batter_tea);
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
		register(cake_model_plate);

		register(cake_sponge_raw);
		register(cake_sponge_model);
		register(cake_sponge_plate_raw);
		register(cake_sponge_plate_model);
		register(cake_sponge_base);
		register(jiggy_cake_raw);
		register(jiggy_cake_model);
		register(jiggy_cake);
		
		register(cake_sponge_chocolate_raw);
		register(cake_sponge_chocolate_model);
		register(cake_sponge_chocolate_plate_raw);
		register(cake_sponge_chocolate_plate_model);
		register(cake_sponge_chocolate_base);
		register(jiggy_cake_chocolate_raw);
		register(jiggy_cake_chocolate_model);
		register(jiggy_cake_chocolate);
		
		register(cake_sponge_coffee_raw);
		register(cake_sponge_coffee_model);
		register(cake_sponge_coffee_plate_raw);
		register(cake_sponge_coffee_plate_model);
		register(cake_sponge_coffee_base);
		register(jiggy_cake_coffee_raw);
		register(jiggy_cake_coffee_model);
		register(jiggy_cake_coffee);
		
		register(cake_sponge_pumpkin_raw);
		register(cake_sponge_pumpkin_model);
		register(cake_sponge_pumpkin_plate_raw);
		register(cake_sponge_pumpkin_plate_model);
		register(cake_sponge_pumpkin_base);
		register(jiggy_cake_pumpkin_raw);
		register(jiggy_cake_pumpkin_model);
		register(jiggy_cake_pumpkin);
		
		register(cake_sponge_carrot_raw);
		register(cake_sponge_carrot_model);
		register(cake_sponge_carrot_plate_raw);
		register(cake_sponge_carrot_plate_model);
		register(cake_sponge_carrot_base);
		register(jiggy_cake_carrot_raw);
		register(jiggy_cake_carrot_model);
		register(jiggy_cake_carrot);
		
		register(cake_sponge_redvelvet_raw);
		register(cake_sponge_redvelvet_model);
		register(cake_sponge_redvelvet_plate_raw);
		register(cake_sponge_redvelvet_plate_model);
		register(cake_sponge_redvelvet_base);
		register(jiggy_cake_redvelvet_raw);
		register(jiggy_cake_redvelvet_model);
		register(jiggy_cake_redvelvet);
		
		register(cake_sponge_lemon_raw);
		register(cake_sponge_lemon_model);
		register(cake_sponge_lemon_plate_raw);
		register(cake_sponge_lemon_plate_model);
		register(cake_sponge_lemon_base);
		register(jiggy_cake_lemon_raw);
		register(jiggy_cake_lemon_model);
		register(jiggy_cake_lemon);
		
		register(cake_sponge_tea_raw);
		register(cake_sponge_tea_model);
		register(cake_sponge_tea_plate_raw);
		register(cake_sponge_tea_plate_model);
		register(cake_sponge_tea_base);
		register(jiggy_cake_tea_raw);
		register(jiggy_cake_tea_model);
		register(jiggy_cake_tea);
		
		register(cake_sponge_berry_raw);
		register(cake_sponge_berry_model);
		register(cake_sponge_berry_plate_raw);
		register(cake_sponge_berry_plate_model);
		register(cake_sponge_berry_base);
		register(jiggy_cake_berry_raw);
		register(jiggy_cake_berry_model);
		register(jiggy_cake_berry);
		
		register(cake_cheese_raw);
		register(cake_cheese_model);
		
		register(brownie_raw);
		register(brownie_model);
		register(tiramisu_model);

		register(baguette);
		register(hardtack_raw);
		register(hardtack);
		register(plate_pastry_raw);
		register(plate_pastry);
		register(mille_feuille);
		register(muffin_raw);
		register(muffin_chocolate_raw);
		register(muffin_coffee_raw);
		register(muffin_pumpkin_raw);
		register(muffin_carrot_raw);
		register(muffin_redvelvet_raw);
		register(muffin_lemon_raw);
		register(muffin_tea_raw);
		register(muffin_berry_raw);
		
		register(muffin);
		register(muffin_chocolate);
		register(muffin_coffee);
		register(muffin_pumpkin);
		register(muffin_carrot);
		register(muffin_redvelvet);
		register(muffin_lemon);
		register(muffin_tea);
		register(muffin_berry);

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
		registerRender(muffin_raw);
		registerRender(muffin_chocolate_raw);
		registerRender(muffin_coffee_raw);
		registerRender(muffin_pumpkin_raw);
		registerRender(muffin_carrot_raw);
		registerRender(muffin_redvelvet_raw);
		registerRender(muffin_lemon_raw);
		registerRender(muffin_tea_raw);
		registerRender(muffin_berry_raw);
		
		registerRender(muffin);
		registerRender(muffin_chocolate);
		registerRender(muffin_coffee);
		registerRender(muffin_pumpkin);
		registerRender(muffin_carrot);
		registerRender(muffin_redvelvet);
		registerRender(muffin_lemon);
		registerRender(muffin_tea);
		registerRender(muffin_berry);
		
		registerRender(cake_cheese_raw);
		registerRender(cake_cheese_model);
		
		registerRender(iron_bowl);
		registerRender(iron_bowl_egg);
		registerRender(iron_bowl_cheese);
		registerRender(iron_bowl_batter);
		registerRender(iron_bowl_batter_chocolate);
		registerRender(iron_bowl_batter_coffee);
		registerRender(iron_bowl_batter_pumpkin);
		registerRender(iron_bowl_batter_carrot);
		registerRender(iron_bowl_batter_red);
		registerRender(iron_bowl_batter_lemon);
		registerRender(iron_bowl_batter_berry);
		registerRender(iron_bowl_batter_tea);
		
		registerRender(cake_model);
		registerRender(cake_model_square);
		registerRender(cake_model_plate);

		registerRender(cake_sponge_raw);
		registerRender(cake_sponge_model);
		registerRender(cake_sponge_plate_raw);
		registerRender(cake_sponge_plate_model);
		registerRender(cake_sponge_base);
		registerRender(jiggy_cake_raw);
		registerRender(jiggy_cake_model);
		registerRender(jiggy_cake);
		
		registerRender(cake_sponge_chocolate_raw);
		registerRender(cake_sponge_chocolate_model);
		registerRender(cake_sponge_chocolate_plate_raw);
		registerRender(cake_sponge_chocolate_plate_model);
		registerRender(cake_sponge_chocolate_base);
		registerRender(jiggy_cake_chocolate_raw);
		registerRender(jiggy_cake_chocolate_model);
		registerRender(jiggy_cake_chocolate);
		
		registerRender(cake_sponge_coffee_raw);
		registerRender(cake_sponge_coffee_model);
		registerRender(cake_sponge_coffee_plate_raw);
		registerRender(cake_sponge_coffee_plate_model);
		registerRender(cake_sponge_coffee_base);
		registerRender(jiggy_cake_coffee_raw);
		registerRender(jiggy_cake_coffee_model);
		registerRender(jiggy_cake_coffee);
		
		registerRender(cake_sponge_pumpkin_raw);
		registerRender(cake_sponge_pumpkin_model);
		registerRender(cake_sponge_pumpkin_plate_raw);
		registerRender(cake_sponge_pumpkin_plate_model);
		registerRender(cake_sponge_pumpkin_base);
		registerRender(jiggy_cake_pumpkin_raw);
		registerRender(jiggy_cake_pumpkin_model);
		registerRender(jiggy_cake_pumpkin);
		
		registerRender(cake_sponge_carrot_raw);
		registerRender(cake_sponge_carrot_model);
		registerRender(cake_sponge_carrot_plate_raw);
		registerRender(cake_sponge_carrot_plate_model);
		registerRender(cake_sponge_carrot_base);
		registerRender(jiggy_cake_carrot_raw);
		registerRender(jiggy_cake_carrot_model);
		registerRender(jiggy_cake_carrot);
		
		registerRender(cake_sponge_redvelvet_raw);
		registerRender(cake_sponge_redvelvet_model);
		registerRender(cake_sponge_redvelvet_plate_raw);
		registerRender(cake_sponge_redvelvet_plate_model);
		registerRender(cake_sponge_redvelvet_base);
		registerRender(jiggy_cake_redvelvet_raw);
		registerRender(jiggy_cake_redvelvet_model);
		registerRender(jiggy_cake_redvelvet);
		
		registerRender(cake_sponge_lemon_raw);
		registerRender(cake_sponge_lemon_model);
		registerRender(cake_sponge_lemon_plate_raw);
		registerRender(cake_sponge_lemon_plate_model);
		registerRender(cake_sponge_lemon_base);
		registerRender(jiggy_cake_lemon_raw);
		registerRender(jiggy_cake_lemon_model);
		registerRender(jiggy_cake_lemon);
		
		registerRender(cake_sponge_tea_raw);
		registerRender(cake_sponge_tea_model);
		registerRender(cake_sponge_tea_plate_raw);
		registerRender(cake_sponge_tea_plate_model);
		registerRender(cake_sponge_tea_base);
		registerRender(jiggy_cake_tea_raw);
		registerRender(jiggy_cake_tea_model);
		registerRender(jiggy_cake_tea);
		
		registerRender(cake_sponge_berry_raw);
		registerRender(cake_sponge_berry_model);
		registerRender(cake_sponge_berry_plate_raw);
		registerRender(cake_sponge_berry_plate_model);
		registerRender(cake_sponge_berry_base);
		registerRender(jiggy_cake_berry_raw);
		registerRender(jiggy_cake_berry_model);
		registerRender(jiggy_cake_berry);
		
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
		
		registerRender(mixing_bowl);
		registerRender(yeast);

		registerRender(brownie_raw);
		registerRender(brownie_model);
		registerRender(tiramisu_model);
		registerRender(butter);
		registerRender(cheese);
		registerRender(croissant_raw);
		registerRender(croissant);
		registerRender(croissant_chocolate_raw);
		registerRender(croissant_chocolate);
		registerRender(D_bar);
		registerRender(brownie);
		
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
