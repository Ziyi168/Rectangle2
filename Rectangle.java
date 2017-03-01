import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;

public Rectangle extends Application{
	public void start(Stage primaryStage){
		
         TextInputDialog input = new TextInputDialog();
	 input.setTitle ("Rectangle Application");
	 input.setHeaderText("input width and height of the rectangle");
	 dialog.showAndWait();
	 
	 String[]side = input.get().split("");
         double width = Double.parseDouble(side[0]);
	 double height = Double.parseDoubke(side[1]);
	 double perimeter = 2*width + 2*height;
	 double area = width*height;

	 Alert alert = new Alert(AlertType.CONFIRMATION);
	 ALERT.setContentText("The perimeter of the rectangle is "+ perimeter +"\n The area of the perimeter is: " + area);
	 alert.showAndWait();



	}


}
