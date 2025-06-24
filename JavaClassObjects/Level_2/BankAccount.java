import java.util.*;
public class BankAccount{
  private String accountHolder;
  private String accountNumber;
  private double balance;
  public BankAccount(String accountHolder,String accountNumber,int balance){
    this.accountHolder=accountHolder;
    this.accountNumber=accountNumber;
    this.balance=balance;
  }
  public void deposit(double amount){
    if(amount>0){
      balance+=amount;
      System.out.println("₹" + amount + " deposited successfully.");
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }
  public void withdraw(double amount){
    if(amount>0){
      if(amount<=balance){
        balance-=amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
      } else {
        System.out.println("Insufficient balance.");
      }
    }
    else{
      System.out.println("Withdrawal amount must be positive.");
    }
  }
  public void displayBalance() {
    System.out.println("Current balance: ₹" + balance);
  }
  public void displayAccountDetails() {
    System.out.println("Account Holder: " + accountHolder);
    System.out.println("Account Number: " + accountNumber);
    displayBalance();
  }
  public static void main(String[] args){
    String accountHolder="Sumit";
    String accountNumber="1234567890";
    int balance=5000000;
    BankAccount account=new BankAccount(accountHolder,accountNumber,balance);
    account.displayAccountDetails();
    System.out.println();
    account.deposit(5000);
    account.displayBalance();
    System.out.println();
    account.withdraw(2500);
    account.displayBalance();
    System.out.println();
    account.withdraw(13000);
  }
}