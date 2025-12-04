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
                zPokeBall.register(bus);
        }

        // ---------------------------------------------------------------------------------------//
        public static final DeferredRegister.Blocks zBlock = DeferredRegister.createBlocks(Main.MODID);
        public static final DeferredRegister.Blocks zBlockItem = DeferredRegister.createBlocks(Main.MODID);
        public static final DeferredRegister.Blocks zPokeBall = DeferredRegister.createBlocks(Main.MODID);
        // ---------------------------------------------------------------------------------------//

        // public static final DeferredHolder<Block, ?> BK = zBlock.register("bk",() ->
        // new BK());

        // ---------------------------------------------------------------------------------------//

        public static final DeferredHolder<Block, ?> POKE_BALL = Material.registerItemBlock(
                        "poke_ball",
                        () -> new PokeLootBall(Properties.of()), zPokeBall);
        public static final DeferredHolder<Block, ?> GREAT_BALL = Material.registerItemBlock(
                        "great_ball",
                        () -> new PokeLootBall(Properties.of()), zPokeBall);
        public static final DeferredHolder<Block, ?> ULTRA_BALL = Material.registerItemBlock(
                        "ultra_ball",
                        () -> new PokeLootBall(Properties.of()), zPokeBall);
        public static final DeferredHolder<Block, ?> MASTER_BALL = Material.registerItemBlock(
                        "master_ball",
                        () -> new PokeLootBall(Properties.of()), zPokeBall);

        // public static List<DeferredHolder<Block,? extends Block>> values = List.of(POKE_BALL,GREAT_BALL,ULTRA_BALL,MASTER_BALL);


        public static void registerLists() {

        }

}
