/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_ex3;

/**
 *
 * @author babyj
 */
public class Song {
    private String title, album;
    private int songNo, popularityFaved, timesPlayed;
    
    public Song(String title) {
        this.title = title;
        this.timesPlayed = 0;
        this.popularityFaved = 0;
    }
    
    public Song(String title, String album, int songNo) {
        this.title = title;
        this.album = album;
        this.songNo = songNo;
        this.timesPlayed = 0;
        this.popularityFaved = 0;
    }
    
    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public int getSongNo() {
        return songNo;
    }

    public int getPopularityFaved() {
        return popularityFaved;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }
    
    public void setSongNo(int songNo) {
        this.songNo = songNo;
    }   
    
    public void play() {
        timesPlayed ++;
    }
    
    public void favorite() {
        popularityFaved ++;
    }
}
