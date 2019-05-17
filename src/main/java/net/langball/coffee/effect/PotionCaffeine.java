package net.langball.coffee.effect;

import net.langball.coffee.CoffeeWork;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer.SleepResult;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PotionCaffeine extends Potion {
	private static final ResourceLocation res = new ResourceLocation("coffeework:textures/gui/potion.png");
	
	public PotionCaffeine() {
		super(false, 0x000000);
		setPotionName("coffee.effect.caffeine");
		setRegistryName(CoffeeWork.MODID, "caffeine");
	}
	  @SideOnly(Side.CLIENT)
	  public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc)
	  {
	    mc.getTextureManager().bindTexture(res);
	    mc.currentScreen.drawTexturedModalRect(x + 6, y + 7, 0, 18, 18, 18);
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha)
	  {
	    mc.getTextureManager().bindTexture(res);
	    Gui.drawModalRectWithCustomSizedTexture(x + 3, y + 3, 0, 18, 18, 18, 256.0F, 256.0F);
	  }
	  
	  @Override
		public void performEffect(EntityLivingBase entityLivingBaseIn, int amplifier) {
		 DamageSource caffeine = new DamageSource("potion_caffeine").setDamageBypassesArmor().setDamageAllowedInCreativeMode();
		 entityLivingBaseIn.attackEntityFrom(caffeine, 1F);
		}
	  @Override
	public boolean isReady(int duration, int amplifier) {
		// TODO Auto-generated method stub
		return (duration & 1) == 0&&(amplifier>=64||duration>=48000);
	}
	  
		@SubscribeEvent
		public void onPlayerSleep(PlayerSleepInBedEvent event)
		{
			if (!event.getEntityPlayer().world.isRemote)
			{
				PotionEffect effect = event.getEntityPlayer().getActivePotionEffect(PotionLoader.caffeine);
				if (effect != null)
				{
					event.setResult(SleepResult.OTHER_PROBLEM);
					event.getEntityPlayer().sendMessage(new TextComponentTranslation("coffeework.message.bed.caffeine"));
				}
			}
		}
}
