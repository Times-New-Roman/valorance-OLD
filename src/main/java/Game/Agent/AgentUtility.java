package Game.Agent;

import java.util.ArrayList;

public abstract class AgentUtility {

    protected abstract String getName();
    protected abstract ArrayList getLore();
    protected abstract AgentUtilityType getUtilityType();
    public abstract void use();
}
