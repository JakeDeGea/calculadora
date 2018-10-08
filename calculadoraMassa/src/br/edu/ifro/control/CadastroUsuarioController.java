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
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
public class CadastroUsuarioController implements Initializable {
    
    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXPasswordField txtSenha;
    @FXML
    private JFXButton btnCadastrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void cadastrarUsuario(ActionEvent event) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Usuario usuario = new Usuario();
        
        usuario.setNomeUsuario(txtUsuario.getText());
        usuario.setSenhaUsuario(txtSenha.getText());
        
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
        JOptionPane.showMessageDialog(null, "Cadastro Realizado");
    }
    
}
