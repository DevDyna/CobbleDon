package com.devdyna.cobbledon.init.types;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import com.devdyna.cobbledon.Main;
import com.devdyna.cobbledon.init.Material;
import com.devdyna.cobbledon.init.builder.PokeLootBall;
@SuppressWarnings("null")
public class zBlocks {
        
        public static void register(IEventBus bus) {
                registerLists();
                zBlock.register(bus);
                zBlockItem.register(bus);
        }

        // ---------------------------------------------------------------------------------------//
        public static final DeferredRegister.Blocks zBlock = DeferredRegister.createBlocks(Main.MODID);
        public static final DeferredRegister.Blocks zBlockItem = DeferredRegister.createBlocks(Main.MODID);
        // ---------------------------------------------------------------------------------------//

        // public static final DeferredHolder<Block, ?> BK = zBlock.register("bk",() ->
        // new BK());

        // ---------------------------------------------------------------------------------------//

        public static final DeferredHolder<Block,?> CLASSIC_POKEBALL = Material.registerItemBlock("poke", () -> new PokeLootBall(Properties.of()));


        
        public static void registerLists() {

                // List.of(...).forEach(p -> ??);

        }

}
