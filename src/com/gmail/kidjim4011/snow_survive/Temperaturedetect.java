package com.gmail.kidjim4011.snow_survive;

import org.bukkit.Location;

public class Temperaturedetect {

    private static float lightlevel;
    private static float temp;
    private static String state;
    private static String suggest;
    public static String getState() { return state; }
    public static String getSuggest() { return suggest; }
    public static String getTemp() { String tempe = String.valueOf(temp); return tempe; }

    public static void getScore(Location location) {

        Location bellowblock = new Location(location.getWorld(), location.getX(), location.getY() , location.getZ());
        temp = (float) (lightlevel * 0.25);
        if (bellowblock != null) { lightlevel = (float) (bellowblock.getBlock().getLightFromBlocks()*0.7 + bellowblock.getBlock().getLightFromSky()*0.3); }

        if (lightlevel == 0) {
            state = "偵測器已凍毀";
            suggest = "功能失常";
        } else if (lightlevel == 1) {
            state = "極..極度低溫";
            suggest = "盡..盡速撤離";
        } else if (lightlevel == 2 || lightlevel == 3 || lightlevel == 4) {
            state = "極度低溫";
            suggest = "盡速撤離";
        } else if (lightlevel == 5 || lightlevel == 6) {
            state = "溫度過低";
            suggest = "撤離現場";
        } else if (lightlevel == 7 || lightlevel == 8 || lightlevel == 9) {
            state = "溫度偏低";
            suggest = "撤離現場";
        } else if (lightlevel == 10 || lightlevel == 11) {
            state = "溫度正常";
            suggest = "無建議";
        } else if (lightlevel == 12 || lightlevel == 13 || lightlevel == 14 || lightlevel == 15) {
            state = "溫度舒適";
            suggest = "無建議";
        }
    }
}
