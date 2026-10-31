package dev.anubis.mobile.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class ClientConfig {

    private static final Gson GSON =
            new GsonBuilder().setPrettyPrinting().create();

    private static final Path FILE =
            FabricLoader.getInstance()
            .getConfigDir()
            .resolve("anubis-mobile.json");

    public static Settings settings = new Settings();

    private ClientConfig() {}

    public static void load() {
        try {
            if (Files.exists(FILE)) {
                Settings loaded =
                        GSON.fromJson(
                                Files.readString(FILE),
                                Settings.class
                        );

                if (loaded != null) {
                    settings = loaded;
                }
            } else {
                save();
            }
        } catch (Exception e) {
            settings = new Settings();
        }
    }

    public static void save() {
        try {
            Files.createDirectories(FILE.getParent());
            Files.writeString(FILE, GSON.toJson(settings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final class Settings {
        public boolean hudEnabled = true;
        public boolean waypointsEnabled = true;
        public boolean floatingRelicsEnabled = false;
        public boolean touchFriendlyGui = true;
        public int guiScale = 100;
    }
}
