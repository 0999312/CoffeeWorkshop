package net.langball.coffee.villager;

import java.util.Random;

import net.langball.coffee.drinks.DrinksLoader;
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

public class VillagerCoffee2 {
	public static void registerVillager() {
		VillagerProfession prof = VillagerRegistry.FARMER;
		VillagerCareer career = new VillagerCareer(prof, "coffee_instant_trader");
		career.addTrade(1, new SimpleBuy(new ItemStack(DrinksLoader.coffee_instant_stick,3),new PriceInfo(1, 2)));
		career.addTrade(2, new SimpleSell(new ItemStack(DrinksLoader.coffee_instant_box,1),new PriceInfo(4, 6)));
		career.addTrade(2, new SimpleBuy(new ItemStack(DrinksLoader.coffee_instant_box,1),new PriceInfo(7, 9)));
		career.addTrade(2, new SimpleBuy(new ItemStack(DrinksLoader.coffee_instant_cup_unopen,1),new PriceInfo(2, 3)));
		career.addTrade(3, new SimpleSell(new ItemStack(DrinksLoader.coffee_instant_box,16),new PriceInfo(24, 48)));
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
