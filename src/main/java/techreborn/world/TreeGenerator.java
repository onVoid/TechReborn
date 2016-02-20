package techreborn.world;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import techreborn.init.ModBlocks;

import java.util.Random;

/**
 * Created by Mark on 19/02/2016.
 */
public class TreeGenerator implements IWorldGenerator {

    public static RubberTreeGenerator treeGenerator = new RubberTreeGenerator(false, 8, ModBlocks.rubberLog.getDefaultState(), ModBlocks.rubberLeaves.getDefaultState(), false);

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        int chance = 10;
        BiomeGenBase biomeGenBase = world.getBiomeGenForCoords( new BlockPos(chunkX * 16, 72, chunkZ * 16));
        if(BiomeDictionary.isBiomeOfType(biomeGenBase, BiomeDictionary.Type.SWAMP)){
            chance -= random.nextInt(5) + 5;
        }
        if(BiomeDictionary.isBiomeOfType(biomeGenBase, BiomeDictionary.Type.FOREST) || BiomeDictionary.isBiomeOfType(biomeGenBase, BiomeDictionary.Type.JUNGLE)){
            chance -= random.nextInt(2) + 1;
        }
        if(world.provider.isSurfaceWorld()){
            if(random.nextInt(chance) == 0){
                for (int i = 0; i < 7; i++) {
                    treeGenerator.generate(world, random, new BlockPos((chunkX + random.nextInt(3)) * 16, 72, (chunkZ + random.nextInt(3)) * 16));
                }

            }

        }
    }
}