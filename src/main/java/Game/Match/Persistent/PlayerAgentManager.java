package Game.Match.Persistent;

import Game.Agent.Util.Abstract.Agent;
import Game.Agent.Util.Enum.AgentIdentifiable;
import Game.Agent.OldDog;
import Game.HUD.HUDScoreboardElement;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerAgentManager {

    private HashMap<String, Agent> playerAgentStorage = new HashMap<>();

    public void registerPlayerAgentSelections(Player player, AgentIdentifiable agent) {
        String playerName = player.getName();

        switch (agent) {
            case OLDDOG -> playerAgentStorage.put(playerName, new OldDog(playerName));
            default -> player.sendMessage("An unexpected error occurred registering your agent.");
        }
    }

    public String getPlayerByAgent(Agent agent) {
        return "";
    }
}