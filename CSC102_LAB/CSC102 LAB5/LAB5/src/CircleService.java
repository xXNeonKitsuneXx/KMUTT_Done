public class CircleService {
        private final static double PI = 3.14159;
        public static double getArea(double radius){
            return PI * radius * radius;
        }
        public static double getDiameter(double radius){
                return 2 * radius;
        }
        public static double getPerimeter(double radius){
                return 2 * PI * radius;
        }
}
