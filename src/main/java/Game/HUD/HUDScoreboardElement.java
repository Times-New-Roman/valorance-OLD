package Game.HUD;

import org.bukkit.ChatColor;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import static Game.Valorance.getPlugin;

public class HUDScoreboardElement {
    public HUDScoreboardElement(HUDScoreboardType t) {
        switch (t) {
            case ROUND: createRoundScoreboard();
            break;
            case TESTING: createTestScoreboard();
            break;
            case PRACTICE: createPracticeScoreboard();
            break;
            case PREROUND: createPreRoundScoreboard();
            break;
            case POSTROUND: createPostRoundScoreboard();
            break;
            case SIMPLIFIED: createSimpleScoreboard();
            break;
        }
    }
    public enum HUDScoreboardType {
        ROUND,
        PREROUND,
        POSTROUND,
        SIMPLIFIED,
        TESTING,
        PRACTICE
    }
    private ScoreboardManager scoreboardManager = getPlugin().getServer().getScoreboardManager();

    private HUDScoreboardType scoreboardType;

    private void createRoundScoreboard() {
        
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();
        Objective title = scoreboard.registerNewObjective("" + ChatColor.YELLOW + ChatColor.BOLD + "ROUND " , "dummy");
        Objective t = scoreboard.registerNewObjective("",  "", "");
    }

    private void createTestScoreboard() {

    }

    private void createPracticeScoreboard() {

    }

    private void createPreRoundScoreboard() {

    }

    private void createPostRoundScoreboard() {

    }

    private void createSimpleScoreboard() {

    }


}
