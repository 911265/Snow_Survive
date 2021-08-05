package com.gmail.kidjim4011.snow_survive;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() { getServer().getPluginManager().registerEvents(this, this); }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Temperaturedetect.getScore(event.getTo());
        Scoreboarddisplay.setBoard(player,
                Temperaturedetect.getTemp(),
                Temperaturedetect.getState(),
                Temperaturedetect.getSuggest());
        if (Integer.getInteger(Temperaturedetect.getTemp()) > 10) {Potion.applyEffect(player);}
    }
}