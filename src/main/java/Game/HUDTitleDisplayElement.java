package Game;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


import java.awt.*;

public class HUDTitleDisplayElement {

    public void displayAceTitle(Player whoAced) {
        for ( Player p : Bukkit.getServer().getOnlinePlayers()) {
            p.sendTitle("§eACE", ""+whoAced, 5, 80, 5);
            p.playSound(p.getLocation(), "valorance.ace", 10.0f, 1.0f);
        }
    }
}
