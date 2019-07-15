package amusingmctm.agmctm.commands;

import amusingmctm.agmctm.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class reload {
    public static void run(CommandSender sender, Main plg) {
        if (!(sender instanceof Player)) {
            plg.reloadConfig();
            plg.saveConfig();
            plg.getLogger().info("Plugin Reloaded");
        } else if (sender.hasPermission("agmc.command.reload")) {
            plg.reloadConfig();
            plg.saveConfig();
            plg.getLogger().info("Plugin Reloaded");
            sender.sendMessage(ChatColor.GREEN + "[AGMCTM] Plugin Reloaded");
        }
    }
}
