package amusingmctm.agmctm.listeners;

import amusingmctm.agmctm.Main;
;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginListener implements Listener {
    private Main plugin;

    public LoginListener(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerLogin(PlayerJoinEvent event) {
        String setConfig = plugin.getConfig().getString("JoinMs");
        setConfig = setConfig.replaceAll("%player", event.getPlayer().getName());
        event.setJoinMessage(ChatColor.translateAlternateColorCodes(('&'), setConfig));

        for(Player player : Bukkit.getOnlinePlayers()){
            player.playSound(player.getLocation(), Sound.DOOR_OPEN,10,0);
        }

    }

}
