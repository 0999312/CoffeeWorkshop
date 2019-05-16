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
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.ForgeRegistry;

public class ItemLoader {
	public static Item coffee_seeds = new SeedCoffee();
	
	public static Item vanilla_seeds = new ItemSeeds(BlockLoader.vanilla_crop, Blocks.FARMLAND).setUnlocalizedName(CoffeeWork.MODID+"."+"vanilla_seeds");
	public static Item vanilla = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"vanilla");
	public static Item bag = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"bag");

	public static ItemBase materials = new ItemBase("itemMaterials", 64, 
			CoffeeWork.MODID+"."+"coffee_bean_raw",//0
			CoffeeWork.MODID+"."+"coffee_bean",//1
			CoffeeWork.MODID+"."+"coffee_powder",//2
			CoffeeWork.MODID+"."+"cocoa_bean",//3
			CoffeeWork.MODID+"."+"cocoa_powder",//4
			CoffeeWork.MODID+"."+"cocoa_batter",//5
			CoffeeWork.MODID+"."+"bag_cloth",//6
			CoffeeWork.MODID+"."+"ice_slag",//7
			CoffeeWork.MODID+"."+"yeast",//8
			CoffeeWork.MODID+"."+"plate_iron",//9
			CoffeeWork.MODID+"."+"spices",//10
			CoffeeWork.MODID+"."+"gelatin",//11
			CoffeeWork.MODID+"."+"soda",//12
			CoffeeWork.MODID+"."+"flour",//13
			CoffeeWork.MODID+"."+"dough",//14
			CoffeeWork.MODID+"."+"dough_pastry",//15
			CoffeeWork.MODID+"."+"dough_cookie",//16
			CoffeeWork.MODID+"."+"dough_ginger",//17
			CoffeeWork.MODID+"."+"dough_bread",//18
			CoffeeWork.MODID+"."+"dough_bread_round",//19
			CoffeeWork.MODID+"."+"dough_baguette",//20
			CoffeeWork.MODID+"."+"dough_bagel",//21
			CoffeeWork.MODID+"."+"dough_toast",//22
			CoffeeWork.MODID+"."+"plate_dough",//23
			CoffeeWork.MODID+"."+"plate_dough_pastry",//24
			CoffeeWork.MODID+"."+"plate_dough_ginger",//25
			CoffeeWork.MODID+"."+"empty_coldbrew_pot"//26
			);
	public static ItemFoodBasic bread = new ItemFoodBasic("bread", 64,
			new int[]{6,9,7,8},
			new float[]{0.6F,0.6F,0.6F,0.6F},
			new String[]{
					CoffeeWork.MODID+"."+"bread_round",//0
					CoffeeWork.MODID+"."+"baguette",//1
					CoffeeWork.MODID+"."+"bagel",//2
					CoffeeWork.MODID+"."+"toast",//3
	});
	
	public static ItemFoodBasic cake_slices = new ItemFoodBasic("cake_slices", 64,
			new int[]{1,1,1,1,1,1,1,1,1,3,3,3,3,3,3,3,3,3},
			new float[]{0.1F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F},
			new String[]{
					CoffeeWork.MODID+"."+"cake_sponge_slices",//0
					CoffeeWork.MODID+"."+"cake_sponge_chocolate_slices",//1
					CoffeeWork.MODID+"."+"cake_sponge_coffee_slices",//2
					CoffeeWork.MODID+"."+"cake_sponge_pumpkin_slices",//3
					CoffeeWork.MODID+"."+"cake_sponge_carrot_slices",//4
					CoffeeWork.MODID+"."+"cake_sponge_redvelvet_slices",//5
					CoffeeWork.MODID+"."+"cake_sponge_lemon_slices",//6
					CoffeeWork.MODID+"."+"cake_sponge_tea_slices",//7
					CoffeeWork.MODID+"."+"cake_sponge_berry_slices",//8
					CoffeeWork.MODID+"."+"cake_slices",//9
					CoffeeWork.MODID+"."+"cake_harvest_slices",//10
					CoffeeWork.MODID+"."+"cake_lemon_slices",//11
					CoffeeWork.MODID+"."+"cake_tea_slices",//12
					CoffeeWork.MODID+"."+"cake_berry_slices",//13
					CoffeeWork.MODID+"."+"cake_schwarzwald_slices",//14
					CoffeeWork.MODID+"."+"cake_redvelvet_slices",//15
					CoffeeWork.MODID+"."+"cake_cheese_slices",//16
					CoffeeWork.MODID+"."+"cake_coffee_slices"//17
			});
	
	public static ItemFoodBasic pie = new ItemFoodBasic("pie", 64,
			new int[]{10,12,12,12,12,12,12,12,12},
			new float[]{0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F},
			new String[]{
					CoffeeWork.MODID+"."+"pie_cream",//0
					CoffeeWork.MODID+"."+"pie_chocolate",//1
					CoffeeWork.MODID+"."+"pie_coffee",//2
					CoffeeWork.MODID+"."+"pie_tea",//3
					CoffeeWork.MODID+"."+"pie_apple",//4
					CoffeeWork.MODID+"."+"pie_lemon",//5
					CoffeeWork.MODID+"."+"pie_berry",//6
					CoffeeWork.MODID+"."+"pie_melon",//7
					CoffeeWork.MODID+"."+"pie_caramel",//8
			});
	
	public static ItemFoodBasic sandwich = new ItemFoodBasic("sandwich", 64,
			  new int[]{10,10,12,12,10,11,10},
			new float[]{0.9F,0.9F,0.9F,0.9F,0.9F,0.9F,0.9F},
			new String[]{
					CoffeeWork.MODID+"."+"sandwich_blt",//0
					CoffeeWork.MODID+"."+"sandwich_club",//1
					CoffeeWork.MODID+"."+"sandwich_blt_large",//2
					CoffeeWork.MODID+"."+"sandwich_club_large",//3
					CoffeeWork.MODID+"."+"sandwich_bacon_egg",//4
					CoffeeWork.MODID+"."+"sandwich_beef_cheese",//5
					CoffeeWork.MODID+"."+"sandwich_ham_cheese"//6
			});
	
	public static Item syrup_empty = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"syrup_empty");
	public static ItemFoodBasic materialFood = new ItemFoodBasic("itemMaterialFood", 64,
			  new int[]{2   ,3   ,1   ,4   ,4   ,9   ,8,2,2,1,3,8,6,12,4,2},
			new float[]{0.4F,0.4F,0.5F,0.5F,0.5F,0.5F,1F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.1f},
			new String[]{
					CoffeeWork.MODID+"."+"butter",//0
					CoffeeWork.MODID+"."+"cheese",//1
					CoffeeWork.MODID+"."+"blueberry",//2
					CoffeeWork.MODID+"."+"chocolate_bar",//3
					CoffeeWork.MODID+"."+"chocolate_chip",//4
					CoffeeWork.MODID+"."+"brownie",//5
					CoffeeWork.MODID+"."+"field_ration_d",//6
					CoffeeWork.MODID+"."+"custard",//7
					CoffeeWork.MODID+"."+"milk_form",//8
					CoffeeWork.MODID+"."+"marshmallow",//9
					CoffeeWork.MODID+"."+"marshmallow_chocolate",//10
					CoffeeWork.MODID+"."+"marshmallow_roast",//11
					CoffeeWork.MODID+"."+"smore",//12
					CoffeeWork.MODID+"."+"plate_ginger",//13
					CoffeeWork.MODID+"."+"caramel"
			});
	
	public static ItemFoodBasic dessert_1 = new ItemFoodBasic("itemDessert", 64,
			  new int[]{2   ,2   ,8   ,10  ,2   ,5   ,1   ,2   ,4   ,2   ,9   ,14,1   ,4   ,7,1   ,3   ,9},
			new float[]{0.4F,0.4F,0.6F,0.6F,0.6F,0.6F,0.4F,0.6F,0.6F,0.6F,0.6F,0.6F,0.4F,0.4F,0.6F,0.4F,0.4F,0.6F},
			new String[]{
					CoffeeWork.MODID+"."+"croissant_raw",//0
					CoffeeWork.MODID+"."+"croissant_chocolate_raw",//1
					CoffeeWork.MODID+"."+"croissant",//2
					CoffeeWork.MODID+"."+"croissant_chocolate",//3
					CoffeeWork.MODID+"."+"hardtack_raw",//4
					CoffeeWork.MODID+"."+"hardtack",//5
					CoffeeWork.MODID+"."+"plate_pastry_raw",//6
					CoffeeWork.MODID+"."+"plate_pastry",//7
					CoffeeWork.MODID+"."+"ginger_bread",//8
					CoffeeWork.MODID+"."+"ginger_bread_man_raw",//9
					CoffeeWork.MODID+"."+"ginger_bread_man",//10
					CoffeeWork.MODID+"."+"mille_feuille",//11
					CoffeeWork.MODID+"."+"puff_raw",//12
					CoffeeWork.MODID+"."+"puff",//13
					CoffeeWork.MODID+"."+"caramel_apple",//14
					CoffeeWork.MODID+"."+"cookie_black_raw",//15
					CoffeeWork.MODID+"."+"cookie_black",//16
					CoffeeWork.MODID+"."+"cookie_oreo"//17
			});

	public static ItemFoodBasic icecream = new ItemFoodBasic("icecream", 64,
			new int[]{4,6,6,6,6,6,6},
			new float[]{0.5F,0.5F,0.5F,0.5F,0.5F,0.5F,0.5F},
			new String[]{
					CoffeeWork.MODID+"."+"icecream_vanilla",//0
					CoffeeWork.MODID+"."+"icecream_chocolate",//1
					CoffeeWork.MODID+"."+"icecream_coffee",//2
					CoffeeWork.MODID+"."+"icecream_apple",//3
					CoffeeWork.MODID+"."+"icecream_berry",//4
					CoffeeWork.MODID+"."+"icecream_melon",//5
					CoffeeWork.MODID+"."+"icecream_lemon"//6
			});

	public static ItemFoodBasic cream = new ItemFoodBasic("cream", 64,
			new int[]{2,4,4,4,4,4,4},
			new float[]{0.4F,0.4F,0.4F,0.4F,0.4F,0.4F,0.4F},
			new String[]{
					CoffeeWork.MODID+"."+"cream_milk",
					CoffeeWork.MODID+"."+"cream_chocolate",
					CoffeeWork.MODID+"."+"cream_coffee",
					CoffeeWork.MODID+"."+"cream_apple",
					CoffeeWork.MODID+"."+"cream_berry",
					CoffeeWork.MODID+"."+"cream_melon",
					CoffeeWork.MODID+"."+"cream_lemon"
			});

	public static ItemFoodBasic cookie_icecream = new ItemFoodBasic("cookie_icecream", 64,
			new int[]{8,10,10,10,10,10,10},
			new float[]{0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F},
			new String[]{
					CoffeeWork.MODID+"."+"cookie_icecream_vanilla",
					CoffeeWork.MODID+"."+"cookie_icecream_chocolate",
					CoffeeWork.MODID+"."+"cookie_icecream_coffee",
					CoffeeWork.MODID+"."+"cookie_icecream_apple",
					CoffeeWork.MODID+"."+"cookie_icecream_berry",
					CoffeeWork.MODID+"."+"cookie_icecream_melon",
					CoffeeWork.MODID+"."+"cookie_icecream_lemon"
			});

	public static ItemFoodBasic mooncake = new ItemFoodBasic("mooncake", 64,
			new int[]{2,2,2,2,8,10,10,10},
			new float[]{0.4F,0.4F,0.4F,0.4F,0.6F,0.6F,0.6F,0.6F},
			new String[]{
					CoffeeWork.MODID+"."+"mooncake_raw",	
					CoffeeWork.MODID+"."+"mooncake_egg_raw",
					CoffeeWork.MODID+"."+"mooncake_ham_raw",
					CoffeeWork.MODID+"."+"mooncake_fruit_raw",
					CoffeeWork.MODID+"."+"mooncake",
					CoffeeWork.MODID+"."+"mooncake_egg",
					CoffeeWork.MODID+"."+"mooncake_ham",
					CoffeeWork.MODID+"."+"mooncake_fruit"
			});
	
	public static Item iron_bowl = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"iron_bowl").setMaxStackSize(16);
	public static Item cake_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_model").setMaxStackSize(16);
	public static Item cake_model_square = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_model_square").setMaxStackSize(16);
	public static Item cake_model_plate = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cake_model_plate").setMaxStackSize(16);
	public static Item small_model = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"small_model").setMaxStackSize(16);
	public static Item mooncake_model = new ItemCooker().setUnlocalizedName(CoffeeWork.MODID+"."+"mooncake_model");
	public static Item mixing_bowl = new ItemCooker().setUnlocalizedName(CoffeeWork.MODID+"."+"mixing_bowl");
	
	public static ItemFoodBasic souffle = new ItemFoodContain("souffle", 64,
			new int[]{2,2,8,10},
			new float[]{0.2F,0.2F,0.6F,0.6F},
			new String[]{
					CoffeeWork.MODID+"."+"souffle_raw",//0
					CoffeeWork.MODID+"."+"souffle_chocolate_raw",//1
					CoffeeWork.MODID+"."+"souffle",//2
					CoffeeWork.MODID+"."+"souffle_chocolate",//3
			},new ItemStack[]{
					new ItemStack(small_model),
					new ItemStack(small_model),
					new ItemStack(small_model),
					new ItemStack(small_model)
			}
	);
	
	public static ItemBase iron_bowl_batter = (ItemBase) new ItemBase("iron_bowl_batter", 16,
			CoffeeWork.MODID+"."+"iron_bowl_egg",//0
			CoffeeWork.MODID+"."+"iron_bowl_cheese",//1
			CoffeeWork.MODID+"."+"iron_bowl_batter",///2
			CoffeeWork.MODID+"."+"iron_bowl_batter_coffee",//3
			CoffeeWork.MODID+"."+"iron_bowl_batter_berry",//4
			CoffeeWork.MODID+"."+"iron_bowl_batter_chocolate",///5
			CoffeeWork.MODID+"."+"iron_bowl_batter_red",//6
			CoffeeWork.MODID+"."+"iron_bowl_batter_lemon",//7
			CoffeeWork.MODID+"."+"iron_bowl_batter_pumpkin",//8
			CoffeeWork.MODID+"."+"iron_bowl_batter_carrot",//9
			CoffeeWork.MODID+"."+"iron_bowl_batter_tea"//10
			).setContainerItem(iron_bowl);

	public static ItemBase raw_cake = new ItemBase("raw_cake", 16, 
			CoffeeWork.MODID+"."+"cake_sponge_raw",//0
			CoffeeWork.MODID+"."+"cake_sponge_chocolate_raw",
			CoffeeWork.MODID+"."+"cake_sponge_coffee_raw",
			CoffeeWork.MODID+"."+"cake_sponge_carrot_raw",
			CoffeeWork.MODID+"."+"cake_sponge_pumpkin_raw",
			CoffeeWork.MODID+"."+"cake_sponge_redvelvet_raw",
			CoffeeWork.MODID+"."+"cake_sponge_lemon_raw",
			CoffeeWork.MODID+"."+"cake_sponge_tea_raw",
			CoffeeWork.MODID+"."+"cake_sponge_berry_raw",
			CoffeeWork.MODID+"."+"cake_cheese_raw",//9
			CoffeeWork.MODID+"."+"mousse_berry_raw",
			CoffeeWork.MODID+"."+"mousse_coffee_raw",
			CoffeeWork.MODID+"."+"mousse_chocolate_raw",
			CoffeeWork.MODID+"."+"mousse_lemon_raw"
			);
	
	public static ItemBase model_cake = (ItemBase) new ItemBase("model_cake", 16, 
			CoffeeWork.MODID+"."+"cake_sponge_model",
			CoffeeWork.MODID+"."+"cake_sponge_chocolate_model",
			CoffeeWork.MODID+"."+"cake_sponge_coffee_model",
			CoffeeWork.MODID+"."+"cake_sponge_carrot_model",
			CoffeeWork.MODID+"."+"cake_sponge_pumpkin_model",
			CoffeeWork.MODID+"."+"cake_sponge_redvelvet_model",
			CoffeeWork.MODID+"."+"cake_sponge_lemon_model",
			CoffeeWork.MODID+"."+"cake_sponge_tea_model",
			CoffeeWork.MODID+"."+"cake_sponge_berry_model",
			CoffeeWork.MODID+"."+"cake_cheese_model",
			CoffeeWork.MODID+"."+"mousse_berry_model",
			CoffeeWork.MODID+"."+"mousse_coffee_model",
			CoffeeWork.MODID+"."+"mousse_chocolate_model",
			CoffeeWork.MODID+"."+"mousse_lemon_model"
			).setContainerItem(cake_model);

	public static ItemBase cake_plate_raw = new ItemBase("cake_plate_raw", 16, new String[]{
			CoffeeWork.MODID+"."+"cake_sponge_plate_raw",
			CoffeeWork.MODID+"."+"cake_sponge_chocolate_plate_raw",
			CoffeeWork.MODID+"."+"cake_sponge_coffee_plate_raw",
			CoffeeWork.MODID+"."+"cake_sponge_carrot_plate_raw",
			CoffeeWork.MODID+"."+"cake_sponge_pumpkin_plate_raw",
			CoffeeWork.MODID+"."+"cake_sponge_redvelvet_plate_raw",
			CoffeeWork.MODID+"."+"cake_sponge_lemon_plate_raw",
			CoffeeWork.MODID+"."+"cake_sponge_tea_plate_raw",
			CoffeeWork.MODID+"."+"cake_sponge_berry_plate_raw"
	});
	
	public static ItemBase cake_plate_model = (ItemBase) new ItemBase("cake_plate_model", 16, new String[]{
			CoffeeWork.MODID+"."+"cake_sponge_plate_model",
			CoffeeWork.MODID+"."+"cake_sponge_chocolate_plate_model",
			CoffeeWork.MODID+"."+"cake_sponge_coffee_plate_model",
			CoffeeWork.MODID+"."+"cake_sponge_carrot_plate_model",
			CoffeeWork.MODID+"."+"cake_sponge_pumpkin_plate_model",
			CoffeeWork.MODID+"."+"cake_sponge_redvelvet_plate_model",
			CoffeeWork.MODID+"."+"cake_sponge_lemon_plate_model",
			CoffeeWork.MODID+"."+"cake_sponge_tea_plate_model",
			CoffeeWork.MODID+"."+"cake_sponge_berry_plate_model"
	}).setContainerItem(cake_model_plate);

	public static ItemFoodBasic cake_base = new ItemFoodBasic("cake_base", 64,
			new int[]{4,6,6,6,6,6,6,6,6},
			new float[]{0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F}, 
			CoffeeWork.MODID+"."+"cake_sponge_base",
			CoffeeWork.MODID+"."+"cake_sponge_chocolate_base",
			CoffeeWork.MODID+"."+"cake_sponge_coffee_base",
			CoffeeWork.MODID+"."+"cake_sponge_carrot_base",
			CoffeeWork.MODID+"."+"cake_sponge_pumpkin_base",
			CoffeeWork.MODID+"."+"cake_sponge_redvelvet_base",
			CoffeeWork.MODID+"."+"cake_sponge_lemon_base",
			CoffeeWork.MODID+"."+"cake_sponge_tea_base",
			CoffeeWork.MODID+"."+"cake_sponge_berry_base"
			);
	
	public static ItemFoodBasic cake_roll = new ItemFoodBasic("cake_roll", 64,
			new int[]{4,6,6,6,6,6,6,6,6},
			new float[]{0.8F,0.8F,0.8F,0.8F,0.8F,0.8F,0.8F,0.8F,0.8F}, 
			CoffeeWork.MODID+"."+"cake_roll",
			CoffeeWork.MODID+"."+"cake_chocolate_roll",
			CoffeeWork.MODID+"."+"cake_coffee_roll",
			CoffeeWork.MODID+"."+"cake_carrot_roll",
			CoffeeWork.MODID+"."+"cake_pumpkin_roll",
			CoffeeWork.MODID+"."+"cake_redvelvet_roll",
			CoffeeWork.MODID+"."+"cake_lemon_roll",
			CoffeeWork.MODID+"."+"cake_tea_roll",
			CoffeeWork.MODID+"."+"cake_berry_roll"
			);
	
	public static ItemBase jiggy_cake_raw = new ItemBase("jiggy_cake_raw", 16, new String[]{
			CoffeeWork.MODID+"."+"jiggy_cake_raw",
			CoffeeWork.MODID+"."+"jiggy_cake_chocolate_raw",
			CoffeeWork.MODID+"."+"jiggy_cake_coffee_raw",
			CoffeeWork.MODID+"."+"jiggy_cake_carrot_raw",
			CoffeeWork.MODID+"."+"jiggy_cake_pumpkin_raw",
			CoffeeWork.MODID+"."+"jiggy_cake_redvelvet_raw",
			CoffeeWork.MODID+"."+"jiggy_cake_lemon_raw",
			CoffeeWork.MODID+"."+"jiggy_cake_tea_raw",
			CoffeeWork.MODID+"."+"jiggy_cake_berry_raw",
			CoffeeWork.MODID+"."+"brownie_raw",
			CoffeeWork.MODID+"."+"tiramisu_raw"
	});

	public static ItemBase jiggy_cake_model = (ItemBase) new ItemBase("jiggy_cake_model", 16, new String[]{
			CoffeeWork.MODID+"."+"jiggy_cake_model",
			CoffeeWork.MODID+"."+"jiggy_cake_chocolate_model",
			CoffeeWork.MODID+"."+"jiggy_cake_coffee_model",
			CoffeeWork.MODID+"."+"jiggy_cake_carrot_model",
			CoffeeWork.MODID+"."+"jiggy_cake_pumpkin_model",
			CoffeeWork.MODID+"."+"jiggy_cake_redvelvet_model",
			CoffeeWork.MODID+"."+"jiggy_cake_lemon_model",
			CoffeeWork.MODID+"."+"jiggy_cake_tea_model",
			CoffeeWork.MODID+"."+"jiggy_cake_berry_model",
			CoffeeWork.MODID+"."+"brownie_model",
			CoffeeWork.MODID+"."+"tiramisu_model"
	}).setContainerItem(cake_model_square);
	
	public static ItemFoodBasic jiggy_cake = new ItemFoodBasic("jiggy_cake", 64,
			new int[]{4,5,5,5,5,5,5,5,5},
			new float[]{0.8F,0.8F,0.8F,0.8F,0.8F,0.8F,0.8F,0.8F,0.8F},
			new String[]{
					CoffeeWork.MODID+"."+"jiggy_cake",
					CoffeeWork.MODID+"."+"jiggy_cake_chocolate",
					CoffeeWork.MODID+"."+"jiggy_cake_coffee",
					CoffeeWork.MODID+"."+"jiggy_cake_carrot",
					CoffeeWork.MODID+"."+"jiggy_cake_pumpkin",
					CoffeeWork.MODID+"."+"jiggy_cake_redvelvet",
					CoffeeWork.MODID+"."+"jiggy_cake_lemon",
					CoffeeWork.MODID+"."+"jiggy_cake_tea",
					CoffeeWork.MODID+"."+"jiggy_cake_berry"
			});
	
	public static ItemFoodBasic muffin = new ItemFoodBasic("muffin", 64,
			new int[]{2,2,2,2,2,2,2,2,2,4,6,6,6,6,6,6,6,6},
			new float[]{0.2F,0.2F,0.2F,0.2F,0.2F,0.2F,0.2F,0.2F,0.2F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F,0.6F},
			new String[]{
					CoffeeWork.MODID+"."+"muffin_raw",//0
					CoffeeWork.MODID+"."+"muffin_chocolate_raw",//1
					CoffeeWork.MODID+"."+"muffin_coffee_raw",
					CoffeeWork.MODID+"."+"muffin_carrot_raw",
					CoffeeWork.MODID+"."+"muffin_pumpkin_raw",
					CoffeeWork.MODID+"."+"muffin_redvelvet_raw",
					CoffeeWork.MODID+"."+"muffin_lemon_raw",
					CoffeeWork.MODID+"."+"muffin_tea_raw",
					CoffeeWork.MODID+"."+"muffin_berry_raw",
					CoffeeWork.MODID+"."+"muffin",
					CoffeeWork.MODID+"."+"muffin_chocolate",
					CoffeeWork.MODID+"."+"muffin_coffee",
					CoffeeWork.MODID+"."+"muffin_carrot",
					CoffeeWork.MODID+"."+"muffin_pumpkin",
					CoffeeWork.MODID+"."+"muffin_redvelvet",
					CoffeeWork.MODID+"."+"muffin_lemon",
					CoffeeWork.MODID+"."+"muffin_tea",
					CoffeeWork.MODID+"."+"muffin_berry"
			});

	public static Item record_blank = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"record_blank").setMaxStackSize(1);
	public static Item kusa_noshi_to_ne = new ItemRecordCW("records.kusa_noshi_to_ne");
	public static Item lazt_lady_kaguya = new ItemRecordCW("records.lazy_lady_kaguya");
	public static Item the_grimoire_of_marisa = new ItemRecordCW("records.the_grimoire_of_marisa");
	
	public static ItemBase syrup = (ItemBase) new ItemBase("syrup", 64, new String[]{
			CoffeeWork.MODID+"."+"syrup_full",//0
			CoffeeWork.MODID+"."+"syrup_brown",//1
			CoffeeWork.MODID+"."+"syrup_vanilla",//2
			CoffeeWork.MODID+"."+"syrup_fruit",//3
			CoffeeWork.MODID+"."+"syrup_chocolate",
			CoffeeWork.MODID+"."+"syrup_mint"
	}).setContainerItem(syrup_empty);

	public static Item coldbrew_bottle = new ItemSeasoning(CoffeeWork.MODID+"."+"coldbrew_bottle", 4);
	
	public ItemLoader(FMLPreInitializationEvent event) {
		register(coldbrew_bottle);
		register(record_blank);
		register(kusa_noshi_to_ne);
		register(lazt_lady_kaguya);
		register(the_grimoire_of_marisa);
		register(mixing_bowl);
		register(mooncake_model);
		register(coffee_seeds);
		register(vanilla_seeds);
		MinecraftForge.addGrassSeed(new ItemStack(vanilla_seeds), 8);
		register(vanilla);
		register(bag);
		register(materials);
		register(bread);
		register(sandwich);
		register(materialFood);
		register(syrup_empty);
		register(syrup);
		register(cream);
		register(icecream);
		register(cookie_icecream);
		register(dessert_1);
		register(pie);
		register(muffin);
		register(mooncake);
		register(iron_bowl);
		register(cake_model);
		register(cake_slices);

		register(cake_model_square);

		register(cake_model_plate);
		register(iron_bowl_batter);
		register(raw_cake);
		register(model_cake);
		register(cake_plate_raw);
		register(cake_plate_model);
		register(cake_base);
		register(cake_roll);
		register(jiggy_cake_raw);
		register(jiggy_cake_model);
		register(jiggy_cake);
		register(small_model);
		register(souffle);
	}
	@SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
		registerRender(small_model);
		registerRender(souffle);
		registerRender(cake_slices);
		registerRender(pie);
		registerRender(coldbrew_bottle);
		registerRender(bag);
		registerRender(bread);
		registerRender(icecream);
		registerRender(cookie_icecream);
		registerRender(vanilla);
		registerRender(muffin);
		registerRender(cake_roll);
		registerRender(syrup_empty);
		registerRender(syrup);
		registerRender(cream);
		registerRender(iron_bowl);
		registerRender(iron_bowl_batter);
		registerRender(cake_model);
		registerRender(cake_model_square);
		registerRender(cake_model_plate);
		registerRender(vanilla_seeds);
		registerRender(dessert_1);
		registerRender(raw_cake);
		registerRender(model_cake);
		registerRender(cake_plate_raw);
		registerRender(cake_plate_model);
		registerRender(cake_base);
		registerRender(jiggy_cake_raw);
		registerRender(jiggy_cake_model);
		registerRender(jiggy_cake);
		registerRender(mooncake_model);
		registerRender(mooncake);
		registerRender(mixing_bowl);
		registerRender(materials);
		registerRender(materialFood);
		registerRender(icecream);
		registerRender(cookie_icecream);
        registerRender(coffee_seeds);
        registerRender(record_blank);
        registerRender(kusa_noshi_to_ne);
        registerRender(lazt_lady_kaguya);
        registerRender(the_grimoire_of_marisa);
        registerRender(sandwich);
    }
	private static void register(Item item)
    {
		item.setCreativeTab(CommonProxy.tab);
        ForgeRegistries.ITEMS.register(item.setRegistryName(item.getUnlocalizedName().substring(5+CoffeeWork.MODID.length()+1)));
    }
    @SideOnly(Side.CLIENT)
    private static void registerRender(ItemBase item)
    {
    	registerRender(item, false);
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(ItemFoodBasic item)
    {
    	registerRender(item, false);
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(ItemBase item,boolean json_create)
    {
    	for(int i = 0;i<item.getSubNames().length;i++){
    		String name = item.getSubNames()[i].substring(CoffeeWork.MODID.length()+1);
    		if(json_create)JSON_Creator.genItem(name, name, "json_create");
            ModelResourceLocation model = new ModelResourceLocation(new ResourceLocation(CoffeeWork.MODID,name), "inventory");
            ModelLoader.setCustomModelResourceLocation(item, i, model);
    	}
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(ItemFoodBasic item,boolean json_create)
    {
    	
    	for(int i = 0;i<item.getSubNames().length;i++){
    		String name = item.getSubNames()[i].substring(CoffeeWork.MODID.length()+1);
        	if(json_create)JSON_Creator.genItem(name, name, "json_create");
            ModelResourceLocation model = new ModelResourceLocation(new ResourceLocation(CoffeeWork.MODID,name), "inventory");
            ModelLoader.setCustomModelResourceLocation(item, i, model);
    	}
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item, int meta, String name)
    {
        ModelResourceLocation model = new ModelResourceLocation(name, "inventory");
        ModelLoader.setCustomModelResourceLocation(item, meta, model);
    }
    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item, int meta, String name,String textureName)
    {
    	JSON_Creator.genItem(name, textureName, "json_create");
        ModelResourceLocation model = new ModelResourceLocation(name, "inventory");
        ModelLoader.setCustomModelResourceLocation(item, meta, model);
    }
	@SideOnly(Side.CLIENT)
    private static void registerRender(Item item,String textureName)
    {
		JSON_Creator.genItem(item.getRegistryName().toString().substring(10), textureName, "json_create");
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
