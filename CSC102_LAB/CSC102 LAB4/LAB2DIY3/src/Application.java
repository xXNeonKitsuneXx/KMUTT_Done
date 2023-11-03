import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] arr = new int[19];
        int i,j,k;
        int h = 0;
        int m = 0;
        for (i = 0; i < arr.length; i++) { //arr.length = 19 0-18
            arr[i] = scr.nextInt();
        }
        if (arr[0] == 1) {
            h = h + 6;
        }
        for (j = 1; j < 7; j++) {
            if (arr[j] == 1){
                h = h + 1;
            }
        }
        for (k = 7; k < 16;k++){
            if (arr[k] == 1){
                m = m + 1;
            }
        }
        if (arr [16] == 1){
            m = m + 10;
        }
        if (arr [17] == 1){
            m = m + 20;
        }
        if (arr [18] == 1){
            m = m + 30;
        }
        
        if (h < 10){
            System.out.println("0" + h + ":" + m);
        }
        else {
            System.out.println(h + ":" + m);
        }
    }
}