package net.langball.coffee.villager;

import java.util.Random;

import net.langball.coffee.item.ItemLoader;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager.ITradeList;
import net.minecraft.entity.passive.EntityVillager.PriceInfo;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerCareer;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

public class VillagerCoffee {
	public static void registerVillager() {
		VillagerProfession prof = VillagerRegistry.FARMER;
		VillagerCareer career = new VillagerCareer(prof, "coffee_trader");
		career.addTrade(1, new SimpleBuy(new ItemStack(ItemLoader.materials,2,0),new PriceInfo(3, 7)));
		career.addTrade(1, new SimpleBuy(new ItemStack(ItemLoader.materials,4,1),new PriceInfo(4, 9)));
		career.addTrade(1, new SimpleBuy(new ItemStack(ItemLoader.materials,4,3),new PriceInfo(6, 11)));
		career.addTrade(2, new SimpleSell(new ItemStack(ItemLoader.materials,16,1),new PriceInfo(2, 6)));
		career.addTrade(2, new SimpleSell(new ItemStack(ItemLoader.materials,16,3),new PriceInfo(4, 8)));
		career.addTrade(2, new SimpleSell(new ItemStack(ItemLoader.materials,16,2),new PriceInfo(2, 6)));
		career.addTrade(2, new SimpleSell(new ItemStack(ItemLoader.materials,16,4),new PriceInfo(2, 6)));
		career.addTrade(2, new SimpleBuy(new ItemStack(ItemLoader.syrup,16,0),new PriceInfo(2, 6)));
		career.addTrade(3, new SimpleBuy(new ItemStack(ItemLoader.materials,16,9),new PriceInfo(2, 6)));
		career.addTrade(3, new SimpleSell(new ItemStack(ItemLoader.materials,8,4),new PriceInfo(2, 6)));
	}
    private static class SimpleBuy implements ITradeList{
		private ItemStack item;
		private PriceInfo price;

		public SimpleBuy(ItemStack item, PriceInfo price){
			this.item = item;
			this.price = price;
		}

		public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
		{
			int i = price != null ? price.getPrice(random) : 1;
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD, i, 0),item.copy()));
        }
	}
    private static class SimpleSell implements ITradeList{
		private ItemStack item;
		private PriceInfo price;

		public SimpleSell(ItemStack item, PriceInfo price){
			this.item = item;
			this.price = price;
		}

		public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
		{
			int i = price != null ? price.getPrice(random) : 1;
			recipeList.add(new MerchantRecipe(item.copy(),new ItemStack(Items.EMERALD, i, 0)));
        }
	}
}
