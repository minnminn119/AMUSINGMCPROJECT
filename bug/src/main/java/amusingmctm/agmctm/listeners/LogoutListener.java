package amusingmctm.agmctm.listeners;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LogoutListener implements Listener {
    private Main plugin;

    @EventHandler
    public void onLogout(PlayerQuitEvent event){
        String setConfig =plugin.getConfig().getString("LeftMs");
        setConfig =setConfig.replaceAll("%player",event.getPlayer().getName());
        event.setQuitMessage(ChatColor.translateAlternateColorCodes(('&'),setConfig));
    }

}
