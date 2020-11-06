package fr.noctu.nucleon.plugin.api;

public interface NucleaonModule {
    public String name();
    public int key();

    public void onEnable();
    public void onDisable();
}
