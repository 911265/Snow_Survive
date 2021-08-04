package com.gmail.kidjim4011.snow_survive;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class Scoreboarddisplay {

    public static void setBoard(Player player, String temp, String statement, String suggest) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard statementboard = manager.getNewScoreboard();
        Objective state = statementboard.registerNewObjective("Player_statement", "dummy",
                ChatColor.translateAlternateColorCodes('＆', "＆b＆n玩家狀態"));
        state.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score playertemp = state.getScore(ChatColor.translateAlternateColorCodes('＆', "＆e＆l玩家溫度:＆c" + temp));
        playertemp.setScore(3);
        Score playerstatement = state.getScore(ChatColor.translateAlternateColorCodes('＆', "＆e＆l玩家狀態:＆c" + statement));
        playerstatement.setScore(2);
        Score playersuggest = state.getScore(ChatColor.translateAlternateColorCodes('＆', "＆e＆l系統建議:＆c" + suggest));
        playersuggest.setScore(1);
        player.setScoreboard(statementboard);
    }
}