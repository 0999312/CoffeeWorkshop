package net.langball.coffee.block;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.CommonProxy;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.util.JSON_Creator;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.GameData;

public class BlockLoader {
	
	public static Block Grinder = new BlockGrinder(false).setRegistryName("grinder_off").setUnlocalizedName(CoffeeWork.MODID+".grinder").setCreativeTab(CommonProxy.tab);
	public static Block Grinder_on = new BlockGrinder(true).setRegistryName("grinder_on").setLightLevel(0.875F).setUnlocalizedName(CoffeeWork.MODID+".grinder");
	public static Item GrinderItem = new ItemBlock(Grinder).setRegistryName("grinder_off").setUnlocalizedName(CoffeeWork.MODID+"grinder");
	public static Block Coffee_Machine = new BlockCoffeeMachine(false).setRegistryName("coffeemachine_off").setUnlocalizedName(CoffeeWork.MODID+".coffeemachine").setCreativeTab(CommonProxy.tab);
	public static Block Coffee_Machine_on = new BlockCoffeeMachine(true).setRegistryName("coffeemachine_on").setUnlocalizedName(CoffeeWork.MODID+".coffeemachine");
	public static Item Coffee_MachineItem = new ItemBlock(Coffee_Machine).setRegistryName("coffee_machine").setUnlocalizedName(CoffeeWork.MODID+"coffeemachine");
	public static Block Coffee_tree = new BlockCoffeeTree();
	public static Block Icecream_Machine = new BlockIcecreamMachine(false).setRegistryName("icecreammachine_off").setUnlocalizedName(CoffeeWork.MODID+".icecream_machine").setCreativeTab(CommonProxy.tab);
	public static Block Icecream_Machine_on = new BlockIcecreamMachine(true).setRegistryName("icecreammachine_on").setUnlocalizedName(CoffeeWork.MODID+".icecream_machine");
	public static Item Icecream_MachineItem = new ItemBlock(Icecream_Machine).setRegistryName("icecream_machine").setUnlocalizedName(CoffeeWork.MODID+"icecream_machine");
	public static Block Roller = new BlockRoller(false).setRegistryName("roller_off").setUnlocalizedName(CoffeeWork.MODID+".roller").setCreativeTab(CommonProxy.tab);
	public static Block Roller_on = new BlockRoller(true).setRegistryName("roller_on").setUnlocalizedName(CoffeeWork.MODID+".roller");
	public static Item RollerItem = new ItemBlock(Roller).setRegistryName("roller").setUnlocalizedName(CoffeeWork.MODID+"roller");

	public static Block Oven = new BlockClayOven(false).setRegistryName("oven_off").setUnlocalizedName(CoffeeWork.MODID+".oven").setCreativeTab(CommonProxy.tab);
	public static Block Oven_on = new BlockClayOven(true).setRegistryName("oven_on").setLightLevel(0.875F).setUnlocalizedName(CoffeeWork.MODID+".oven");
	public static Item OvenItem = new ItemBlock(Oven).setRegistryName("oven_off").setUnlocalizedName(CoffeeWork.MODID+"oven");
	
	public static Block vanilla_crop = new BlockVanilla();
	
	public static Block plate = new BlockPlate();
	public static Block coffee_instantBlock = new BlockCoffee(new ItemStack(DrinksLoader.coffee_instant));
	public static Block bag_coffee = new BlockBag();
	public static Block bag_coffee_raw = new BlockBag();
	public static Block bag_cocoa = new BlockBag();
	public static Block bag_cocoa_powder = new BlockBag();
	public static Block bag_flour = new BlockBag();
	public static Block bag_coffee_powder = new BlockBag();
	public static Block bag_sugar = new BlockBag();
	
	public static Block double_bag_coffee = new BlockBag2();
	public static Block double_bag_coffee_raw = new BlockBag2();
	public static Block double_bag_cocoa = new BlockBag2();
	public static Block double_bag_cocoa_powder = new BlockBag2();
	public static Block double_bag_flour = new BlockBag2();
	public static Block double_bag_coffee_powder = new BlockBag2();
	public static Block double_bag_sugar = new BlockBag2();
	
	public static Block cake_sponge = new BlockCakeBasic(1,0.1F);
	public static Block cake_sponge_chocolate = new BlockCakeBasic(1,0.5F);
	public static Block cake_sponge_coffee = new BlockCakeBasic(1,0.5F);
	public static Block cake_sponge_pumpkin = new BlockCakeBasic(1,0.5F);
	public static Block cake_sponge_carrot = new BlockCakeBasic(1,0.5F);
	public static Block cake_sponge_redvelvet = new BlockCakeBasic(1,0.5F);
	public static Block cake_sponge_lemon = new BlockCakeBasic(1,0.5F);
	public static Block cake_sponge_tea = new BlockCakeBasic(1,0.5F);
	public static Block cake_sponge_berry = new BlockCakeBasic(1,0.5F);
	
	public static Block cake_coffee = new BlockCakeBasic(3,0.5F);
	public static Block cake_harvest = new BlockCakeBasic(3,0.5F);
	public static Block cake_lemon = new BlockCakeBasic(3,0.5F);
	public static Block cake_tea = new BlockCakeBasic(3,0.5F);
	public static Block cake_berry = new BlockCakeBasic(3,0.5F);
	public static Block cake_cheese = new BlockCakeBasic(3,0.5F);
	public static Block cake_schwarzwald = new BlockCakeBasic(3,0.5F);
	public static Block cake_redvelvet = new BlockCakeBasic(3,0.5F);
	public static Block tiramisu = new BlockCakeBasic(5,0.5F);
	public static Block BlueBerryBush = new BlockBlueBerryBush();
	public static Block XmasTree = new BlockXmasTree();
	public static Block GingerHouse = new BlockGingerHouse();
	public static Block Soda_Ore = new BlockOreSoda();
	public static Block mousse_berry = new BlockCakeBasic(3,0.5F);
	public static Block mousse_lemon = new BlockCakeBasic(3,0.5F);
	public static Block mousse_chocolate = new BlockCakeBasic(3,0.5F);
	public static Block mousse_coffee = new BlockCakeBasic(3,0.5F);
	
	public static Block ColdBrewPot = new BlockColdBrewPot(ItemStack.EMPTY, new ItemStack[]{new ItemStack(ItemLoader.materials,4,2)}).setUnlocalizedName("coldbrew_pot");
	public BlockLoader(FMLPreInitializationEvent event) {
		ForgeRegistries.BLOCKS.register(Grinder);
		ForgeRegistries.BLOCKS.register(Grinder_on);
		ForgeRegistries.ITEMS.register(GrinderItem);
		ForgeRegistries.BLOCKS.register(Coffee_Machine);
		ForgeRegistries.BLOCKS.register(Coffee_Machine_on);
		ForgeRegistries.ITEMS.register(Coffee_MachineItem);
		ForgeRegistries.BLOCKS.register(Icecream_Machine);
		ForgeRegistries.BLOCKS.register(Icecream_Machine_on);
		ForgeRegistries.ITEMS.register(Icecream_MachineItem);
		ForgeRegistries.BLOCKS.register(Roller);
		ForgeRegistries.BLOCKS.register(Roller_on);
		ForgeRegistries.ITEMS.register(RollerItem);
		
		ForgeRegistries.BLOCKS.register(Oven);
		ForgeRegistries.BLOCKS.register(Oven_on);
		ForgeRegistries.ITEMS.register(OvenItem);
		
		register(ColdBrewPot, new ItemBlock(ColdBrewPot), "coldbrew_pot");

		register(Soda_Ore, new ItemBlock(Soda_Ore), "soda_ore");
		register(Coffee_tree, new ItemBlock(Coffee_tree), "coffee_tree");
		register(BlueBerryBush, new ItemBlock(BlueBerryBush), "blueberry_bush");
		register(vanilla_crop, null, "vanilla_crop");
		register(plate, new ItemBlock(plate), "plate");
		
		register(bag_coffee, new ItemBlock(bag_coffee), "bag_coffee");
		register(bag_coffee_raw, new ItemBlock(bag_coffee_raw), "bag_coffee_raw");
		register(bag_cocoa, new ItemBlock(bag_cocoa), "bag_cocoa");
		register(bag_cocoa_powder, new ItemBlock(bag_cocoa_powder), "bag_cocoa_powder");
		register(bag_flour, new ItemBlock(bag_flour), "bag_flour");
		register(bag_coffee_powder, new ItemBlock(bag_coffee_powder), "bag_coffee_powder");
		register(bag_sugar, new ItemBlock(bag_sugar), "bag_sugar");
		
		register(double_bag_coffee, new ItemBlock(double_bag_coffee), "double_bag_coffee");
		register(double_bag_coffee_raw, new ItemBlock(double_bag_coffee_raw), "double_bag_coffee_raw");
		register(double_bag_cocoa, new ItemBlock(double_bag_cocoa), "double_bag_cocoa");
		register(double_bag_cocoa_powder, new ItemBlock(double_bag_cocoa_powder), "double_bag_cocoa_powder");
		register(double_bag_flour, new ItemBlock(double_bag_flour), "double_bag_flour");
		register(double_bag_coffee_powder, new ItemBlock(double_bag_coffee_powder), "double_bag_coffee_powder");
		register(double_bag_sugar, new ItemBlock(double_bag_sugar), "double_bag_sugar");
		
		register(cake_sponge, new ItemBlock(cake_sponge), "cake_sponge");
		register(cake_sponge_chocolate, new ItemBlock(cake_sponge_chocolate), "cake_sponge_chocolate");
		register(cake_sponge_coffee, new ItemBlock(cake_sponge_coffee), "cake_sponge_coffee");
		register(cake_sponge_pumpkin, new ItemBlock(cake_sponge_pumpkin), "cake_sponge_pumpkin");
		register(cake_sponge_carrot, new ItemBlock(cake_sponge_carrot), "cake_sponge_carrot");
		register(cake_sponge_redvelvet, new ItemBlock(cake_sponge_redvelvet), "cake_sponge_redvelvet");
		register(cake_sponge_lemon, new ItemBlock(cake_sponge_lemon), "cake_sponge_lemon");
		register(cake_sponge_tea, new ItemBlock(cake_sponge_tea), "cake_sponge_tea");
		register(cake_sponge_berry, new ItemBlock(cake_sponge_berry), "cake_sponge_berry");
		
		register(cake_coffee, new ItemBlock(cake_coffee), "cake_coffee");
		register(cake_harvest, new ItemBlock(cake_harvest), "cake_harvest");
		register(cake_lemon, new ItemBlock(cake_lemon), "cake_lemon");
		register(cake_tea, new ItemBlock(cake_tea), "cake_tea");
		register(cake_berry, new ItemBlock(cake_berry), "cake_berry");
		register(cake_cheese, new ItemBlock(cake_cheese), "cake_cheese");
		register(cake_schwarzwald, new ItemBlock(cake_schwarzwald), "cake_schwarzwald");
		register(cake_redvelvet, new ItemBlock(cake_redvelvet), "cake_redvelvet");
		
		register(tiramisu, new ItemBlock(tiramisu), "tiramisu");
		register(mousse_lemon, new ItemBlock(mousse_lemon), "mousse_lemon");
		register(mousse_berry, new ItemBlock(mousse_berry), "mousse_berry");
		register(mousse_chocolate, new ItemBlock(mousse_chocolate), "mousse_chocolate");
		register(mousse_coffee, new ItemBlock(mousse_coffee), "mousse_coffee");
		
		register(XmasTree, new ItemBlock(XmasTree), "xmas_tree");
		register(GingerHouse, new ItemBlock(GingerHouse), "ginger_house");
	}
	private static void register(Block block, Item itemBlock, String string) {
		block.setRegistryName(string);
		block.setUnlocalizedName(CoffeeWork.MODID+"."+string);
		block.setCreativeTab(CommonProxy.tab);
		ForgeRegistries.BLOCKS.register(block);
		if (itemBlock != null) {
			itemBlock.setRegistryName(string);
			itemBlock.setUnlocalizedName(CoffeeWork.MODID+"."+string);
			ForgeRegistries.ITEMS.register(itemBlock);
			GameData.getBlockItemMap().put(block, itemBlock);
		}
		
	}
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(ColdBrewPot);
		registerRender(mousse_berry);
		registerRender(mousse_chocolate);
		registerRender(mousse_coffee);
		registerRender(mousse_lemon);
		registerRender(GingerHouse);
		registerRender(XmasTree);
		registerRender(Soda_Ore);
		registerRender(coffee_instantBlock);
		registerRender(cake_sponge);
		registerRender(cake_sponge_chocolate);
		registerRender(cake_sponge_coffee);
		registerRender(cake_sponge_pumpkin);
		registerRender(cake_sponge_carrot);
		registerRender(cake_sponge_redvelvet);
		registerRender(cake_sponge_lemon);
		registerRender(cake_sponge_tea);
		registerRender(cake_sponge_berry);
		registerRender(cake_sponge);
		registerRender(BlueBerryBush);
		registerRender(cake_cheese);
		registerRender(vanilla_crop);
		registerRender(cake_schwarzwald);
		registerRender(cake_redvelvet);
		registerRender(tiramisu);
		registerRender(Roller);
		registerRender(Roller_on);
		registerRender(double_bag_flour);
		registerRender(double_bag_sugar);
		registerRender(double_bag_coffee_powder);
		registerRender(double_bag_cocoa_powder);
		registerRender(double_bag_cocoa);
		registerRender(double_bag_coffee);
		registerRender(double_bag_coffee_raw);
		registerRender(bag_flour);
		registerRender(bag_sugar);
		registerRender(bag_coffee_powder);
		registerRender(bag_cocoa_powder);
		registerRender(bag_cocoa);
		registerRender(bag_coffee);
		registerRender(bag_coffee_raw);
		registerRender(Grinder);
		registerRender(Grinder_on);
		registerRender(Oven);
		registerRender(Oven_on);
		registerRender(Coffee_Machine);
		registerRender(Coffee_Machine_on);
		registerRender(Icecream_Machine);
		registerRender(Icecream_Machine_on);
		registerRender(Coffee_tree);
		registerRender(plate);


		registerRender(cake_coffee);
		registerRender(cake_harvest);
		registerRender(cake_lemon);
		registerRender(cake_tea);
		registerRender(cake_berry);
	}
	@SideOnly(Side.CLIENT)
	public static void registerRender(Block block) {
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(),"inventory");
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerCakeRender(Block block,String name) {
		JSON_Creator.genCake(block.getRegistryName().toString().substring(11), name, "json_create");
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(),"inventory");
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRender(Block block,String name) {
		JSON_Creator.genBlock(block.getRegistryName().toString().substring(11), name, "json_create");
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(),"inventory");
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
	}
}
