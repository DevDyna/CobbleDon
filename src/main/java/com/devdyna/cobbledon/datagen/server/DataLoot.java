package com.devdyna.cobbledon.datagen.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.cobblemon.mod.common.CobblemonItems;
import com.devdyna.cobbledon.init.types.zBlocks;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@SuppressWarnings("null")
public class DataLoot extends BlockLootSubProvider {

        public DataLoot(HolderLookup.Provider l) {
                super(Set.of(), FeatureFlags.DEFAULT_FLAGS, l);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
                List<Block> blocks = new ArrayList<>();
                blocks.addAll(getList(zBlocks.zBlock));
                blocks.addAll(getList(zBlocks.zPokeBall));
                blocks.addAll(getList(zBlocks.zBlockItem));
                return blocks;
        }

        @SuppressWarnings("unchecked")
        private List<Block> getList(DeferredRegister.Blocks c) {
                return (List<Block>) c.getEntries().stream().map(DeferredHolder::get).toList();
        }

        @Override
        protected void generate() {
                zBlocks.zPokeBall.getEntries().forEach(p -> add(p.get(), b -> LootTable.lootTable().withPool(
                                LootPool.lootPool()
                                                .setRolls(ConstantValue.exactly(1))
                                                .add(LootItem.lootTableItem(CobblemonItems.ADAMANT_MINT)
                                                                .apply(SetItemCountFunction.setCount(
                                                                                UniformGenerator.between(1, 3))))
                                                .add(LootItem.lootTableItem(Items.EMERALD)
                                                                .apply(SetItemCountFunction.setCount(
                                                                                UniformGenerator.between(1, 3))))
                                                .add(LootItem.lootTableItem(Items.GOLD_INGOT).apply(SetItemCountFunction
                                                                .setCount(UniformGenerator.between(1, 3)))))));

        }

}
