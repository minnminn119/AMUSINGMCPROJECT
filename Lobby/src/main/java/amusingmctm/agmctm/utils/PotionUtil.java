package amusingmctm.agmctm.utils;

import amusingmctm.agmctm.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PotionUtil implements Listener {
    private Main plugin;

    public PotionUtil(Main plugin){
        this.plugin =plugin;
    }

    @EventHandler
    public void onPotion(PlayerJoinEvent event){
        Player player =(Player) event.getPlayer();
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,100000,1));
    }


}
