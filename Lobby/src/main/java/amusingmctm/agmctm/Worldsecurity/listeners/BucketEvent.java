package amusingmctm.agmctm.Worldsecurity.listeners;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;

public class BucketEvent implements Listener {
    private Main plugin;
    public BucketEvent(Main plugin){
        this.plugin=plugin;
    }

    @EventHandler
    public void BucketEvent(PlayerBucketFillEvent event){
        Player player=(Player)event.getPlayer();
        if(!player.hasPermission("Worldsecurity,BucketEvent")){
            player.playSound(player.getLocation(), Sound.GHAST_FIREBALL,10,0);
            player.sendMessage(ChatColor.DARK_RED+"蒸発した");
            player.getWorld().playEffect(player.getLocation(), Effect.LAVA_POP,0);
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void BucketEvent2(PlayerBucketEmptyEvent event){
        Player player=(Player)event.getPlayer();
        if(!player.hasPermission("Worldsecurity,BucketEvent")){
            player.playSound(player.getLocation(), Sound.GHAST_FIREBALL,10,0);
            player.sendMessage(ChatColor.DARK_RED+"蒸発した");
            player.getWorld().playEffect(player.getLocation(), Effect.LAVA_POP,0);
            event.setCancelled(true);
        }
    }
}
