package dev.anubis.mobile;

import dev.anubis.mobile.config.ClientConfig;
import dev.anubis.mobile.module.ModuleManager;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AnubisClient implements ClientModInitializer {

    public static final String MOD_ID = "anubis_mobile";
    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        ClientConfig.load();
        ModuleManager.registerDefaults();

        LOGGER.info("Anubis Client Mobile Beta 0.1 initialized!");
        LOGGER.info("Anubis Mobile foundation loaded.");
    }
}
