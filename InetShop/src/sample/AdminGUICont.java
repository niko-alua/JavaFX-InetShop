package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdminGUICont {

    static ArrayList<Device> devices = new ArrayList<>();
    static ArrayList<Wearing>wearings = new ArrayList<>();
    private static ObservableList<String> devSmPhlist = FXCollections.observableArrayList();
    private static ObservableList<String> devComplist = FXCollections.observableArrayList();
    private static ObservableList<String> devLaptoplist = FXCollections.observableArrayList();
    private static ObservableList<String> wearList = FXCollections.observableArrayList();

    private String model;
    private double price;
    private int count;
    private String cpu;
    private int ram;
    private double mgpx;
    private String generation;
    private boolean ssd = false;
    private int memory;
    private double weight;
    private boolean touch;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneSmPh;

    @FXML
    private MenuButton butModel;

    @FXML
    private MenuItem butSamsung;

    @FXML
    private MenuItem butApple;

    @FXML
    private MenuItem butHuawei;

    @FXML
    private MenuItem butXiaomi;

    @FXML
    private TextField fieldPrice;

    @FXML
    private TextField fieldCount;

    @FXML
    private MenuButton butCpu;

    @FXML
    private MenuItem but600;

    @FXML
    private MenuItem but700;

    @FXML
    private MenuItem but800;

    @FXML
    private TextField fieldRam;

    @FXML
    private TextField fieldMgpx;

    @FXML
    private MenuButton butGener;

    @FXML
    private MenuItem but2G;

    @FXML
    private MenuItem but3G;

    @FXML
    private MenuItem but4G;

    @FXML
    private MenuItem but5G;

    @FXML
    private Button butAdding;

    @FXML
    private AnchorPane paneComp;

    @FXML
    private MenuButton butModelComp;

    @FXML
    private MenuItem butAcer;

    @FXML
    private MenuItem butHP;

    @FXML
    private MenuItem butLenovo;

    @FXML
    private MenuItem butNeo;

    @FXML
    private TextField fieldPriceComp;

    @FXML
    private TextField fieldCountComp;

    @FXML
    private MenuButton butCpuComp;

    @FXML
    private MenuItem butCore3;

    @FXML
    private MenuItem butCore5;

    @FXML
    private MenuItem butCore7;

    @FXML
    private MenuItem butCore9;

    @FXML
    private TextField fieldRamComp;

    @FXML
    private Button butAddingComp;

    @FXML
    private ToggleButton butSsdYes;

    @FXML
    private ToggleButton butSsdNo;

    @FXML
    private TextField fieldMemory;

    @FXML
    private AnchorPane paneLaptop;

    @FXML
    private MenuButton butModelLaptop;

    @FXML
    private MenuItem butAcerLaptop;

    @FXML
    private MenuItem butAsus;

    @FXML
    private MenuItem butLenovoLaptop;

    @FXML
    private MenuItem butAppleLaptop;

    @FXML
    private TextField fieldPriceLaptop;

    @FXML
    private TextField fieldCountLaptop;

    @FXML
    private MenuButton butCpuLaptop;

    @FXML
    private MenuItem butCore3Laptop;

    @FXML
    private MenuItem butCore5Laptop;

    @FXML
    private MenuItem butCore7Laptop;

    @FXML
    private MenuItem butCore9Laptop;

    @FXML
    private TextField fieldRamLaptop;

    @FXML
    private Button butAddingLaptop;

    @FXML
    private ToggleButton butSsdYesLaptop;

    @FXML
    private ToggleButton butSsdNoLaptop;

    @FXML
    private TextField fieldMemoryLaptop;

    @FXML
    private TextField fieldWeight;

    @FXML
    private ToggleButton butTouchYes;

    @FXML
    private ToggleButton butTouchNo;

    @FXML
    private AnchorPane paneDel;

    @FXML
    private ListView<String> viewDelSmPh;

    @FXML
    private ListView<String> viewDelComp;

    @FXML
    private ListView<String> viewDelLaptop;

    @FXML
    private ListView<String> viewDelWearing;

    @FXML
    private Button butDel;

    @FXML
    private Button allDevDelButton;

    @FXML
    private Button allWearingDelButton;

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
    private Button butSignOut;

    @FXML
    private Button butAddGood;

    @FXML
    private Button butDelGood;

    @FXML
    private Button butAddAmount;

    @FXML
    private AnchorPane paneAddAmount;

    @FXML
    private Button allDevAmountButton;

    @FXML
    private Button allWearingAmountButton;

    @FXML
    private ListView<String> viewAmountSmPh;

    @FXML
    private ListView<String> viewAmountComp;

    @FXML
    private ListView<String> viewAmountLaptop;

    @FXML
    private ListView<String> viewAmountWearing;

    @FXML
    private TextField addNumber;

    @FXML
    private Button butAddingAmount;

    @FXML
    private Button butIncome;

    @FXML
    void initialize() {
        paneSmPh.setVisible(false);
        paneComp.setVisible(false);
        paneLaptop.setVisible(false);
        paneDel.setVisible(false);
        viewDelSmPh.setVisible(false);
        viewDelComp.setVisible(false);
        viewDelLaptop.setVisible(false);
        viewDelWearing.setVisible(false);
        paneAddAmount.setVisible(false);
        viewAmountSmPh.setVisible(false);
        viewAmountComp.setVisible(false);
        viewAmountLaptop.setVisible(false);
        viewAmountWearing.setVisible(false);
        ToggleGroup group = new ToggleGroup();
        ToggleGroup group1 = new ToggleGroup();
        ToggleGroup group2 = new ToggleGroup();

        butSignOut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
                    Parent root1 = fxmlLoader.load();
                    Stage stage1 = new Stage();
                    stage1.setScene(new Scene(root1, 700, 400));
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
            paneComp.setVisible(false);
            paneLaptop.setVisible(false);
        });

        itemComputer.setOnAction(event -> {
            String item = itemComputer.getText();
            menuDev.setText(item);
            menuWear.setText("Wearings");
            paneSmPh.setVisible(false);
            paneLaptop.setVisible(false);
        });

        itemLaptop.setOnAction(event -> {
            String item = itemLaptop.getText();
            menuDev.setText(item);
            menuWear.setText("Wearings");
            paneSmPh.setVisible(false);
            paneComp.setVisible(false);
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

        butAddGood.setOnAction(event -> {
            switch (menuDev.getText()) {
                case "Smart Phone":
                    paneSmPh.setVisible(true);
                    paneComp.setVisible(false);
                    paneLaptop.setVisible(false);
                    paneDel.setVisible(false);
                    paneAddAmount.setVisible(false);
                    break;
                case "Computer":
                    paneComp.setVisible(true);
                    paneSmPh.setVisible(false);
                    paneLaptop.setVisible(false);
                    paneDel.setVisible(false);
                    paneAddAmount.setVisible(false);
                    break;
                case "Laptop":
                    paneLaptop.setVisible(true);
                    paneComp.setVisible(false);
                    paneSmPh.setVisible(false);
                    paneDel.setVisible(false);
                    paneAddAmount.setVisible(false);
                    break;
            }
            switch (menuWear.getText()) {
                case "T-Shirt":
                case "Sneakers":
                    paneSmPh.setVisible(false);
                    paneComp.setVisible(false);
                    paneLaptop.setVisible(false);
                    break;
            }
            butSamsung.setOnAction(event1 -> {
                String item = butSamsung.getText();
                butModel.setText(item);
            });
            butApple.setOnAction(event1 -> {
                String item = butApple.getText();
                butModel.setText(item);
            });
            butHuawei.setOnAction(event1 -> {
                String item = butHuawei.getText();
                butModel.setText(item);
            });
            butXiaomi.setOnAction(event1 -> {
                String item = butXiaomi.getText();
                butModel.setText(item);
            });
            but600.setOnAction(event1 -> {
                String item = but600.getText();
                butCpu.setText(item);
            });
            but700.setOnAction(event1 -> {
                String item = but700.getText();
                butCpu.setText(item);
            });
            but800.setOnAction(event1 -> {
                String item = but800.getText();
                butCpu.setText(item);
            });
            but2G.setOnAction(event1 -> {
                String item = but2G.getText();
                butGener.setText(item);
            });
            but3G.setOnAction(event1 -> {
                String item = but3G.getText();
                butGener.setText(item);
            });
            but4G.setOnAction(event1 -> {
                String item = but4G.getText();
                butGener.setText(item);
            });
            but5G.setOnAction(event1 -> {
                String item = but5G.getText();
                butGener.setText(item);
            });
            butAcer.setOnAction(event1 -> {
                String item = butAcer.getText();
                butModelComp.setText(item);
            });
            butHP.setOnAction(event1 -> {
                String item = butHP.getText();
                butModelComp.setText(item);
            });
            butLenovo.setOnAction(event1 -> {
                String item = butLenovo.getText();
                butModelComp.setText(item);
            });
            butNeo.setOnAction(event1 -> {
                String item = butNeo.getText();
                butModelComp.setText(item);
            });
            butCore3.setOnAction(event1 -> {
                String item = butCore3.getText();
                butCpuComp.setText(item);
            });
            butCore5.setOnAction(event1 -> {
                String item = butCore5.getText();
                butCpuComp.setText(item);
            });
            butCore7.setOnAction(event1 -> {
                String item = butCore7.getText();
                butCpuComp.setText(item);
            });
            butCore9.setOnAction(event1 -> {
                String item = butCore9.getText();
                butCpuComp.setText(item);
            });
            butSsdYes.setToggleGroup(group);
            butSsdNo.setToggleGroup(group);
            butSsdYes.setUserData("Yes");
            butSsdNo.setUserData("No");
            butSsdYes.setSelected(true);
            butAcerLaptop.setOnAction(event1 -> {
                String item = butAcerLaptop.getText();
                butModelLaptop.setText(item);
            });
            butAsus.setOnAction(event1 -> {
                String item = butAsus.getText();
                butModelLaptop.setText(item);
            });
            butLenovoLaptop.setOnAction(event1 -> {
                String item = butLenovoLaptop.getText();
                butModelLaptop.setText(item);
            });
            butAppleLaptop.setOnAction(event1 -> {
                String item = butAppleLaptop.getText();
                butModelLaptop.setText(item);
            });
            butCore3Laptop.setOnAction(event1 -> {
                String item = butCore3Laptop.getText();
                butCpuLaptop.setText(item);
            });
            butCore5Laptop.setOnAction(event1 -> {
                String item = butCore5Laptop.getText();
                butCpuLaptop.setText(item);
            });
            butCore7Laptop.setOnAction(event1 -> {
                String item = butCore7Laptop.getText();
                butCpuLaptop.setText(item);
            });
            butCore9Laptop.setOnAction(event1 -> {
                String item = butCore9Laptop.getText();
                butCpuLaptop.setText(item);
            });
            butSsdYesLaptop.setToggleGroup(group2);
            butSsdNoLaptop.setToggleGroup(group2);
            butSsdYesLaptop.setUserData("Yes");
            butSsdNoLaptop.setUserData("No");
            butSsdYesLaptop.setSelected(true);
            butTouchYes.setToggleGroup(group1);
            butTouchNo.setToggleGroup(group1);
            butTouchYes.setUserData("Yes");
            butTouchNo.setUserData("No");
            butTouchYes.setSelected(true);
        });

        butAdding.setOnAction(event -> {
            model = butModel.getText();
            price = Double.parseDouble(fieldPrice.getText());
            count = Integer.parseInt(fieldCount.getText());
            cpu = butCpu.getText();
            ram = Integer.parseInt(fieldRam.getText());
            mgpx = Double.parseDouble(fieldMgpx.getText());
            generation = butGener.getText();
            devices.add(new SmartPhone(model, price, count, cpu, ram, mgpx, generation));
            //devList = FXCollections.observableArrayList(new SmartPhone(model, price, count, cpu, ram, mgpx, generation).showDetails());
            for (Device device : devices) {
                System.out.println(device.showDetails());
            }
            butModel.setText("");
            fieldPrice.setText("");
            fieldCount.setText("");
            butCpu.setText("");
            fieldRam.setText("");
            fieldMgpx.setText("");
            butGener.setText("");
        });

        butAddingComp.setOnAction(event -> {
            model = butModelComp.getText();
            price = Double.parseDouble(fieldPriceComp.getText());
            count = Integer.parseInt(fieldCountComp.getText());
            cpu = butCpuComp.getText();
            ram = Integer.parseInt(fieldRamComp.getText());
            ToggleButton button = (ToggleButton)group.getSelectedToggle();
            if(button.getText().equals("Yes")){
                ssd = true;
            }
            else if(button.getText().equals("No")){
                ssd = false;
            }
            memory = Integer.parseInt(fieldMemory.getText());
            devices.add(new Computer(model, price, count, cpu, ram, ssd, memory));
            //devList = FXCollections.observableArrayList(new Computer(model, price, count, cpu, ram, ssd, memory).showDetails());
            for (Device device : devices) {
                System.out.println(device.showDetails());
            }
            butModelComp.setText("");
            fieldPriceComp.setText("");
            fieldCountComp.setText("");
            butCpuComp.setText("");
            fieldRamComp.setText("");
            butSsdYes.setSelected(true);
            fieldMemory.setText("");
        });

        butAddingLaptop.setOnAction(event -> {
            model = butModelLaptop.getText();
            price = Double.parseDouble(fieldPriceLaptop.getText());
            count = Integer.parseInt(fieldCountLaptop.getText());
            cpu = butCpuLaptop.getText();
            ram = Integer.parseInt(fieldRamLaptop.getText());
            ToggleButton button = (ToggleButton)group2.getSelectedToggle();
            if(button.getText().equals("Yes")){
                ssd = true;
            }
            else if(button.getText().equals("No")){
                ssd = false;
            }
            memory = Integer.parseInt(fieldMemoryLaptop.getText());
            weight = Double.parseDouble(fieldWeight.getText());
            ToggleButton button1 = (ToggleButton)group1.getSelectedToggle();
            if(button1.getText().equals("Yes")){
                touch = true;
            }
            else if(button1.getText().equals("No")){
                touch = false;
            }
            devices.add(new Laptop(model, price, count, cpu, ram, ssd, memory, weight, touch));
            //devList = FXCollections.observableArrayList(new Laptop(model, price, count, cpu, ram, ssd, memory, weight, touch).showDetails());
            for (Device device : devices) {
                System.out.println(device.showDetails());
            }
            butModelLaptop.setText("");
            fieldPriceLaptop.setText("");
            fieldCountLaptop.setText("");
            butCpuLaptop.setText("");
            fieldRamLaptop.setText("");
            butSsdYesLaptop.setSelected(true);
            fieldMemoryLaptop.setText("");
            fieldWeight.setText("");
            butTouchYes.setSelected(true);
        });

        butDelGood.setOnAction(event -> {
            menuDev.setText("Devices");
            paneDel.setVisible(true);
            paneAddAmount.setVisible(false);
            paneSmPh.setVisible(false);
            paneComp.setVisible(false);
            paneLaptop.setVisible(false);
            paneAddAmount.setVisible(false);
                devSmPhlist.clear();
            devComplist.clear();
            devLaptoplist.clear();
            for (Device device : devices) {
                if (device instanceof SmartPhone) {
                    devSmPhlist.add(device.showDetails() + "; Amount: " + device.getCount() + ';');
                }
                else if (device instanceof Computer && !(device instanceof Laptop)) {
                    devComplist.add(device.showDetails() + "; Amount: " + device.getCount() + ';');
                }
                else if (device instanceof Laptop) {
                    devLaptoplist.add(device.showDetails() + "; Amount: " + device.getCount() + ';');
                }
            }
            viewDelSmPh.setItems(devSmPhlist);
            viewDelComp.setItems(devComplist);
            viewDelLaptop.setItems(devLaptoplist);
        });

        allDevDelButton.setOnAction(event -> {
            switch (menuDev.getText()) {
                case "Smart Phone":
                    viewDelSmPh.setVisible(true);
                    viewDelComp.setVisible(false);
                    viewDelLaptop.setVisible(false);
                    break;
                case "Computer":
                    viewDelComp.setVisible(true);
                    viewDelSmPh.setVisible(false);
                    viewDelLaptop.setVisible(false);
                    break;
                case "Laptop":
                    viewDelLaptop.setVisible(true);
                    viewDelComp.setVisible(false);
                    viewDelSmPh.setVisible(false);
                    break;
            }
        });

        butDel.setOnAction(event -> {
            if(viewDelSmPh.isVisible()){
                String selected = viewDelSmPh.getSelectionModel().getSelectedItem();
                int delIndex1 = -1;
                int delIndex2 = -1;
                for(int i = 0; i < devSmPhlist.size(); i++){
                    if(devSmPhlist.get(i).equals(selected)){
                        delIndex1 = i;
                    }
                }
                devSmPhlist.remove(delIndex1);
                for(int i = 0; i < devices.size(); i++){
                    if(devices.get(i).showDetails().equals(selected)){
                        delIndex2 = i;
                    }
                }
                devices.remove(delIndex2);
            }
            else if(viewDelComp.isVisible()){
                String selected = viewDelComp.getSelectionModel().getSelectedItem();
                int delIndex1 = -1;
                int delIndex2 = -1;
                for(int i = 0; i < devComplist.size(); i++){
                    if(devComplist.get(i).equals(selected)){
                        delIndex1 = i;
                    }
                }
                devComplist.remove(delIndex1);
                for(int i = 0; i < devices.size(); i++){
                    if(devices.get(i).showDetails().equals(selected)){
                        delIndex2 = i;
                    }
                }
                devices.remove(delIndex2);
            }
            else if(viewDelLaptop.isVisible()){
                String selected = viewDelLaptop.getSelectionModel().getSelectedItem();
                int delIndex1 = -1;
                int delIndex2 = -1;
                for(int i = 0; i < devLaptoplist.size(); i++){
                    if(devLaptoplist.get(i).equals(selected)){
                        delIndex1 = i;
                    }
                }
                devLaptoplist.remove(delIndex1);
                for(int i = 0; i < devices.size(); i++){
                    if(devices.get(i).showDetails().equals(selected)){
                        delIndex2 = i;
                    }
                }
                devices.remove(delIndex2);
            }
        });

        butAddAmount.setOnAction(event -> {
            paneAddAmount.setVisible(true);
            paneDel.setVisible(false);
            paneSmPh.setVisible(false);
            paneComp.setVisible(false);
            paneLaptop.setVisible(false);
            paneAddAmount.setVisible(false);
            devSmPhlist.clear();
            devComplist.clear();
            devLaptoplist.clear();
            for (Device device : devices) {
                if (device instanceof SmartPhone) {
                    devSmPhlist.add(device.showDetails());
                }
                else if (device instanceof Computer && !(device instanceof Laptop)) {
                    devComplist.add(device.showDetails());
                }
                else if (device instanceof Laptop) {
                    devLaptoplist.add(device.showDetails());
                }
            }
            viewAmountSmPh.setItems(devSmPhlist);
            viewAmountComp.setItems(devComplist);
            viewAmountLaptop.setItems(devLaptoplist);
        });

        allDevAmountButton.setOnAction(event -> {
            switch (menuDev.getText()) {
                case "Smart Phone":
                    viewAmountSmPh.setVisible(true);
                    viewAmountComp.setVisible(false);
                    viewAmountLaptop.setVisible(false);
                    break;
                case "Computer":
                    viewAmountComp.setVisible(true);
                    viewAmountSmPh.setVisible(false);
                    viewAmountLaptop.setVisible(false);
                    break;
                case "Laptop":
                    viewAmountLaptop.setVisible(true);
                    viewAmountComp.setVisible(false);
                    viewAmountSmPh.setVisible(false);
                    break;
            }
        });

        butAddingAmount.setOnAction(event -> {
            if(viewAmountSmPh.isVisible()){
                String selected = viewAmountSmPh.getSelectionModel().getSelectedItem();
                int amountNum = Integer.parseInt(addNumber.getText());
                int delIndex1 = -1;
                int delIndex2 = -1;
                for(int i = 0; i < devSmPhlist.size(); i++){
                    if(devSmPhlist.get(i).equals(selected)){
                        if (devSmPhlist.get(i).contains(addNumber.getText()))
                        delIndex1 = i;
                    }
                }
                devSmPhlist.remove(delIndex1);
                for(int i = 0; i < devices.size(); i++){
                    if(devices.get(i).showDetails().equals(selected)){
                        delIndex2 = i;
                    }
                }
                devices.remove(delIndex2);
            }
            else if(viewAmountComp.isVisible()){
                String selected = viewAmountComp.getSelectionModel().getSelectedItem();
                int delIndex1 = -1;
                int delIndex2 = -1;
                for(int i = 0; i < devComplist.size(); i++){
                    if(devComplist.get(i).equals(selected)){
                        delIndex1 = i;
                    }
                }
                devComplist.remove(delIndex1);
                for(int i = 0; i < devices.size(); i++){
                    if(devices.get(i).showDetails().equals(selected)){
                        delIndex2 = i;
                    }
                }
                devices.remove(delIndex2);
            }
            else if(viewAmountLaptop.isVisible()){
                String selected = viewAmountLaptop.getSelectionModel().getSelectedItem();
                int delIndex1 = -1;
                int delIndex2 = -1;
                for(int i = 0; i < devLaptoplist.size(); i++){
                    if(devLaptoplist.get(i).equals(selected)){
                        delIndex1 = i;
                    }
                }
                devLaptoplist.remove(delIndex1);
                for(int i = 0; i < devices.size(); i++){
                    if(devices.get(i).showDetails().equals(selected)){
                        delIndex2 = i;
                    }
                }
                devices.remove(delIndex2);
            }
        });
    }
}
