/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v01goldendreams;

/**
 *
 * @author Bree Sison
 */

public class Region extends Area {
    public String regArea;
    public NPC regMboss;
    public NPC regRands;
    public int regLvU;
    public Region(String n, String p, Area a, NPC b, int LvU){
        super(n, p);
        regArea = a.areaName;
        regMboss = b;
        regLvU = LvU;
    }
}
