package dev.anubis.mobile.module;

public abstract class AnubisModule {

    private final String name;
    private final String category;
    private boolean enabled;

    protected AnubisModule(
            String name,
            String category
    ) {
        this.name = name;
        this.category = category;
        this.enabled = false;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void toggle() {
        this.enabled = !this.enabled;
    }

    public void onEnable() {
    }

    public void onDisable() {
    }
}
