package amusingmctm.agmctm.Worldsecurity.Utils;

import amusingmctm.agmctm.Main;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerItemDropEventSound implements Listener {
    private Main plugin;

    public PlayerItemDropEventSound(Main plugin){
        this.plugin=plugin;
    }

    @EventHandler
    public void ItemDrop(PlayerDropItemEvent event){
        Player player=(Player)event.getPlayer();
        if(!player.hasPermission("Worldsecurity.ItemDrop")) {
            player.playSound(player.getLocation(), Sound.ANVIL_LAND, 10, 0);
        }
    }
}
