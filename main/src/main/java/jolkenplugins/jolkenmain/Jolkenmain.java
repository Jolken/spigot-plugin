package jolkenplugins.jolkenmain;


import org.bukkit.plugin.java.JavaPlugin;

public final class Jolkenmain extends JavaPlugin {

    public boolean [] isPvP = new boolean[]{false};
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("enabled");
        getServer().getPluginManager().registerEvents(new listener(isPvP), this);
        this.getCommand("jolken").setExecutor(new jolkenCommand(isPvP));
        //this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}

