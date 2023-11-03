import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();
        String surname = scr.nextLine();
        int age = scr.nextInt();
        scr.next();
        String studyProgram = scr.nextLine();
//        int age = scr.nextInt();
        System.out.println("My name is "+ name + " " + surname);
        System.out.println("I'm " + age + " years old.");
        System.out.println("I'm studying " + studyProgram);
    }
}
