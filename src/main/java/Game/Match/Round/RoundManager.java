package Game.Match.Round;

import Game.PlayerInventoryManager;
import Game.Team.Attackers;
import Game.Team.Defenders;
import Game.Weapon.Gun;
import Game.Weapon.TestWeapon;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Collection;

public class RoundManager {
    public RoundManager(int roundNumber, Attackers attackers, Defenders defenders) {

    }



    public static void startRound() {

        PlayerInventoryManager inventoryManager = new PlayerInventoryManager();
            for (Player player : Bukkit.getOnlinePlayers()) {
                String playerName = player.getName();


                //This can currently return null but in the future will not be able to do so.
                //The RoundManager will automatically fill in the secondary weapon if there isn't one when the game starts.
                Gun gunFromItem = inventoryManager.itemToGun(player.getInventory().getItem(1).getType());
                inventoryManager.setSecondary(playerName, gunFromItem);
            }
        }
    }

