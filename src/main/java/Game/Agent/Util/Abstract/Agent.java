package Game.Agent.Util.Abstract;

import Game.Agent.Util.Enum.AgentUtilityType;
import Game.Agent.Util.Enum.CharacterModel;
import Game.Effect.Effects;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public abstract class Agent {

    public abstract String getName();

    public abstract ArrayList<String> getLore();


    public abstract AgentUtility getUtility(AgentUtilityType type);

    public abstract double getMaxHealth();

    public abstract double getHealth();

    public abstract void setHealth(int health);

    public abstract boolean setIsHealing(boolean b);

    public abstract boolean isHealing();

    public abstract boolean hasShield();

    public abstract boolean setShield(int amount);

    public abstract CharacterModel getCharacterModel();

    public abstract void useUtility(AgentUtilityType type, Player player, Agent agent, Effects... agentEffects);

    public abstract boolean hasEffect(Effects e);

    public abstract Effects getEffects();

    public abstract String getPlayer(Agent agent);
}
