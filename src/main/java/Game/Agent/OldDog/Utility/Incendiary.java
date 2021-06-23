package Game.Agent.OldDog.Utility;

import Game.Agent.AgentUtility;
import Game.Agent.AgentUtilityType;
import static java.util.Arrays.asList;
import java.util.ArrayList;

public class Incendiary extends AgentUtility {

    private String name = "INCENDIARY";
    private ArrayList<String> lore = new ArrayList<>(asList(
            "EQUIP a loaded grenade launcher. FIRE to",
            "launch the incendiary grenade. Upon landing",
            "it will ignite the surrounding area, dealing",
            "massive area-of-effect damage to anybody who",
            "finds themselves caught in range. Lasts 10",
            "seconds upon landing."
    ));

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<String> getLore() {
        return lore;
    }

    @Override
    public AgentUtilityType getUtilityType() {
        return AgentUtilityType.ABILITY2;
    }

    public void use() {
        //TODO: define what happens when used here
    }
}
