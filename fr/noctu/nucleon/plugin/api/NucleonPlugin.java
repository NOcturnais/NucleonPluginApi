package fr.noctu.nucleon.plugin.api;

//Main plugin class
public interface NucleonPlugin {
    public String pluginName();
    public String pluginVersion();
    public String pluginDescription();
    public String pluginAuthor();

    public void onPluginStart(Object nucleonInstance);
}
