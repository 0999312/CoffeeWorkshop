package net.langball.coffee.drinks;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.CommonProxy;
import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.item.DrinkCocoaIce;
import net.langball.coffee.item.DrinkCoffee;
import net.langball.coffee.item.DrinkEspresso;
import net.langball.coffee.item.DrinkMixCoffee;
import net.langball.coffee.item.DrinkMixCoffeeIce;
import net.langball.coffee.item.DrinkTurkeyCoffee;
import net.langball.coffee.util.JSON_Creator;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
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

public class DrinksLoader {
	public static Item cup = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cup").setMaxStackSize(1);
	public static Item coffee=new DrinkCoffee(2,1f,null).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee");
	public static Item coffee_milk=new DrinkCoffee(3,1f,new PotionEffect(Potion.getPotionById(10),500,1)).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_milk");
	public static Item coffee_cream=new DrinkCoffee(4,2f,new PotionEffect(Potion.getPotionById(10),300,2)).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_cream");
	public static Item coffee_cheese=new DrinkCoffee(5,2f,new PotionEffect(Potion.getPotionById(12),500,1)).setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_cheese");
	public static Item espresso=new DrinkEspresso(2,2f).setUnlocalizedName(CoffeeWork.MODID+"."+"espresso");
	public static Item cocoa=new DrinkCoffee(4,2f,null).setUnlocalizedName(CoffeeWork.MODID+"."+"cocoa");
	public static Item strong_cocoa=new DrinkCoffee(5,2f,new PotionEffect(Potion.getPotionById(5),600,1)).setUnlocalizedName(CoffeeWork.MODID+"."+"strong_cocoa");
	public static Item coffee_american=new DrinkMixCoffee(EnumCoffee.american);
	public static Item coffee_latte=new DrinkMixCoffee(EnumCoffee.latte);
	public static Item coffee_mochaccino=new DrinkMixCoffee(EnumCoffee.mochaccino);
	public static Item coffee_cappuccino=new DrinkMixCoffee(EnumCoffee.cappuccino);
	public static Item coffee_macchiato=new DrinkMixCoffee(EnumCoffee.macchiato);
	
	public static Item coffee_vanilla=new DrinkMixCoffee(EnumCoffee.vanilla);
	public static Item coffee_berry=new DrinkMixCoffee(EnumCoffee.berry);
	public static Item coffee_lemon=new DrinkMixCoffee(EnumCoffee.lemon);
	
	public static Item coffee_mochaccino_ice=new DrinkMixCoffeeIce(EnumCoffee.mochaccino);
	public static Item coffee_cappuccino_ice=new DrinkMixCoffeeIce(EnumCoffee.cappuccino);
	public static Item coffee_macchiato_ice=new DrinkMixCoffeeIce(EnumCoffee.macchiato);
	public static Item cup_glass = new Item().setUnlocalizedName(CoffeeWork.MODID+"."+"cup_glass").setMaxStackSize(1);
	public static Item coffee_american_ice=new DrinkMixCoffeeIce(EnumCoffee.american);
	public static Item coffee_latte_ice=new DrinkMixCoffeeIce(EnumCoffee.latte);
	
	public static Item coffee_vanilla_ice=new DrinkMixCoffeeIce(EnumCoffee.vanilla);
	public static Item coffee_berry_ice=new DrinkMixCoffeeIce(EnumCoffee.berry);
	public static Item coffee_lemon_ice=new DrinkMixCoffeeIce(EnumCoffee.lemon);
	
	public static Item coffee_turkey = new DrinkTurkeyCoffee().setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_turkey");
	public static Item cocoa_ice=new DrinkCocoaIce(4,2f,null).setUnlocalizedName(CoffeeWork.MODID+"."+"cocoa_ice");
	public static Item strong_cocoa_ice=new DrinkCocoaIce(5,2f,new PotionEffect(Potion.getPotionById(5),600,1)).setUnlocalizedName(CoffeeWork.MODID+"."+"strong_cocoa_ice");
	public static Item freddo=new DrinkMixCoffeeIce(EnumCoffee.freddo);
	public static Item freddo_mocha=new DrinkMixCoffeeIce(EnumCoffee.freddo_mocha);
	public static Item freddo_caramel=new DrinkMixCoffeeIce(EnumCoffee.freddo_caramel);
	
	public DrinksLoader(FMLPreInitializationEvent event) {

		register(cup);
		register(coffee);
		register(coffee_milk);
		register(coffee_cream);
		register(coffee_cheese);
		register(coffee_turkey);
		register(cocoa);
		register(strong_cocoa);
		
		register(espresso);
		register(coffee_american);
		register(coffee_latte);
		register(coffee_mochaccino);
		register(coffee_cappuccino);
		register(coffee_macchiato);
		
		register(coffee_vanilla);
		register(coffee_berry);
		register(coffee_lemon);
		
		register(cup_glass);
		register(cocoa_ice);
		register(strong_cocoa_ice);
		register(coffee_american_ice);
		register(coffee_latte_ice);
		register(coffee_mochaccino_ice);
		register(coffee_cappuccino_ice);
		register(coffee_macchiato_ice);
		register(coffee_vanilla_ice);
		register(coffee_berry_ice);
		register(coffee_lemon_ice);
		
		register(freddo);
		register(freddo_caramel);
		register(freddo_mocha);
		
	}
	@SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
		registerRender(coffee_cream);
		registerRender(coffee_vanilla_ice);
		registerRender(coffee_berry_ice);
		registerRender(coffee_lemon_ice);
		registerRender(coffee_vanilla);
		registerRender(coffee_berry);
		registerRender(coffee_lemon);
		registerRender(freddo);
		registerRender(freddo_caramel);
		registerRender(freddo_mocha);
		registerRender(coffee_cheese);
		registerRender(coffee_turkey);
		registerRender(cup_glass);
		registerRender(cocoa_ice);
		registerRender(strong_cocoa_ice);
		registerRender(coffee_american_ice);
		registerRender(coffee_latte_ice);
		registerRender(coffee_mochaccino_ice);
		registerRender(coffee_cappuccino_ice);
		registerRender(coffee_macchiato_ice);
	
        registerRender(coffee_american);
        registerRender(coffee_latte);
        registerRender(coffee_mochaccino);
        registerRender(coffee_cappuccino);
        registerRender(coffee_macchiato);
        registerRender(espresso);
        registerRender(strong_cocoa);
        registerRender(cup);
        registerRender(coffee);
        registerRender(cocoa);
        registerRender(coffee_milk);
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
