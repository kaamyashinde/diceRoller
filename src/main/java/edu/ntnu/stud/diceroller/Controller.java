package edu.ntnu.stud.diceroller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

/**
 * This class acts as the controller for the JavaFX application.
 * @version 0.2
 * @since 0.1
 * @author kaamyashinde
 */

public class Controller {
  @FXML
  private Label diceNumberLabel;
  @FXML
  private ImageView diceImageView;
  private final DiceRoller dice = new DiceRoller();
  private int numRolled;


  /**
   * Call to action method for the button that displays a welcome text.
   */
  @FXML
  protected void onRollDiceButtonClicked() {
    try{
    dice.rollDice();
    numRolled = dice.getDiceNumber();
    diceNumberLabel.setText(Integer.toString(numRolled));
      updateDiceImage();
    }
    catch (Exception e){
      System.getLogger(e.getMessage());
    }
  }

  /**
   * Method that updates the dice image based on the number rolled.
   * This is done by creating a new image object, setting it to a new image view, and then setting the FXML image view.
   */
  @FXML
  protected void updateDiceImage(){
    String diceImage = "/edu/ntnu/stud/diceroller/images/" + numRolled + ".png";
    Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(diceImage)));
    ImageView imageView = new ImageView(image);
    imageView.setFitHeight(100);
    imageView.setFitWidth(100);
    diceImageView.setImage(image);
  }
}