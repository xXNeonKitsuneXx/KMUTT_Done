public class Circle extends GeometricObject{
    private double radius;
    private final double PI = Math.PI;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius= radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
    
    public void printInfo() {
        super.printInfo();
        System.out.println( "It is a circle with radius of " + radius);
    } 
}