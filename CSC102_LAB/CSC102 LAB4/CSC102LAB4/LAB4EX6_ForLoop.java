public class LAB4EX6_ForLoop {
    public static void main(String[]args){
        String[] fruits = new String[3];
        fruits[0] = new String("Apple");
        fruits[1] = "Banana";
        fruits[2] = new String("Mango");
        for(String f : fruits){
            System.out.println(f);
        }
    }
}
