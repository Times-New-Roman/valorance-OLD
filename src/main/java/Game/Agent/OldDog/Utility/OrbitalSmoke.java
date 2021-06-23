package Game.Agent.OldDog.Utility;

import Game.Agent.AgentUtility;
import Game.Agent.AgentUtilityType;
import org.bukkit.event.Listener;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class OrbitalSmoke extends AgentUtility {
    private String name = "ORBITAL SMOKE";
    private ArrayList<String> lore = new ArrayList<>(asList(
            "EQUIP a targeting device. FIRE to deploy an",
            "orbital smoke cloud, which will fall from",
            "the sky and block enemies' line of sight",
            "once it lands. The smoke will last for 20",
            "seconds, and will hide anyone inside.",
            ""
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
        return AgentUtilityType.SIGNATURE;
    }

    @Override
    public void use() {

    }
}
