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
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootPool.Builder;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
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

        int POKE_TIER = 1;
        int GREAT_TIER = 2;
        int ULTRA_TIER = 3;
        int MASTER_TIER = 4;

        @Override
        protected void generate() {

                add(zBlocks.POKE_BALL.get(), b -> LootTable.lootTable().withPool(createBall(POKE_TIER)));
                add(zBlocks.GREAT_BALL.get(), b -> LootTable.lootTable().withPool(createBall(GREAT_TIER)));
                add(zBlocks.ULTRA_BALL.get(), b -> LootTable.lootTable().withPool(createBall(ULTRA_TIER)));
                add(zBlocks.MASTER_BALL.get(), b -> LootTable.lootTable().withPool(createBall(MASTER_TIER)));

        }

        private Builder createBall(int tier) {

                var b = lootball.of(tier);

                // if (tier >= POKE_TIER) {

                // }

                if (tier >= GREAT_TIER) {
                        b.add(CobblemonItems.GREAT_BALL);
                        b.add(CobblemonItems.TUMBLESTONE);
                        b.add(CobblemonItems.SKY_TUMBLESTONE);
                        b.add(CobblemonItems.BLACK_TUMBLESTONE);
                        b.add(CobblemonItems.SUN_STONE);
                        b.add(CobblemonItems.SHINY_STONE);
                        b.add(CobblemonItems.MOON_STONE);
                        b.add(CobblemonItems.OVAL_STONE);
                        b.add(CobblemonItems.ICE_STONE);
                        b.add(CobblemonItems.DAWN_STONE);
                        b.add(CobblemonItems.FIRE_STONE);
                        b.add(CobblemonItems.LEAF_STONE);
                        b.add(CobblemonItems.THUNDER_STONE);
                        b.add(CobblemonItems.WATER_STONE);
                        b.add(CobblemonItems.DUSK_STONE);
                        b.add(CobblemonItems.EXPERIENCE_CANDY_M);
                        b.add(CobblemonItems.EXPERIENCE_CANDY_L);
                        b.add(CobblemonItems.NORMAL_GEM);
                        b.add(CobblemonItems.FIRE_GEM);
                        b.add(CobblemonItems.WATER_GEM);
                        b.add(CobblemonItems.GRASS_GEM);
                        b.add(CobblemonItems.ELECTRIC_GEM);
                        b.add(CobblemonItems.ICE_GEM);
                        b.add(CobblemonItems.FIGHTING_GEM);
                        b.add(CobblemonItems.POISON_GEM);
                        b.add(CobblemonItems.GROUND_GEM);
                        b.add(CobblemonItems.FLYING_GEM);
                        b.add(CobblemonItems.BUG_GEM);
                        b.add(CobblemonItems.PSYCHIC_GEM);
                        b.add(CobblemonItems.ROCK_GEM);
                        b.add(CobblemonItems.GHOST_GEM);
                        b.add(CobblemonItems.DRAGON_GEM);
                        b.add(CobblemonItems.DARK_GEM);
                        b.add(CobblemonItems.STEEL_GEM);
                        b.add(CobblemonItems.FAIRY_GEM);
                        b.add(Items.HONEYCOMB);
                        b.add(Items.NAUTILUS_SHELL);
                        b.add(Items.DIAMOND);
                        b.add(Items.EMERALD);
                        b.add(Items.TRIAL_KEY);
                        b.add(Items.NETHER_WART);
                        b.add(CobblemonItems.SPORT_BALL);
                        b.add(CobblemonItems.RELIC_COIN_POUCH);
                }
                if (tier >= ULTRA_TIER) {
                        b.add(CobblemonItems.ULTRA_BALL);
                        b.add(CobblemonItems.FOSSILIZED_BIRD);
                        b.add(CobblemonItems.FOSSILIZED_DINO);
                        b.add(CobblemonItems.FOSSILIZED_DRAKE);
                        b.add(CobblemonItems.FOSSILIZED_FISH);
                        b.add(CobblemonItems.JAW_FOSSIL);
                        b.add(CobblemonItems.CLAW_FOSSIL);
                        b.add(CobblemonItems.DOME_FOSSIL);
                        b.add(CobblemonItems.ROOT_FOSSIL);
                        b.add(CobblemonItems.SAIL_FOSSIL);
                        b.add(CobblemonItems.ARMOR_FOSSIL);
                        b.add(CobblemonItems.COVER_FOSSIL);
                        b.add(CobblemonItems.HELIX_FOSSIL);
                        b.add(CobblemonItems.PLUME_FOSSIL);
                        b.add(CobblemonItems.SKULL_FOSSIL);
                        b.add(CobblemonItems.OLD_AMBER_FOSSIL);
                        b.add(CobblemonItems.EXPERIENCE_CANDY_XL);
                        b.add(Items.ECHO_SHARD);
                        b.add(Items.NETHERITE_SCRAP);
                        b.add(Items.HEART_OF_THE_SEA);
                        b.add(Items.SHULKER_SHELL);
                        b.add(Items.DRAGON_BREATH);
                        b.add(Items.OMINOUS_TRIAL_KEY);
                        b.add(Items.BREEZE_ROD);
                        b.add(Items.BLAZE_ROD);
                        b.add(Items.SCULK);
                }
                if (tier >= MASTER_TIER) {
                        b.add(CobblemonItems.MASTER_BALL);
                        b.add(CobblemonItems.RARE_CANDY);
                        b.add(CobblemonItems.BEAST_BALL);
                }

                b.add(CobblemonItems.POKE_BALL);
                b.add(CobblemonItems.CITRINE_BALL);
                b.add(CobblemonItems.VERDANT_BALL);
                b.add(CobblemonItems.AZURE_BALL);
                b.add(CobblemonItems.ROSEATE_BALL);
                b.add(CobblemonItems.SLATE_BALL);
                b.add(CobblemonItems.PREMIER_BALL);
                b.add(CobblemonItems.CHERISH_BALL);

                b.add(CobblemonItems.SAFARI_BALL);
                b.add(CobblemonItems.FAST_BALL);
                b.add(CobblemonItems.LEVEL_BALL);
                b.add(CobblemonItems.LURE_BALL);
                b.add(CobblemonItems.HEAVY_BALL);
                b.add(CobblemonItems.LOVE_BALL);
                b.add(CobblemonItems.FRIEND_BALL);
                b.add(CobblemonItems.MOON_BALL);

                b.add(CobblemonItems.PARK_BALL);
                b.add(CobblemonItems.NET_BALL);
                b.add(CobblemonItems.DIVE_BALL);
                b.add(CobblemonItems.NEST_BALL);
                b.add(CobblemonItems.REPEAT_BALL);
                b.add(CobblemonItems.TIMER_BALL);
                b.add(CobblemonItems.LUXURY_BALL);
                b.add(CobblemonItems.DUSK_BALL);
                b.add(CobblemonItems.HEAL_BALL);
                b.add(CobblemonItems.QUICK_BALL);
                b.add(CobblemonItems.DREAM_BALL);

                b.add(CobblemonItems.EXPERIENCE_CANDY_XS);
                b.add(CobblemonItems.EXPERIENCE_CANDY_S);

                b.add(CobblemonItems.RELIC_COIN);

                return b.build();

        }

}

@SuppressWarnings("null")
class lootball {

        private LootPool.Builder pool;

        public lootball(int rarity) {
                this.pool = new LootPool.Builder()
                                .setRolls(ConstantValue.exactly(1));
        }

        public static lootball of(int rarity) {
                return new lootball(rarity);
        }

        public lootball add(ItemLike item) {
                this.pool = pool.add(LootItem.lootTableItem(item));
                return this;
        }

        public Builder build() {
                return pool;
        }

}