class BankAccount { 
    protected static String accountNumber; // Shared by all instances
    protected double balance = 0;

    // Getter and Setter for accountNumber (Static)
    public static String getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(String accountNumber) {
        if (BankAccount.accountNumber == null || BankAccount.accountNumber.isEmpty()) {
            BankAccount.accountNumber = accountNumber;
        } else {
            System.out.println("Account number is already set to: " + BankAccount.accountNumber);
        }
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Default Constructor
    public BankAccount() {
    }

    // Parameterized Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }

    // Withdraw Method
    public void withDraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance: " + balance);
        }
    }

    // Display Balance Method
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " and Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Getter and Setter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Constructor
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // Calculate Interest
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest credited to " + accountNumber + " is: " + interest);
        System.out.println("Balance after interest: " + balance);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    // Getter and Setter for overdraftLimit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Constructor
    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withDraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance and overdraft limit: " + (balance + overdraftLimit));
        }
    }
}

class FixedDepositAccount extends BankAccount {
    private double tenure;

    // Getter and Setter for tenure
    public double getTenure() {
        return tenure;
    }

    public void setTenure(double tenure) {
        this.tenure = tenure;
    }

    // Constructor
    public FixedDepositAccount(double balance, double tenure) {
        super(balance);
        this.tenure = tenure;
    }

    // Display Maturity Details
    public void displayMaturityDetails() {
        System.out.println("Account Number: " + accountNumber + ", Maturity Balance: " 
            + (balance * Math.pow(1.05, tenure / 12)));
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Set the account number once (it will be shared across all instances)
        BankAccount.setAccountNumber("CITI0001");

        // Create a BankAccount and test functionality
        BankAccount bankAccount = new BankAccount(50000);
        bankAccount.deposit(2000);
        bankAccount.displayBalance();

        // Create a SavingsAccount and calculate interest
        SavingsAccount savings = new SavingsAccount(10000, 5);
        savings.calculateInterest();

        // Create a CurrentAccount and test withdrawal with overdraft limit
        CurrentAccount current = new CurrentAccount(20000, 5000);
        current.withDraw(6000);
        current.deposit(1000);
        current.displayBalance();

        // Create a FixedDepositAccount and display maturity details
        FixedDepositAccount fd = new FixedDepositAccount(150000, 24);
        fd.displayMaturityDetails();
    }
}
