/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4project;

/**
 *
 * @author babyj
 */
public class Prefer {
    private String charPrefer;
    private boolean known;
    private Relations partner;
    
    public Prefer(String history) {
        this.charPrefer = history;
        this.partner = null;
        this.known = false;    
    }

    /**
     * @return the charPrefer
     */
    public String getCharPrefer() {
        return charPrefer;
    }

    /**
     * @param charPrefer the charPrefer to set
     */
    public void setCharPrefer(String charPrefer) {
        this.charPrefer = charPrefer;
    }
}
