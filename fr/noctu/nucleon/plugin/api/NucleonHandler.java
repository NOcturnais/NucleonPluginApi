package fr.noctu.nucleon.plugin.api;

public interface NucleonHandler {
    public void onUpdate();
    public void onGui(Object guiScreen);
    public void onPacket(Object packet);
    public void onRender2D();
    public void onRender3D();
    public void onKeyPress(int key);
}
