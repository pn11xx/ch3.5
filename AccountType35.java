import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;



public class AccountType35 extends Application{

	public enum Role{
		SelectRole, Administrator, Faculty, Student, Staff, Guest
	}

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Account Type");
        primaryStage.setHeight(100);
        primaryStage.setWidth(300);

        ComboBox <Role> combobox = new ComboBox<>();
        combobox.getItems().addAll(Role.SelectRole, Role.Administrator, Role.Faculty, Role.Staff, Role.Student, Role.Guest);
	combobox.setValue(Role.SelectRole);
	Label label = new Label("Please select your role!");
        FlowPane pane = new FlowPane();
        combobox.setOnAction(e->label.setText("Welcome " + combobox.getValue() + "!"));
        pane.getChildren().add(label);
        pane.getChildren().add(combobox);
        Scene scene1 = new Scene(pane);
        primaryStage.setScene(scene1);//This put the scene inside the stage
        primaryStage.show();

    }

}


