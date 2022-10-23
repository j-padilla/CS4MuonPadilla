/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_ex4;

/**
 *
 * @author babyj
 */
public class Q1_Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song2 s1 = new Song2("Paradise");
        Song2 s2 = new Song2("Easy"); 
        Song2 s3 = new Song2("FOOLS");
        Song2 s4 = new Song2("LIFE");
        
        Singer2 ra = new Singer2("Rude-a");
        Singer2 ts = new Singer2("Troye Sivan", s2);
        
        Album2 p1 = new Album2("KUMI", 43);
        Album2 p2 = new Album2("Ten2", 12);
        Album2 p3 = new Album2("Rnds", 24);
        
        ra.performForAudience(12);
        ra.setFavoriteSong(s4);
        
        p2.setTopPlayed(s2);
        p1.setNoOfSongs(43);
                
        System.out.println(ra.getFavoriteSong().getTitle());
        System.out.println(p2.getTopPlayed().getTitle());
        System.out.println(p1.getNoOfSongs());
        
        ts.performForAudience(12, ra);
        System.out.println(ts.getNoOfPerformances());
        System.out.println(ra.getNoOfPerformances());
    }
}
