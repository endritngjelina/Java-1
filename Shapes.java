package nngjelina14;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program uses java fx to displays a rectangle, a circle and a cross 
//It contains methods alongside the objects for the shapes
//All the shapes have precise measures and colors 

	//Import java fx files
	import javafx.application.Application;
	import javafx.scene.Group;
	import javafx.scene.Scene;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.StackPane;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Circle;
	import javafx.scene.shape.Line;
	import javafx.geometry.Insets;
	import javafx.scene.shape.Rectangle;
	import javafx.stage.Stage;
	
	//Shapes Class
	public class Shapes extends Application{
		
		private static final int x = 50;
	    
		//Main method
	    public static void main(String[] args) {
	        launch(args);
	    }
	    
	    public void start(Stage primaryStage)	//Start method
	    			throws Exception{ //Throw exception	
    	
    	
    	Rectangle rect = new Rectangle(); //Create rectangle
    	rect.setX(50);					//Set x for rectangle
    	rect.setY(50);					//Set y for rectangle
    	rect.setWidth(2*x);				//Set width for rectangle
    	rect.setHeight(2*x);			//Set height for rectangle
    	rect.setStroke(Color.BLUE);		//Set stroke color for rectangle
    	rect.setStrokeWidth(3);			//Set stroke width for rectangle
    	rect.setFill(Color.BLUE);		//Set fill color for rectangle
    	
    
    	Circle k = new Circle(x);	//Create Circle
    	k.setStroke(Color.RED);		//Set stroke color
    	k.setStrokeWidth(3);		//Set width
    	k.setFill(Color.RED);
    	
    	//Create two lines for cross
    	Line x11 = new Line(-x / 1.5, -x / 2.5, x / 1.5, -x / 2.5);
    	Line x12 = new Line(0, -x, 0, x);
        x11.setStroke(Color.GREEN); 		//Set stroke color for lines
        x11.setStrokeWidth(6);				//Set stroke width
        x12.setStroke(Color.GREEN); 		//Select the color
        x12.setStrokeWidth(6);				//Set stroke width
            
        StackPane lines = new StackPane(x11, x12);
        
        //Create grid pane and set properties
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        
        //Add rectangle, circle and line to grid 
        pane.add(lines, 2, 2);
        pane.add(rect, 0, 0);
        pane.add(k, 1, 1);
        pane.add(new Group(x11, x12), 2, 2);
        
        //Create the scene and add pane to scene
        Scene scene = new Scene(pane);
        
        //Set the stage name
        primaryStage.setTitle("Shapes in Grid");
        
        //Add scene in stage
        primaryStage.setScene(scene);
        
        //Set the scene properties
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}