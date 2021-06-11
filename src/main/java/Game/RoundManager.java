package Game;

import Game.PlayerInventoryManager;
import Game.Weapon.TestWeapon;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Collection;

public class RoundManager {

    public static void startRound() {
        PlayerInventoryManager inventoryManager = new PlayerInventoryManager();
        Collection<Player> onlinePlayers = Valorance.getPlugin().getServer().getOnlinePlayers());
        for (Player player : onlinePlayers) {
            inventoryManager.setPrimary("player", new TestWeapon());

        }
    }
}
