package fr.noctu.nucleon.plugin.api;

public interface NucleonModule {
    public String name();
    public int key();

    public void onEnable();
    public void onDisable();
}
