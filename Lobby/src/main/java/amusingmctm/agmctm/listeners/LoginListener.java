package amusingmctm.agmctm.listeners;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginListener implements Listener {

    private Main plugin;

    public LoginListener(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerLogin(PlayerJoinEvent event){

        String setConfig =plugin.getConfig().getString("JoinMs");

        setConfig =setConfig.replaceAll("%player",event.getPlayer().getName());

        event.setJoinMessage(ChatColor.translateAlternateColorCodes(('&'),setConfig));
    }
}
