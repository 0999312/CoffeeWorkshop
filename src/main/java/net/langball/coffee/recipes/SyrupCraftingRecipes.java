package net.langball.coffee.recipes;

import net.langball.coffee.item.ItemLoader;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class SyrupCraftingRecipes {
	public static void init(){
		
	RecipesUtil.addRecipe(ItemLoader.syrup_empty, new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.syrup_empty,8),new Object[]{
			"WGW","W W"," W ",'W',"paneGlassColorless",'G',"plankWood"
	}));
	RecipesUtil.addRecipe("syrup_full", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.syrup,1,0),new Object[]{
			ItemLoader.syrup_empty,"listAllsugar","listAllsugar"
	}));
	RegisterSyrupRecipe(new ItemStack(ItemLoader.syrup,1,3), "listAllberry","syrup_berry");
	RegisterSyrupRecipe(new ItemStack(ItemLoader.syrup,1,5), "cropLemon","syrup_lemon");
	RegisterSyrupRecipe(new ItemStack(ItemLoader.syrup,1,4), "cropCherry","syrup_cherry");
	RegisterSyrupRecipe(new ItemStack(ItemLoader.syrup,1,2), "cropVanilla","syrup_vanilla");
	RegisterSyrupRecipe(new ItemStack(ItemLoader.syrup,1,6), "foodCocoapowder","syrup_chocolate");
	RegisterSyrupRecipe(new ItemStack(ItemLoader.syrup,1,7), "cropApple","syrup_apple");
	RegisterSyrupRecipe(new ItemStack(ItemLoader.syrup,1,8), "cropSpiceleaf","syrup_mint");
	GameRegistry.addSmelting(new ItemStack(ItemLoader.syrup,1,0), new ItemStack(ItemLoader.syrup,1,1), 0F);
	}
	public static void RegisterSyrupRecipe(ItemStack syrup,String oredict,String name){
		RecipesUtil.addRecipe(name, new ShapelessOreRecipe(new ResourceLocation(""), syrup,new Object[]{
				ItemLoader.syrup_empty,"listAllsugar",oredict,"listAllsugar"
		}));
		RecipesUtil.addRecipe(name+"_2", new ShapelessOreRecipe(new ResourceLocation(""), syrup,new Object[]{
				new ItemStack(ItemLoader.syrup,1,0),oredict
		}));
	}
}
