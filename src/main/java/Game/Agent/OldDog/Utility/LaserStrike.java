package Game.Agent.OldDog.Utility;

import Game.Agent.AgentUtility;
import Game.Agent.AgentUtilityType;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class LaserStrike extends AgentUtility {
    private String name = "LASER STRIKE";
    private ArrayList<String> lore = new ArrayList<>(asList(
            "EQUIP a targeting device. FIRE to launch a",
            "laser bombardment at the block you are",
            "currently looking at, dealing heavy damage",
            "and slowing anybody caught in the blast.",
            "The laser will last for 5 seconds, and deal",
            "40 damage per second to all players in range."
    ));

    @Override
    protected String getName() {
        return name;
    }

    @Override
    protected ArrayList getLore() {
        return lore;
    }

    @Override
    protected AgentUtilityType getUtilityType() {
        return AgentUtilityType.ULTIMATE;
    }

    @Override
    public void use() {

    }
}
