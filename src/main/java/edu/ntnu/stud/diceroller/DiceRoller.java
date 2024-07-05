package edu.ntnu.stud.diceroller;

import java.util.Random;

/**
 * The class that represents the dice roller.
 * @version 0.2
 * @since 0.1
 * @author kaamyashinde
 */
public class DiceRoller {
  private int diceNumber;
  private int throwAmount;
  private final Random rand = new Random();

  /**
   * Constructor for the dice roller.
   */
  public DiceRoller(){
    this.throwAmount = 0;
    this.diceNumber = 0;
  }

  /**
   * Method that generates a random number between 1 and 6 and sets the diceNumber
   */
  public void rollDice(){
    this.diceNumber = rand.nextInt(6) + 1;
    throwAmount++;
  }

  /**
   * Method that returns the dice number.
   * @return dice number
   * @throws Exception if the dice has not been thrown yet, an exception is thrown, asking using to throw the dice first.
   */
  public int getDiceNumber() throws Exception{
    if (getThrowAmount() == 0){
      throw new Exception("The dice has not been thrown yet.");
    }
    return diceNumber;
  }

  /**
   * Method that returns the amount of times the dice has been thrown.
   * @return the amount of times the dice has been thrown.
   */
  public int getThrowAmount(){
    return throwAmount;
  }
}
