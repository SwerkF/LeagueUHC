package me.swerk.leagueuhc.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.swing.text.rtf.RTFEditorKit;

public class repeatCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;

            if(args.length == 0) {
                p.sendMessage(ChatColor.RED + "Veuillez saisir la phrase que vous voulez. Ex : /repeat Bonjour à vous !");
            } else {
                StringBuilder builder = new StringBuilder();

                for(int i = 0; i < args.length; i++) {
                    builder.append(args[i]);
                    builder.append(" ");
                }
                String finalMessage = builder.toString();
                p.sendMessage(finalMessage);
            }
        }

        return true;
    }
}
