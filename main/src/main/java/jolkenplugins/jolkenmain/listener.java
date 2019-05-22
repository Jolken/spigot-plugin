package jolkenplugins.jolkenmain;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public final class listener implements Listener {
    public boolean [] isPvP;

    public listener(boolean[] bool)
    {
        isPvP = bool;
    }
    @EventHandler(priority= EventPriority.LOW)
    public void onPlayerDeath(PlayerDeathEvent event)
    {
        Player player = event.getEntity();
        Player killer = player.getKiller();
        if (killer != null && !isPvP[0])
        {
            event.setKeepInventory(true);
        }
        else
        {
            event.setKeepInventory(false);
        }
    }
}