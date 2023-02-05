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
public class Landmark extends Region {
    public String ldmkReg;
    public NPC ldmkRboss; //ask
    public ArrayList<NPC> ldmkRands;
    public int ldmkLvU;
    public Landmark(String n, String p, Area a, Region r, NPC b, int LvU){
        super(n, p, a, b, LvU);
        ldmkReg = r.areaName;
        ldmkRboss = b;
        ldmkLvU = LvU;
        ldmkRands = new ArrayList<>();
    }
}
