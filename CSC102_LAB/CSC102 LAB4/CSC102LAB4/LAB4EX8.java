public class LAB4EX8 {
    public static void main(String[] args) {
        int[][] numTable = {
                {1, 2, 3}, {4, 5}};
        System.out.println (numTable.length);
        System.out.println(numTable[0].length);
        System.out.println(numTable[1].length);
        System.out.println(numTable[1][0]);
        System.out.println(numTable[1][2]);//This one wrong
        //Index 2 out of bounds for length 2
    }
}
