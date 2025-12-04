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
        zBlocks.zPokeBall.getEntries().forEach(p->
        horizontalBlock(p.get(),
                models().withExistingParent(p.getRegisteredName(),
                        modLoc("block/base_lootpokeball"))
                        .texture("ball", x.rl("cobblemon","item/poke_balls/models/"+p.getRegisteredName().replace(MODID+":", "")))));

    }

}
