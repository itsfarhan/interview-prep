class BankingEncapsulationExample{
    private double balance;

        BankingEncapsulationExample(double balance) {
            this.balance = balance;
        }
    
        public void deposit(double amount){
            if (amount > 0){
                balance += amount;
            }
            else {
                System.out.println("Invalid deposit amount");
            }
        }
    
        public void withdraw(double amount){
            if (amount > 0 && amount <= balance){
                balance -= amount;
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
    
        public double getBalance() {
            return balance;
        }
    }
    
    public class EncapsulationExample {
        public static void main(String[] args) {
        BankingEncapsulationExample account = new BankingEncapsulationExample(10000.00);
        account.deposit(5000.0);
        account.withdraw(2000.0);
        System.out.println("Balance of the account is -> "+ account.getBalance());

    }
}
