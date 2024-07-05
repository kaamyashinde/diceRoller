module edu.ntnu.stud.diceroller {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;

  opens edu.ntnu.stud.diceroller to javafx.fxml;
  exports edu.ntnu.stud.diceroller;
}