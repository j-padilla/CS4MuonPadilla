/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_ex3;

/**
 *
 * @author babyj
 */
public class Album {
    private String playList;
    private int noOfSongs;
    private Song topPlayed;
    
    public Album(String playList, int noOfSongs) {
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

    public Song getTopPlayed() {
        return topPlayed;
    }

    public void setTopPlayed(Song topPlayed) {
        this.topPlayed = topPlayed;
    }

    public void setNoOfSongs(int noOfSongs) {
        this.noOfSongs = noOfSongs;
    }
}
