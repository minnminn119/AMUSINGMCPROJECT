package amusingmctm.agmctm.Worldsecurity.listeners;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class PlayerBedEvent implements Listener {
    private Main plugin;
    public PlayerBedEvent(Main plugin){
        this.plugin =plugin;
    }

    @EventHandler
    public void BedEnterEvent(PlayerBedEnterEvent event){
        Player player=(Player)event.getPlayer();
        if(!player.hasPermission("Worldsecurity.BedEnter")){
            player.playSound(player.getLocation(), Sound.AMBIENCE_CAVE,10,0);
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"寝たら死ぬ");
            player.getWorld().playEffect(player.getLocation(), Effect.ZOMBIE_DESTROY_DOOR,0);
        }
    }
}
