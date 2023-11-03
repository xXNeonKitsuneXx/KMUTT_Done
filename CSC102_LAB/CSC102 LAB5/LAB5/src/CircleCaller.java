public class CircleCaller {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(2.5);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        System.out.println("---After the first Circle created---");
        System.out.println(c1.getNumberofCircleObjects());
        System.out.println(Circle.getNumberofCircleObjects());
        System.out.println(c1.countCircleObject);
        System.out.println(Circle.countCircleObject);

        Circle c2 = new Circle();
        c2.setRadius(4);
        System.out.println("---After the second Circle created---");
        System.out.println(c2.getNumberofCircleObjects());
        System.out.println(Circle.getNumberofCircleObjects());
        System.out.println(c2.countCircleObject);
        System.out.println(Circle.countCircleObject);

        Circle c3 = new Circle();
        System.out.println("---After the third Circle created---");
        System.out.println(c3.getNumberofCircleObjects());
        System.out.println(Circle.getNumberofCircleObjects());
        System.out.println(c3.countCircleObject);
        System.out.println(Circle.countCircleObject);
    }
}
