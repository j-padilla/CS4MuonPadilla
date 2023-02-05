/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v01goldendreams;

/**
 *
 * @author Bree Sison
 */

public class Dream extends Area {
    public String drmArea;
    public NPC drmHost;
    public int drmLvU;
    public Dream(String n, String p, Area a, NPC b, int LvU){
        super(n, p);
        drmArea = a.areaName;
        drmHost = b; //if a host is a boss, keep b. if a host is just an npc u spend the dream with, change to h.
        drmLvU = LvU;
    }
}
