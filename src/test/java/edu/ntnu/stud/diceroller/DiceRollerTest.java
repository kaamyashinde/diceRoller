package edu.ntnu.stud.diceroller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollerTest {
  DiceRoller dice;
  @BeforeEach
  void setUp(){
    dice = new DiceRoller();

  }

  @Test
  void rollDice() {
    dice.rollDice();
    assertEquals(1, dice.getThrowAmount());
  }

  @Test
  void getDiceNumberNegative() {
    assertThrows(Exception.class, () -> dice.getDiceNumber());
  }

  @Test
  void getDiceNumberPositive() throws Exception {
    dice.rollDice();
    assertTrue(dice.getDiceNumber() != 0);
  }

}
