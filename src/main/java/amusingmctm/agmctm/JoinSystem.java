package amusingmctm.agmctm;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinSystem implements Listener {

    //参加したときのイベント待機
    @EventHandler
    public void onLogin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + "が参加");
    }

    //退出したときのイベント待機
    @EventHandler
    public void onLeft(PlayerQuitEvent event){
        event.setQuitMessage(ChatColor.DARK_RED + event.getPlayer().getName() + "が退出");
    }

}
