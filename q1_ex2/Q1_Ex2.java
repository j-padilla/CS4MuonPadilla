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
        
        String trueStart = "start game";
        String theSettings = "change settings";
        String endApplication = "end application";
        int guess = 0;
        int turns = 3;
        boolean guesses = true;
        
        System.out.print("Welcome to Higher or Lower! What will you do? \n-Start Game \n-Change Settings \n-End Application \n");
        String start = sc.nextLine();
        
        int randNum = sc.nextInt();
        
        if(start.equalsIgnoreCase(trueStart)) System.out.printf("%nYou have %d guess(es) left. What is your guess? %d",turns, guess);
        else if(start.equalsIgnoreCase(theSettings)) System.out.println("\nWhat is the lower limit of number? \nWhat is the higher limit of the number? \nHow many guesses are allowed?");
        else if(start.equalsIgnoreCase(endApplication)) System.out.println("Thank you for playing!");
        
        while(turns != 0)
        
        if(randNum == (random)) System.out.println("\nYou got it! \nPlay Again (y/n)? ");        
    }
    
}
