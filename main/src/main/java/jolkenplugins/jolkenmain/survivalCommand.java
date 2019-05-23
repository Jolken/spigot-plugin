package jolkenplugins.jolkenmain;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class survivalCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        String username = sender.getName().toLowerCase();

        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        String str = String.format("permissions player addgroup %s survival", username);
        Bukkit.dispatchCommand(console, str);
        return true;
    }
}
