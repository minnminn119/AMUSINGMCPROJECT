package amusingmctm.agmctm.listeners;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import static org.bukkit.Bukkit.getServer;

public class LogoutListener implements Listener {
    private Main plugin;

    public LogoutListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        String msg = plugin.getConfig().getString("LeftMs");
        msg = ChatColor.translateAlternateColorCodes(('&'), util(msg, event.getPlayer()));
        event.setQuitMessage(msg);
    }

    private String util(String string, Player player) {
        string = string.replaceAll("%player", player.getName());
        string = string.replaceAll("%online", Integer.toString(getServer().getOnlinePlayers().size()));

        return string;
    }
}
