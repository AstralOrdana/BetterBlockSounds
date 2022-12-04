package com.ordana.bbs;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BBS {

    public static final String MOD_ID = "bbs";
    public static final Logger LOGGER = LogManager.getLogger();

    private static final String NAME = "bbs";

    public static ResourceLocation res(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public static void commonInit() {

    }

}