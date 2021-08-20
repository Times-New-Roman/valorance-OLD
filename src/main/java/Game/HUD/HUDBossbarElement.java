package Game.HUD;

import Game.Valorance;
import org.bukkit.NamespacedKey;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

import static Game.Valorance.getPlugin;

public class HUDBossbarElement {

    public void send(String text, Long time, BarColor color, Player[] players) {
        BossBar bar = getPlugin().getServer().createBossBar(text, BarColor.WHITE, BarStyle.SOLID);
        for ( Player p : players) {
            bar.addPlayer( p );
        }

        BukkitRunnable runnable = new BukkitRunnable() {
            @Override
            public void run() {
                bar.setVisible(false);
            }
        };

        runnable.runTaskLaterAsynchronously(getPlugin(), 400L);
    }

}
