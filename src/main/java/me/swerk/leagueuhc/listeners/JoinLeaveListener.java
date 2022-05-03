package me.swerk.leagueuhc.listeners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.RED + player.getName() + " a quitté le serveur.");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        if(player.hasPlayedBefore()) {
            player.sendMessage(ChatColor.BLUE + "Bienvenue à nouveau sur le serveur !");
        } else {
            e.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + player.getName() + " a rejoint le serveur.");
        }


    }
}
