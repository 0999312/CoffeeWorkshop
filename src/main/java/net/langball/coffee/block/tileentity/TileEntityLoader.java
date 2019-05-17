package net.langball.coffee.block.tileentity;

import net.langball.coffee.CoffeeWork;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityLoader
{
    public TileEntityLoader(FMLPreInitializationEvent event)
    {
        registerTileEntity(TileEntityGrinder.class, "Grinder");
        registerTileEntity(TileEntityCoffeeMachine.class, "Fxxking_Machine");
        registerTileEntity(TileEntityIcecreamMachine.class, "icecream_Machine");
        registerTileEntity(TileEntityRoller.class, "roller");
        registerTileEntity(TileEntityOven.class, "oven_clay");
    }

    public void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String id)
    {
    	GameRegistry.registerTileEntity(tileEntityClass, new ResourceLocation(CoffeeWork.MODID, id));
    }
}
