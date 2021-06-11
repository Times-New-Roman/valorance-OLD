package Game;


import Game.Weapon.Gun;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerInventoryManager {

    private HashMap<String, Gun> primaryWeapon = new HashMap<String, Gun>();
    private HashMap<String, Gun> secondaryWeapon = new HashMap<String, Gun>();

    public Gun getPrimary(String player) { return primaryWeapon.get(player); }
    public Gun getSecondary(String player) { return secondaryWeapon.get(player); }

    public void setPrimary(String player, Gun gun) { primaryWeapon.put(player, gun); }
    public void setSecondary(String player, Gun gun) { secondaryWeapon.put(player, gun); }

}
