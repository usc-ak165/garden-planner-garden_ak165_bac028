package garden_planner.gui;

import garden_planner.model.GardenPlanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class GuiMain extends Application {

    private GardenPlanner planner;

    public GuiMain() {
        planner = new GardenPlanner();

        planner.createBasicDesign();

    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("garden_gui.fxml"));
        //Button root = new Button("TODO: design garden planner GUI");


        Pane root = new Pane();

        root.setStyle("-fx-background-color:#008000;");

        for (garden_planner.model.Rectangle bed : planner.getBeds()) {
            double x = bed.getLeft();
            double y = bed.getTop();
            double w = bed.getWidth();
            double h = bed.getHeight();
            Rectangle r = new Rectangle(w*100, h*100);
            r.setFill(Color.MAROON);
            r.setStroke(Color.BLACK);
            r.setStrokeWidth(5);
            r.setLayoutX(x*100);
            r.setLayoutY(y*100);
            root.getChildren().add(r);
        }
        primaryStage.setTitle("The Awesome Garden");
        primaryStage.setScene(new Scene(root , 800 , 600));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
