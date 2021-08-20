package Game.Effect;

import Game.Agent.Util.Abstract.Agent;
import org.bukkit.entity.Player;

import java.util.List;

public class PlayerEffectManager {



    public List<Effects> getEffects(Player player) {
        String resolvablePlayerKey = player.getName();
        List<Effects> currentEffects = effectStorage.get(resolvablePlayerKey);
        return currentEffects;
    }

    public List<Effects> getEffects(Agent agent) {
        String resolvablePlayerKey = agent.getPlayer();
        List<Effects> currentEffects =
    }

    public void setEffects(Player player, List<Effects> effects) {
        String resolvablePlayerKey = player.getName();
        effectStorage.put(resolvablePlayerKey, effects);
    }

    public void setEffect(Player player, Effects effect) {




    }




}
