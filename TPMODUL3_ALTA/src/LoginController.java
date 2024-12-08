import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordLogin;

    @FXML
    private TextField usernameLogin;

    @FXML
    void loginFunction(ActionEvent event) throws IOException {
        String username = usernameLogin.getText();
        String password = passwordLogin.getText();

        Parent inventoryPageParent = FXMLLoader.load(getClass().getResource("InventoryPage.fxml"));
        Scene inventoryPagescene = new Scene(inventoryPageParent);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        if (username.equals("Kominfo") && password.equals("Kominfo")) {
            stage.setScene(inventoryPagescene);
            stage.show();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Salah Username atau Password");
            alert.setContentText("Silahkan cek kembali Username dan Password Anda");
            alert.showAndWait();
        }
    }

}
