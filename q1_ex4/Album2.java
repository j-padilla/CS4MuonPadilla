/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_ex4;

/**
 *
 * @author babyj
 */
public class Album2 {
    private String playList;
    private int noOfSongs;
    private Song2 topPlayed;
    
    public Album2(String playList, int noOfSongs) {
        this.playList = playList;
        this.noOfSongs = noOfSongs;
        this.topPlayed = null;
    }

    public String getPlayList() {
        return playList;
    }

    public int getNoOfSongs() {
        return noOfSongs;
    }

    public Song2 getTopPlayed() {
        return topPlayed;
    }

    public void setTopPlayed(Song2 topPlayed) {
        this.topPlayed = topPlayed;
    }

    public void setNoOfSongs(int noOfSongs) {
        this.noOfSongs = noOfSongs;
    }
}
