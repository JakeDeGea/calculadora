/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Historico;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author Jake de Gea
 */
public class CalculadoraController extends MenuController implements Initializable {

    @FXML
    private JFXButton btnCalculadora;
    @FXML
    private JFXButton btnHistorico;
    @FXML
    private TextField txtValor1;
    @FXML
    private TextField txtResultado;
    @FXML
    private TextField txtValor2;
    @FXML
    private Button btnSoma;
    @FXML
    private Button btnSubtracao;
    @FXML
    private Button btnMultiplicacao;
    @FXML
    private Button btnDivisao;
    
    private Historico h;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        h = new Historico();
    }    

    @FXML
    private void somar(ActionEvent event) {
        
        h.setValor1(Double.parseDouble(txtValor1.getText()));
        h.setValor2(Double.parseDouble(txtValor2.getText()));
        h.setResultado(h.getValor1()+h.getValor2());
        h.setOperador("+");
        
        txtResultado.setText(Double.toString(h.getResultado()));
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula2");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(h);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }  
    

    @FXML
    private void subtrair(ActionEvent event) {
        h.setValor1(Double.parseDouble(txtValor1.getText()));
        h.setValor2(Double.parseDouble(txtValor2.getText()));
        h.setResultado(h.getValor1()-h.getValor2());
        h.setOperador("-");
        
        txtResultado.setText(Double.toString(h.getResultado()));
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula2");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(h);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }

    @FXML
    private void multiplicar(ActionEvent event) {
        h.setValor1(Double.parseDouble(txtValor1.getText()));
        h.setValor2(Double.parseDouble(txtValor2.getText()));
        h.setResultado(h.getValor1()*h.getValor2());
        h.setOperador("x");
        
        txtResultado.setText(Double.toString(h.getResultado()));
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula2");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(h);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }

    @FXML
    private void dividir(ActionEvent event) {
        h.setValor1(Double.parseDouble(txtValor1.getText()));
        h.setValor2(Double.parseDouble(txtValor2.getText()));
        h.setResultado(h.getValor1()/h.getValor2());
        h.setOperador("/");
        
        txtResultado.setText(Double.toString(h.getResultado()));
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula2");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(h);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
}
