package amusingmctm.agmctm.utils;

import amusingmctm.agmctm.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;

public class UnknownCommandSoundUtil implements Listener {

    private Main plugin;
    public UnknownCommandSoundUtil(Main plugin){
        this.plugin=plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onUnknownCommandSound(PlayerCommandPreprocessEvent event){
        if (!event.isCancelled()) {
            Player player = event.getPlayer();
            String cmd = event.getMessage().split(" ")[0];
            HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(cmd);
            if (topic == null) {
                player.sendMessage(ChatColor.DARK_RED+"違う。これじゃない。");
                player.playSound(player.getLocation(), Sound.NOTE_BASS, 10, 0);
                event.setCancelled(true);
            }
        }

    }



}
