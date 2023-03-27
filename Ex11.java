/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ex11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author babyj
 */
public class Ex11 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        
        Subject displayedSubject = math;
        
        primaryStage.setTitle("JavaFX Window");

        /* Setting a layout */
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 450, 450);
        primaryStage.setScene(scene);
        
        Text sampleText = new Text(displayedSubject.getName());
        sampleText.setFill(Color.BLUE);
        sampleText.setFont(new Font("Arial", 20));
        root.getChildren().add(sampleText);
        
        ImageView sampleImage = new ImageView();
        Image img = new Image(Ex11.class.getResourceAsStream(displayedSubject.getImgFileName()));
        sampleImage.setImage(img);
        root.getChildren().add(sampleImage);
        
        Text units = new Text("Units: " + displayedSubject.getUnits());
        sampleText.setFill(Color.BLUE);
        sampleText.setFont(new Font("Arial", 20));
        root.getChildren().add(units);
        
        Text grade = new Text("Grade: " + displayedSubject.getGrade());
        sampleText.setFill(Color.BLUE);
        sampleText.setFont(new Font("Arial", 20));
        root.getChildren().add(grade);
        
        Button button = new Button("Next");
        root.getChildren().add(button);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
