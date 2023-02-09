/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MUON
 */
public class JavaFXApplication4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);

        Subject displayedSubject = math;
        
        primaryStage.setTitle("Display Details");
        
        FlowPane root = new FlowPane();
        Scene mathWin = new Scene(root, 450, 450);
        primaryStage.setScene(mathWin);
        
        ImageView displayedImage = new ImageView();
        Image mathImg = new Image(Subject.class.getResourceAsStream("math"));
        displayedImage.setImage(mathImg);
        root.getChildren().add(displayedImage);
        
        Text unitText = new Text("Units: 4");
        unitText.setFill(Color.BLUE);
        unitText.setFont(new Font("Arial", 20));
        Text gradeText = new Text("Grade: 1.75");
        gradeText.setFill(Color.BLUE);
        gradeText.setFont(new Font("Arial", 20));
        root.getChildren().add(gradeText);
        
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
