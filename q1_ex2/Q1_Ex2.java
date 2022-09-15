/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_ex2;

/**
 *
 * @author MUON
 */
import java.util.Scanner;
public class Q1_Ex2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int random = (int) Math.floor(Math.random()*10) + 1;
        int turns = 3;        

        String start = "";
        int guess = 0;
        int lLim = 5;
        int hLim = 10;
                
        do {
          System.out.print("Welcome to Higher or Lower! What will you do?\n" 
                  + "-Start game\n" 
                  + "-Change settings\n" 
                  + "-End application\n");
          start = sc.nextLine();
          
          if(start.equalsIgnoreCase("start game")) {
              do {
                System.out.printf("You have %d guess(es) left. What is your guess? ", turns);
                guess = sc.nextInt();
              }while(turns != 0);
          }
          else if(start.equalsIgnoreCase("change settings")) {
              System.out.println("What is the lower limit of the random number?");
              lLim = sc.nextInt();
              System.out.println("What is the upper limit of the random number?");
              hLim = sc.nextInt();
              System.out.println("How many guesses are allowed?");
              turns = sc.nextInt();
          }
        }
        while(!start.equalsIgnoreCase("end application")); 
    }
}
