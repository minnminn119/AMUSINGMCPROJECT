package amusingmctm.agmctm.utils;

import amusingmctm.agmctm.Main;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EffectUtil implements Listener {
    private Main plugin;
    public EffectUtil(Main plugin){
        this.plugin =plugin;
    }

    @EventHandler
    public void onLoginEffect(PlayerJoinEvent event){
        Player player =(Player) event.getPlayer();
        Location loc= player.getLocation();
        for(int i=10;i<4;i++){
            player.getWorld().playEffect(loc,Effect.ENDER_SIGNAL,0);
        }
    }

    @EventHandler
    public void onLogoutEffect(PlayerQuitEvent event){
        Player player =(Player) event.getPlayer();
        Location loc=player.getLocation();
        for(int i=0;i<10;i++){
            player.getWorld().playEffect(loc,Effect.SMOKE,0);
        }


    }
}
