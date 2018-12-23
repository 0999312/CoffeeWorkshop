package net.langball.coffee.world;

import java.util.Random;

import net.langball.coffee.block.BlockLoader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class WorldGeneratorSoda extends WorldGenerator {

	 private final WorldGenerator sodaGenerator = new WorldGenMinable(BlockLoader.Soda_Ore.getDefaultState(), 16);

	    @Override
	    public boolean generate(World world, Random rand, BlockPos pos)
	    {
	        if (TerrainGen.generateOre(world, rand, this, pos, OreGenEvent.GenerateMinable.EventType.CUSTOM))
	        {
	            for (int i = 0; i < 4; ++i)
	            {
	                int posX = pos.getX() + rand.nextInt(16);
	                int posY = 8 + rand.nextInt(64);
	                int posZ = pos.getZ() + rand.nextInt(16);
	                BlockPos blockpos = new BlockPos(posX, posY, posZ);
	                Biome biomeGenBase = world.getBiomeForCoordsBody(blockpos);
	                if (biomeGenBase.getRainfall() < rand.nextInt(65536))
	                {
	                    sodaGenerator.generate(world, rand, blockpos);
	                }
	            }
	        }
	        return true;
	    }
}
