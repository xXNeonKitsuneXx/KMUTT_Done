public class Circle {
    double radius;
    final double PI = 3.14159;
    double xcoor;
    double ycoor;
    public static int countCircleObject;

    public void setRadius(double r) {
        this.radius = r;
        countCircleObject++;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * PI * radius;
    }
    public double getAreaofCircles(int n){
        return n * getArea();
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public void setCenter(int x, int y) {
        xcoor = x;
        ycoor = y;
    }
    public void printInfo(){
        System.out.println("The circle have:");
        System.out.println("radius = " + radius);
        System.out.println("area = " + getArea());
        System.out.println("diameter =" + getDiameter());
        System.out.println("coordinate = ("+xcoor+","+ycoor+")");
    }
    public static int getNumberofCircleObjects(){
        return countCircleObject;
    }

}
