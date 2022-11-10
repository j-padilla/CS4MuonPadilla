/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4project;

/**
 *
 * @author babyj
 */
public class Species {
    private String charSpecies;
    private static int charStatus = 10;
    
    public Species(String charSpecies) {
        this.charSpecies = charSpecies;
    }    
    
    public void setCharStatus(int socPoints) {
        if(getCharSpecies().equalsIgnoreCase("Victor")) {
            this.charStatus = 8;
        }
        else if(getCharSpecies().equalsIgnoreCase("Faded")) {
            this.charStatus = 2;
        }
    }
    
    public String getCharSpecies() {
        return charSpecies;
    }

    public void setCharSpecies(String charSpecies) {
        this.charSpecies = charSpecies;
    }

    public static int getCharStatus() {
        return charStatus;
    }
}
