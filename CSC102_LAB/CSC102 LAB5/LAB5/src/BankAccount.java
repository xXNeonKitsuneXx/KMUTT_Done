public class BankAccount {
        private int accId;
        private double balance;
        private static int count;

        public static int getCounter(){
                return count;
        }
        public int getAccId(){
                return accId;
        }
        public double getBalance(){
                return balance;
        }
        public void setAccId(int accId) {
                this.accId = accId;
        }
        public void setBalance(double balance) {
                this.balance = balance;
        }
        public void deposit(double amount){
                balance = balance + amount;
        }
        public void withdraw(double amount){
                if (amount <= balance){
                        balance = balance - amount;
                }
                else{
                        System.out.println("Not Enough Money");
                }
        }
}
