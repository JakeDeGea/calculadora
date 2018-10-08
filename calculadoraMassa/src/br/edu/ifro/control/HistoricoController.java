/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Historico;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author Jake de Gea
 */
public class HistoricoController extends MenuController implements Initializable {

    @FXML
    private JFXButton btnCalculadora;
    @FXML
    private JFXButton btnHistorico;
    @FXML
    private TableView<?> tbHistorico;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula2");
        EntityManager em = emf.createEntityManager();
                
        Query query = em.createQuery("SELECT a FROM historico as a");
        
        List<Historico> h = query.getResultList();
        
        ObservableList oH = FXCollections.observableArrayList(h); 
        tbHistorico.setItems(oH);
    }    
    
}
