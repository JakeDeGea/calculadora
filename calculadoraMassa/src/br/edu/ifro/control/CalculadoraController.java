/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    private TextField txtValor2;
    @FXML
    private Button btnMultiplicacao;
    @FXML
    private Button btnSoma;
    @FXML
    private Button btnSubtracao;
    @FXML
    private Button btnDivisao;
    @FXML
    private TextField txtResult;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void multiplicar(ActionEvent event) {
    }

    @FXML
    private void somar(ActionEvent event) {
    }

    @FXML
    private void subtrair(ActionEvent event) {
    }

    @FXML
    private void dividir(ActionEvent event) {
    }
    
}
