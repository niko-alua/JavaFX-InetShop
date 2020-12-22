package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class AdminController {

    private static AdminInfo adminInfo = new AdminInfo("adminyes", "qwerty");

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField fieldLog;

    @FXML
    private Button butSignInAd;

    @FXML
    private PasswordField fieldPass;

    @FXML
    private Label labelWrong;

    @FXML
    void initialize() {
        labelWrong.setVisible(false);
        butSignInAd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (fieldLog.getText().equals(adminInfo.getLogin()) && fieldPass.getText().equals(adminInfo.getPassword())){
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("adminGUI.fxml"));
                        Parent root1 = fxmlLoader.load();
                        Stage stage1 = new Stage();
                        stage1.setScene(new Scene(root1, 700, 400));
                        stage1.show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else {
                    labelWrong.setVisible(true);
                }
            }
        });
    }
}
