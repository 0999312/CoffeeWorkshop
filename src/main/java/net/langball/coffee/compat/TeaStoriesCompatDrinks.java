package net.langball.coffee.compat;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.CommonProxy;
import net.langball.coffee.block.BlockCoffee;
import net.langball.coffee.block.ItemBlockCoffee;
import net.langball.coffee.drinks.DrinkCocoaIce;
import net.langball.coffee.drinks.DrinkCoffee;
import net.langball.coffee.drinks.DrinkMixCoffee;
import net.langball.coffee.drinks.DrinkMixCoffeeIce;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.drinks.EnumCoffee;
import net.langball.coffee.util.JSON_Creator;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import roito.teastory.potion.PotionRegister;

public class TeaStoriesCompatDrinks {
	public static Item green_tea_ice =new DrinkCocoaIce(3,2f,new PotionEffect(PotionRegister.PotionExcitement,600,2)).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_green_tea_ice");
	public static Item black_tea_ice =new DrinkCocoaIce(3,2f,new PotionEffect(PotionRegister.PotionAgility,600,2)).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_black_tea_ice");
	public static Item milk_tea_ice =new DrinkCocoaIce(4, 2f, new PotionEffect(PotionRegister.PotionAgility,600,2)).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_milk_tea_ice");
	public static Item milk_tea =new DrinkCoffee(4, 1f, new PotionEffect(PotionRegister.PotionAgility,600,2)).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_milk_tea");
	public static Item mandarin_drink =new DrinkCoffee(4, 2f, new PotionEffect(PotionRegister.PotionAgility,600,2)).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_mandarin_drink");

	public static Block milk_teaBlock = new BlockCoffee(milk_tea);
	public static Item milk_teaBlockItem = new ItemBlockCoffee(milk_teaBlock);
	public static Block mandarin_drinkBlock = new BlockCoffee(mandarin_drink);
	public static Item mandarin_drinkBlockItem = new ItemBlockCoffee(mandarin_drinkBlock);
	
	public TeaStoriesCompatDrinks(FMLPreInitializationEvent event) {
		register(green_tea_ice);
		register(black_tea_ice);
		register(milk_tea_ice);
		register(milk_tea);
		register(mandarin_drink);
		
		ForgeRegistries.BLOCKS.register(milk_teaBlock);
		ForgeRegistries.ITEMS.register(milk_teaBlockItem);
		ForgeRegistries.BLOCKS.register(mandarin_drinkBlock);
		ForgeRegistries.ITEMS.register(mandarin_drinkBlockItem);
	}
	@SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
		registerRender(green_tea_ice);
		registerRender(black_tea_ice);
		registerRender(milk_tea_ice);
		registerRender(milk_tea);
		registerRender(mandarin_drink);
		registerRender(milk_teaBlock);
		registerRender(mandarin_drinkBlock);
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
	@SideOnly(Side.CLIENT)
	public static void registerRender(Block block) {
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(),"inventory");
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
	}
}
