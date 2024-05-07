package a03242022;

import java.util.*;
/** 
* Holds a set of dice 
*/ 
class Dice { 
  // Fields 
  // Random object for all random number generation 
  private Random rand; 
  // Number of sides 
  private int numSides;
  // Number of dice 
  private int numDice; 
  // Whether most recent roll had all dice the same 
  private boolean allSame; 
  // Constructor(s) 
  /** 
  * constructs a new set of dice, with the given parameters 
  * @param rand needed for random number generation 
  * @param numSides number of sides on each die 
  * @param numDice number of dice in set 
  */ 
  public Dice(Random rand, int numSides, int numDice) { 
    this.rand = rand; 
    this.numSides = numSides; 
    this.numDice = numDice; 
    this.allSame = false; 
  } 
  // Methods 
  // Roll Dice - rolls all this object's dice, and returns total 
  public int roll() { 
    // loop - roll the number of dice I have, totaling them 
    // TODO: notice whether they're all the same or not 
    this.allSame = true; // assume true, notice when false 
    int previousDieRoll = 0; // an impossible roll to get 
    int total = 0; 
    for (int i = 0; i < this.numDice; i++) { 
      int roll = this.rollDie(); 
      // if roll is different from previous set allSame = false 
      // logic is different for first roll though. 
      if (roll != previousDieRoll && previousDieRoll != 0) { 
        allSame = false; 
      } 
      previousDieRoll = roll; 
      total += roll; 
    } 
    return total; 
  } 
  // helper method - rolls a single die 
  private int rollDie() { 
    return 1 + this.rand.nextInt(this.numSides); 
  }
  // All The Same - returns true if all dice showed the same value 
  // in the previous roll 
  public boolean allTheSame() { 
    return this.allSame; 
  } 
} 