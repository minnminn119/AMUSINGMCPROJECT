package amusingmctm.agmctm;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    //プラグインの起動
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"START SUCCESS!");
        getServer().getPluginManager().registerEvents(new JoinSystem(),this);

    }
    //プラグインの終了
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"END SUCCESS!");

    }
}
