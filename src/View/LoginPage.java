
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Ahmed Hasanain
 */
public class LoginPage extends Stage {

    private Scene login;

    public LoginPage() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        login = new Scene(parent);
        this.setScene(login);
        this.setTitle("Login Page");
    }

}
