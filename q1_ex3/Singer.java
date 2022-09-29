/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_ex3;

/**
 *
 * @author babyj
 */
public class Singer {
    String name, favoriteSong;
    int noOfPerformances, fans;
    double earnings;
    boolean perform = false;
    String concert = "";
    
    public Singer(String n) {
        this.name = n;
        favoriteSong = "";
        noOfPerformances = 0;
        earnings = 0;
        fans = 12;
    }
    
    public void performance() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Will the singer have a concert? [y/n]");
            concert = sc.nextLine();
            if(concert.equalsIgnoreCase("y")) {
               noOfPerformances =+ 1;
               earnings = 100 * fans;
               System.out.printf("12 people attended this concert. \nCurrent Earnings: %d \nCurrent Number of Performances: %d", earnings, noOfPerformances);
            }
            else {
                break;
            }
        }
        while(perform == true);
}
