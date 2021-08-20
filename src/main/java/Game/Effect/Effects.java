package Game.Effect;

import java.util.HashMap;
import java.util.List;

public class Effects {

    private HashMap<String, List<Effects>> effectStorage = new HashMap<>();

    public enum EffectIdentifiable {
        NONE,
        COMBAT_STIM,
        VULNERABLE,
        SPEED,
        SLOWNESS,
        CONCUSSION,
        BLINDED,
        NEARSIGHT
    }

    public boolean applyEffect(EffectIdentifiable e) {
        switch (e) {
            case NONE:
                //No effect will be added and the method returns false.
                throw new IllegalArgumentException("EffectIdentifiable.NONE cannot be added to target player.");
            case COMBAT_STIM:
                //Add the combat stim effect to the player, which will increase fire and reload rate.
                //TODO add body
                return true;
            case VULNERABLE:
                //Effect will double incoming damage on anyone affected.
                //TODO add body
                return true;
            case SPEED:
                //Speed of player will be increased.
                //TODO add body
                return true;
            case SLOWNESS:
                //Speed of player will be decreased.
                //TODO add body
                return true;
            case CONCUSSION:
                //Player fire rate will substantially decrease and their vision will become distorted.
                //TODO add body
                return true;
            case BLINDED:
                //Player vision will be completely blocked..
                //TODO add body
                return true;
            case NEARSIGHT:
                //player vision will be significantly reduced.
                //TODO add body
                return true;
            default:
                throw new IllegalArgumentException("Invalid enum value provided.");
        }
    }
}