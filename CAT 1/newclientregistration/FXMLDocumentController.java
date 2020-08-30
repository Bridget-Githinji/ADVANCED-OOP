package newclientregistration;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;

/**
 *
 * @author BRIDGET GITHINJI
 */
public class FXMLDocumentController implements Initializable {
        
    @FXML
    public ComboBox<String> combobox;
    ObservableList<String> List = FXCollections.observableArrayList("Two Weeks","One Month","Two Months","Three Months","Six Months");
    
    @FXML
    public Button button;
    public void handleButtonAction(ActionEvent event) {
        System.out.println("Thank you for registering in the Serenity Beauty Salon Application!");
        button.setStyle("-fx-background-color: blue");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.setItems(List);
    }    
    
}
