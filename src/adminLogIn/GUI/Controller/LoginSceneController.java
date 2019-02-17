/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminLogIn.GUI.Controller;

import adminLogIn.BE.Teacher;
import adminLogIn.GUI.Model.Model;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Nijas Hansen
 */
public class LoginSceneController implements Initializable {

    @FXML
    private ImageView imgviewAvatar;
    @FXML
    private TextField txtfldTeacherID;
    @FXML
    private TextField txtfldPassword;
    @FXML
    private Button btnLogin;
    
    private Model model;
    
    private Teacher teacher;
    @FXML
    private ImageView imgviewBanner;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imgviewBanner.setImage(new Image("resus/Banner.png"));
        imgviewAvatar.setImage(new Image("resus/Login-avatar.png"));
        imgviewBanner.setFitWidth(0);
        model = new Model();
        teacher = new Teacher();
        teacher = model.generateTeachers();
    }    
    
    @FXML
    private void handleLoginButton(MouseEvent event) {
        String username = txtfldTeacherID.getText();
        String password = txtfldPassword.getText();
        
        if (username.equals(model.getTeacherID(teacher)) && password.equals(model.getTeacherPassword(teacher))) {
            System.out.println("welcome");
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fravaer.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (IOException e) {
            }
        } else {
            System.out.println("incorrect login");
        }
        
    }

     
}
