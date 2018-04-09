package garden_planner.gui;

import garden_planner.model.GardenPlanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

;

public class GuiMain extends Application {

    private GardenPlanner planner;

    public GuiMain() {
        planner = new GardenPlanner();

        planner.createBasicDesign();

    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("garden_gui.fxml"));


        Pane root = new Pane();


        root.setStyle("-fx-background-color:#008000;");



        // For loop for assigning x, y, w, h to GUI positions.
        for (garden_planner.model.GardenBed bed : planner.getBeds()) {
            double x = bed.getLeft();
            double y = bed.getTop();
            double w = bed.getWidth();
            double h = bed.getHeight();

            Button btnShape = new Button();
            btnShape.setText("Change Shape");
            btnShape.setLayoutX(x*100);
            btnShape.setLayoutY(y*310);
            btnShape.setOnAction((ActionEvent)->{
                btnShape.setText("Yes");
                System.out.println(btnShape.getText());
            });
            root.getChildren().add(btnShape);

            //Creating a text field and making it a title for the garden planner.
            TextField text = new TextField("Overlook of the Garden");
            text.setFont(Font.font("SanSerif", 30));
            Font SanSerif = Font.font("Phosphate",30);
            text.setFont(SanSerif);
            text.setTranslateY(10);
            text.setTranslateX((215));

            //Creating a rectangle bed
            Rectangle r = new Rectangle(w*100, h*100);
            Image im = new Image("http://images.all-free-download.com/images/graphicthumb/flower_pattern_6819485.jpg");
            r.setFill(Color.MAROON);
            r.setStroke(Color.BLACK);
            r.setStrokeWidth(4);
            r.setLayoutX(x*100);
            r.setLayoutY(y*100);
            r.setFill(new ImagePattern(im));
            root.getChildren().add(r);
            root.getChildren().add(text);


            // Creates a circle bed
            Circle c = new Circle(130,100,100);
            Image im2 = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdU7OglxEJPnYpbskdd6-0j-_PtGnE2ZY4uR28ukhJFQB3uUeH");
            c.setFill(Color.MAROON);
            c.setStroke(Color.BLACK);
            c.setStrokeWidth(4);
            c.setLayoutX(x*136);
            c.setLayoutY(y*350);
            c.setFill(new ImagePattern(im2));
            root.getChildren().add(c);



        }
        primaryStage.setTitle("The Awesome Garden");
        primaryStage.setScene(new Scene(root , 800 , 600));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
