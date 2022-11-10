/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4project;

/**
 *
 * @author babyj
 */
public class Relations {
    private String partner;
    private boolean parent;
    private int merits;
    private double network;
    
    public Relations(String partner) {
        this.partner = partner;
        this.parent = true;
        this.merits = 100;
        this.network = 0;
    }

    public String getPartner() {
        return partner;
    }

    public boolean isParent() {
        return parent;
    }

    public void setParent(boolean parent) {
        this.parent = parent;
    }

    public int getMerits() {
        return merits;
    }

    public double getNetwork() {
        return network;
    }
    
    
}
