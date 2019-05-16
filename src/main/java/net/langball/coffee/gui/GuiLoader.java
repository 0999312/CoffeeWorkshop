package net.langball.coffee.gui;

import net.langball.coffee.CoffeeWork;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class GuiLoader implements IGuiHandler {
	public static final int GUI_BLAST = 1;
	public static final int GUI_COFFEEMACHINE = 2;
	public static final int GUI_ICECREAM = 3;
	public static final int GUI_ROLLER = 4;
	public static final int GUI_OVEN = 5;
    public GuiLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(CoffeeWork.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
    	switch (ID)
        {
        case GUI_BLAST:
            return new ContainerGrinder(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        case GUI_COFFEEMACHINE:
            return new ContainerCoffeeMachine(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        case GUI_ICECREAM:
            return new ContainerIcecreamMachine(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        case GUI_ROLLER:
            return new ContainerRoller(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        case GUI_OVEN:
            return new ContainerOven(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        default:
            return null;
        }

    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
    	switch (ID)
        {
        case GUI_BLAST:
            return new GuiGrinder(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        case GUI_COFFEEMACHINE:
            return new GuiCoffeeMachine(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        case GUI_ICECREAM:
            return new GuiIcecreamMachine(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        case GUI_ROLLER:
            return new GuiRoller(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        case GUI_OVEN:
            return new GuiOven(player.inventory,(IInventory) world.getTileEntity(new BlockPos(x, y, z)));
        default:
            return null;
        }

    }

}
