package amusingmctm.agmctm.utils;

import amusingmctm.agmctm.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class SoundUtil implements Listener {
    private Main plugin;

    public SoundUtil (Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void JoinSound(PlayerJoinEvent event) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.playSound(player.getLocation(), Sound.DOOR_OPEN, 10, 0);

        }
    }

    @EventHandler
    public void LogoutSound(PlayerQuitEvent event){
        for(Player player : Bukkit.getOnlinePlayers()){
            player.playSound(player.getLocation(),Sound.DOOR_CLOSE,10,0);
        }
    }
}
