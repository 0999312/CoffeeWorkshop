package net.langball.coffee.effect;

import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionLoader {
	public static Potion relax = new PotionRelax();
	public static Potion caffeine = new PotionCaffeine();
	public static Potion golden_heart = new PotionGoldenHeart();
	public PotionLoader(FMLPreInitializationEvent event) {
		 ForgeRegistries.POTIONS.register(relax);
		 ForgeRegistries.POTIONS.register(caffeine);
		 ForgeRegistries.POTIONS.register(golden_heart);
		 
		 registerPotionEvent();
	}
	private static void registerPotionEvent() {
		MinecraftForge.EVENT_BUS.register(caffeine);
	}
	
}
