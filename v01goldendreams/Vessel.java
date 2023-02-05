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
public class Vessel extends Character implements Interact {
    private int vesselLvl;
    public int vesselGdp;
    public int vesselBdp;
    private ArrayList<String> vesselItems;
    public Vessel(String n, String p, String s){
        super(n, p, s);
        vesselItems = new ArrayList<>();
        vesselLvl = 0;
        vesselGdp = 0;
        vesselBdp = 0;
    }
    public void setName(String n){
        charName = n;
    }
    public void setPrefer(String p){
        charName = p;
    }
    public void setSpecies(String s){
        charName = s;
    }
    @Override
    public void doActs(){
    }
    @Override
    public void interact() {
    }
}