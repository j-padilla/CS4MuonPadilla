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
        
        Album p1 = new Album("KUMI", 43);
        Album p2 = new Album("Ten2", 12);
        Album p3 = new Album("Rnds", 24);
        
        ra.performForAudience(12);
        ra.setFavoriteSong(s4);
        
        p2.setTopPlayed(s2);
        p1.setNoOfSongs(43);
                
        System.out.println(ra.getFavoriteSong().getTitle());
        System.out.println(p2.getTopPlayed().getTitle());
        System.out.println(p1.getNoOfSongs());
    }
}
