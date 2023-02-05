/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v01goldendreams;

/**
 *
 * @author Bree Sison
 */
public abstract class Character {
    protected String charName, charPrefer, charSpecies, charProfile;
    
    public Character(String n, String p, String s){
        charName = n;
        charPrefer = p;
        charSpecies = s;
        charProfile = "\nName: " + charName + "\nPrefer: " + charPrefer + "\nSpecies: " + charSpecies;
    }
    public String getName() {
        return charName;
    }
    public String getPrefer() {
        return charPrefer;
    }
    public String getSpecies() {
        return charSpecies;
    }
    public String getProfile() {
        return charProfile;
    }
    public abstract void doActs();
}
