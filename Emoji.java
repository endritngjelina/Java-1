package nngjelina14;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program displays an emoji by using java fx
//The emoji displayed has a smile and glasses
//It is created by using circles, rectangles, ellipses and an arc

	//Import java fx files
	import javafx.application.Application;
	import javafx.scene.Group;
	import javafx.scene.Scene;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Arc;
	import javafx.scene.shape.ArcType;
	import javafx.scene.shape.Circle;
	import javafx.scene.shape.Ellipse;
	import javafx.scene.shape.Rectangle;
	import javafx.stage.Stage;

	//public class Emoji 
	public class Emoji extends Application{
	    
	    @Override
	    
	    //Start method
	    public void start(Stage uStage) {
	        
	    	//Create double values for face x, face y and eye y center and eye x center
	        double faceX = 220.0;
	        double faceY = 220.0;
	        double eyeYFaceCenter = 25.0;
	        double eyeXFaceCenter = 80.0;
	        
	        //Create circle for face
	        Circle face = new Circle();
	        
	        
	        face.setCenterX(faceX);     		 //Set center for x coordinate
	        face.setCenterY(faceY);     		 //Set center for y coordinate
	        face.setRadius(190.0);      		 //Set radius
	        face.setFill(Color.YELLOW); 		 //Set fill color
	        face.setStroke(Color.BLACK);		 //Color for stroke
	        face.setStrokeWidth(15);	   		 //Width for stroke
	        Ellipse ellipse = new Ellipse(218.0f, 215.0f, 175.0f, 165.f); //New ellipse to go inside the face
	        ellipse.setFill(Color.GOLD); 		 //Fill ellipse with color
	        
	        
	        Circle lGlass = new Circle();	//New circle for left part of glasses
	        lGlass.setCenterX(faceX - eyeXFaceCenter - 20);	  //Set center with x coordinate
	        lGlass.setCenterY(faceY - eyeYFaceCenter);		  //Set center with y coordinate
	        lGlass.setRadius(55.0);		    //Set radius
	        lGlass.setStrokeWidth(12);	    //Set Stroke width
	        lGlass.setFill(null);		    //Set fill as null because its glass
	        lGlass.setStroke(Color.BLACK);  //Set stroke color
	        
	        
	        Rectangle rectangle = new Rectangle();  //Create rectangle part of glasses
	        rectangle.setX(faceX - 43);			//Set center with x coordinate
	        rectangle.setY(faceY - 30);			//Set center with y coordinate
	        rectangle.setHeight(25);			//Set height
	        rectangle.setWidth(90);				//Set width
	        rectangle.setFill(Color.BLACK);		//Set fill color
	        
	        
	        //Create circle for right part of glasses
	        Circle rGlass = new Circle();
	        rGlass.setCenterX(faceX + eyeXFaceCenter + 20);		//Set center for x coordinate
	        rGlass.setCenterY(faceY-eyeYFaceCenter);			//Set the center for y coordinate
	        rGlass.setRadius(55.0); 		//Set radius 
	        rGlass.setStrokeWidth(12);		//Set stroke width
	        rGlass.setFill(null);			//Set fill empty
	        rGlass.setStroke(Color.BLACK);	//Fill with color black

	        
	        //Create circle for left eye
	        Circle lEye = new Circle();
	        lEye.setCenterX(faceX - eyeXFaceCenter);
	        lEye.setCenterY(faceY - eyeYFaceCenter);
	        lEye.setRadius(25.0);
	        lEye.setFill(Color.BLACK);
	        
	        //Create circle for right eye
	        Circle rEye = new Circle();
	        rEye.setCenterX(faceX + eyeXFaceCenter);
	        rEye.setCenterY(faceY - eyeYFaceCenter);
	        rEye.setRadius(25.0);
	        rEye.setFill(Color.BLACK);
	        
	        //Create arc for mouth
	        Arc mouth = new Arc(faceX, faceY + 90, 60, 40, 180, 180);
	        mouth.setFill(null);
	        mouth.setStroke(Color.BLACK);
	        mouth.setStrokeWidth(15.0);
	        mouth.setType(ArcType.OPEN);
	      
	        //Create root to display code
	        Group root = new Group(face, ellipse, rEye, lEye, rGlass, lGlass, rectangle, mouth);
	        Scene scene = new Scene(root, 600, 600);
	        uStage.setTitle(" Drawing an emoji");
	        uStage.setScene(scene);
	        uStage.show();
	    }
	    
	    //Main method
	    public static void main(String[] args) {
	    	
	    	//Launch arguments
	        launch(args);
	    }
}