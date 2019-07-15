package amusingmctm.agmctm;

import amusingmctm.agmctm.commands.reload;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class command_agmc implements CommandExecutor {
    private final Main plg;
    command_agmc(Main plg_){plg = plg_;}

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String commandLabel, String[] args) {
        if (command.getName().equalsIgnoreCase("agmc")){
            if (args.length == 0) return false;
            switch (args[0].toLowerCase()){
                case "reload":
                    reload.run(commandSender, plg);
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }
}
