package jolkenplugins.jolkenmain;


import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Jolkenmain extends JavaPlugin {

    public boolean[] isPvP = new boolean[]{false};
    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        try {
            isPvP[0] = config.getBoolean("warmode");
        } catch (Exception e) {
            config.addDefault("warmode", false);
            config.options().copyDefaults(true);
            saveConfig();
        }
        getLogger().info("enabled");
        getServer().getPluginManager().registerEvents(new listener(this), this);
        this.getCommand("war").setExecutor(new warCommand(this));
        this.getCommand("survival").setExecutor(new survivalCommand());
        //this.getCommand("village").setExecutor(new villageCommand());
        //this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        saveConfig();
    }


}

