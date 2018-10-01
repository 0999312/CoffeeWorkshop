package net.langball.coffee.item;

import net.minecraft.item.Item;

public class ItemCooker extends Item {
	public ItemCooker() {
		this.setContainerItem(this);
		this.setMaxStackSize(1);
	}
}
