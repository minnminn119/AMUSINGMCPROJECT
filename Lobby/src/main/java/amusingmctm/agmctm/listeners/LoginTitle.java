
package amusingmctm.agmctm.listeners;

import amusingmctm.agmctm.Main;
import com.connorlinfoot.titleapi.TitleAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class LoginTitle implements Listener {
    private Main plugin;

    public LoginTitle(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onTitle(PlayerJoinEvent event){

        TitleAPI.sendTitle(event.getPlayer(),25,25,25,"test");

    }

}
