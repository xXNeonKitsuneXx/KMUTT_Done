import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numin = scr.nextInt();
        if (numin == 1){
            System.out.print("Monday");
        }
        else if (numin == 2){
            System.out.print("Tuesday");
        }
        else if (numin == 3){
            System.out.print("Wednesday");
        }
        else if (numin == 4){
            System.out.print("Thursday");
        }
        else if (numin == 5){
            System.out.print("Friday");
        }
        else if (numin == 6){
            System.out.print("Saturday");
        }
        else if (numin == 7){
            System.out.print("Sunday");
        }
    }
}
