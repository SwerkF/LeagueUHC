package me.swerk.leagueuhc.listeners;

import com.sun.corba.se.spi.logging.CORBALogDomains;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class menuListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {

        if(e.getView().getTitle().equalsIgnoreCase("Configuration")) {

            if(e.getCurrentItem() == null){
                return;
            }

            if(e.getCurrentItem().getType() == Material.WATCH) {
                Player p = (Player) e.getWhoClicked();

                Inventory inventory = Bukkit.createInventory(p,27, ChatColor.YELLOW + "Temps : X minutes");
                ItemStack redWool1 = new ItemStack(Material.WOOL,1,(byte)14);
                ItemMeta redWool1Meta = redWool1.getItemMeta();
                redWool1Meta.setDisplayName(ChatColor.RED + "-10 Min");
                redWool1.setItemMeta(redWool1Meta);

                ItemStack redWool2 = new ItemStack(Material.WOOL,1,(byte)14);
                ItemMeta redWool2Meta = redWool2.getItemMeta();
                redWool2Meta.setDisplayName(ChatColor.RED + "-5 Min");
                redWool1.setItemMeta(redWool2Meta);

                ItemStack redWool3 = new ItemStack(Material.WOOL,1,(byte)14);
                ItemMeta redWool3Meta = redWool2.getItemMeta();
                redWool3Meta.setDisplayName(ChatColor.RED + "-1 Min");
                redWool1.setItemMeta(redWool3Meta);

                ItemStack greenWool1 = new ItemStack(Material.WOOL,1, (byte)5);
                ItemMeta greenWool1Meta = greenWool1.getItemMeta();
                greenWool1Meta.setDisplayName(ChatColor.GREEN + "+10 Min");
                greenWool1.setItemMeta(greenWool1Meta);

                ItemStack greenWool2 = new ItemStack(Material.WOOL,1,(byte)5);
                ItemMeta greenWool2Meta = redWool2.getItemMeta();
                greenWool2Meta.setDisplayName(ChatColor.GREEN + "+5 Min");
                greenWool2.setItemMeta(greenWool2Meta);

                ItemStack greenWool3 = new ItemStack(Material.WOOL,1,(byte)5);
                ItemMeta greenWoolMeta = greenWool3.getItemMeta();
                greenWoolMeta.setDisplayName(ChatColor.GREEN + "+1 Min");
                greenWool3.setItemMeta(greenWoolMeta);

                ItemStack grayGlassPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(byte)7);

                for(int i = 0; i < inventory.getSize(); i++){
                    inventory.setItem(i,grayGlassPane);
                }
                inventory.setItem(10,redWool1);
                inventory.setItem(11,redWool2);
                inventory.setItem(12,redWool3);
                inventory.setItem(14,greenWool3);
                inventory.setItem(15,greenWool2);
                inventory.setItem(16,greenWool1);

                p.openInventory(inventory);

            }
            e.setCancelled(true);
        }


    }
}
