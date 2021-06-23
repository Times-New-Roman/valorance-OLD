package Game.Agent;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public abstract class Agent {

    public abstract String getName();

    public abstract ArrayList<String> getLore();


    public abstract AgentUtility getAgentUtility(AgentUtilityType type);

    public abstract int getMaxHealth();
    public abstract int getHealth();
    public abstract void setHealth(int health);

    public abstract boolean setIsHealing(boolean b);
    public abstract boolean isHealing();

    public abstract boolean hasShield();
    public abstract boolean setShield(int amount);

    public abstract CharacterModel getCharacterModel();

    public abstract void useUtility(AgentUtilityType type, Player player, Agent agent);




}
