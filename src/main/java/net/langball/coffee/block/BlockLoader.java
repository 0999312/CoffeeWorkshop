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
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	
	public static Block Grinder = new BlockGrinder(false).setRegistryName("grinder_off").setUnlocalizedName(CoffeeWork.MODID+".grinder").setCreativeTab(CommonProxy.tab);
	public static Block Grinder_on = new BlockGrinder(true).setRegistryName("grinder_on").setLightLevel(0.875F).setUnlocalizedName(CoffeeWork.MODID+".grinder");
	public static Item GrinderItem = new ItemBlock(Grinder).setRegistryName("grinder_off").setUnlocalizedName(CoffeeWork.MODID+"grinder");
	public static Block Coffee_Machine = new BlockCoffeeMachine(false).setRegistryName("coffeemachine_off").setUnlocalizedName(CoffeeWork.MODID+".coffeemachine").setCreativeTab(CommonProxy.tab);
	public static Block Coffee_Machine_on = new BlockCoffeeMachine(true).setRegistryName("coffeemachine_on").setUnlocalizedName(CoffeeWork.MODID+".coffeemachine");
	public static Item Coffee_MachineItem = new ItemBlock(Coffee_Machine).setRegistryName("coffee_machine").setUnlocalizedName(CoffeeWork.MODID+"coffeemachine");
	public static Block Coffee_tree = new BlockCoffeeTree().setRegistryName("coffee_tree").setUnlocalizedName(CoffeeWork.MODID+".coffee_tree").setCreativeTab(CommonProxy.tab);
	public static Item Coffee_treeItem = new ItemBlock(Coffee_tree).setRegistryName("coffee_tree").setUnlocalizedName(CoffeeWork.MODID+"coffee_tree");
	public static Block Icecream_Machine = new BlockIcecreamMachine(false).setRegistryName("icecreammachine_off").setUnlocalizedName(CoffeeWork.MODID+".icecream_machine").setCreativeTab(CommonProxy.tab);
	public static Block Icecream_Machine_on = new BlockIcecreamMachine(true).setRegistryName("icecreammachine_on").setUnlocalizedName(CoffeeWork.MODID+".icecream_machine");
	public static Item Icecream_MachineItem = new ItemBlock(Icecream_Machine).setRegistryName("icecream_machine").setUnlocalizedName(CoffeeWork.MODID+"icecream_machine");
	public static Block Roller = new BlockRoller(false).setRegistryName("roller_off").setUnlocalizedName(CoffeeWork.MODID+".roller").setCreativeTab(CommonProxy.tab);
	public static Block Roller_on = new BlockRoller(true).setRegistryName("roller_on").setUnlocalizedName(CoffeeWork.MODID+".roller");
	public static Item RollerItem = new ItemBlock(Roller).setRegistryName("roller").setUnlocalizedName(CoffeeWork.MODID+"roller");
	public static Block vanilla_crop = new BlockVanilla().setRegistryName("vanilla_crop").setUnlocalizedName(CoffeeWork.MODID+".vanilla_crop");
	
	public static Block plate = new BlockPlate().setRegistryName("plate").setUnlocalizedName(CoffeeWork.MODID+".plate").setCreativeTab(CommonProxy.tab);
	public static Item plateItem = new ItemBlock(plate).setRegistryName("plate").setUnlocalizedName(CoffeeWork.MODID+"plate");
	
	public static Block coffeeBlock = new BlockCoffee(DrinksLoader.coffee);
	public static Block coffee_milkBlock = new BlockCoffee(DrinksLoader.coffee_milk);
	public static Block cocoaBlock = new BlockCoffee(DrinksLoader.cocoa);
	public static Block strong_cocoaBlock = new BlockCoffee(DrinksLoader.strong_cocoa);
	public static Block coffee_creamBlock = new BlockCoffee(DrinksLoader.coffee_cream);
	public static Block espressoBlock = new BlockCoffee(DrinksLoader.espresso);
	public static Block coffee_americanBlock = new BlockCoffee(DrinksLoader.coffee_american);
	public static Block coffee_latteBlock = new BlockCoffee(DrinksLoader.coffee_latte);
	public static Block coffee_mochaccinoBlock = new BlockCoffee(DrinksLoader.coffee_mochaccino);
	public static Block coffee_cappuccinoBlock = new BlockCoffee(DrinksLoader.coffee_cappuccino);
	public static Block coffee_macchiatoBlock = new BlockCoffee(DrinksLoader.coffee_macchiato);
	public static Block coffee_vanillaBlock = new BlockCoffee(DrinksLoader.coffee_vanilla);
	public static Block coffee_berryBlock = new BlockCoffee(DrinksLoader.coffee_berry);
	public static Block coffee_lemonBlock = new BlockCoffee(DrinksLoader.coffee_lemon);

	
	public static Item coffee_berryBlockItem = new ItemBlockCoffee(coffee_berryBlock);
	public static Item coffee_creamBlockItem = new ItemBlockCoffee(coffee_creamBlock);
	public static Item coffee_lemonBlockItem = new ItemBlockCoffee(coffee_lemonBlock);
	public static Item coffee_vanillaBlockItem = new ItemBlockCoffee(coffee_vanillaBlock);
	public static Item coffeeBlockItem = new ItemBlockCoffee(coffeeBlock);
	public static Item coffee_milkBlockItem = new ItemBlockCoffee(coffee_milkBlock);
	public static Item cocoaBlockItem = new ItemBlockCoffee(cocoaBlock);
	public static Item strong_cocoaBlockItem = new ItemBlockCoffee(strong_cocoaBlock);
	public static Item coffee_americanBlockItem = new ItemBlockCoffee(coffee_americanBlock);
	public static Item coffee_latteBlockItem = new ItemBlockCoffee(coffee_latteBlock);
	public static Item coffee_mochaccinoBlockItem = new ItemBlockCoffee(coffee_mochaccinoBlock);
	public static Item coffee_cappuccinoBlockItem = new ItemBlockCoffee(coffee_cappuccinoBlock);
	public static Item coffee_macchiatoBlockItem = new ItemBlockCoffee(coffee_macchiatoBlock);
	public static Item espressoBlockItem = new ItemBlockCoffee(espressoBlock);
	public static Block coffee_turkeyBlock = new BlockCoffee(DrinksLoader.coffee_turkey);
	public static Item coffee_turkeyBlockItem = new ItemBlockCoffee(coffee_turkeyBlock);
	public static Block coffee_cheeseBlock = new BlockCoffee(DrinksLoader.coffee_cheese);
	public static Item coffee_cheeseBlockItem = new ItemBlockCoffee(coffee_cheeseBlock);
	
	public static Block bag_coffee = new BlockBag().setRegistryName("bag_coffee").setUnlocalizedName(CoffeeWork.MODID+".bag_coffee").setCreativeTab(CommonProxy.tab);
	public static Item bag_coffeeItem = new ItemBlock(bag_coffee).setRegistryName("bag_coffee").setUnlocalizedName(CoffeeWork.MODID+".bag_coffee").setContainerItem(ItemLoader.bag);
	public static Block bag_coffee_raw = new BlockBag().setRegistryName("bag_coffee_raw").setUnlocalizedName(CoffeeWork.MODID+".bag_coffee_raw").setCreativeTab(CommonProxy.tab);
	public static Item bag_coffee_rawItem = new ItemBlock(bag_coffee_raw).setRegistryName("bag_coffee_raw").setUnlocalizedName(CoffeeWork.MODID+"bag_coffee_raw").setContainerItem(ItemLoader.bag);
	public static Block bag_cocoa = new BlockBag().setRegistryName("bag_cocoa").setUnlocalizedName(CoffeeWork.MODID+".bag_cocoa").setCreativeTab(CommonProxy.tab);
	public static Item bag_cocoaItem = new ItemBlock(bag_cocoa).setRegistryName("bag_cocoa").setUnlocalizedName(CoffeeWork.MODID+".bag_cocoa").setContainerItem(ItemLoader.bag);
	public static Block bag_cocoa_powder = new BlockBag().setRegistryName("bag_cocoa_powder").setUnlocalizedName(CoffeeWork.MODID+".bag_cocoa_powder").setCreativeTab(CommonProxy.tab);
	public static Item bag_cocoa_powderItem = new ItemBlock(bag_cocoa_powder).setRegistryName("bag_cocoa_powder").setUnlocalizedName(CoffeeWork.MODID+".bag_cocoa_powder").setContainerItem(ItemLoader.bag);
	public static Block bag_flour = new BlockBag().setRegistryName("bag_flour").setUnlocalizedName(CoffeeWork.MODID+".bag_flour").setCreativeTab(CommonProxy.tab);
	public static Item bag_flourItem = new ItemBlock(bag_flour).setRegistryName("bag_flour").setUnlocalizedName(CoffeeWork.MODID+".bag_flour").setContainerItem(ItemLoader.bag);
	public static Block bag_coffee_powder = new BlockBag().setRegistryName("bag_coffee_powder").setUnlocalizedName(CoffeeWork.MODID+".bag_coffee_powder").setCreativeTab(CommonProxy.tab);
	public static Item bag_coffee_powderItem = new ItemBlock(bag_coffee_powder).setRegistryName("bag_coffee_powder").setUnlocalizedName(CoffeeWork.MODID+".bag_coffee_powder").setContainerItem(ItemLoader.bag);
	public static Block bag_sugar = new BlockBag().setRegistryName("bag_sugar").setUnlocalizedName(CoffeeWork.MODID+".bag_sugar").setCreativeTab(CommonProxy.tab);
	public static Item bag_sugarItem = new ItemBlock(bag_sugar).setRegistryName("bag_sugar").setUnlocalizedName(CoffeeWork.MODID+".bag_sugar").setContainerItem(ItemLoader.bag);
	
	public static Block double_bag_coffee = new BlockBag2().setRegistryName("double_bag_coffee").setUnlocalizedName(CoffeeWork.MODID+".double_bag_coffee").setCreativeTab(CommonProxy.tab);
	public static Item double_bag_coffeeItem = new ItemBlock(double_bag_coffee).setRegistryName("double_bag_coffee").setUnlocalizedName(CoffeeWork.MODID+".double_bag_coffee");
	public static Block double_bag_coffee_raw = new BlockBag2().setRegistryName("double_bag_coffee_raw").setUnlocalizedName(CoffeeWork.MODID+".double_bag_coffee_raw").setCreativeTab(CommonProxy.tab);
	public static Item double_bag_coffee_rawItem = new ItemBlock(double_bag_coffee_raw).setRegistryName("double_bag_coffee_raw").setUnlocalizedName(CoffeeWork.MODID+"double_bag_coffee_raw");
	public static Block double_bag_cocoa = new BlockBag2().setRegistryName("double_bag_cocoa").setUnlocalizedName(CoffeeWork.MODID+".double_bag_cocoa").setCreativeTab(CommonProxy.tab);
	public static Item double_bag_cocoaItem = new ItemBlock(double_bag_cocoa).setRegistryName("double_bag_cocoa").setUnlocalizedName(CoffeeWork.MODID+".double_bag_cocoa");
	public static Block double_bag_cocoa_powder = new BlockBag2().setRegistryName("double_bag_cocoa_powder").setUnlocalizedName(CoffeeWork.MODID+".double_bag_cocoa_powder").setCreativeTab(CommonProxy.tab);
	public static Item double_bag_cocoa_powderItem = new ItemBlock(double_bag_cocoa_powder).setRegistryName("double_bag_cocoa_powder").setUnlocalizedName(CoffeeWork.MODID+"double_bag_cocoa_powder");
	public static Block double_bag_flour = new BlockBag2().setRegistryName("double_bag_flour").setUnlocalizedName(CoffeeWork.MODID+".bag_flour").setCreativeTab(CommonProxy.tab);
	public static Item double_bag_flourItem = new ItemBlock(double_bag_flour).setRegistryName("double_bag_flour").setUnlocalizedName(CoffeeWork.MODID+".double_bag_flour").setContainerItem(ItemLoader.bag);
	public static Block double_bag_coffee_powder = new BlockBag2().setRegistryName("double_bag_coffee_powder").setUnlocalizedName(CoffeeWork.MODID+".double_bag_coffee_powder").setCreativeTab(CommonProxy.tab);
	public static Item double_bag_coffee_powderItem = new ItemBlock(double_bag_coffee_powder).setRegistryName("double_bag_coffee_powder").setUnlocalizedName(CoffeeWork.MODID+"double_bag_coffee_powder");
	public static Block double_bag_sugar = new BlockBag2().setRegistryName("double_bag_sugar").setUnlocalizedName(CoffeeWork.MODID+".double_bag_sugar").setCreativeTab(CommonProxy.tab);
	public static Item double_bag_sugarItem = new ItemBlock(double_bag_sugar).setRegistryName("double_bag_sugar").setUnlocalizedName(CoffeeWork.MODID+".double_bag_sugar");
	
	public static Block cake_sponge = new BlockCakeBasic(1,0.1F).setRegistryName("cake_sponge").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge").setCreativeTab(CommonProxy.tab);
	public static Item cake_spongeItem = new ItemBlock(cake_sponge).setRegistryName("cake_sponge").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge");
	public static Block cake_sponge_chocolate = new BlockCakeBasic(1,0.5F).setRegistryName("cake_sponge_chocolate").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_chocolate").setCreativeTab(CommonProxy.tab);
	public static Item cake_sponge_chocolateItem = new ItemBlock(cake_sponge_chocolate).setRegistryName("cake_sponge_chocolate").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_chocolate");

	public static Block cake_sponge_coffee = new BlockCakeBasic(1,0.5F).setRegistryName("cake_sponge_coffee").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_coffee").setCreativeTab(CommonProxy.tab);
	public static Item cake_sponge_coffeeItem = new ItemBlock(cake_sponge_coffee).setRegistryName("cake_sponge_coffee").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_coffee");
	public static Block cake_sponge_pumpkin = new BlockCakeBasic(1,0.5F).setRegistryName("cake_sponge_pumpkin").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_pumpkin").setCreativeTab(CommonProxy.tab);
	public static Item cake_sponge_pumpkinItem = new ItemBlock(cake_sponge_pumpkin).setRegistryName("cake_sponge_pumpkin").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_pumpkin");
	
	public static Block cake_sponge_carrot = new BlockCakeBasic(1,0.5F).setRegistryName("cake_sponge_carrot").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_carrot").setCreativeTab(CommonProxy.tab);
	public static Item cake_sponge_carrotItem = new ItemBlock(cake_sponge_carrot).setRegistryName("cake_sponge_carrot").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_carrot");
	public static Block cake_sponge_redvelvet = new BlockCakeBasic(1,0.5F).setRegistryName("cake_sponge_redvelvet").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_redvelvet").setCreativeTab(CommonProxy.tab);
	public static Item cake_sponge_redvelvetItem = new ItemBlock(cake_sponge_redvelvet).setRegistryName("cake_sponge_redvelvet").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_redvelvet");
	
	
	public static Block cake_sponge_lemon = new BlockCakeBasic(1,0.5F).setRegistryName("cake_sponge_lemon").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_lemon").setCreativeTab(CommonProxy.tab);
	public static Item cake_sponge_lemonItem = new ItemBlock(cake_sponge_lemon).setRegistryName("cake_sponge_lemon").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_lemon");
	public static Block cake_sponge_tea = new BlockCakeBasic(1,0.5F).setRegistryName("cake_sponge_tea").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_tea").setCreativeTab(CommonProxy.tab);
	public static Item cake_sponge_teaItem = new ItemBlock(cake_sponge_tea).setRegistryName("cake_sponge_tea").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_tea");
	
	public static Block cake_sponge_berry = new BlockCakeBasic(1,0.5F).setRegistryName("cake_sponge_berry").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_berry").setCreativeTab(CommonProxy.tab);
	public static Item cake_sponge_berryItem = new ItemBlock(cake_sponge_berry).setRegistryName("cake_sponge_berry").setUnlocalizedName(CoffeeWork.MODID+".cake_sponge_berry");
	
	public static Block cake_coffee = new BlockCakeBasic(2,0.5F).setRegistryName("cake_coffee").setUnlocalizedName(CoffeeWork.MODID+".cake_coffee").setCreativeTab(CommonProxy.tab);
	public static Item cake_coffeeItem = new ItemBlock(cake_coffee).setRegistryName("cake_coffee").setUnlocalizedName(CoffeeWork.MODID+".cake_coffee");
	public static Block cake_harvest = new BlockCakeBasic(2,0.5F).setRegistryName("cake_harvest").setUnlocalizedName(CoffeeWork.MODID+".cake_harvest").setCreativeTab(CommonProxy.tab);
	public static Item cake_harvestItem = new ItemBlock(cake_harvest).setRegistryName("cake_harvest").setUnlocalizedName(CoffeeWork.MODID+".cake_harvest");

	public static Block cake_lemon = new BlockCakeBasic(2,0.5F).setRegistryName("cake_lemon").setUnlocalizedName(CoffeeWork.MODID+".cake_lemon").setCreativeTab(CommonProxy.tab);
	public static Item cake_lemonItem = new ItemBlock(cake_lemon).setRegistryName("cake_lemon").setUnlocalizedName(CoffeeWork.MODID+".cake_lemon");
	public static Block cake_tea = new BlockCakeBasic(2,0.5F).setRegistryName("cake_tea").setUnlocalizedName(CoffeeWork.MODID+".cake_tea").setCreativeTab(CommonProxy.tab);
	public static Item cake_teaItem = new ItemBlock(cake_tea).setRegistryName("cake_tea").setUnlocalizedName(CoffeeWork.MODID+".cake_tea");
	
	public static Block cake_berry = new BlockCakeBasic(2,0.5F).setRegistryName("cake_berry").setUnlocalizedName(CoffeeWork.MODID+".cake_berry").setCreativeTab(CommonProxy.tab);
	public static Item cake_berryItem = new ItemBlock(cake_berry).setRegistryName("cake_berry").setUnlocalizedName(CoffeeWork.MODID+".cake_berry");
	
	public static Block cake_cheese = new BlockCakeBasic(2,0.2F).setRegistryName("cake_cheese").setUnlocalizedName(CoffeeWork.MODID+".cake_cheese").setCreativeTab(CommonProxy.tab);
	public static Item cake_cheeseItem = new ItemBlock(cake_cheese).setRegistryName("cake_cheese").setUnlocalizedName(CoffeeWork.MODID+".cake_cheese");
	public static Block cake_schwarzwald = new BlockCakeBasic(3,0.5F).setRegistryName("cake_schwarzwald").setUnlocalizedName(CoffeeWork.MODID+".cake_schwarzwald").setCreativeTab(CommonProxy.tab);
	public static Item cake_schwarzwaldItem = new ItemBlock(cake_schwarzwald).setRegistryName("cake_schwarzwald").setUnlocalizedName(CoffeeWork.MODID+".cake_schwarzwald");

	public static Block cake_redvelvet = new BlockCakeBasic(2,0.5F).setRegistryName("cake_redvelvet").setUnlocalizedName(CoffeeWork.MODID+".cake_redvelvet").setCreativeTab(CommonProxy.tab);
	public static Item cake_redvelvetItem = new ItemBlock(cake_redvelvet).setRegistryName("cake_redvelvet").setUnlocalizedName(CoffeeWork.MODID+".cake_redvelvet");
	public static Block tiramisu = new BlockCakeBasic(3,0.5F).setRegistryName("tiramisu").setUnlocalizedName(CoffeeWork.MODID+".tiramisu").setCreativeTab(CommonProxy.tab);
	public static Item tiramisuItem = new ItemBlock(tiramisu).setRegistryName("tiramisu").setUnlocalizedName(CoffeeWork.MODID+".tiramisu");
	
	public static Block BlueBerryBush = new BlockBlueBerryBush().setRegistryName("blueberry_bush").setUnlocalizedName(CoffeeWork.MODID+".blueberry_bush").setCreativeTab(CommonProxy.tab);
	public static Item BlueBerryBushItem = new ItemBlock(BlueBerryBush).setRegistryName("blueberry_bush").setUnlocalizedName(CoffeeWork.MODID+"blueberry_bush");
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
		ForgeRegistries.BLOCKS.register(Coffee_tree);
		ForgeRegistries.ITEMS.register(Coffee_treeItem);
		ForgeRegistries.BLOCKS.register(BlueBerryBush);
		ForgeRegistries.ITEMS.register(BlueBerryBushItem);
		ForgeRegistries.BLOCKS.register(vanilla_crop);
		
		ForgeRegistries.BLOCKS.register(cake_sponge);
		ForgeRegistries.ITEMS.register(cake_spongeItem);
		ForgeRegistries.BLOCKS.register(cake_sponge_chocolate);
		ForgeRegistries.ITEMS.register(cake_sponge_chocolateItem);
		ForgeRegistries.BLOCKS.register(cake_sponge_coffee);
		ForgeRegistries.ITEMS.register(cake_sponge_coffeeItem);
		ForgeRegistries.BLOCKS.register(cake_sponge_pumpkin);
		ForgeRegistries.ITEMS.register(cake_sponge_pumpkinItem);
		ForgeRegistries.BLOCKS.register(cake_sponge_carrot);
		ForgeRegistries.ITEMS.register(cake_sponge_carrotItem);
		ForgeRegistries.BLOCKS.register(cake_sponge_redvelvet);
		ForgeRegistries.ITEMS.register(cake_sponge_redvelvetItem);
		ForgeRegistries.BLOCKS.register(cake_sponge_lemon);
		ForgeRegistries.ITEMS.register(cake_sponge_lemonItem);
		ForgeRegistries.BLOCKS.register(cake_sponge_tea);
		ForgeRegistries.ITEMS.register(cake_sponge_teaItem);
		ForgeRegistries.BLOCKS.register(cake_sponge_berry);
		ForgeRegistries.ITEMS.register(cake_sponge_berryItem);

		ForgeRegistries.BLOCKS.register(cake_coffee);
		ForgeRegistries.ITEMS.register(cake_coffeeItem);
		ForgeRegistries.BLOCKS.register(cake_harvest);
		ForgeRegistries.ITEMS.register(cake_harvestItem);
		ForgeRegistries.BLOCKS.register(cake_lemon);
		ForgeRegistries.ITEMS.register(cake_lemonItem);
		ForgeRegistries.BLOCKS.register(cake_tea);
		ForgeRegistries.ITEMS.register(cake_teaItem);
		ForgeRegistries.BLOCKS.register(cake_berry);
		ForgeRegistries.ITEMS.register(cake_berryItem);
		
		ForgeRegistries.BLOCKS.register(cake_cheese);
		ForgeRegistries.ITEMS.register(cake_cheeseItem);
		ForgeRegistries.BLOCKS.register(cake_schwarzwald);
		ForgeRegistries.ITEMS.register(cake_schwarzwaldItem);
		ForgeRegistries.BLOCKS.register(cake_redvelvet);
		ForgeRegistries.ITEMS.register(cake_redvelvetItem);
		ForgeRegistries.BLOCKS.register(tiramisu);
		ForgeRegistries.ITEMS.register(tiramisuItem);
		
		ForgeRegistries.BLOCKS.register(bag_coffee_raw);
		ForgeRegistries.ITEMS.register(bag_coffee_rawItem);
		ForgeRegistries.BLOCKS.register(bag_coffee);
		ForgeRegistries.ITEMS.register(bag_coffeeItem);
		ForgeRegistries.BLOCKS.register(bag_cocoa);
		ForgeRegistries.ITEMS.register(bag_cocoaItem);
		ForgeRegistries.BLOCKS.register(bag_cocoa_powder);
		ForgeRegistries.ITEMS.register(bag_cocoa_powderItem);
		ForgeRegistries.BLOCKS.register(bag_flour);
		ForgeRegistries.ITEMS.register(bag_flourItem);
		ForgeRegistries.BLOCKS.register(bag_sugar);
		ForgeRegistries.ITEMS.register(bag_sugarItem);
		ForgeRegistries.BLOCKS.register(bag_coffee_powder);
		ForgeRegistries.ITEMS.register(bag_coffee_powderItem);
		
		ForgeRegistries.BLOCKS.register(double_bag_coffee_raw);
		ForgeRegistries.ITEMS.register(double_bag_coffee_rawItem);
		ForgeRegistries.BLOCKS.register(double_bag_coffee);
		ForgeRegistries.ITEMS.register(double_bag_coffeeItem);
		ForgeRegistries.BLOCKS.register(double_bag_cocoa);
		ForgeRegistries.ITEMS.register(double_bag_cocoaItem);
		ForgeRegistries.BLOCKS.register(double_bag_cocoa_powder);
		ForgeRegistries.ITEMS.register(double_bag_cocoa_powderItem);
		ForgeRegistries.BLOCKS.register(double_bag_flour);
		ForgeRegistries.ITEMS.register(double_bag_flourItem);
		ForgeRegistries.BLOCKS.register(double_bag_sugar);
		ForgeRegistries.ITEMS.register(double_bag_sugarItem);
		ForgeRegistries.BLOCKS.register(double_bag_coffee_powder);
		ForgeRegistries.ITEMS.register(double_bag_coffee_powderItem);
		
		ForgeRegistries.BLOCKS.register(plate);
		ForgeRegistries.ITEMS.register(plateItem);
		
		ForgeRegistries.BLOCKS.register(coffeeBlock);
		ForgeRegistries.BLOCKS.register(coffee_milkBlock);
		ForgeRegistries.BLOCKS.register(cocoaBlock);
		ForgeRegistries.BLOCKS.register(strong_cocoaBlock);
		ForgeRegistries.BLOCKS.register(coffee_turkeyBlock);
		ForgeRegistries.BLOCKS.register(coffee_cheeseBlock);
		ForgeRegistries.BLOCKS.register(coffee_creamBlock);
		ForgeRegistries.BLOCKS.register(espressoBlock);
		ForgeRegistries.BLOCKS.register(coffee_americanBlock);
		ForgeRegistries.BLOCKS.register(coffee_latteBlock);
		ForgeRegistries.BLOCKS.register(coffee_cappuccinoBlock);
		ForgeRegistries.BLOCKS.register(coffee_mochaccinoBlock);
		ForgeRegistries.BLOCKS.register(coffee_macchiatoBlock);
		ForgeRegistries.BLOCKS.register(coffee_vanillaBlock);
		ForgeRegistries.BLOCKS.register(coffee_berryBlock);
		ForgeRegistries.BLOCKS.register(coffee_lemonBlock);

		ForgeRegistries.ITEMS.register(coffeeBlockItem);
		ForgeRegistries.ITEMS.register(coffee_milkBlockItem);
		ForgeRegistries.ITEMS.register(coffee_turkeyBlockItem);
		ForgeRegistries.ITEMS.register(coffee_creamBlockItem);
		ForgeRegistries.ITEMS.register(coffee_cheeseBlockItem);
		ForgeRegistries.ITEMS.register(cocoaBlockItem);
		ForgeRegistries.ITEMS.register(strong_cocoaBlockItem);
		ForgeRegistries.ITEMS.register(espressoBlockItem);
		ForgeRegistries.ITEMS.register(coffee_americanBlockItem);
		ForgeRegistries.ITEMS.register(coffee_latteBlockItem);
		ForgeRegistries.ITEMS.register(coffee_cappuccinoBlockItem);
		ForgeRegistries.ITEMS.register(coffee_macchiatoBlockItem);
		ForgeRegistries.ITEMS.register(coffee_mochaccinoBlockItem);
		ForgeRegistries.ITEMS.register(coffee_vanillaBlockItem);
		ForgeRegistries.ITEMS.register(coffee_berryBlockItem);
		ForgeRegistries.ITEMS.register(coffee_lemonBlockItem);


	}
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(coffee_creamBlock);
		registerRender(coffee_berryBlock);
		registerRender(coffee_vanillaBlock);
		registerRender(coffee_lemonBlock);
		
		registerRender(coffee_cheeseBlock);
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
		registerRender(Coffee_Machine);
		registerRender(Coffee_Machine_on);
		registerRender(Icecream_Machine);
		registerRender(Icecream_Machine_on);
		registerRender(Coffee_tree);
		registerRender(plate);
		registerRender(coffee_turkeyBlock);
		registerRender(coffeeBlock);
		registerRender(coffee_milkBlock);
		registerRender(cocoaBlock);
		registerRender(strong_cocoaBlock);
		registerRender(coffee_americanBlock);
		registerRender(coffee_latteBlock);
		registerRender(coffee_mochaccinoBlock);
		registerRender(coffee_cappuccinoBlock);
		registerRender(coffee_macchiatoBlock);
		registerRender(espressoBlock);

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
