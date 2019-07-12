package amusingmctm.agmctm.listeners;

import amusingmctm.agmctm.Main;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEvent;
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

        Player p =(Player) event;
        Location loc=p.getLocation();

        p.playSound(loc, Sound.DOOR_OPEN,10,10);
        loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL,10);
    }

}
