package edu.ntnu.stud.diceroller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * This class acts as the controller for the JavaFX application.
 * @version 0.1
 * @since 0.1
 * @author kaamyashinde
 */

public class Controller {
  @FXML
  private Label welcomeText;

  /**
   * Call to action method for the button that displays a welcome text.
   */
  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
  }
}