/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2_ex6;

/**
 *
 * @author babyj
 */
public class WaterType extends Monster {
    public WaterType(String n, int m, int base) {
        super(n, "water", "fire", "grass", m, base);
    }
    
    public void special(Monster m){
        System.out.println(name + " did a pose.");        
        this.hp += hp * 0.2;
    } 
}
