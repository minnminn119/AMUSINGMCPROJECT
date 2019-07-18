package amusingmctm.agmctm.Worldsecurity.Utils;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockEventSound implements Listener {
    private Main plugin;
    public BlockEventSound(Main plugin){
        this.plugin=plugin;
    }

    @EventHandler
    public void onBreakSound(BlockBreakEvent event){
        Player player = (Player) event.getPlayer();
        if (!player.hasPermission("Worldsecurity.BlockBreak")) {
            event.setCancelled(true);
            player.playSound(player.getLocation(), Sound.LAVA_POP, 10, 0);
        }
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event){
        Player player=(Player)event.getPlayer();
        if(!player.hasPermission("Worldsecurity.BlockPlace")) {
            player.playSound(player.getLocation(), Sound.GLASS, 10, 0);
            event.setCancelled(true);
        }
    }
}
