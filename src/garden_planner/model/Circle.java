package garden_planner.model;

public class Circle {
    private double left = 0.0;
    private double top = 0.0;
    private double width = 1.0;
    private double height = 1.0;


    public Circle() {
    }

    /**
     * Position of left edge of this shape.
     *
     * @return left edge, in metres
     */
    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    /**
     * Position of top edge of this shape.
     *
     * @return top edge, in metres
     *
     */


    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    /**
     * Total width of this shape.
     *
     * @return width in metres.
     */
    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Total height of this shape.
     *
     * @return height in metres.
     */
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get the area of this shape.
     *
     * @param v
     * @param v1
     * @return the total internal area of the shape.
     */
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
    public double getPerimeter(double v , double v1) {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle %.2f %.2f %.2f %.2f" , left , top , width , height);
    }
}
