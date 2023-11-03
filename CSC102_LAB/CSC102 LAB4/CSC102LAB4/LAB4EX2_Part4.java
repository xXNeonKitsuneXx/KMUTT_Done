public class LAB4EX2_Part4 {
    public static void main(String[] args) {
        int[] myNumbers;
        myNumbers = new int[5];
        System.out.println(myNumbers[0]);
        myNumbers[0] = 128;
        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[10]);
        //The value of 5 does not exist
        //Index 10 out of bounds for length 5
    }
}