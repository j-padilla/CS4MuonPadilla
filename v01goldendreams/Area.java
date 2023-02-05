/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v01goldendreams;

/**
 *
 * @author Bree Sison
 */

import java.util.ArrayList;
public class Area {
    protected String areaName, areaProfile;
    protected ArrayList<Character> Characters;
    
    public Area(String n, String p){
        areaName = n;
        areaProfile = "\nName: " + areaName + "\nDescription: " + p;
        Characters = new ArrayList<>();
    }
    public String getName() {
        return areaName;
    }
    public String getProfile() {
        return areaProfile;
    }
}
