package amusingmctm.agmctm.listeners;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getServer;

public class LoginListener implements Listener {
    private Main plugin;

    public LoginListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String msg = plugin.getConfig().getString("JoinMs");
        msg = ChatColor.translateAlternateColorCodes('&', util(msg, event.getPlayer()));
        event.setJoinMessage(msg);
    }

    private String util(String string, Player player) {
        string = string.replaceAll("%player", player.getName());
        string = string.replaceAll("%server", player.getServer().getServerName());
        string = string.replaceAll("%online", Integer.toString(getServer().getOnlinePlayers().size()));

        return string;
    }
}
