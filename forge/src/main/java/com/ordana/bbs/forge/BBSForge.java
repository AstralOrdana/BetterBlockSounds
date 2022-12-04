package com.ordana.bbs.forge;

import com.ordana.bbs.BBS;
import com.ordana.bbs.BBSClient;
import net.minecraftforge.fml.common.Mod;

@Mod(BBS.MOD_ID)
public class BBSForge {

    public BBSForge() {
        BBS.commonInit();
/*
        if (PlatformHelper.getEnv().isClient()) {
            BBSClient.init();
        }

 */
    }
}

