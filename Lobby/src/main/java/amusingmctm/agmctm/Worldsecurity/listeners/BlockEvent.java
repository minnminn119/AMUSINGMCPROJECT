package amusingmctm.agmctm.Worldsecurity.listeners;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockEvent implements Listener {
    private Main plugin;
    public BlockEvent(Main plugin){
        this.plugin=plugin;
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        Player player = (Player) event.getPlayer();
        if (!player.hasPermission("Worldsecurity.BlockBreak")) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED + "時間の無駄だ");
        }
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event){
        Player player=(Player)event.getPlayer();
        if(!player.hasPermission("Worldsecurity.BlockPlace")) {
            player.sendMessage(ChatColor.DARK_RED + "消された");
            event.setCancelled(true);
        }
    }

}
