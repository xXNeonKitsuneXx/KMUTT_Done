public class LAB4EX6_WhileLoop {
    public static void main(String[]args){
        String[] fruits = new String[3];
        fruits[0] = new String("Apple");
        fruits[1] = "Banana";
        fruits[2] = new String("Mango");
        int i = 0;
        while (i < fruits.length){
            System.out.println(fruits[i]);
            i++;
        }
    }
}