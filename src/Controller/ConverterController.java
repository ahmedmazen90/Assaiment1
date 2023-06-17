
package Controller;

import View.ConverterPage;
import Model.ConverterCurrency;
import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ahmed Hasanain
 */
public class ConverterController implements Initializable {

    @FXML
    private Button logout;
  ;
    @FXML
    private Button Convert;
    @FXML
    private TextField UsdTF;
    @FXML
    private TextField NisTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void BtnLogout(ActionEvent event) {
        try {
            ViewManager.closeConverterPage();
            
            ViewManager.openloginPage();
        } catch (IOException ex) {
            Logger.getLogger(ConverterPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void BtnConvert(ActionEvent event) {
        
        if (!UsdTF.getText().isEmpty() && NisTF.getText().isEmpty()) {
                double Usd = Double.parseDouble(UsdTF.getText());
                double Ils = ConverterCurrency.convertToILS(Usd);
                NisTF.setText(String.format("%.2f", Ils));
            } else if (!NisTF.getText().isEmpty() && UsdTF.getText().isEmpty()) {
                double Ils = Double.parseDouble(NisTF.getText());
                double Usd = ConverterCurrency.convertToUSD(Ils);
                UsdTF.setText(String.format("%.2f", Usd));
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Error....Fill the TextFields");
                alert.showAndWait();
            }
    }

}
