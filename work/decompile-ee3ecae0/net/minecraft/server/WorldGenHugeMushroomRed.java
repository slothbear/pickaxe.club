package net.minecraft.server;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;

public class WorldGenHugeMushroomRed extends WorldGenMushrooms {

    public WorldGenHugeMushroomRed(Function<Dynamic<?>, ? extends WorldGenFeatureMushroomConfiguration> function) {
        super(function);
    }

    @Override
    protected void a(GeneratorAccess generatoraccess, Random random, BlockPosition blockposition, int i, BlockPosition.MutableBlockPosition blockposition_mutableblockposition, WorldGenFeatureMushroomConfiguration worldgenfeaturemushroomconfiguration) {
        for (int j = i - 3; j <= i; ++j) {
            int k = j < i ? worldgenfeaturemushroomconfiguration.c : worldgenfeaturemushroomconfiguration.c - 1;
            int l = worldgenfeaturemushroomconfiguration.c - 2;

            for (int i1 = -k; i1 <= k; ++i1) {
                for (int j1 = -k; j1 <= k; ++j1) {
                    boolean flag = i1 == -k;
                    boolean flag1 = i1 == k;
                    boolean flag2 = j1 == -k;
                    boolean flag3 = j1 == k;
                    boolean flag4 = flag || flag1;
                    boolean flag5 = flag2 || flag3;

                    if (j >= i || flag4 != flag5) {
                        blockposition_mutableblockposition.g(blockposition).e(i1, j, j1);
                        if (!generatoraccess.getType(blockposition_mutableblockposition).g(generatoraccess, blockposition_mutableblockposition)) {
                            this.a(generatoraccess, blockposition_mutableblockposition, (IBlockData) ((IBlockData) ((IBlockData) ((IBlockData) ((IBlockData) worldgenfeaturemushroomconfiguration.a.a(random, blockposition).set(BlockHugeMushroom.e, j >= i - 1)).set(BlockHugeMushroom.d, i1 < -l)).set(BlockHugeMushroom.b, i1 > l)).set(BlockHugeMushroom.a, j1 < -l)).set(BlockHugeMushroom.c, j1 > l));
                        }
                    }
                }
            }
        }

    }

    @Override
    protected int a(int i, int j, int k, int l) {
        int i1 = 0;

        if (l < j && l >= j - 3) {
            i1 = k;
        } else if (l == j) {
            i1 = k;
        }

        return i1;
    }
}
