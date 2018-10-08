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
        
    }
    
    @FXML
    private void showCalculadora(ActionEvent event) throws IOException {
        Stage st = (Stage) btnHistorico.getScene().getWindow();
        st.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600,400);
        Stage stage = new Stage();
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void showHistorico(ActionEvent event) throws IOException {
        Stage st = (Stage) btnHistorico.getScene().getWindow();
        st.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Historico.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600,400);
        Stage stage = new Stage();
        stage.setTitle("Historico");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void subtrair(ActionEvent event) {
    }

    @FXML
    private void multiplicar(ActionEvent event) {
    }

    @FXML
    private void dividir(ActionEvent event) {
    }
    
}
