package com.ordana.bbs.fabric;

import net.fabricmc.api.ModInitializer;
import com.ordana.bbs.BBS;

public class BBSFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        BBS.commonInit();
/*
        if (PlatformHelper.getEnv().isClient()) {
            FabricSetupCallbacks.CLIENT_SETUP.add(BBSClient::init);
        }

 */
    }
}
