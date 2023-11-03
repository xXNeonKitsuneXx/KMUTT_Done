import java.lang.reflect.Member;

public class Order {
    private int orderId;
    private LineItem lineitems[];
    private double totalAmount;
    private static int count;
    public Order (Member bob){
        this.orderId = count ++;
        this.totalAmount = 0;
        this.lineitems = new LineItem[20];
    }

    public void addLineItem(LineItem lineitem, int index){
        if(lineitems[index] == null){
            lineitems[index] = lineitem;
            System.out.println("Add line item successfully. ");
        }else{
            System.out.println("Add array is not empty. Line item cannot be added.");
        }
    }
    public void addLineItem(LineItem lineitem){
        boolean addSuccess = false;
        for(int i = 0; i < lineitems.length; i++){
            if(lineitems[i] == null){
                lineitems[i] = lineitem;
                addSuccess = true;
                break;
            }
        }
    
    if(addSuccess){
        System.out.println("Add line item successfully.");

    }else{
        System.out.println("Your basket is full. Cannot add a line item.");
    }
 }
 
 public void removeLineItemByArrayIndex (int index) {
    if (lineitems [index] !=null){
            lineitems [index] = null;
            System.out.println("Remove line item successfully.");
    }
    else{
        System. out.println("The array is empty. Nothing removed.");
       }
    }
    public void calculateTotalAmount ( ) {
        double sum = 0;
        for (LineItem L : lineitems){
        if(L !=null){
            sum = sum + L.calculaterotalAmount();
        }

        totalAmount = sum;
    }
}
         public double getTotalAmount () {
            calculateTotalAmount ();
            return totalAmount;
         }
        public double getOrderId(){
            return orderId;
        }
        public void printLineItems(){
            for(LineItem l : lineitems){
                if(l != null){
                    l.printDetail();
                }
            }
        }

 
}
