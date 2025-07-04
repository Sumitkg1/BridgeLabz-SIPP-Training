abstract class BankAccount {  
    private String accountNumber, holderName;
    private double balance;

    public BankAccount(String accountno, String name, double balance) {
        this.accountNumber = accountno;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountno, String name, double balance) {
        super(accountno, name, balance);
    }

    public double calculateInterest() {
        return 0.04 * balance;
    }

    public void applyForLoan(double amount) {
        System.out.println("Applied for loan: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return true;
    }
}
