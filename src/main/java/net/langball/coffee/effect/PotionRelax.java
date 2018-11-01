package net.langball.coffee.effect;

import net.langball.coffee.CoffeeWork;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PotionRelax extends Potion {
	private static final ResourceLocation res = new ResourceLocation("coffeework:textures/gui/potion.png");
	
	public PotionRelax() {
		super(false, 0x000000);
		setPotionName("coffee.effect.relax");
		setRegistryName(CoffeeWork.MODID, "relax");
	}
	  @SideOnly(Side.CLIENT)
	  public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc)
	  {
	    mc.getTextureManager().bindTexture(res);
	    mc.currentScreen.drawTexturedModalRect(x + 6, y + 7, 0, 0, 18, 18);
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha)
	  {
	    mc.getTextureManager().bindTexture(res);
	    Gui.drawModalRectWithCustomSizedTexture(x + 3, y + 3, 0.0F, 0.0F, 18, 18, 256.0F, 256.0F);
	  }
}
