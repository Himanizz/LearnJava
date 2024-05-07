package a03242022;
import java.util.*;
class Main {
	public static void main(String[] args) { 
    // Dice stuff 
    Random rand = new Random(); 
    Dice dice = new Dice(rand, 6, 2); 
    // Roll until we get doubles on our set of 2 dice 
    while (!dice.allTheSame()) { 
      System.out.println("Dice roll: " + dice.roll());       
    } 
    System.out.println("Yay! Doubles! I get out of jail!"); 
    // locationTesting(); 

  }
}