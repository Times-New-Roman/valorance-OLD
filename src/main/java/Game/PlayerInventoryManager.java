package Game;

import Game.Weapon.Gun;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerInventoryManager {

    private HashMap<Player, Gun> primaryWeapon = new HashMap<Player, Gun>();
    private HashMap<Player, Gun> secondaryWeapon = new HashMap<Player, Gun>();

    public Gun getPrimary(Player player) { return primaryWeapon.get(player); }
    public Gun getSecondary(Player player) { return secondaryWeapon.get(player); }

    public void setPrimary(Player player, Gun gun) { primaryWeapon.put(player, gun); }
    public void setSecondary(Player player, Gun gun) { secondaryWeapon.put(player, gun); }

}
