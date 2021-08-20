package Game.Agent;

import Game.Agent.Util.Abstract.Agent;
import Game.Agent.Util.Abstract.AgentUtility;
import Game.Agent.Util.Enum.AgentUtilityType;
import Game.Agent.Util.Enum.CharacterModel;
import Game.Effect.Effects;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import static java.util.Arrays.asList;

public class OldDog extends Agent {
    public OldDog(String playerName) {
        this.laserStrike = new LaserStrike();
        this.orbitalSmoke = new OrbitalSmoke(3);
        this.incendiary = new Incendiary(1);
        this.stimBeacon = new StimBeacon(2);
        this.playerName = playerName;
    }
    final LaserStrike laserStrike;
    final OrbitalSmoke orbitalSmoke;
    final StimBeacon stimBeacon;
    final Incendiary incendiary;
    final String playerName;

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
    public AgentUtility getUtility(AgentUtilityType type) {
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
                throw new IllegalArgumentException("Unexpected value: " + type);
        }
    }

    @Override
    public double getMaxHealth() {
        return 0;
    }

    @Override
    public double getHealth() {
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
    public boolean isHealing() { return false;
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
    public void useUtility(AgentUtilityType type, Player player, Agent agent, Effects... agentEffects) {
        switch (type) {
            case ABILITY1:
                stimBeacon.use(player);
                break;
            case ABILITY2:
                incendiary.use(player);
                break;
            case SIGNATURE:
                orbitalSmoke.use(player);
                break;
            case
        };
    }

    @Override
    public boolean hasEffect(Effects e) {
        return false;
    }

    @Override
    public Effects getEffects() {
        return null;
    }

    public String getPlayer(Agent agent) {
        return "";
    }


    class StimBeacon extends AgentUtility {
        protected StimBeacon(int i) {
            this.initialCharges = i;
        }
        private final int initialCharges;
        private String name = "Stim Beacon";
        private ArrayList<String> lore;
        private ItemStack display;
        private int remainingCharges;
        private AgentUtilityType type = AgentUtilityType.ABILITY1;

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
            return type;
        }

        @Override
        public void use() {

        }
    }

    class OrbitalSmoke extends AgentUtility {
        protected OrbitalSmoke(int i) {
            this.charges = i;
        }
        private final int charges;

        @Override
        protected String getName() {
            return null;
        }

        @Override
        protected ArrayList getLore() {
            return null;
        }

        @Override
        protected AgentUtilityType getUtilityType() {
            return null;
        }

        @Override
        public void use() {

        }
    }

    class Incendiary extends AgentUtility {
        protected Incendiary(int i) {
            this.charges = i;
        }
        private final int charges;

        @Override
        protected String getName() {
            return null;
        }

        @Override
        protected ArrayList getLore() {
            return null;
        }

        @Override
        protected AgentUtilityType getUtilityType() {
            return null;
        }

        @Override
        public void use() {

        }
    }

    class LaserStrike extends AgentUtility {
        protected LaserStrike() {
        }
        private String name = "Laser Strike";
        private ArrayList<String> lore = new ArrayList<String>();

        @Override
        protected String getName() {
            return name;
        }

        @Override
        protected ArrayList getLore() {
            return null;
        }

        @Override
        protected AgentUtilityType getUtilityType() {
            return null;
        }

        @Override
        public void use() {
        }
    }
}