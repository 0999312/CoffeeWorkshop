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
	RecipesUtil.addRecipe(ItemLoader.syrup_full, new ShapelessOreRecipe(new ResourceLocation(""), ItemLoader.syrup_full,new Object[]{
			ItemLoader.syrup_empty,"listAllsugar"
	}));
	RegisterSyrupRecipe(ItemLoader.syrup_berry, "listAllberry");
	RegisterSyrupRecipe(ItemLoader.syrup_lemon, "cropLemon");
	RegisterSyrupRecipe(ItemLoader.syrup_cherry, "cropCherry");
	RegisterSyrupRecipe(ItemLoader.syrup_vanilla, "cropVanilla");
	GameRegistry.addSmelting(ItemLoader.syrup_full, new ItemStack(ItemLoader.syrup_brown), 0F);
	}
	public static void RegisterSyrupRecipe(Item syrup,String oredict){
		RecipesUtil.addRecipe(syrup, new ShapelessOreRecipe(new ResourceLocation(""), syrup,new Object[]{
				ItemLoader.syrup_empty,"listAllsugar",oredict
		}));
		RecipesUtil.addRecipe(syrup.getRegistryName().toString()+"_2", new ShapelessOreRecipe(new ResourceLocation(""), syrup,new Object[]{
				ItemLoader.syrup_full,oredict
		}));
	}
}
