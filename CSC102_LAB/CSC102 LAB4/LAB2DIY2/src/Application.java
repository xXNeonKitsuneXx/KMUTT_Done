import java.util.*;
public class Application {
    public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int row = scr.nextInt();
            int column = scr.nextInt();
            int i, j;
            int arr[][] = new int[row][column];
            int ans[] = new int[row];
            int total = 0;
            boolean x = true;
            for (i = 0; i < row; i++) {
                for (j = 0; j < column; j++) {
                    arr[i][j] = scr.nextInt();
                }
            }
            for (i = 0; i < row; i++) {
                for (j = 0; j < column; j++) {
                    total += arr[i][j];
                }
                ans[i] = total;
                if (ans[0] != ans[i]) {
                    x = false;
                    System.out.println("false");
                    return;
                }
                total = 0;
            }
            if (x == true) {
                System.out.println("true");
                return;
            }
    }
}
