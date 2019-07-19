package amusingmctm.agmctm.Worldsecurity.listeners;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerItemDropEvent implements Listener {
    private Main plugin;
    public PlayerItemDropEvent(Main plugin){
        this.plugin=plugin;
    }

    @EventHandler
    public void PlayerItemDrop(PlayerDropItemEvent event){
        Player player=(Player)event.getPlayer();

        if(!player.hasPermission("ItemDrop")){
            player.sendMessage(ChatColor.DARK_RED+"戻ってきた");
            event.setCancelled(true);
        }

    }
}