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
public class NPC extends Character implements Interact {
    public String npcDialogue;
    public boolean npcSide, isInteractable;
    public ArrayList<String> npcGdc = new ArrayList<>();
    public ArrayList<String> npcBdc = new ArrayList<>();
    public NPC(String n, String p, String s, String d, boolean i){
        super(n, p, s);
        npcDialogue = d;
        isInteractable = i;
    }
    public void vesselTalk(){
    }
    public void vesselBefriend(){
    }
    public void vesselBeloathe(){
    }
    @Override
    public void doActs() {
    }
    @Override
    public void interact() {
        System.out.println(charName + ": " + npcDialogue);
    }
}
