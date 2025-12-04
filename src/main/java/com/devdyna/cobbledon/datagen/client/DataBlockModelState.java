package com.devdyna.cobbledon.datagen.client;

import static com.devdyna.cobbledon.Main.MODID;

import com.devdyna.cobbledon.init.types.zBlocks;
import com.devdyna.cobbledon.utils.x;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

@SuppressWarnings("null")
public class DataBlockModelState extends BlockStateProvider {

    public DataBlockModelState(PackOutput o, ExistingFileHelper f) {
        super(o, MODID, f);
    }

    @Override
    protected void registerStatesAndModels() {

        directionalBlock(zBlocks.CLASSIC_POKEBALL.get(),
                models().getExistingFile(x.rl("cobblemon", "item/poke_ball_model")));

    }

}
