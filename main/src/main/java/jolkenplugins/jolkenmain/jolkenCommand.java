package jolkenplugins.jolkenmain;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getServer;

public class jolkenCommand implements CommandExecutor {
    public boolean[] isPvP;

    public jolkenCommand(boolean[] bool) {

        isPvP = bool;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        switch (args[0])
        {
            case "pvpon":
                isPvP[0] = true;
                getServer().broadcastMessage(String.format("pvp set to %b", isPvP[0]));
                break;
            case "pvpoff":
                isPvP[0] = false;
                getServer().broadcastMessage(String.format("pvp set to %b", isPvP[0]));
                break;
            case "pvp":
                getServer().broadcastMessage(String.format("pvp is %b", isPvP[0]));
                break;
        }
        return false;
    }

    private void setpermission(String username, String level)
    {
        switch (level)
        {
            case "leader":
                Player player = getServer().getPlayer(username);
        }
    }
}
