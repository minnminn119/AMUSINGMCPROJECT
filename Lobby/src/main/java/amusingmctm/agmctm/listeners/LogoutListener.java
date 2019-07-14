package amusingmctm.agmctm.listeners;

import amusingmctm.agmctm.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LogoutListener implements Listener {
    private Main plugin;

    public LogoutListener(Main plugin){
        this.plugin=plugin;
    }

    @EventHandler
    public void onLogout(PlayerQuitEvent event){
        String setConfig =plugin.getConfig().getString("LeftMs");
        setConfig =setConfig.replaceAll("%player",event.getPlayer().getName());
        event.setQuitMessage(ChatColor.translateAlternateColorCodes(('&'),setConfig));

        for(Player player : Bukkit.getOnlinePlayers()){
            player.playSound(player.getLocation(), Sound.DOOR_CLOSE,10,0);
        }

    }

}
