package me.swerk.leagueuhc.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
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
        itemMeta.addEnchant(Enchantment.DURABILITY, 3,true);
        itemMeta.setLore(Arrays.asList("Permet l'ajout / suppression des rôles."));
        item.setItemMeta(itemMeta);

        ItemStack item2 = new ItemStack(Material.WATCH, 1);
        ItemMeta item2Meta = item2.getItemMeta();
        item2Meta.setDisplayName(ChatColor.YELLOW + "Temps");
        item2Meta.setLore(Arrays.asList("Permet de définir le temps max de la partie."));
        item2Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        item2.setItemMeta(item2Meta);

        ItemStack flower = new ItemStack(Material.RED_ROSE,1);
        ItemMeta flowerMeta = flower.getItemMeta();
        flowerMeta.addEnchant(Enchantment.SILK_TOUCH,1,true);
        flowerMeta.setDisplayName(ChatColor.RED + "Autres options...");
        flowerMeta.setLore(Arrays.asList("Permet l'accèss à d'autres options du plugins"));
        flower.setItemMeta(flowerMeta);

        ItemStack start = new ItemStack(Material.GOLD_PICKAXE,1);
        ItemMeta startMeta = start.getItemMeta();
        startMeta.addEnchant(Enchantment.DIG_SPEED,5,true);
        startMeta.setDisplayName(ChatColor.GREEN + "Début de la partie");
        startMeta.setLore(Arrays.asList("Lancez la partie quand vous êtes prêt"));
        start.setItemMeta(startMeta);

        ItemStack grayGlassPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(byte)7);

        for(int i = 0; i < inventory.getSize(); i++){
            inventory.setItem(i,grayGlassPane);
        }

        inventory.setItem(1,item);
        inventory.setItem(3,item2);
        inventory.setItem(5,flower);
        inventory.setItem(7,start);
        p.openInventory(inventory);
        
        return false;
    }
}
