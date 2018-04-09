package garden_planner.model;

public class Rectangle extends GardenBed {

    double width = 1.0;
    double height = 1.0;

    /**
     * Total width of this shape.
     *
     * @return width in metres.
     */
    @Override
    public double getWidth() {
        return width;
    }

    /**
     * Total height of this shape.
     *
     * @return height in metres.
     */
    @Override
    public double getHeight() {
        return height;
    }

    /**
     * Get the area of this shape.
     *
     * @param v
     * @param v1
     * @return the total internal area of the shape.
     */
    @Override
    public double getArea(double v , double v1) {
        return width * height;
    }

    /**
     * Get the perimeter of this shape.
     *
     * @param v
     * @param v1
     * @return the total length of the edges of the shape.
     */
    @Override
    public double getPerimeter(double v , double v1) {
        return 2 * (width + height);
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
