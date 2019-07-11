package amusingmctm.agmctm;

import amusingmctm.agmctm.listeners.LoginListener;
import amusingmctm.agmctm.listeners.LogoutListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    //プラグインの起動
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new LoginListener(),this);
        getServer().getPluginManager().registerEvents(new LogoutListener(),this);
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"START SUCCESS!");
    }

    //プラグインの終了
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"END SUCCESS!");
    }

    @Override
    public void onLoad(){
        getServer().getConsoleSender().sendMessage((ChatColor.GREEN+"Plugin loaded."));

    }


}
