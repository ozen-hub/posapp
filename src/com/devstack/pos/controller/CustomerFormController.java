package com.devstack.pos.controller;

import com.devstack.pos.bo.BoFactory;
import com.devstack.pos.bo.custom.CustomerBo;
import com.devstack.pos.dto.CustomerDto;
import com.devstack.pos.views.tm.CustomerTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.util.List;
import java.util.UUID;

public class CustomerFormController {
    public AnchorPane context;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;
    public Button btnSaveUpdate;
    public TableView<CustomerTm> tblCustomers;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TableColumn colLoyaltyCard;
    public TableColumn colOption;

    private CustomerBo customerBo = BoFactory.getBo(BoFactory.BoType.CUSTOMER);

    public void initialize(){

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colLoyaltyCard.setCellValueFactory(new PropertyValueFactory<>("privilegeType"));
        colOption.setCellValueFactory(new PropertyValueFactory<>("bar"));

        loadAllCustomers();
    }

    public void backToHomeOnAction(ActionEvent actionEvent) {
    }

    public void newCustomerOnAction(ActionEvent actionEvent) {

    }

    private void loadAllCustomers() {
        List<CustomerDto> all = customerBo.findAll();
        ObservableList<CustomerTm> objects = FXCollections.observableArrayList();
       for(CustomerDto dto : all){

           ButtonBar buttonBar = new ButtonBar();
           Button deleteButton = new Button("delete");
           Button updateButton = new Button("update");
           Button loyaltyCardButton = new Button("+ L.. card");

           buttonBar.getButtons().addAll(
                   loyaltyCardButton,
                   updateButton,
                   deleteButton
           );

           objects.add(new CustomerTm(dto.getId(),
                   dto.getName(),
                   dto.getAddress(),
                   dto.getSalary(),
                   dto.getPrivilegeType(),
                   buttonBar));
       }
       tblCustomers.setItems(objects);
    }

    public void saveCustomerOnAction(ActionEvent actionEvent) {
        if(btnSaveUpdate.getText().equals("Save Customer")){
            customerBo.create(
                    new CustomerDto( UUID.randomUUID().toString(),
                            txtName.getText(),
                            txtAddress.getText(),
                            Double.parseDouble(txtSalary.getText()))
            );
            new Alert(Alert.AlertType.INFORMATION,"Customer was added!").show();
            loadAllCustomers();
        }
    }
}
