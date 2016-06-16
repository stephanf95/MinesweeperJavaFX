package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private Model model;
    @FXML
    Button startButton;
    @FXML
    Button resetButton;
    @FXML
    Button fieldButton00;
    @FXML
    Button fieldButton01;
    @FXML
    Button fieldButton02;
    @FXML
    Button fieldButton03;
    @FXML
    Button fieldButton04;
    @FXML
    Button fieldButton05;
    @FXML
    Button fieldButton06;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new Model();
        setOnAction();
    }

    private void setOnAction() {
        fieldButton00.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fieldButton00.setStyle("-fx-background-image: url('/graphics/OneMineNearby.png')");
            }
        });

        fieldButton01.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fieldButton01.setStyle("-fx-background-image: url('/graphics/TwoMinesNearby.png')");
            }
        });

        fieldButton02.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fieldButton02.setStyle("-fx-background-image: url('/graphics/ThreeMinesNearby.png')");
            }
        });

        fieldButton03.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fieldButton03.setStyle("-fx-background-image: url('/graphics/FourMinesNearby.png')");
            }
        });

        fieldButton04.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fieldButton04.setStyle("-fx-background-image: url('/graphics/FlagField.png')");
            }
        });

        fieldButton05.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fieldButton05.setStyle("-fx-background-image: url('/graphics/MineField.png')");
            }
        });

        fieldButton06.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fieldButton06.setStyle("-fx-background-image: url('/graphics/EmptyField.png')");
            }
        });
    }
}
