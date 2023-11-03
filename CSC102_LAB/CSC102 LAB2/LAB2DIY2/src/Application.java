import java.util.Locale;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String text = scr.nextLine();
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.length());
        System.out.println(text.charAt(2));
        System.out.println(text.substring(2,text.length()));
    }
}
