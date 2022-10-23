/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_ex4;

/**
 *
 * @author babyj
 */
public class Singer2 {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song2 favoriteSong;
    private static int totalPerformances = 0;

    public Singer2(String name) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = null; 
    }
        
    public Singer2(String name, Song2 favoriteSong) {
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

    public Song2 getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(Song2 favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int fans) {
        noOfPerformances++;
        earnings =+ fans*100;
        System.out.printf("The artist %s performed for an audience of %d people, increasing their net worth to %.2f.%n", name, fans, earnings);
    }
    
    public void performForAudience(int fans, Singer2 collab) {
        double totalEarnings = 100*fans;
        this.earnings += totalEarnings/2;
        collab.earnings += totalEarnings/2;
        totalPerformances++;
        this.noOfPerformances++;
        collab.noOfPerformances++;
        System.out.printf("The artist %s collaborated with %s for an audience of %d people, increasing both net worths to %.2f.%n", this.name, collab.name, fans, totalEarnings/2);
    }
    
    public int gettotalPerformances() {
        return totalPerformances;
    }
}
