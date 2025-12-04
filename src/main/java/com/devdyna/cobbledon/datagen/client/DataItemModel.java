package com.devdyna.cobbledon.datagen.client;

import static com.devdyna.cobbledon.Main.MODID;

import com.devdyna.cobbledon.init.types.zBlocks;
import com.devdyna.cobbledon.utils.x;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

@SuppressWarnings("null")
public class DataItemModel extends ItemModelProvider {

    public DataItemModel(PackOutput o, ExistingFileHelper f) {
        super(o, MODID, f);
    }

    @Override
    protected void registerModels() {

        withExistingParent(zBlocks.CLASSIC_POKEBALL.getRegisteredName(), x.rl("cobblemon", "item/poke_ball_model"));

    }

}
