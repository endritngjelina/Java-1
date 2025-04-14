package nngjelina15;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program moves a ball in a pane
//The program contains a pane class for displaying the ball
//It also contains the the methods for moving the ball left, right, up or down
//The ball can not go outside of the window

//Import java fx files
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

//Public Class Move The Ball
public class MoveTheBall extends Application{
	
	//Start method
    public void start(Stage primaryStage) throws Exception {

        double width = 400;		//Create width double
        double height = 400;	//Create height double
        
        //set ball dimensions and boundaries
        BallPane ballPane = new BallPane(width / 2,height / 2, Math.min(width,height) / 15);

        Button bUp = new Button("Up");					//Button for up action
        bUp.setOnAction(e -> ballPane.moveUp());		//Set on action move up

        Button bDown = new Button("Down");				//Button for down action
        bDown.setOnAction(e -> ballPane.moveDown());	//Set on action move down

        Button bLeft = new Button("Left");				//Button for left action
        bLeft.setOnAction(e -> ballPane.moveLeft());	//Set on action move left

        Button bRight = new Button("Right");			//Button for right action
        bRight.setOnAction(e -> ballPane.moveRight()); //Set on action move right

        
        HBox buttons = new HBox(bUp, bDown, bLeft, bRight);	//Create a space for all buttons
        buttons.setAlignment(Pos.BOTTOM_CENTER);			//Set buttons in bottom
        buttons.setSpacing(15);								//set space between button
        buttons.setPadding(new Insets(10, 10, 10, 10));		//Set padding for buttons

        BorderPane pane = new BorderPane();			
        pane.setCenter(ballPane);
        pane.setBottom(buttons);

        Scene scene = new Scene(pane, width, height);		//Create new scene with parameters
        primaryStage.setScene(scene);						//Set scene
        primaryStage.setTitle("Click to move ball");		//Display title
        primaryStage.show();								
    }
    
    //Private class Ball Pane to display ball
    private class BallPane extends Pane {

    	//Create circle
        private Circle hCircle;
        public BallPane(double centerX, double centerY, double radius) {
            hCircle = new Circle(centerX, centerY, radius);
            getChildren().add(hCircle);
        }
        //Method to move up
        public void moveUp() {
            if (hCircle.getCenterY() - hCircle.getRadius()  - 10 < 0) return;
            hCircle.setCenterY(hCircle.getCenterY() - 10);
        }
        //Method to move down
        public void moveDown() {
            if (hCircle.getCenterY() + hCircle.getRadius() + 10 > getHeight()) return;

            hCircle.setCenterY(hCircle.getCenterY() + 10);
        }
      //Method to move right
        public void moveRight() {
            if (hCircle.getCenterX() + hCircle.getRadius() + 10 > getWidth()) return;
            hCircle.setCenterX(hCircle.getCenterX() + 10);
        }
        //Method to move left
        public void moveLeft() {
            if (hCircle.getCenterX() - hCircle.getRadius()  - 10 < 0) return;
            hCircle.setCenterX(hCircle.getCenterX() - 10);
       }
    }
    //Main method
    public static void main(String[] args) {
    	
    	//Launch
        Application.launch(args);
    }
}
