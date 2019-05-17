package net.langball.coffee.world;

import java.util.Random;

import javax.annotation.Nullable;

import net.langball.coffee.ConfigLoader;
import net.langball.coffee.block.BlockLoader;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

public class BlueBerryWorldGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
	    int x = chunkX * 16 + 8;
	    int z = chunkZ * 16 + 8;
	    
	    Biome biome = world.getBiomeForCoordsBody(new BlockPos(x, 0, z));
	    if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD)
	    		||BiomeDictionary.hasType(biome, BiomeDictionary.Type.SANDY)) {
	      return;
	    }
	    if (random.nextFloat() < ConfigLoader.blueberry_int / 8.0F)
	    {
	      int posX = x + world.rand.nextInt(16);
	      int posZ = z + world.rand.nextInt(16);
	      BlockPos newPos = getGroundPos(world, posX, posZ);
	      if ((newPos != null) && (BlockLoader.BlueBerryBush.canPlaceBlockAt(world, newPos))) {
	        world.setBlockState(newPos, BlockLoader.BlueBerryBush.getDefaultState(), 2);
	      }
	    }
	}
	@Nullable
	  public static BlockPos getGroundPos(World world, int x, int z)
	  {
	    BlockPos topPos = world.getHeight(new BlockPos(x, 0, z));
	    if (topPos.getY() == 0) {
	      return null;
	    }
	    BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos(topPos);
	    
	    IBlockState blockState = world.getBlockState(pos);
	    while ((isTreeBlock(blockState, world, pos)) || (canReplace(blockState, world, pos)))
	    {
	      pos.move(EnumFacing.DOWN);
	      if (pos.getY() <= 0) {
	        return null;
	      }
	      blockState = world.getBlockState(pos);
	    }
	    return pos.up();
	  }
	public static boolean isTreeBlock(IBlockState blockState, World world, BlockPos pos)
	  {
	    Block block = blockState.getBlock();
	    return (block.isLeaves(blockState, world, pos)) || (block.isWood(world, pos));
	  }
	  
	  public static boolean canReplace(IBlockState blockState, World world, BlockPos pos)
	  {
	    Block block = blockState.getBlock();
	    return (block.isReplaceable(world, pos)) && (!blockState.getMaterial().isLiquid());
	  }
}
