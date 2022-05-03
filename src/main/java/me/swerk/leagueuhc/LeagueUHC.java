package me.swerk.leagueuhc;

import me.swerk.leagueuhc.commands.*;
import me.swerk.leagueuhc.listeners.JoinLeaveListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;



public final class LeagueUHC extends JavaPlugin implements Listener {

    private static LeagueUHC plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic

        plugin = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        System.out.println("Le plugin a démarré...");
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this );
        getCommand("feed").setExecutor(new feedCommand());
        getCommand("gm1").setExecutor(new gm1Command());
        getCommand("gm0").setExecutor(new gm0Command());
        getCommand("backpack").setExecutor(new backPackCommand());
        getCommand("repeat").setExecutor(new repeatCommand());
    }

    public static LeagueUHC getPlugin() {
        return plugin;
    }
}
