/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Hasanain
 */
public class ConverterPage extends Stage {

    private Scene Converter;

    public ConverterPage() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Converter.fxml"));
        Converter = new Scene(parent);
        this.setScene(Converter);
        this.setTitle("Login Page");
    }

}
