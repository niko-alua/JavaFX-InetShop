package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import static sample.AdminGUICont.devices;
import static sample.AdminGUICont.wearings;

public class Controller {

    private static int count = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField fieldSearch;

    @FXML
    private Button butSignIn;

    @FXML
    private Button butBasket;

    @FXML
    private MenuButton menuDev;

    @FXML
    private MenuItem itemSmartPhone;

    @FXML
    private MenuItem itemComputer;

    @FXML
    private MenuItem itemLaptop;

    @FXML
    private MenuButton menuWear;

    @FXML
    private MenuItem itemTshirt;

    @FXML
    private MenuItem itemSneak;

    @FXML
    private AnchorPane paneArea;

    @FXML
    void initialize() {

        butSignIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("adminCont.fxml"));
                    Parent root1 = fxmlLoader.load();
                    Stage stage1 = new Stage();
                    stage1.setScene(new Scene(root1, 350, 286));
                    stage1.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        itemSmartPhone.setOnAction(event -> {
            String item = itemSmartPhone.getText();
            menuDev.setText(item);
            menuWear.setText("Wearings");
        });

        itemComputer.setOnAction(event -> {
            String item = itemComputer.getText();
            menuDev.setText(item);
            menuWear.setText("Wearings");
        });

        itemLaptop.setOnAction(event -> {
            String item = itemLaptop.getText();
            menuDev.setText(item);
            menuWear.setText("Wearings");
        });

        itemTshirt.setOnAction(event -> {
            String item = itemTshirt.getText();
            menuWear.setText(item);
            menuDev.setText("Devices");
        });

        itemSneak.setOnAction(event -> {
            String item = itemSneak.getText();
            menuWear.setText(item);
            menuDev.setText("Devices");
        });

        if(menuDev.getText().equals("Smart Phone")){
            for (Device device : devices) {
                if (device instanceof SmartPhone) {
                    count++;
                    if (count > 0) {
                        String det = device.showDetails();
                        paneArea.getChildren().add(new RadioButton(det));
                        //System.out.println((i + 1) + ". " + det);
                    }
                }
            }
        }
    }
}