public class Rectangle {
    double width;
    double height;
    public void setWidthHeight(double w, double h){
        this.width = w;
        this.height = h;
    }
    public double getPerimeter(){
        return width + height + width + height;
    }
    public double getArea(){
        return width * height;
    }
    public void printInfo(){
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}
