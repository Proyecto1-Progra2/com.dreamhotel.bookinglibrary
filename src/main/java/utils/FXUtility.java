package utils;

import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Region;

import java.io.IOException;

public class FXUtility {

    public static Alert alert(String title, String header){
        Alert myalert = new Alert(Alert.AlertType.NONE);
        myalert.setAlertType(Alert.AlertType.ERROR);
        myalert.setTitle(title);
        myalert.setHeaderText(header);
        return myalert;
    }

}
