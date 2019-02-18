/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminLogIn.GUI.Controller;

import adminLogIn.DAL.FraværDAO;
import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bruger
 */
public class FraværController implements Initializable
{

    FraværDAO fravær;
    
         
            
            
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        fravær = new FraværDAO();
        AnchorPane Anpane = new AnchorPane();
        Anpane.setLayoutX(100);
        Anpane.setLayoutY(100);
        Anpane.setPrefSize(600, 50);
        Anpane.setMaxSize(600, 50);
        Anpane.setMinSize(600, 50);
        
        HBox hBox = new HBox();
        hBox.setSpacing(60);
        
        Label lblDato = new Label();
        Label lblFag = new Label();
        Label lblModul = new Label();
     
        System.out.println(fravær.dato());
        lblDato.setText(fravær.dato().get(1));
        lblDato.setTranslateY(4);
        
        
        lblFag.setText(fravær.fag().get(2));
        lblFag.setTranslateY(4);
        
        lblModul.setText(fravær.modul().get(0));
        lblModul.setTranslateY(4);
        
        JFXComboBox coBox = new JFXComboBox(fravær.combBox());
        coBox.promptTextProperty().setValue("Vælg fraværsårsag");
        
        hBox.getChildren().addAll(lblDato, lblFag, lblModul, coBox);
        
        Anpane.getChildren().add(hBox);
        
        Scene scene = new Scene(Anpane, 300, 250);
        
        
    }    
    
    
    
}
