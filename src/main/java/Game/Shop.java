package Game;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;



public class Shop implements Listener {
    private final Inventory inv;
    public Shop() {
            inv = Bukkit.createInventory(null, 54, "Shop");

            // Put the items into the inventory
            initializeItems();
        }

        public void initializeItems() {
            inv.addItem(createGuiItem(Material.IRON_HOE, "§b§lSpirit", "§f§l$2,900","§7A 30-round rifle that can instantly kill", "§7enemies with a headshot."));
            inv.addItem(createGuiItem(Material.IRON_SHOVEL, "§b§lDeviant", "§f§l$2,900", "§7A suppressed fully-automatic rifle with", "§7a promising fire rate."));

        }


        protected ItemStack createGuiItem(final Material material, final String name, final String... lore) {
            final ItemStack item = new ItemStack(material, 1);
            final ItemMeta meta = item.getItemMeta();

            // Set the name of the item
            meta.setDisplayName(name);

            // Set the lore of the item
            meta.setLore(Arrays.asList(lore));

            item.setItemMeta(meta);

            return item;
        }

        public void openInventory(final HumanEntity ent) {
            ent.openInventory(inv);
        }


        @EventHandler
        public void onInventoryClick(final InventoryClickEvent e) {
            if (e.getInventory() != inv) return;

            e.setCancelled(true);

            final ItemStack clickedItem = e.getCurrentItem();


            if (clickedItem == null || clickedItem.getType() == Material.AIR) return;

            final Player p = (Player) e.getWhoClicked();


            p.sendMessage("You clicked at slot " + e.getRawSlot());

            //Adds the clicked weapon to the InventoryManager map

            if ( )
        }


        @EventHandler
        public void onInventoryClick(final InventoryDragEvent e) {
            if (e.getInventory() == inv) {
                e.setCancelled(true);
            }
        }
}
