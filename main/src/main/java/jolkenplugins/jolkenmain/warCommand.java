package jolkenplugins.jolkenmain;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.io.IOException;

import static org.bukkit.Bukkit.getServer;

public class warCommand implements CommandExecutor {
    Jolkenmain cfg;

    public warCommand(Jolkenmain plugin) {

        cfg = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (args.length < 1) {
            getServer().broadcastMessage(String.format("war is %b", cfg.config.getBoolean("warmode")));
        } else {

            switch (args[0]) {
                case "on":
                    cfg.config.set("warmode", true);
                    getServer().broadcastMessage(String.format("war set to %b", cfg.config.getBoolean("warmode")));
                    cfg.saveConfig();
                    break;
                case "off":
                    cfg.config.set("warmode", false);
                    getServer().broadcastMessage(String.format("war set to %b", cfg.config.getBoolean("warmode")));
                    cfg.saveConfig();
                    break;
            }
        }
        return true;
    }

    private void setpermission(String username, String level) {
        switch (level) {
            case "leader":
                Player player = getServer().getPlayer(username);
        }
    }
}
