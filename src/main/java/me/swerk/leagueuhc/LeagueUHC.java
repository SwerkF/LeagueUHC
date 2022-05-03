package me.swerk.leagueuhc;

import me.swerk.leagueuhc.commands.backPackCommand;
import me.swerk.leagueuhc.commands.feedCommand;
import me.swerk.leagueuhc.commands.gm0Command;
import me.swerk.leagueuhc.commands.gm1Command;
import me.swerk.leagueuhc.listeners.JoinLeaveListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class LeagueUHC extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Le plugin a démarré...");
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this );
        getCommand("feed").setExecutor(new feedCommand());
        getCommand("gm1").setExecutor(new gm1Command());
        getCommand("gm0").setExecutor(new gm0Command());
        getCommand("backpack").setExecutor(new backPackCommand());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return super.onCommand(sender, command, label, args);
    }

}
