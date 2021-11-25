package lk.ijse.hibernate.controller.Item;

import bo.BoFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.hibernate.bo.custom.ItemBO;
import lk.ijse.hibernate.dto.ItemDTO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

public class UpdateItemFormController {

    private final ItemBO itemBO = (ItemBO) BoFactory.getBOFactory().getBO(BoFactory.BoTypes.ITEM);

    public AnchorPane UpdateItemFormContext;
    public static AnchorPane ManageItemFormContext;
    public Button btnUpdateItem;
    public TextField txtUpdateDescription;
    public TextField txtUpdatePackSize;
    public TextField txtUpdateQtyOnHand;
    public TextField txtUpdateUnitPrice;

    public String itemCode;



    public void UpdateItemOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException, IOException {

        try {
            ItemDTO dto = new ItemDTO(itemCode, txtUpdateDescription.getText(),
                    txtUpdatePackSize.getText(),
                    Integer.parseInt(txtUpdateQtyOnHand.getText()),
                    Double.parseDouble(txtUpdateUnitPrice.getText()));
            boolean updateItem = itemBO.updateItem(dto);


            Stage stage = (Stage) btnUpdateItem.getScene().getWindow();
            stage.close();

            refreshTableUpdate(updateItem);

        } catch (SQLException e) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void refreshTableUpdate(boolean updateItem) throws IOException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.NO);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Updated..", yes, no);
        Optional<ButtonType> result = alert.showAndWait();
        if (updateItem) {
            if (result.orElse(no) == yes) {
                Stage window = (Stage) ManageItemFormContext.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ManageItemForm.fxml"))));
            }
        } else {
            new Alert(Alert.AlertType.ERROR, "Failed to update the Item ", ButtonType.CLOSE).show();
        }
    }

}
