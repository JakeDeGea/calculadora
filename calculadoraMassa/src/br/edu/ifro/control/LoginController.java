/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Usuario;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author mathe
 */
public class LoginController implements Initializable {

    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXPasswordField txtSenha;
    private Usuario user;
    @FXML
    private JFXButton btnCadastrar;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void VerificarUsuario(ActionEvent event) throws IOException {
               
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery("SELECT c FROM Usuario c WHERE c.loginUser = :user");
        query.setParameter("user", txtUsuario.getText());
        
        try {
            user = (Usuario)query.getSingleResult();
        } catch (Exception e) {}
        
        if (user.getNomeUsuario()== null) {JOptionPane.showMessageDialog(null, "Usuário Inválido");}
        else {
            if (!(user.getSenhaUsuario()).equals(txtSenha.getText())) {JOptionPane.showMessageDialog(null, "Senha Inválida");}
            else {
                Stage st = (Stage) txtSenha.getScene().getWindow();
                st.close();

                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Menu.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),1366,700);
                Stage stage = new Stage();
                
                stage.setTitle("Menu");
                stage.setScene(scene);
                stage.show();
            }
        } 
        
        em.close();
        emf.close();
        
    }

    @FXML
    private void cadastrarUsuario(ActionEvent event) {
    }
    
}
