package garden_planner.model;

public class Circle extends GardenBed {

    private double radius = 0.0;
    private double pi = 3.14;

    public Circle() {
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }


    public double getArea(double v, double v1 ) {
        return pi * radius*radius;
    }

    /**
     * Get the perimeter of this shape.
     *
     * @param v
     * @param v1
     * @return the total length of the edges of the shape.
     */
    public double getPerimeter(double v , double v1) {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle %.2f %.2f %.2f" , left , top , radius);
    }
}
