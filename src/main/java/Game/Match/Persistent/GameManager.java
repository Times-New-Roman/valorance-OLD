package Game.Match.Persistent;

import Game.Effect.PlayerEffectManager;
import Game.Match.Round.PlayerInventoryManager;
import Game.Match.Round.RoundManager;

public class GameManager {
    public GameManager() {
        int roundNumber = 1;
        this.roundManager = new RoundManager(1);


    }
    RoundManager roundManager;


    public void suspend(String reason) {
        //TODO: Safely suspend the match and everything associated with it.
    }

    class RoundManager {

        RoundManager(int roundNumber) {
            this.playerEffectManager = new PlayerEffectManager();
            this.playerInventoryManager = new PlayerInventoryManager();
            this.roundNumber = roundNumber;
            if (roundNumber == 12) {


            }
        }
        private int roundNumber;
        private PlayerEffectManager playerEffectManager;
        private PlayerInventoryManager playerInventoryManager;







        public void startRound(int roundNumber) {
            Game.Match.Round.RoundManager manager = new Game.Match.Round.RoundManager(roundNumber);
            //TODO: When command to start game is finished, the following functionality will be added to the RoundManager:
            // - Anyone with the valorance.admin.* or valorance.admin.manageGame permission can run the command.
            // - People who want to add specific people to a team will be able to do so with this permission.
            // - If the command specifies random teams, random teams will be chosen from the players online, UNLESS:
            // - People in the exemptions section of the config.yml will not be added to a team by default.
            // -
            // - Optional settings
            //
        }

    }
}
