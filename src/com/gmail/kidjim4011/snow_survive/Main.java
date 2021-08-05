package com.gmail.kidjim4011.snow_survive;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() { getServer().getPluginManager().registerEvents(this, this); }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Temperaturedetect.getScore(event.getTo());
        Scoreboarddisplay.setBoard(event.getPlayer(),
                Temperaturedetect.getTemp(),
                Temperaturedetect.getState(),
                Temperaturedetect.getSuggest());
        if (Integer.getInteger(Temperaturedetect.getTemp()) > 10) {}
    }
}