package user_login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Page3Controller implements Initializable {
    
    String user = "Eliza Atanbaeva";
    String pass = "eli0302pass";
    String mail = "eliza@mail.ru";

    @FXML
    private TextField email;
    @FXML
    private TextField name;
    @FXML
    private PasswordField password;
    @FXML
    private ImageView image;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void Check(ActionEvent event) {
        String Tname = name.getText();
        String Tpass = password.getText();
        String Tmail = email.getText();
        if(Tname.isEmpty() || Tmail.isEmpty() || Tpass.isEmpty()){
            Alert error = new Alert(AlertType.ERROR);
            error.setHeaderText(null);
            error.setContentText("Please fill all of them");
            error.showAndWait();
        }else{
        if(Tname.equals(user) && Tpass.equals(pass) && Tmail.equals(mail)){
            Alert error = new Alert(AlertType.INFORMATION);
            error.setHeaderText(null);
            error.setContentText("ALL RIGHT!");
            error.showAndWait();
        }
        else{
            Alert error = new Alert(AlertType.ERROR);
            error.setHeaderText(null);
            error.setContentText("Check them again");
            error.showAndWait();
           }
        }
        
    }

}
