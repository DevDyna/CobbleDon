package com.devdyna.cobbledon.init;

import java.util.function.Supplier;

import com.devdyna.cobbledon.Main;
import com.devdyna.cobbledon.init.types.*;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@SuppressWarnings("null")
public class Material {
        public static void register(IEventBus bus) {
                zBlocks.register(bus);
                zBlockTag.register(bus);
                zCreativeTab.register(bus);
                zItems.register(bus);
                zItemTag.register(bus);
        }

        public static final BlockBehaviour.Properties bProp = BlockBehaviour.Properties.of();
        public static final Properties iProp = new Item.Properties();

        /**
         * register an block + item
         * 
         * @param sup () -> new Builder
         */
        public static DeferredHolder<Block, ?> registerItemBlock(String blockname, Supplier<? extends Block> sup) {
                return registerItemBlock(blockname, sup, zBlocks.zBlockItem);
        }

        /**
         * register an block + item
         * 
         * @param sup () -> new Builder
         * @param b   Blocks.zBlock
         */
        public static DeferredHolder<Block, ?> registerItemBlock(String blockname, Supplier<? extends Block> sup,
                        DeferredRegister.Blocks b) {
                DeferredHolder<Block, ?> block = b.register(blockname, sup);
                zItems.zBlockItem.registerSimpleBlockItem(block);
                return block;
        }

        /**
         * create an itemtag
         */
        public static TagKey<Item> tagItem(String name) {
                return TagKey.create(BuiltInRegistries.ITEM.key(),
                                ResourceLocation.fromNamespaceAndPath(Main.MODID, name));
        }

        /**
         * create an blocktag
         */
        public static TagKey<Block> tagBlock(String name) {
                return TagKey.create(BuiltInRegistries.BLOCK.key(),
                                ResourceLocation.fromNamespaceAndPath(Main.MODID, name));
        }

        /**
         * create an itemtag
         */
        public static TagKey<Item> tagItem(String name, String modid) {
                return TagKey.create(BuiltInRegistries.ITEM.key(),
                                ResourceLocation.fromNamespaceAndPath(modid, name));
        }

        /**
         * create an blocktag
         */
        public static TagKey<Block> tagBlock(String name, String modid) {
                return TagKey.create(BuiltInRegistries.BLOCK.key(),
                                ResourceLocation.fromNamespaceAndPath(modid, name));
        }

        /**
         * create an fluidtag
         */
        public static TagKey<Fluid> tagFluid(String name) {
                return TagKey.create(BuiltInRegistries.FLUID.key(),
                                ResourceLocation.fromNamespaceAndPath(Main.MODID, name));
        }

}
