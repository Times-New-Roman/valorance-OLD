package Game.Command;

import Game.RoundManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RoundCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        if (args[0].equalsIgnoreCase("start")) {
            RoundManager.startRound();
            commandSender.sendMessage("Round started.");
            return true;
        }
        else {
            commandSender.sendMessage("Error: You tried to use functionality which hasn't been implemented yet.");
            return false;
        }
    }
}
