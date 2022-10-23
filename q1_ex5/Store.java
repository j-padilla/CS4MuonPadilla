/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_ex5;

/**
 *
 * @author MUON
 */
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    
    this.itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  
  public double getEarnings(){
    return earnings;
  }
  
  public void sellItem(int index){
    if(index >= 0 && index < itemList.size()) {
        Item foundItem = itemList.get(index);
        earnings += foundItem.getCost();
        System.out.printf("%n%s has been sold for %.2f.%n%n", foundItem.getName(), foundItem.getCost());
    }
    else {
        System.out.printf("%s does not sell that item.%n%n", this.name);
    }
  } 
  
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean found = false;
    for(Item i : itemList) {
        if(i.getName().equals(name)) {
            found = true;
            earnings += i.getCost();
            System.out.printf("%s was sold for %.2f.%n%n", i.getName(), i.getCost());
        }
    }
    if(!found) {
        System.out.printf("%s does not sell the item %s.%n%n", this.name, name);
    }
  }
  
  public void sellItem(Item i){
    if(itemList.contains(i)) {
        earnings += i.getCost();
        System.out.printf("%s was sold for %.2f.%n%n", i.getName(), i.getCost());
    }
    else {
        System.out.printf("%s does not sell the item %s.%n%n", this.name, i.getName());
    }
  }
  
  public void addItem(Item i){
    itemList.add(i);
  }
  
  public void filterType(String type){
    for(Item i : itemList) {
        if(i.getType().equalsIgnoreCase(type)) {
            System.out.println(i.getName());
        }
    }
  }
  
  public void filterCheap(double maxCost){
    for(Item i : itemList) {
        if(i.getCost() <= maxCost) {
            System.out.println(i.getName());
        }
    }
  }
  
  public void filterExpensive(double minCost){
    for(Item i : itemList) {
        if(i.getCost() >= minCost) {
            System.out.println(i.getName());
        }
    }
  }
  
  public static void printStats(){
    for(Store s : storeList) {
        System.out.printf("Store: %s %nEarnings: %.2f%n %n", s.name, s.earnings);
    }

  }
}
