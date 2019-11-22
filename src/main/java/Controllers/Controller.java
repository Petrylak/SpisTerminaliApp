package Controllers;

import Model.AutoMap;
import Model.Task;
import Model.Terminal;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Logger logger = LoggerFactory.getLogger(Controller.class);

    private Task task = new Task();
    private Terminal terminal = new Terminal();
    private AutoMap autoMap = new AutoMap();


    public TextField company_tfield, order_tfield, terminalNumber_tfield, terminalModel_tfield, terminalSystemVersion_tfield, terminalSerialNumber_tfield, autoMapLicense_tfield;
    public ChoiceBox<String> cardCapacity_cBox, terminalProgramVersion_cBox, terminalConfiguration_cBox, autoMapLicenseVersion_cBox;
    public TextArea additionalInfo_tarea;
    public DatePicker productionDate_dpicker,autoMapRegistrationDate_dpicker;
    public Button save_btn;


    private ChoiceBoxesController choiceBoxesController = new ChoiceBoxesController();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choiceBoxesController.loadMemoryCardOptions(cardCapacity_cBox);
        choiceBoxesController.loadSystemVersionOptions(terminalProgramVersion_cBox);
        choiceBoxesController.loadTerminalConfigurationOptions(terminalConfiguration_cBox);
        choiceBoxesController.loadAutoMapLicenseVersionOptions(autoMapLicenseVersion_cBox);

    }

    @FXML
    private void handleButtonClick(){
        saveFields();
        logger.info("Task ---->> Company name: {}, Order number: {} , Additional info: {}, Production date: {} ", task.getCompanyName(), task.getOrderNumber(),
                task.getAdditionalInfo(), task.getProductionDate());
        logger.info("Terminal ---->> Number: {}, Model: {} , System version: {}, Serial number: {}, Card capacity: {}, Program version: {}, Terminal configuration: {}",
                terminal.getNumber(), terminal.getModel(), terminal.getSystemVersion(), terminal.getSerialNumber(), terminal.getCardCapacity(), terminal.getProgramVersion(),
                terminal.getConfiguration());
        logger.info("AutoMap ---->> License: {}, Registration date: {}, License version: {}", autoMap.getLicense(), autoMap.getRegistrationDate(), autoMap.getLicenseVersion());
            }

    private void saveFields(){
       task.setCompanyName(company_tfield.getText());
       task.setOrderNumber(order_tfield.getText());
       task.setAdditionalInfo(additionalInfo_tarea.getText());
       task.setProductionDate(productionDate_dpicker.getValue());
       terminal.setNumber(terminalNumber_tfield.getText());
       terminal.setModel(terminalModel_tfield.getText());
       terminal.setSystemVersion(terminalSystemVersion_tfield.getText());
       terminal.setSerialNumber(terminalSerialNumber_tfield.getText());
       terminal.setCardCapacity(cardCapacity_cBox.getValue());
       terminal.setProgramVersion(terminalProgramVersion_cBox.getValue());
       terminal.setConfiguration(terminalConfiguration_cBox.getValue());
       autoMap.setLicense(autoMapLicense_tfield.getText());
       autoMap.setRegistrationDate(autoMapRegistrationDate_dpicker.getValue());
       autoMap.setLicenseVersion(autoMapLicenseVersion_cBox.getValue());

    }


}
