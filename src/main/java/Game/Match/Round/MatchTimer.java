package Game.Match.Round;

import Game.HUD.HUDBossbarElement;
import Game.Valorance;
import org.bukkit.scheduler.BukkitRunnable;

public class MatchTimer extends BukkitRunnable {

    public MatchTimer(int seconds) {
        HUDBossbarElement timerdisplay = new HUDBossbarElement();

    }
    public void displayTime(int i) {

        int ms = i / 60;
        int ss = i % 60;
        String m = (ms < 10 ? "0" : "") + ms;
        String s = (ss < 10 ? "0" : "") + ss;
        String time = m + ":" + s;
        runTaskTimerAsynchronously(Valorance.getPlugin(),20L, 20L);
    }


    @Override
    public void run() {

    }
}
