package Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;


class ChoiceBoxesController {


        private ObservableList<String> list = FXCollections.observableArrayList();
        private ObservableList<String> systemVersions = FXCollections.observableArrayList();
        private ObservableList<String> terminalConfigurations = FXCollections.observableArrayList();
        private ObservableList<String> autoMapLicenses = FXCollections.observableArrayList();


    void loadMemoryCardOptions(ChoiceBox<String> cardCapacity_cBox){
        list.addAll("8 GB","16 GB","32 GB");
        cardCapacity_cBox.getItems().setAll(list);
    }
    void loadSystemVersionOptions(ChoiceBox<String> terminalProgramVersion_cBox){
        systemVersions.addAll("5.2.1","5.5.0","6.0");
        terminalProgramVersion_cBox.getItems().setAll(systemVersions);
    }
    void loadTerminalConfigurationOptions(ChoiceBox<String> terminalConfiguration_cBox){
        terminalConfigurations.addAll("Komunalny","Straż","Pogotowie");
        terminalConfiguration_cBox.getItems().setAll(terminalConfigurations);
    }
    void loadAutoMapLicenseVersionOptions(ChoiceBox<String> autoMapLicenseVersion_cBox){
        autoMapLicenses.addAll("6.2.5","4.0.0","2.5.0");
        autoMapLicenseVersion_cBox.getItems().setAll(autoMapLicenses);
    }

    }
