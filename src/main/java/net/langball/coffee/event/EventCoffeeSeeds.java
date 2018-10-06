package net.langball.coffee.event;

import java.util.List;

import net.langball.coffee.item.ItemLoader;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.oredict.OreDictionary;

public class EventCoffeeSeeds {
	@SubscribeEvent
	public void onWater(TickEvent.PlayerTickEvent event){
		EntityPlayer player = event.player;
	    World world = player.world;
	    List<EntityItem> itemList = world.getEntitiesWithinAABB(EntityItem.class, player.getEntityBoundingBox().expand(4.0D, 2.0D, 4.0D).expand(-4.0D, -2.0D, -4.0D));
	    for (EntityItem entityItem : itemList) {
	      if (((OreDictionary.containsMatch(false, OreDictionary.getOres("seedCoffee"), new ItemStack[] { entityItem.getItem() }))||(OreDictionary.containsMatch(false, OreDictionary.getOres("cropCoffee"), new ItemStack[] { entityItem.getItem() }))) && (world.isMaterialInBB(entityItem.getEntityBoundingBox(), Material.WATER))) {
	        entityItem.setItem(new ItemStack(ItemLoader.coffee_bean_raw, entityItem.getItem().getCount()));
	      }
	    }
	}
}
