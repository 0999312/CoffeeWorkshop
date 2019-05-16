package net.langball.coffee.compat;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.CommonProxy;
import net.langball.coffee.block.BlockCoffee;
import net.langball.coffee.block.ItemBlockCoffee;
import net.langball.coffee.drinks.DrinkCoffeeIce;
import net.langball.coffee.drinks.DrinkCoffee;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.effect.PotionLoader;
import net.langball.coffee.util.JSON_Creator;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.GameData;
import roito.teastory.potion.PotionRegister;

public class TeaStoriesCompatDrinks {
	public static DrinkCoffee tea_drinks = new DrinkCoffee("tea_drinks", 3, 
			new int[]{2,2,2,2}, 
			new float[]{0.2f,0.2f,0.2f,0.2f}, 
			new String[]{
					CoffeeWork.MODID+"."+"coffee_green_tea",
					CoffeeWork.MODID+"."+"coffee_black_tea",
					CoffeeWork.MODID+"."+"coffee_milk_tea",
					CoffeeWork.MODID+"."+"coffee_mandarin_drink"
					}, 
			new PotionEffect[][]{
			new PotionEffect[]{
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 0),
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 0),
					new PotionEffect(PotionRegister.PotionAgility, 600,0),
					new PotionEffect(PotionLoader.caffeine, 3600,0)
			},
			new PotionEffect[]{
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 0),
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 0),
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 600, 0),
					new PotionEffect(PotionLoader.caffeine, 3600,0)
			},
			new PotionEffect[]{
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 0),
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 0),
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "regeneration")), 600,0),
					new PotionEffect(PotionLoader.caffeine, 3600,0)
			},
			new PotionEffect[]{
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 800, 1),
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 800, 1),
					new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "regeneration")), 800,0),
					new PotionEffect(PotionRegister.PotionLifeDrain, 800,0),
					new PotionEffect(PotionLoader.caffeine, 4800,0)
			}	
	}
	);
	public static DrinkCoffee tea_ice_drinks = new DrinkCoffeeIce("tea_ice_drinks", 3, 
			new int[]{2,2,2,2}, 
			new float[]{0.2f,0.2f,0.2f,0.2f}, 
			new String[]{
					CoffeeWork.MODID+"."+"coffee_green_tea_ice",
					CoffeeWork.MODID+"."+"coffee_black_tea_ice",
					CoffeeWork.MODID+"."+"coffee_milk_tea_ice",
					CoffeeWork.MODID+"."+"coffee_mandarin_drink_ice"
					}, 
			new PotionEffect[][]{
				new PotionEffect[]{
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 0),
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 0),
						new PotionEffect(PotionRegister.PotionAgility, 600,0),
						new PotionEffect(PotionLoader.relax,600,1),
						new PotionEffect(PotionLoader.caffeine, 3600,0)
				},
				new PotionEffect[]{
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 0),
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 0),
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "health_boost")), 600, 0),
						new PotionEffect(PotionLoader.relax,600,1),
						new PotionEffect(PotionLoader.caffeine, 3600,0)
				},
				new PotionEffect[]{
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 600, 0),
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 600, 0),
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "regeneration")), 600,0),
						new PotionEffect(PotionLoader.golden_heart, 600,0),
						new PotionEffect(PotionLoader.relax,600,1),
						new PotionEffect(PotionLoader.caffeine, 3600,0)
				},
				new PotionEffect[]{
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "haste")), 800, 1),
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "speed")), 800, 1),
						new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation("minecraft", "regeneration")), 800,0),
						new PotionEffect(PotionRegister.PotionLifeDrain, 800,0),
						new PotionEffect(PotionLoader.golden_heart, 800,0),
						new PotionEffect(PotionLoader.relax,800,1),
						new PotionEffect(PotionLoader.caffeine, 4800,0)
				}	
		
	}
	);
	public static Block green_teaBlock = new BlockCoffee(new ItemStack(tea_drinks,1,0));
	public static Block black_teaBlock = new BlockCoffee(new ItemStack(tea_drinks,1,1));
	public static Block milk_teaBlock = new BlockCoffee(new ItemStack(tea_drinks,1,2));
	public static Block mandarin_drinkBlock = new BlockCoffee(new ItemStack(tea_drinks,1,3));
	public static Block green_tea_iceBlock = new BlockCoffee(new ItemStack(tea_ice_drinks,1,0));
	public static Block black_tea_iceBlock = new BlockCoffee(new ItemStack(tea_ice_drinks,1,1));
	public static Block milk_tea_iceBlock = new BlockCoffee(new ItemStack(tea_ice_drinks,1,2));
	public static Block mandarin_drink_iceBlock = new BlockCoffee(new ItemStack(tea_ice_drinks,1,3));
	
	public TeaStoriesCompatDrinks(FMLPreInitializationEvent event) {
		register(tea_drinks);
		register(tea_ice_drinks);
		
		register(green_teaBlock);
		register(black_teaBlock);
		register(milk_teaBlock);
		register(mandarin_drinkBlock);
		register(green_tea_iceBlock);
		register(black_tea_iceBlock);
		register(milk_tea_iceBlock);
		register(mandarin_drink_iceBlock);
	}
	@SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
		registerRender(green_tea_iceBlock);
		registerRender(black_tea_iceBlock);
		registerRender(milk_tea_iceBlock);
		registerRender(mandarin_drink_iceBlock);
		registerRender(tea_drinks);
		registerRender(tea_ice_drinks);
		registerRender(green_teaBlock);
		registerRender(black_teaBlock);
		registerRender(milk_teaBlock);
		registerRender(mandarin_drinkBlock);
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
