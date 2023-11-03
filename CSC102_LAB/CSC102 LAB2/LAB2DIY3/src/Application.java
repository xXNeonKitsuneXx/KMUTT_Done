import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String words1 = scr.nextLine();
        String words2 = scr.nextLine();
        if (words1.equalsIgnoreCase(words2)){
            System.out.print("equal");
        }
        else {
            System.out.print("not equal");
        }
    }
}
