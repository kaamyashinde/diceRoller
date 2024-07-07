package edu.ntnu.stud.diceroller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The main application class that handles the starting of the javafx application.
 * @version 0.2
 * @since 0.1
 * @author kaamyashinde
 */
public class App extends Application {
  /**
   * Start method that is inherited from {@link Application}. It loads the javafx content from the fxml file
   * and displays the stage that is set.
   * @param stage the stage to set.
   * @throws IOException exception thrown if the fxml file is not found.
   */
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/edu/ntnu/stud/diceroller/fxml/app-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    stage.setTitle("Dice Roller");
    stage.setScene(scene);
    stage.show();
  }

  /**
   * Main method that launches the javafx application.
   * @param args the arguments passed to the main method.
   */
  public static void main(String[] args) {
    launch();
  }
}