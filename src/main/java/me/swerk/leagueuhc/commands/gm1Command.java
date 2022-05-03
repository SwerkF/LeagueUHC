package me.swerk.leagueuhc.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gm1Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player p = (Player) sender;

            if(p.hasPermission("leagueuhc.gm1")) {
                if(p.getGameMode() == GameMode.CREATIVE) {
                    p.sendMessage(ChatColor.RED + "Vous êtes déjà en créatif.");
                } else {
                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage(ChatColor.GREEN + "Passage en mode" + ChatColor.BOLD + " CREATIF.");
                }
            } else {
                p.sendMessage(ChatColor.RED + "Tu n'as pas la permission (leagueuhc.gm1) afin d'effectuer la commande.");
            }

        }


        return true;
    }
}
