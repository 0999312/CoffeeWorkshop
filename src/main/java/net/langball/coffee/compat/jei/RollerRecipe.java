package net.langball.coffee.compat.jei;

import java.awt.Color;
import java.util.Collections;
import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.langball.coffee.recipes.blocks.RollerRecipes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;

public class RollerRecipe  implements IRecipeWrapper
{
	  private final List<List<ItemStack>> inputs;
	  private final ItemStack output;
	  
	  public RollerRecipe(List<ItemStack> inputs, ItemStack output)
	  {
	    this.inputs = Collections.singletonList(inputs);
	    this.output = output;
	  }
	  
	  public void getIngredients(IIngredients ingredients)
	  {
	    ingredients.setInputLists(ItemStack.class, this.inputs);
	    ingredients.setOutput(ItemStack.class, this.output);
	  }
	  
	  public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY)
	  {
		RollerRecipes furnaceRecipes = RollerRecipes.instance();
	    float experience = furnaceRecipes.getSmeltingExperience(this.output);
	    if (experience > 0.0F)
	    {
	      String experienceString = I18n.format("gui.jei.category.smelting.experience", new Object[] { Float.valueOf(experience) });
	      FontRenderer fontRenderer = minecraft.fontRenderer;
	      int stringWidth = fontRenderer.getStringWidth(experienceString);
	      fontRenderer.drawString(experienceString, recipeWidth - stringWidth, 0, Color.gray.getRGB());
	    }
	  }
	}
