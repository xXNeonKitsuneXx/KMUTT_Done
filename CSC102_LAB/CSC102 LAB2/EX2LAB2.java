public class EX2LAB2 {
    public static void main(String[] args) {
        String st1 = new String("Hello");
        String st2 = "Programming";
        int a = st2.length();
        char b = st2.charAt(3);
        String c = st2.concat(st1);
        int d = st2.indexOf("a");
        int e = st2.indexOf("o", 4);
        String f = st2.substring(3);
        String g = st2.substring(3, 6);
        System.out.println(st1);
        System.out.println(a+b+c+d+e+f+g);
    }
}
