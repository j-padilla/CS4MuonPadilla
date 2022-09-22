/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_ex3;

/**
 *
 * @author babyj
 */
public class Singer {
    String name, favoriteSong;
    int noOfPerformances, audience;
    double earnings;
    boolean performForAudience;
    
    public Singer(String n) {
        this.name = n;
        favoriteSong = "";
        noOfPerformances = 0;
        earnings = 0;
        performForAudience = false;
        audience = 0;
    }
    
    public void performForAudience() {
        if(performForAudience == true) {
            noOfPerformances =+ 1;
            earnings = audience * 100;
        }
    }
    
    public void changeFavSong(String n) {
        this.favoriteSong = n;
    }
}
