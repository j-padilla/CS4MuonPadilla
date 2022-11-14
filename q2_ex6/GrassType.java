/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2_ex6;

/**
 *
 * @author babyj
 */
public class GrassType extends Monster{
    public GrassType(String n, int m, int base) {
        super(n, "grass", "water", "fire", m, base);
        this.hp = maxHP;
        this.guard = true;
    }
    
    public void special(Monster m){
        System.out.println(name + " did a pose.");        
        this.hp += hp * 0.2;
    } 
    
    public void setHP(int m){
        this.maxHP = m;
    }
}
