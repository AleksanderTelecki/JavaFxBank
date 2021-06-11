package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.DBcontroller;
import utils.WindowController;

public class AdminLoginController {


    @FXML
    private Pane Pane_AdminLogIn;

    @FXML
    private Button Button_Submit;

    @FXML
    private Button Button_LogIn;

    @FXML
    private PasswordField TextBox_AdminKey;

    private WindowController starter = new WindowController();

    @FXML
    void LogIn(ActionEvent event) {
        starter.Show((Stage) Pane_AdminLogIn.getScene().getWindow(), WindowController.windowType.LogIn);
    }

    @FXML
    void SubmitLogIn(ActionEvent event) {
        if(DBcontroller.isAdminKey(TextBox_AdminKey.getText()))
        {
            starter.Show((Stage) Pane_AdminLogIn.getScene().getWindow(), WindowController.windowType.Admin,null);

        }
    }

}
