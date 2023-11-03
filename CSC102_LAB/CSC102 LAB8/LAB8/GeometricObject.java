public abstract class GeometricObject {
    private String color;
    private booleanfilled;
    public GeometricObject() {
        this.color = "blue";
    }
    public GeometricObject(String color, booleanfilled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public booleanisFilled() {
        return filled;
    }
    public void setFilled(booleanfilled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}