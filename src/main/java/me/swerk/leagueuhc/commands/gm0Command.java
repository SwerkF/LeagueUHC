package me.swerk.leagueuhc.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gm0Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player p = (Player) sender;
            if(p.hasPermission("leagueuhc.gm0")) {
                if(p.getGameMode() == GameMode.SURVIVAL) {
                    p.sendMessage(ChatColor.RED + "Vous êtes déjà en survie.");
                } else {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage(ChatColor.GREEN + "Passage en mode" + ChatColor.BOLD + " SURVIE.");
                }
            } else {
                p.sendMessage(ChatColor.RED + "Tu n'as pas la permission (leagueuhc.gm0) afin d'effectuer la commande.");
            }

        }


        return true;
    }
}
