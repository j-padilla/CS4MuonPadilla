/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_ex1;

/**
 *
 * @author MUON
 */
public class Q1_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int mt = 7;
      int jt = 4;
      int ty = mt + jt;
      boolean isMore = true;
      
      if(jt > mt) {
         isMore = true;
      }
      else {
         isMore = false;
      }
            
      //System.out.printf("Teacher 1 %n Name: %s %n Subject: ");
      System.out.println("Total years of teaching: " + ty);
      System.out.println("Joshua Tarcelo has more years of teaching: " + isMore);
      System.out.println("The teachers have the same subject: " );
      
    }
    
}
