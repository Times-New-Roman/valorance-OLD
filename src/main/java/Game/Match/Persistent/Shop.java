package Game.Match.Persistent;

import Game.Agent.AgentUtilityType;
import Game.Agent.OldDog.OldDog;
import Game.Agent.OldDog.Utility.Incendiary;
import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;
import net.minecraft.server.v1_16_R3.Tag;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.HashMap;


public class Shop implements Listener {

    private final Inventory inv;

    public Shop() {
        inv = Bukkit.createInventory(null, 54, "Shop");
        initializeItems();
    }

        public void initializeItems() {
            ItemStack sidebar = new ItemStack(Material.CYAN_STAINED_GLASS_PANE);
            //The sidebar represents the sidebars on either side made up of cyan panes.
            inv.setItem(0, sidebar);
            inv.setItem(9, sidebar);
            inv.setItem(18, sidebar);
            inv.setItem(27, sidebar);
            inv.setItem(36, sidebar);
            inv.setItem(45, sidebar);
            inv.setItem(8, sidebar);
            inv.setItem(17, sidebar);
            inv.setItem(26, sidebar);
            inv.setItem(35, sidebar);
            inv.setItem(44, sidebar);
            inv.setItem(53, sidebar);

            //The following are placeholders for the implementation of proper weapon types:
            ItemStack pistolPlaceholder = new ItemStack(Material.STONE_HOE);
            ItemStack weaponPlaceholder = new ItemStack(Material.IRON_HOE);
            ItemStack abilityPlaceholder = new ItemStack(Material.ENCHANTED_BOOK);
            ItemStack armorPlaceholder = new ItemStack(Material.IRON_CHESTPLATE);
            ItemStack economyPlaceholder = new ItemStack(Material.NAME_TAG);

            inv.setItem(1, pistolPlaceholder);
            inv.setItem(10, pistolPlaceholder);
            inv.setItem(19, pistolPlaceholder);
            inv.setItem(28, pistolPlaceholder);
            inv.setItem(3, weaponPlaceholder);
            inv.setItem(4, weaponPlaceholder);
            inv.setItem(5, weaponPlaceholder);
            inv.setItem(12, weaponPlaceholder);
            inv.setItem(13, weaponPlaceholder);
            inv.setItem(14, weaponPlaceholder);
            inv.setItem(21, weaponPlaceholder);
            inv.setItem(22, weaponPlaceholder);
            inv.setItem(23, weaponPlaceholder);
            inv.setItem(30, weaponPlaceholder);
            inv.setItem(31, weaponPlaceholder);
            inv.setItem(32, weaponPlaceholder);
            inv.setItem(46, abilityPlaceholder);
            inv.setItem(47, abilityPlaceholder);
            inv.setItem(48, abilityPlaceholder);
            inv.setItem(50, economyPlaceholder);
            inv.setItem(51, economyPlaceholder);
            inv.setItem(52, economyPlaceholder);
        }

        @EventHandler
        public void onInventoryClick ( final InventoryClickEvent e){
            if (e.getInventory() != inv) return;

            e.setCancelled(true);

            final ItemStack clickedItem = e.getCurrentItem();


            if (clickedItem == null || clickedItem.getType() == Material.AIR) return;

            final Player p = (Player) e.getWhoClicked();


            p.sendMessage("You clicked at slot " + e.getRawSlot());

            //Adds the clicked weapon to the InventoryManager map

        }


        @EventHandler
        public void onInventoryClick ( final InventoryDragEvent e){
            if (e.getInventory() == inv) {
                e.setCancelled(true);
            }
        }
    }

