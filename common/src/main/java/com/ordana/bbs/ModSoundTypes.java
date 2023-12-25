package com.ordana.bbs;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class ModSoundTypes {
    private static final SoundType STONE_ORE = new SoundType(1.0F, 0.9F, SoundEvents.NETHER_ORE_BREAK, SoundEvents.NETHER_ORE_STEP, SoundEvents.NETHER_ORE_PLACE, SoundEvents.NETHER_ORE_HIT, SoundEvents.NETHER_ORE_FALL);
    private static final SoundType OBSIDIAN = new SoundType(1.0F, 0.7F, SoundEvents.DEEPSLATE_BREAK, SoundEvents.DEEPSLATE_STEP, SoundEvents.DEEPSLATE_PLACE, SoundEvents.DEEPSLATE_HIT, SoundEvents.DEEPSLATE_FALL);
    private static final SoundType BLACKSTONE = new SoundType(1.0F, 0.9F, SoundEvents.DEEPSLATE_BREAK, SoundEvents.DEEPSLATE_STEP, SoundEvents.DEEPSLATE_PLACE, SoundEvents.DEEPSLATE_HIT, SoundEvents.DEEPSLATE_FALL);
    private static final SoundType POLISHED_BLACKSTONE = new SoundType(1.0F, 0.9F, SoundEvents.POLISHED_DEEPSLATE_BREAK, SoundEvents.POLISHED_DEEPSLATE_STEP, SoundEvents.POLISHED_DEEPSLATE_PLACE, SoundEvents.POLISHED_DEEPSLATE_HIT, SoundEvents.POLISHED_DEEPSLATE_FALL);
    private static final SoundType POLISHED_BLACKSTONE_BRICKS = new SoundType(1.0F, 0.9F, SoundEvents.DEEPSLATE_BRICKS_BREAK, SoundEvents.DEEPSLATE_BRICKS_STEP, SoundEvents.DEEPSLATE_BRICKS_PLACE, SoundEvents.DEEPSLATE_BRICKS_HIT, SoundEvents.DEEPSLATE_BRICKS_FALL);
    private static final SoundType END_STONE_BRICKS = new SoundType(1.0F, 0.8F, SoundEvents.DEEPSLATE_TILES_BREAK, SoundEvents.DEEPSLATE_TILES_STEP, SoundEvents.DEEPSLATE_TILES_PLACE, SoundEvents.DEEPSLATE_TILES_HIT, SoundEvents.DEEPSLATE_TILES_FALL);
    private static final SoundType QUARTZ = new SoundType(1.0F, 0.9F, SoundEvents.CALCITE_BREAK, SoundEvents.CALCITE_STEP, SoundEvents.CALCITE_PLACE, SoundEvents.CALCITE_HIT, SoundEvents.CALCITE_FALL);
    private static final SoundType QUARTZ_BRICKS = new SoundType(1.0F, 1.1F, SoundEvents.CALCITE_BREAK, SoundEvents.CALCITE_STEP, SoundEvents.CALCITE_PLACE, SoundEvents.CALCITE_HIT, SoundEvents.CALCITE_FALL);
    private static final SoundType GRASS_BLOCK = new SoundType(1.0F, 1.0F, SoundEvents.ROOTED_DIRT_BREAK, SoundEvents.GRASS_STEP, SoundEvents.ROOTED_DIRT_BREAK, SoundEvents.ROOTED_DIRT_BREAK, SoundEvents.GRASS_FALL);
    private static final SoundType TERRACOTTA = new SoundType(1.0F, 0.6F, SoundEvents.CALCITE_BREAK, SoundEvents.CALCITE_STEP, SoundEvents.CALCITE_PLACE, SoundEvents.CALCITE_HIT, SoundEvents.CALCITE_FALL);
    private static final SoundType STONE_BRICK = new SoundType(1.0F, 0.6F, SoundEvents.DEEPSLATE_TILES_BREAK, SoundEvents.DEEPSLATE_TILES_STEP, SoundEvents.DEEPSLATE_TILES_PLACE, SoundEvents.DEEPSLATE_TILES_HIT, SoundEvents.DEEPSLATE_TILES_FALL);
    private static final SoundType CLAY_BRICK = new SoundType(1.0F, 1.3F, SoundEvents.NETHER_BRICKS_BREAK, SoundEvents.NETHER_BRICKS_STEP, SoundEvents.NETHER_BRICKS_PLACE, SoundEvents.NETHER_BRICKS_HIT, SoundEvents.NETHER_BRICKS_FALL);
    private static final SoundType METAL = new SoundType(1.0F, 0.6F, SoundEvents.COPPER_BREAK, SoundEvents.COPPER_STEP, SoundEvents.COPPER_PLACE, SoundEvents.COPPER_HIT, SoundEvents.COPPER_FALL);
    private static final SoundType LILY_PAD = new SoundType(1.0F, 1.0F, SoundEvents.BIG_DRIPLEAF_BREAK, SoundEvents.BIG_DRIPLEAF_STEP, SoundEvents.LILY_PAD_PLACE, SoundEvents.BIG_DRIPLEAF_HIT, SoundEvents.BIG_DRIPLEAF_FALL);
    private static final SoundType SMALL_OBJECT = new SoundType(1.0F, 0.8F, SoundEvents.CANDLE_BREAK, SoundEvents.CANDLE_STEP, SoundEvents.CANDLE_PLACE, SoundEvents.CANDLE_HIT, SoundEvents.CANDLE_FALL);
    private static final SoundType BELL = new SoundType(1.0F, 1.0F, SoundEvents.BELL_BLOCK, SoundEvents.METAL_STEP, SoundEvents.BELL_BLOCK, SoundEvents.COPPER_HIT, SoundEvents.BELL_RESONATE);

    public static SoundType assignSounds(Block block, CallbackInfoReturnable<SoundType> cir) {
        String blockId = BuiltInRegistries.BLOCK.getKey(block).getPath();
        SoundType sound = null;

        if (block.defaultBlockState().is(BlockTags.SMALL_FLOWERS)) sound = SoundType.HANGING_ROOTS;
        if (block.defaultBlockState().is(BBSMain.STONE_ORES)) sound = STONE_ORE;

        switch (blockId) {
            case "coal_ore",
                    "copper_ore",
                    "iron_ore",
                    "gold_ore",
                    "emerald_ore",
                    "diamond_ore",
                    "redstone_ore" -> {
                return STONE_ORE;
            }
            case "raw_copper_block",
                    "raw_iron_block",
                    "raw_gold_block",
                    "coal_block" -> {
                return SoundType.NETHER_GOLD_ORE;
            }
            case "oak_leaves",
                    "birch_leaves",
                    "spruce_leaves",
                    "jungle_leaves",
                    "acacia_leaves",
                    "dark_oak_leaves",
                    "mangrove_leaves" -> {
                return SoundType.AZALEA_LEAVES;
            }
            case "oak_sapling",
                    "birch_sapling",
                    "spruce_sapling",
                    "jungle_sapling",
                    "acacia_sapling",
                    "dark_oak_sapling",
                    "mangrove_propagule",
                    "dead_bush" -> {
                return SoundType.CHERRY_SAPLING;
            }
            case "lily_pad" -> {
                return LILY_PAD;
            }
            case "bell" -> {
                return BELL;
            }
            case "skeleton_skull",
                    "wither_skeleton_skull" -> {
                return SoundType.BONE_BLOCK;
            }
            case "sponge",
                    "wet_sponge" -> {
                return SoundType.WET_GRASS;
            }
            case "end_rod" -> {
                return SoundType.SHROOMLIGHT;
            }
            case "magma_block" -> {
                return SoundType.NETHERRACK;
            }
            case "blackstone",
                    "blackstone_stairs",
                    "blackstone_slab",
                    "blackstone_wall" -> {
                return BLACKSTONE;
            }
            case "polished_blackstone",
                    "polished_blackstone_stairs",
                    "polished_blackstone_slab",
                    "polished_blackstone_wall",
                    "polished_blackstone_button",
                    "polished_blackstone_pressure_plate" -> {
                return POLISHED_BLACKSTONE;
            }
            case "polished_blackstone_bricks",
                    "polished_blackstone_brick_stairs",
                    "polished_blackstone_brick_slab",
                    "polished_blackstone_brick_wall",
                    "chiseled_polished_blackstone" -> {
                return POLISHED_BLACKSTONE_BRICKS;
            }
            case "end_stone",
                    "end_portal_frame",
                    "andesite",
                    "andesite_wall",
                    "andesite_slab",
                    "andesite_stairs",
                    "diorite",
                    "diorite_wall",
                    "diorite_stairs",
                    "diorite_slab",
                    "granite",
                    "granite_wall",
                    "granite_slab",
                    "granite_stairs" -> {
                return SoundType.BASALT;
            }
            case "sandstone",
                    "chiseled_sandstone",
                    "cut_sandstone",
                    "smooth_sandstone",
                    "sandstone_stairs",
                    "smooth_sandstone_stairs",
                    "sandstone_slab",
                    "cut_sandstone_slab",
                    "smooth_sandstone_slab",
                    "sandstone_wall",
                    "red_sandstone",
                    "red_chiseled_sandstone",
                    "cut_red_sandstone",
                    "smooth_red_sandstone",
                    "red_sandstone_stairs",
                    "smooth_red_sandstone_stairs",
                    "red_sandstone_slab",
                    "cut_red_sandstone_slab",
                    "smooth_red_sandstone_slab",
                    "red_sandstone_wall",
                    "turtle_egg" -> {
                return SoundType.TUFF;
            }
            case "end_stone_bricks",
                    "end_stone_brick_stairs",
                    "end_stone_brick_slab",
                    "end_stone_brick_wall" -> {
                return END_STONE_BRICKS;
            }
            case "obsidian",
                    "crying_obsidian",
                    "respawn_anchor",
                    "ender_chest",
                    "bedrock",
                    "enchanting_table",
                    "beacon" -> {
                return OBSIDIAN;
            }
            case "smooth_quartz_block",
                    "smooth_quartz_slab",
                    "smooth_quartz_stairs",
                    "quartz_block",
                    "quartz_slab",
                    "quartz_stairs",
                    "prismarine",
                    "prismarine_slab",
                    "prismarine_stairs",
                    "prismarine_wall" -> {
                return QUARTZ;
            }
            case "chiseled_quartz_block",
                    "quartz_pillar",
                    "quartz_bricks",
                    "prismarine_bricks",
                    "prismarine_brick_slab",
                    "prismarine_brick_stairs",
                    "dark_prismarine",
                    "dark_prismarine_slab",
                    "dark_prismarine_stairs",
                    "purpur_block",
                    "purpur_slab",
                    "purpur_stairs",
                    "purpur_pillar",
                    "sea_lantern" -> {
                return QUARTZ_BRICKS;
            }
            case "grass_block",
                    "podzol",
                    "mycelium",
                    "dirt_path" -> {
                return GRASS_BLOCK;
            }
            case "grass",
                    "tall_grass",
                    "fern",
                    "large_fern",
                    "dandelion",
                    "poppy",
                    "blue_orchid",
                    "allium",
                    "azure_bluet",
                    "red_tulip",
                    "orange_tulip",
                    "white_tulip",
                    "pink_tulip",
                    "oxeye_daisy",
                    "cornflower",
                    "lily_of_the_valley",
                    "wither_rose",
                    "brown_mushroom",
                    "red_mushroom" -> {
                return SoundType.HANGING_ROOTS;
            }
            case "cobweb",
                    "glow_lichen" -> {
                return SoundType.VINE;
            }
            case "white_terracotta",
                    "orange_terracotta",
                    "magenta_terracotta",
                    "light_blue_terracotta",
                    "yellow_terracotta",
                    "lime_terracotta",
                    "pink_terracotta",
                    "gray_terracotta",
                    "light_gray_terracotta",
                    "cyan_terracotta",
                    "purple_terracotta",
                    "blue_terracotta",
                    "brown_terracotta",
                    "green_terracotta",
                    "red_terracotta",
                    "black_terracotta",
                    "terracotta",
                    "conduit" -> {
                return TERRACOTTA;
            }
            case "stone_brick_slab",
                    "infested_stone_bricks",
                    "infested_mossy_stone_bricks",
                    "infested_cracked_stone_bricks",
                    "infested_chiseled_stone_bricks",
                    "stone_bricks",
                    "mossy_stone_bricks",
                    "cracked_stone_bricks",
                    "chiseled_stone_bricks",
                    "stone_brick_stairs",
                    "mossy_stone_brick_wall",
                    "stone_brick_wall",
                    "mossy_stone_brick_stairs",
                    "mossy_stone_brick_slab" -> {
                return STONE_BRICK;
            }
            case "brick_slab",
                    "bricks",
                    "brick_stairs",
                    "brick_wall" -> {
                return CLAY_BRICK;
            }
            case "gold_block",
                    "diamond_block",
                    "iron_bars",
                    "iron_door",
                    "iron_block",
                    "observer",
                    "dropper",
                    "dispenser" -> {
                return SoundType.NETHERITE_BLOCK;
            }
            case "emerald_block" -> {
                return SoundType.AMETHYST;
            }
            case "dead_brain_coral",
                    "dead_horn_coral",
                    "dead_fire_coral",
                    "dead_tube_coral",
                    "dead_bubble_coral",
                    "dead_brain_coral_fan",
                    "dead_horn_coral_fan",
                    "dead_fire_coral_fan",
                    "dead_tube_coral_fan",
                    "dead_bubble_coral_fan",
                    "dead_brain_coral_block",
                    "dead_horn_coral_block",
                    "dead_fire_coral_block",
                    "dead_tube_coral_block",
                    "dead_bubble_coral_block" -> {
                return SoundType.CORAL_BLOCK;
            }
            case "gravel",
                    "dirt",
                    "coarse_dirt" -> {
                return SoundType.ROOTED_DIRT;
            }
            case "rooted_dirt",
                    "red_mushroom_block",
                    "brown_mushroom_block",
                    "mushroom_stem" -> {
                return SoundType.WART_BLOCK;
            }
            case "chorus_plant",
                    "chorus_flower" -> {
                return SoundType.STEM;
            }
            case "rose_bush",
                    "peony",
                    "lilac",
                    "sunflower",
                    "cactus",
                    "sugar_cane",
                    "torchflower" -> {
                return SoundType.CROP;
            }
            case "flower_pot",
                    "torch",
                    "soul_torch",
                    "redstone_torch",
                    "wall_torch",
                    "soul_wall_torch",
                    "redstone_wall_torch" -> {
                return SMALL_OBJECT;
            }
        }
        if (sound != null) return sound;
        return cir.getReturnValue();
    }
}
