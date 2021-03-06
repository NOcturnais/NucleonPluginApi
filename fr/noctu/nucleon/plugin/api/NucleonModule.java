package fr.noctu.nucleon.plugin.api;

public interface NucleonModule {
    public String name();
    public int key();

    public void onEnable();
    public void onDisable();

    public void onUpdate();
    public void onGui(Object guiScreen);
    public void onPacket(Object packet);
    public void onRender2D();
    public void onRender3D();
    public void onKeyPress(int key);
}
