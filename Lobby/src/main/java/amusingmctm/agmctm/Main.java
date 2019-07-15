package amusingmctm.agmctm;

import amusingmctm.agmctm.listeners.LoginListener;
import amusingmctm.agmctm.listeners.LoginTitle;
import amusingmctm.agmctm.listeners.LogoutListener;
import amusingmctm.agmctm.utils.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main instance;

    public static Main getInstance(){
        return instance;
    }

    //プラグインの起動
    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new LoginListener(this),this);
        this.getServer().getPluginManager().registerEvents(new LogoutListener(this),this);
        this.getServer().getPluginManager().registerEvents(new SoundUtil(this),this);
        this.getServer().getPluginManager().registerEvents(new EffectUtil(this),this);
        this.getServer().getPluginManager().registerEvents(new PotionUtil(this),this);
        this.getServer().getPluginManager().registerEvents(new LoginTitle(this),this);
        this.getServer().getPluginManager().registerEvents(new ChatSoundUtil(this),this);
        this.getServer().getPluginManager().registerEvents(new UnknownCommandSoundUtil(this),this);
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"START SUCCESS!");
    }

    //プラグインの終了
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"END SUCCESS!");
        instance =null;
    }

    @Override
    public void onLoad(){
        getServer().getConsoleSender().sendMessage((ChatColor.GREEN+"Plugin loaded."));

    }


}
