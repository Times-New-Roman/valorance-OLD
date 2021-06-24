package Game.Agent.OldDog;

import Game.Agent.Agent;
import Game.Agent.AgentUtility;
import Game.Agent.AgentUtilityType;
import Game.Agent.CharacterModel;
import Game.Agent.OldDog.Utility.Incendiary;
import Game.Agent.OldDog.Utility.LaserStrike;
import Game.Agent.OldDog.Utility.OrbitalSmoke;
import Game.Agent.OldDog.Utility.StimBeacon;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class OldDog extends Agent {
    OrbitalSmoke orbitalSmoke;
    StimBeacon stimBeacon;
    Incendiary incendiary;
    LaserStrike laserStrike;

    public OldDog() {
        this.orbitalSmoke = new OrbitalSmoke();
        this.stimBeacon = new StimBeacon();
        this.incendiary = new Incendiary();
        this.laserStrike = new LaserStrike();
    }
    private final String name = "Old Dog";

    private final ArrayList<String> lore = new ArrayList<>(asList(
            "The battle-hardened general from America,",
            "\"Old Dog\" Sanders is ready to bring his",
            "team the battlefield advantage using an",
            "arsenal of on-demand ordnance drops.",
            "His on-the-ground field control is",
            "unchallenged across all fronts."
    ));

    private final int maxHealth = 100;
    private boolean hasShield = false;
    private int health = 100;
    private boolean isHealing = false;
    private int shield = 0;

    @Deprecated
    private final CharacterModel characterModel = null;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList getLore() {
        return lore;
    }

    @Override
    public AgentUtility getAgentUtility(AgentUtilityType type) {
        switch ( type ) {
            case SIGNATURE:
                return orbitalSmoke;
            case ABILITY1:
                return stimBeacon;
            case ABILITY2:
                return incendiary;
            case ULTIMATE:
                return laserStrike;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    @Override
    public int getMaxHealth() {
        return 0;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public void setHealth(int health) {

    }

    @Override
    public boolean setIsHealing(boolean b) {
        return false;
    }

    @Override
    public boolean isHealing() {
        return false;
    }

    @Override
    public boolean hasShield() {
        return false;
    }

    @Override
    public boolean setShield(int amount) {
        return false;
    }

    @Override @Deprecated
    public CharacterModel getCharacterModel() {
        return null;
    }

    @Override
    public void useUtility(AgentUtilityType type, Player player, Agent agent) {
        agent.getAgentUtility(type).use();
    }
}