package Game.Event;

import Game.Match.Round.PlayerInventoryManager;
import Game.Weapon.Gun;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class FireEvent implements Listener {

    @EventHandler
    public void onFireEvent(PlayerInteractEvent e) {

        Gun gun = PlayerInventoryManager.itemToGun(e.getPlayer().getInventory().getItemInMainHand().getType());
        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK) || PlayerInventoryManager.itemToGun(e.getPlayer().getInventory().getItemInMainHand().getType()) != null) {

        }
        else e.setCancelled(true);
    }
}
