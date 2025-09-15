public class Circle{
    private double radius;
    private String color;
    
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) { // 3rd constructor
        radius = r;
        color = c;
    }
    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        color = c;
    }

    public void setRadius(double r){
        radius = r;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

}