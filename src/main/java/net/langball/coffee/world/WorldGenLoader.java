package net.langball.coffee.world;

import net.langball.coffee.ConfigLoader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGenLoader {
    private static WorldGenerator generatorSoda = new WorldGeneratorSoda();
    private BlockPos pos;
	public WorldGenLoader() {
	if (ConfigLoader.coffee_tree_int < 0) ConfigLoader.coffee_tree_int = 1;
	if (ConfigLoader.coffee_tree_int > 20) ConfigLoader.coffee_tree_int = 20;
	GameRegistry.registerWorldGenerator(new CoffeeTreeWorldGen(), 1);
	if (ConfigLoader.blueberry_int < 0) ConfigLoader.blueberry_int = 1;
	if (ConfigLoader.blueberry_int > 20) ConfigLoader.blueberry_int = 20;
	GameRegistry.registerWorldGenerator(new BlueBerryWorldGen(), 2);
	  MinecraftForge.ORE_GEN_BUS.register(this);
	}
    @SubscribeEvent
    public void onOreGenPost(OreGenEvent.Post event)
    {
        if (!event.getPos().equals(this.pos))
        {
            this.pos = event.getPos();
            generatorSoda.generate(event.getWorld(), event.getRand(), event.getPos());
        }
    }

    @SubscribeEvent
    public void onOreGenGenerateMinable(OreGenEvent.GenerateMinable event)
    {
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.ANDESITE)
        {
            event.setResult(Result.DENY);
        }
    }
}
