/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4project;

/**
 *
 * @author babyj
 */
import java.util.Scanner;
public class CS4Project {

    /**
     * @param args the command line arguments
     * @return 
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getStacks = 0;
        
        
        Vessel v1 = new Vessel("Ehrsei");
        Vessel v2 = new Vessel("Vessel");
        
        Prefer e1 = new Prefer("Cold");
        Prefer e2 = new Prefer("Heat");
        
        Species h1 = new Species("Victor");
        Species h2 = new Species("Faded");
        
        
        v1.setCharPrefer(e1);
        v1.setCharSpecies(h1);
        
        System.out.print(v1.getCharPrefer());
        System.out.print(v1.getCharSpecies());
                
        
        int gamePlays = 1;
        while(gamePlays != 13) {
        gamePlays++;
        if(gamePlays == 6) {
            System.out.println("\nHm... 5 attempts. Interesting.");
        }
        else if(gamePlays == 9) {
            System.out.print("""
                             
                             8th attempt. Don't you have anything better to do?
                             I'm limiting you to 13.
                             This will benefit the both of us.
                             """);
        }
        else if(gamePlays == 13) {
            System.out.println("You have one last attempt.\n");
        }
        
        System.out.print("""
                         
                         Land of Gold 
                         Start Game? 
                         [y/n]: """);
        String startGame = sc.nextLine();
            if(startGame.equalsIgnoreCase("y")) {
            while(getStacks != 4) {  
                System.out.print("""
                               
                               Game Menu:
                               1.) New Character
                               2.) Continue Game
                               3.) Miscellaneous
                               4.) Return to Start
                               Your Choice [1,2,3,4]: """);
            getStacks = sc.nextInt();
            
            switch(getStacks) {
                case 1:
                    if(v2.getCharName().equalsIgnoreCase("Vessel")) {
                        System.out.println("\nLet us create a vessel.\n");
                        System.out.print("""
                                         Choose your History:
                                         [Victor] or [Faded]?
                                         """);
                        String historyChoice = sc.nextLine();
                            if(historyChoice.equalsIgnoreCase("Victor")) {
                                v2.setCharSpecies(h1);
                            }
                            else if(historyChoice.equalsIgnoreCase("Faded")) {
                                v2.setCharSpecies(h2);
                            }
                            else {
                                System.out.println("Is that something from a work of fiction?");
                            }
                        
                        System.out.print("""
                                         
                                         Choose your Emotion:
                                         [Cold] or [Heat]?
                                         """);
                        String emoteChoice = sc.nextLine();
                            if(emoteChoice.equalsIgnoreCase("Cold")) {
                                v2.setCharPrefer(e1);
                            }
                            else if(emoteChoice.equalsIgnoreCase("Heat")) {
                                v2.setCharPrefer(e2);
                            }
                            else {
                                System.out.println("I have my limitations.");
                            }
                            
                        System.out.print("""
                                         
                                         Finally, Choose your Self:
                                         [Nobody] or [input your Name]?
                                         """);
                        String nameChoice = sc.nextLine();
                        String yourName = nameChoice;
                            if(nameChoice.equalsIgnoreCase("Nobody")) {
                                v2.setCharName(yourName);
                            }
                            else {
                                v2.setCharName("[REDACTED]");
                            }
                     
                            break;
                    }
                    else {
                        System.out.println("I apologize. You are not Influence Level [ERROR], required to make another vessel.");
                    }
                    
                break;  

                case 2:
                    if(getStacks == 2) {
                        
                    }
                    else {
                        break;
                    }
                    
                case 3:
                    if(getStacks == 3) {
                        
                    }
                    else {
                        break;
                    }
                
                default:
                    System.out.println("Hm.");
            }                     
        }
            }
            
            else if(startGame.equalsIgnoreCase("n")) {
                System.out.println("Be my guest.");
                return;
            }
            else {
                System.out.println("Please don't make this harder for the both of us.");
            }
        } 
    }
}
