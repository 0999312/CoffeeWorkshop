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

public class VillagerFood {
	public static void registerVillager() {
		VillagerProfession prof = VillagerRegistry.getById(4);
		VillagerCareer career = new VillagerCareer(prof, "food_trader");
		career.addTrade(1, new SimpleBuy(new ItemStack(ItemLoader.materials,8,13),new PriceInfo(3, 5)));
		career.addTrade(1, new SimpleBuy(new ItemStack(ItemLoader.materialFood,4,6),new PriceInfo(6, 8)));
		career.addTrade(1, new SimpleBuy(new ItemStack(ItemLoader.materials,4,6),new PriceInfo(3, 5)));
		career.addTrade(2, new SimpleSell(new ItemStack(ItemLoader.muffin,8),new PriceInfo(8, 14)));
		career.addTrade(2, new SimpleBuy(new ItemStack(ItemLoader.materials,8,7),new PriceInfo(6, 7)));
		career.addTrade(2, new SimpleBuy(new ItemStack(ItemLoader.materialFood,8,8),new PriceInfo(8, 10)));
		career.addTrade(3, new SimpleBuy(new ItemStack(ItemLoader.cake_model),new PriceInfo(4, 8)));
		career.addTrade(3, new SimpleBuy(new ItemStack(ItemLoader.cake_model_square),new PriceInfo(4, 8)));		
		career.addTrade(3, new SimpleBuy(new ItemStack(ItemLoader.cake_model_plate),new PriceInfo(4, 8)));
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
