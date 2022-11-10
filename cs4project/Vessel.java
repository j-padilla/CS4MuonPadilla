/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4project;

/**
 *
 * @author babyj
 */
public class Vessel {
    private String charName;
    private Prefer charPrefer;
    private Species charSpecies;
     
    
    public Vessel(String charName) {
        this.charName = charName;
        this.charSpecies = null;
        this.charPrefer = null;
    }
    
    public Vessel(String charName, Prefer charPrefer, Species charSpecies) {
        this.charName = charName;
        this.charSpecies = charSpecies;
        this.charPrefer = charPrefer;
    }
    
    /**
     * @param charSpecies the charSpecies to set
     */
    public void setCharSpecies(Species charSpecies) {
        this.charSpecies = charSpecies;
    }

    /**
     * @return the charName
     */
    public String getCharName() {
        return charName;
    }

    /**
     * @param charName the charName to set
     */
    public void setCharName(String charName) {
        this.charName = charName;
    }

    /**
     * @return the charPrefer
     */
    public Prefer getCharPrefer() {
        return charPrefer;
    }

    /**
     * @param charPrefer the charPrefer to set
     */
    public void setCharPrefer(Prefer charPrefer) {
        this.charPrefer = charPrefer;
    }

    /**
     * @return the charSpecies
     */
    public Species getCharSpecies() {
        return charSpecies;
    }
}
