package net.langball.coffee.villager;

import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

public class VillagerLoader {
	public VillagerLoader() {
		VillagerCoffee.registerVillager();
		VillagerCoffee2.registerVillager();
		VillagerFood.registerVillager();
	}
}
