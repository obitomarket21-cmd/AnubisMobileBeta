package dev.anubis.mobile.module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ModuleManager {

    private static final List<AnubisModule> MODULES =
            new ArrayList<>();

    private ModuleManager() {
    }

    public static void registerDefaults() {

        if (!MODULES.isEmpty()) {
            return;
        }

        // VISUAL
        register("Waypoints", "Visual");
        register("HUD", "Visual");
        register("Floating Relics", "Visual");
        register("Nametags", "Visual");

        // FINDING
        register("Storage ESP", "Finding");
        register("Hole ESP", "Finding");
        register("Chunk Finder", "Finding");
        register("Better Sus Chunk", "Finding");

        // MOVEMENT
        register("Boat Utilities", "Movement");
        register("Vehicle Log", "Movement");

        // MISC
        register("Auto Reconnect", "Misc");
        register("Spotify HUD", "Misc");
    }

    private static void register(
            String name,
            String category
    ) {
        MODULES.add(
                new BasicModule(name, category)
        );
    }

    public static List<AnubisModule> getModules() {
        return Collections.unmodifiableList(MODULES);
    }

    public static AnubisModule getModule(String name) {
        for (AnubisModule module : MODULES) {
            if (module.getName().equalsIgnoreCase(name)) {
                return module;
            }
        }

        return null;
    }

    private static final class BasicModule
            extends AnubisModule {

        private BasicModule(
                String name,
                String category
        ) {
            super(name, category);
        }
    }
}
