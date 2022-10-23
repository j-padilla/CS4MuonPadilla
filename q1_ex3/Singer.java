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
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;

    public Singer(String name) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = null; 
    }
        
    public Singer(String name, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = favoriteSong;    
    }
    
    public String getName() {
        return name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int fans) {
        noOfPerformances++;
        earnings =+ fans*100;
        System.out.printf("The artist %s performed for an audience of %d people, increasing their net worth to %.2f.%n", name, fans, earnings);
    }
}
