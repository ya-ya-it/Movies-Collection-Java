/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_f2017_davydenko;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dasha
 */
public class MovieViewController implements Initializable {

    @FXML private TextField movieNameTextField;
    @FXML private TextField genreTextField;
    @FXML private TextField descriptionTextField;
    @FXML private TextField yearReleasedTextField;
    
    @FXML private Button createMovieButton;
    @FXML private Label errorLabel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        errorLabel.setVisible(false);
    }
    
    public void createMovieButtonPushed() {
        errorLabel.setVisible(true);
        String movieName = movieNameTextField.getText();
        String genre = genreTextField.getText();
        String description = descriptionTextField.getText();
        int yearReleased = Integer.parseInt(yearReleasedTextField.getText());
        try {
            Movie movie = new Movie (movieName, genre, description, yearReleased);
            errorLabel.setText("The movie " + movie.toString() + " was created.");
        } catch (IllegalArgumentException e) {
            errorLabel.setText(e.getMessage());
        }
        
    }
    
}
