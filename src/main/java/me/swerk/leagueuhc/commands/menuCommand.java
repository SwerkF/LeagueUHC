package me.swerk.leagueuhc.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class menuCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;
        Inventory inventory = Bukkit.createInventory(p,9,"Configuration");

        ItemStack item = new ItemStack(Material.WOOD_AXE,1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Rôles");
        itemMeta.setLore(Arrays.asList("Permet l'ajout/suppression des rôles"));
        item.setItemMeta(itemMeta);

        inventory.setItem(2,item);

        p.openInventory(inventory);
        
        return false;
    }
}
