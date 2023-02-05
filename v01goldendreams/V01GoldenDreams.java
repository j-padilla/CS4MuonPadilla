/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v01goldendreams;

/**
 *
 * @author Bree Sison
 */

import java.util.Scanner;
public class V01GoldenDreams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Vessel player = new Vessel("Jeremias", "[emotion]", "Human");
        System.out.println(player.charProfile);
        
        NPC tovitcj = new NPC("Tovitcj", "[emotion]", "Human", "[his thoughts r full of soup]", true);
        System.out.println(tovitcj.charProfile);
        tovitcj.interact();
        
        NPC nightWatcher = new NPC("The Night Watcher", "[emotion]", "Monster", "Oh, for a child to set foot in these shadowy woods. What a grave mistake they have made.", true);
        System.out.println(nightWatcher.charProfile);
        nightWatcher.interact();
        
        NPC guy = new NPC("Some Guy?", "[emotion]", "Human", "I need to check on- ... oh, there you are. Hi "+player.charName+"!", true);
        System.out.println(guy.charProfile);
        guy.interact();
        
        Area woodlands = new Area("Woodlands", "[description of an area filled with forests]");
        System.out.println(woodlands.areaProfile);
        
        Region twistingWoods = new Region("The Twisting Woods", "[description of a forest with tall trees and looming shadows]", woodlands, nightWatcher, 3);
        System.out.println(twistingWoods.areaProfile);
        
        Landmark stoneCircle = new Landmark("Mysterious Stone Circle", "[description of a weathered stone circle in the middle of the woods]", woodlands, twistingWoods, nightWatcher, 3);
        System.out.println(stoneCircle.areaProfile);
        
        //if a host is a boss, keep nightWatcher. if a host is just an npc u spend the dream with, change to guy.
        Area woods = new Dream("Some Woods?", "[description of a calm looking forest. the leaves r all orange implying the season of autumn. your favorite spot to hang out with... \"Some Guy\"? you dont remember much about it.]", woodlands, nightWatcher, 3);
        System.out.println(woods.areaProfile);
    }
}
