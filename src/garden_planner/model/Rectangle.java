package garden_planner.model;

/**
 * Represents a rectangular shape garden.
 *
 * @author Mark Utting
 */
public class Rectangle extends GardenPlan {

    public Rectangle() {
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle %.2f %.2f %.2f %.2f" , left , top , width , height);
    }
}

