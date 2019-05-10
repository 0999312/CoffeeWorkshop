package net.langball.coffee.drinks;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.CommonProxy;
import net.langball.coffee.block.BlockCoffee;
import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.effect.PotionLoader;
import net.langball.coffee.item.ItemFoodBasic;
import net.langball.coffee.util.JSON_Creator;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.GameData;

public class DrinksLoader {
	public static Item coffee_instant_stick = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_instant_stick");
	public static Item coffee_instant_box = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_instant_box");
	public static Item coffee_instant_cup_unopen = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_instant_cup_unopen");
	public static Item coffee_instant_cup= new DrinkCoffeeInstant("coffee_instant", 3, 2, 0.2f, new PotionEffect[]{
			new PotionEffect(PotionLoader.relax,1200,0),
			new PotionEffect(PotionLoader.caffeine,1200,0)
	}, true).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_instant_cup");
	public static DrinkCoffee coffee_instant= new DrinkCoffeeInstant("coffee_instant", 3, 2, 0.2f, new PotionEffect[]{
			new PotionEffect(PotionLoader.relax,1200,0),
			new PotionEffect(PotionLoader.caffeine,1200,0)
	}, false);
	
	public static DrinkCoffee coffee_americano = new DrinkCoffee("coffee_americano", 4, 
			  new int[]{2,2},
			new float[]{0.2f,0.2f},
			new String[]{
			CoffeeWork.MODID+"."+"coffee_americano",
			CoffeeWork.MODID+"."+"coffee_americano_fruit"
			},
			new PotionEffect[][]{
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,600,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,600,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "saturation")), 50, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 300, 0)
				}
		}
	);
	public static DrinkCoffee coffee_americano_ice = new DrinkCoffeeIce("coffee_americano_ice", 4, 
			  new int[]{2,2,2,2},
			new float[]{0.2f,0.2f,0.2f,0.2f},
			new String[]{
			CoffeeWork.MODID+"."+"coffee_americano_ice",
			CoffeeWork.MODID+"."+"coffee_americano_fruit_ice",
			CoffeeWork.MODID+"."+"coffee_americano_nitro_ice",
			CoffeeWork.MODID+"."+"coffee_americano_nitro_fruit_ice"
			},
			new PotionEffect[][]{
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,800,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 800, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 800, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "fire_resistance")), 800, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,800,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 800, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 800, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "saturation")), 100, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 500, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "fire_resistance")), 800, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1000,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1000, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1000, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "fire_resistance")), 1000, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1000,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1000, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1000, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "saturation")), 150, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 600, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "fire_resistance")), 1000, 0)
				}
			}
	);

	public static DrinkCoffee coffee_latte = new DrinkCoffee("coffee_latte", 3, 
			  new int[]{3,3,3,3,3,3,3,3,3},
			new float[]{0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f},
			new String[]{
			CoffeeWork.MODID+"."+"coffee_latte",
			CoffeeWork.MODID+"."+"coffee_latte_fruit",
			CoffeeWork.MODID+"."+"coffee_latte_caramel",
			CoffeeWork.MODID+"."+"coffee_latte_chocolate",
			CoffeeWork.MODID+"."+"coffee_latte_mint",
			CoffeeWork.MODID+"."+"coffee_latte_vanilla",
			CoffeeWork.MODID+"."+"coffee_cappuccino",
			CoffeeWork.MODID+"."+"coffee_macchiato",
			CoffeeWork.MODID+"."+"coffee_mochaccino"
			},
			new PotionEffect[][]{
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 900,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 900,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "saturation")), 150, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 600, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 900,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "resistance")), 900, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 900,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "strength")), 900, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 900,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "jump_boost")), 900, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 900,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "absorption")), 900, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1200,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1200,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "resistance")), 1200, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1200,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "strength")), 1200, 0)
				}
			}
	);
	public static DrinkCoffee coffee_latte_ice = new DrinkCoffeeIce("coffee_latte_ice", 3, 
			  new int[]{3,3,3,3,3,3,3,3,3},
			new float[]{0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f},
			new String[]{
			CoffeeWork.MODID+"."+"coffee_latte_ice",
			CoffeeWork.MODID+"."+"coffee_latte_fruit_ice",
			CoffeeWork.MODID+"."+"coffee_latte_caramel_ice",
			CoffeeWork.MODID+"."+"coffee_latte_chocolate_ice",
			CoffeeWork.MODID+"."+"coffee_latte_mint_ice",
			CoffeeWork.MODID+"."+"coffee_latte_vanilla_ice",
			CoffeeWork.MODID+"."+"coffee_cappuccino_ice",
			CoffeeWork.MODID+"."+"coffee_macchiato_ice",
			CoffeeWork.MODID+"."+"coffee_mochaccino_ice"
			},
			new PotionEffect[][]{
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1200,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1200,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "saturation")), 200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 800, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1200,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "resistance")), 1200, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1200,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "strength")), 1200, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1200,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "jump_boost")), 1200, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1200,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "absorption")), 1200, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1500,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1500,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1500, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1500, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1500,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1500,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1500, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1500, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "resistance")), 1500, 0)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1500,1),
				new PotionEffect(PotionLoader.caffeine,3600,0),
				new PotionEffect(PotionLoader.golden_heart, 1500,0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1500, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1500, 0),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "strength")), 1500, 0)
				}
			}
	);
	
	public static DrinkCoffee coffee_coldbrew = new DrinkCoffee("coffee_coldbrew", 3, 
			  new int[]{2,2,3,3,3,3,3,3},
			new float[]{0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f},
			new String[]{
			CoffeeWork.MODID+"."+"coffee_coldbrew",
			CoffeeWork.MODID+"."+"coffee_coldbrew_fruit",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_fruit",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_caramel",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_chocolate",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_mint",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_vanilla"
			},
			new PotionEffect[][]{
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,600,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,600,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "saturation")), 50, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 300, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 900,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 900,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "saturation")), 150, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 600, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 900,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "resistance")), 900, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 900,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "strength")), 900, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 900,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "jump_boost")), 900, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 900,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "absorption")), 900, 1)
				}
			}
	);
	public static DrinkCoffee coffee_coldbrew_ice = new DrinkCoffeeIce("coffee_coldbrew_ice", 3, 
			  new int[]{2,2,3,3,3,3,3,3},
			new float[]{0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f,0.2f},
			new String[]{
			CoffeeWork.MODID+"."+"coffee_coldbrew_ice",
			CoffeeWork.MODID+"."+"coffee_coldbrew_fruit_ice",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_ice",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_fruit_ice",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_caramel_ice",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_chocolate_ice",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_mint_ice",
			CoffeeWork.MODID+"."+"coffee_coldbrew_latte_vanilla_ice"
			},
			new PotionEffect[][]{
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,900,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 900, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "saturation")), 150, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 600, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 1200,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 1200,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "saturation")), 300, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 1200, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 1200,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "resistance")), 1200, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 1200,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "strength")), 1200, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 1200,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "jump_boost")), 1200, 1)
				},
		new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,2),
				new PotionEffect(PotionLoader.caffeine,3600,1),
				new PotionEffect(PotionLoader.golden_heart, 1200,1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 1200, 1),
				new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "absorption")), 1200, 1)
				}
			}
	);
	
	public static Item cup = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cup").setMaxStackSize(1);
	public static Item cup_glass = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cup_glass").setMaxStackSize(1);
	public static DrinkCoffee espresso = new DrinkEspresso();
	
	public static Block coffee_americanoBlock = new BlockCoffee(new ItemStack(coffee_americano,1,0));
	public static Block coffee_americano_fruitBlock = new BlockCoffee(new ItemStack(coffee_americano,1,1));
	public static Block coffee_latteBlock = new BlockCoffee(new ItemStack(coffee_latte,1,0));
	public static Block coffee_latte_fruitBlock = new BlockCoffee(new ItemStack(coffee_latte,1,1));
	public static Block coffee_latte_caramelBlock = new BlockCoffee(new ItemStack(coffee_latte,1,2));
	public static Block coffee_latte_chocolateBlock = new BlockCoffee(new ItemStack(coffee_latte,1,3));
	public static Block coffee_latte_mintBlock = new BlockCoffee(new ItemStack(coffee_latte,1,4));
	public static Block coffee_latte_vanillaBlock = new BlockCoffee(new ItemStack(coffee_latte,1,5));
	public static Block coffee_cappuccinoBlock = new BlockCoffee(new ItemStack(coffee_latte,1,6));
	public static Block coffee_macchiatoBlock = new BlockCoffee(new ItemStack(coffee_latte,1,7));
	public static Block coffee_mochaccinoBlock = new BlockCoffee(new ItemStack(coffee_latte,1,8));
	
	public static Block coffee_coldbrewBlock = new BlockCoffee(new ItemStack(coffee_coldbrew,1,0));
	public static Block coffee_coldbrew_fruitBlock = new BlockCoffee(new ItemStack(coffee_coldbrew,1,1));
	public static Block coffee_coldbrew_latteBlock = new BlockCoffee(new ItemStack(coffee_coldbrew,1,2));
	public static Block coffee_coldbrew_latte_fruitBlock = new BlockCoffee(new ItemStack(coffee_coldbrew,1,3));
	public static Block coffee_coldbrew_latte_caramelBlock = new BlockCoffee(new ItemStack(coffee_coldbrew,1,4));
	public static Block coffee_coldbrew_latte_chocolateBlock = new BlockCoffee(new ItemStack(coffee_coldbrew,1,5));
	public static Block coffee_coldbrew_latte_mintBlock = new BlockCoffee(new ItemStack(coffee_coldbrew,1,6));
	public static Block coffee_coldbrew_latte_vanillaBlock = new BlockCoffee(new ItemStack(coffee_coldbrew,1,7));
	
	public static Block coffee_americano_iceBlock = new BlockCoffee(new ItemStack(coffee_americano_ice,1,0));
	public static Block coffee_americano_ice_fruitBlock = new BlockCoffee(new ItemStack(coffee_americano_ice,1,1));
	public static Block coffee_americano_nitro_iceBlock = new BlockCoffee(new ItemStack(coffee_americano_ice,1,2));
	public static Block coffee_americano_nitro_ice_fruitBlock = new BlockCoffee(new ItemStack(coffee_americano_ice,1,3));
	public static Block coffee_latte_iceBlock = new BlockCoffee(new ItemStack(coffee_latte_ice,1,0));
	public static Block coffee_latte_ice_fruitBlock = new BlockCoffee(new ItemStack(coffee_latte_ice,1,1));
	public static Block coffee_latte_ice_caramelBlock = new BlockCoffee(new ItemStack(coffee_latte_ice,1,2));
	public static Block coffee_latte_ice_chocolateBlock = new BlockCoffee(new ItemStack(coffee_latte_ice,1,3));
	public static Block coffee_latte_ice_mintBlock = new BlockCoffee(new ItemStack(coffee_latte_ice,1,4));
	public static Block coffee_latte_ice_vanillaBlock = new BlockCoffee(new ItemStack(coffee_latte_ice,1,5));
	public static Block coffee_cappuccino_iceBlock = new BlockCoffee(new ItemStack(coffee_latte_ice,1,6));
	public static Block coffee_macchiato_iceBlock = new BlockCoffee(new ItemStack(coffee_latte_ice,1,7));
	public static Block coffee_mochaccino_iceBlock = new BlockCoffee(new ItemStack(coffee_latte_ice,1,8));
	
	public static Block coffee_coldbrew_iceBlock = new BlockCoffee(new ItemStack(coffee_coldbrew_ice,1,0));
	public static Block coffee_coldbrew_ice_fruitBlock = new BlockCoffee(new ItemStack(coffee_coldbrew_ice,1,1));
	public static Block coffee_coldbrew_ice_latteBlock = new BlockCoffee(new ItemStack(coffee_coldbrew_ice,1,2));
	public static Block coffee_coldbrew_ice_latte_fruitBlock = new BlockCoffee(new ItemStack(coffee_coldbrew_ice,1,3));
	public static Block coffee_coldbrew_ice_latte_caramelBlock = new BlockCoffee(new ItemStack(coffee_coldbrew_ice,1,4));
	public static Block coffee_coldbrew_ice_latte_chocolateBlock = new BlockCoffee(new ItemStack(coffee_coldbrew_ice,1,5));
	public static Block coffee_coldbrew_ice_latte_mintBlock = new BlockCoffee(new ItemStack(coffee_coldbrew_ice,1,6));
	public static Block coffee_coldbrew_ice_latte_vanillaBlock = new BlockCoffee(new ItemStack(coffee_coldbrew_ice,1,7));
	
	public static Block coffee_instantBlock = new BlockCoffee(new ItemStack(coffee_instant));
	public DrinksLoader(FMLPreInitializationEvent event) {
		register(coffee_instant_stick);
		register(coffee_instant_box);
		register(coffee_instant_cup_unopen);
		register(coffee_instant_cup);
		register(coffee_instant);
		register(espresso);
		register(cup);
		register(coffee_americano);
		register(coffee_latte);
		register(coffee_coldbrew);
		register(cup_glass);
		register(coffee_americano_ice);
		register(coffee_latte_ice);
		register(coffee_coldbrew_ice);
		
		register(coffee_instantBlock);
		register(coffee_americanoBlock);
		register(coffee_americano_fruitBlock);

		register(coffee_latteBlock);
		register(coffee_latte_fruitBlock);
		register(coffee_latte_caramelBlock);
		register(coffee_latte_chocolateBlock);
		register(coffee_latte_mintBlock);
		register(coffee_latte_vanillaBlock);
		register(coffee_cappuccinoBlock);
		register(coffee_macchiatoBlock);
		register(coffee_mochaccinoBlock);
		
		register(coffee_coldbrewBlock);
		register(coffee_coldbrew_fruitBlock);
		register(coffee_coldbrew_latteBlock);
		register(coffee_coldbrew_latte_fruitBlock);
		register(coffee_coldbrew_latte_caramelBlock);
		register(coffee_coldbrew_latte_chocolateBlock);
		register(coffee_coldbrew_latte_mintBlock);
		register(coffee_coldbrew_latte_vanillaBlock);
		
		register(coffee_americano_iceBlock);
		register(coffee_americano_ice_fruitBlock);
		register(coffee_americano_nitro_iceBlock);
		register(coffee_americano_nitro_ice_fruitBlock);

		register(coffee_latte_iceBlock);
		register(coffee_latte_ice_fruitBlock);
		register(coffee_latte_ice_caramelBlock);
		register(coffee_latte_ice_chocolateBlock);
		register(coffee_latte_ice_mintBlock);
		register(coffee_latte_ice_vanillaBlock);
		register(coffee_cappuccino_iceBlock);
		register(coffee_macchiato_iceBlock);
		register(coffee_mochaccino_iceBlock);
		
		register(coffee_coldbrew_iceBlock);
		register(coffee_coldbrew_ice_fruitBlock);
		register(coffee_coldbrew_ice_latteBlock);
		register(coffee_coldbrew_ice_latte_fruitBlock);
		register(coffee_coldbrew_ice_latte_caramelBlock);
		register(coffee_coldbrew_ice_latte_chocolateBlock);
		register(coffee_coldbrew_ice_latte_mintBlock);
		register(coffee_coldbrew_ice_latte_vanillaBlock);
	}
	@SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
		registerRender(coffee_americano_iceBlock);
		registerRender(coffee_americano_ice_fruitBlock);
		registerRender(coffee_americano_nitro_iceBlock);
		registerRender(coffee_americano_nitro_ice_fruitBlock);

		registerRender(coffee_latte_iceBlock);
		registerRender(coffee_latte_ice_fruitBlock);
		registerRender(coffee_latte_ice_caramelBlock);
		registerRender(coffee_latte_ice_chocolateBlock);
		registerRender(coffee_latte_ice_mintBlock);
		registerRender(coffee_latte_ice_vanillaBlock);
		registerRender(coffee_cappuccino_iceBlock);
		registerRender(coffee_macchiato_iceBlock);
		registerRender(coffee_mochaccino_iceBlock);
		
		registerRender(coffee_coldbrew_iceBlock);
		registerRender(coffee_coldbrew_ice_fruitBlock);
		registerRender(coffee_coldbrew_ice_latteBlock);
		registerRender(coffee_coldbrew_ice_latte_fruitBlock);
		registerRender(coffee_coldbrew_ice_latte_caramelBlock);
		registerRender(coffee_coldbrew_ice_latte_chocolateBlock);
		registerRender(coffee_coldbrew_ice_latte_mintBlock);
		registerRender(coffee_coldbrew_ice_latte_vanillaBlock);
		registerRender(coffee_instantBlock);
		registerRender(coffee_coldbrewBlock);
		registerRender(coffee_coldbrew_fruitBlock);
		registerRender(coffee_coldbrew_latteBlock);
		registerRender(coffee_coldbrew_latte_fruitBlock);
		registerRender(coffee_coldbrew_latte_caramelBlock);
		registerRender(coffee_coldbrew_latte_chocolateBlock);
		registerRender(coffee_coldbrew_latte_mintBlock);
		registerRender(coffee_coldbrew_latte_vanillaBlock);
		registerRender(coffee_coldbrew);
		registerRender(coffee_coldbrew_ice);
		registerRender(coffee_latte_vanillaBlock);
		registerRender(coffee_americanoBlock);
		registerRender(coffee_americano_fruitBlock);
		registerRender(coffee_latteBlock);
		registerRender(coffee_latte_fruitBlock);
		registerRender(coffee_latte_caramelBlock);
		registerRender(coffee_latte_chocolateBlock);
		registerRender(coffee_latte_mintBlock);
		registerRender(coffee_cappuccinoBlock);
		registerRender(coffee_macchiatoBlock);
		registerRender(coffee_mochaccinoBlock);
		
		registerRender(coffee_latte);
		registerRender(coffee_latte_ice);
		registerRender(coffee_americano);
		registerRender(coffee_americano_ice);
		registerRender(cup_glass);
		registerRender(espresso);
		registerRender(coffee_instant_stick);
		registerRender(coffee_instant_box);
		registerRender(coffee_instant_cup_unopen);
		registerRender(coffee_instant_cup);
		registerRender(coffee_instant);

        registerRender(cup);

    }
	
	@SideOnly(Side.CLIENT)
    private static void registerRender(DrinkCoffee item)
    {
    	registerRender(item, false, false);
    }
	
    @SideOnly(Side.CLIENT)
    private static void registerRender(DrinkCoffee item,boolean genModel,boolean ice)
    {
    	for(int i = 0;i<item.getSubNames().length;i++){
    		String name = item.getSubNames()[i].substring(CoffeeWork.MODID.length()+1);
    		if(genModel){
    		if(!ice)JSON_Creator.genCoffee(name, name, "json_create");
    		else JSON_Creator.genCoffeeIce(name, name.substring(0, name.length()-4), "json_create");
    		}
            ModelResourceLocation model = new ModelResourceLocation(new ResourceLocation(CoffeeWork.MODID,name), "inventory");
            ModelLoader.setCustomModelResourceLocation(item, i, model);
    	}
    }
	private static void register(Item item)
    {
		item.setCreativeTab(CommonProxy.tab);
        ForgeRegistries.ITEMS.register(item.setRegistryName(item.getUnlocalizedName().substring(5+CoffeeWork.MODID.length()+1)));
    }
	private static void register(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        ItemBlock itemBlock = new ItemBlock(block);
		if (itemBlock != null) {
			itemBlock.setRegistryName(block.getRegistryName().getResourcePath());
			itemBlock.setUnlocalizedName(CoffeeWork.MODID+"."+block.getRegistryName().getResourcePath());
			ForgeRegistries.ITEMS.register(itemBlock);
		}
		GameData.getBlockItemMap().put(block, itemBlock);
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
	@SideOnly(Side.CLIENT)
	public static void registerRender(Block block) {
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(),"inventory");
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
	}
}
