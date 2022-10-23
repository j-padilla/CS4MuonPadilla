/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_ex3;

/**
 *
 * @author babyj
 */
import java.util.Scanner;
public class Q1_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song s1 = new Song("Paradise");
        Song s2 = new Song("Easy"); 
        Song s3 = new Song("FOOLS");
        Song s4 = new Song("LIFE");
        
        Singer ra = new Singer("Rude-a");
        Singer ts = new Singer("Troye Sivan", s2);
        
        ra.performForAudience(12);
        ra.setFavoriteSong(s4);
        
        System.out.println(ra.getFavoriteSong().getTitle());
    }
}
