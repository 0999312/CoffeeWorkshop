package net.langball.coffee.block;

import net.langball.coffee.item.ItemLoader;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockVanilla extends BlockCrops {
    protected Item getSeed()
    {
        return ItemLoader.vanilla_seeds;
    }

    protected Item getCrop()
    {
        return ItemLoader.vanilla;
    }
}
