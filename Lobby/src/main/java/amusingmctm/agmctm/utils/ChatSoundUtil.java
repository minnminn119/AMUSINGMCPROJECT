package amusingmctm.agmctm.utils;

import amusingmctm.agmctm.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatSoundUtil implements Listener {
    private Main plugin;
    public ChatSoundUtil(Main plugin){
        this.plugin =plugin;
    }

    @EventHandler
    public void PlayerChat(AsyncPlayerChatEvent event){
        for(Player player: Bukkit.getOnlinePlayers()){
            player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP,10,0);
        }

    }
}
