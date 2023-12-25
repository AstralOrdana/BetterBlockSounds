package com.ordana.bbs;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class BBSMain {

    public static final TagKey<Block> STONE_ORES = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "stone_ores"));
    public static final TagKey<Block> OBSIDIAN = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "obsidian"));
    public static final TagKey<Block> COPPER = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "glass"));
    public static final TagKey<Block> GLASS = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "copper"));
    public static final TagKey<Block> HEAVY_METAL = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "heavy_metal"));
    public static final TagKey<Block> SMALL_OBJECTS = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "small_objects"));
    public static final TagKey<Block> CLAY_BRICKS = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "clay_bricks"));
    public static final TagKey<Block> GRASS_BLOCKS = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "grass_blocks"));
    public static final TagKey<Block> BLACKSTONE = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "blackstone"));
    public static final TagKey<Block> POLISHED_BLACKSTONE = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "polished_blackstone"));
    public static final TagKey<Block> BLACKSTONE_BRICKS = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "blackstone_bricks"));
    public static final TagKey<Block> BASALT = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "basalt"));
    public static final TagKey<Block> END_STONE_BRICKS = TagKey.create(Registries.BLOCK, new ResourceLocation("bbs", "end_stone_bricksw"));

    public static void commonInit() {
    }
}
