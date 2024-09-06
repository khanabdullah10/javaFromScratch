package classesAndObjects.bank;

import java.util.ArrayList;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
        if(this.balance < withdraw) System.out.println("you have insufficient balance");
        else this.balance -= withdraw;
    }
    public void display(){
        System.out.println("Account No :- "+ accountNumber+", Balance :- "+ balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String toString(){
        return "Account No: " + accountNumber + " ,Balance:" + balance;
    }
}public class Bank extends Account{


    public Bank(String accountNumber, double balance) {

        super(accountNumber, balance);

    }

    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc){
        accounts.add(acc);
    }

    public void remove_account(String accno){
        accounts.removeIf(account -> account.toString().contains(accno));


    }
    public void displayAccounts() {

        for(Account acc :accounts){
            System.out.println(acc);
        }

    }



    public static void main(String[] args) {
        Bank bank = new Bank("686702010011973",10000);
        Bank bk2 = new Bank("686702010011973",10000);
        Bank ac2 = new Bank("686702014654563",20000);
        Bank ac3 = new Bank("686554640011973",30000);
        Bank ac4 = new Bank("686705454251252",40000);
        Bank ac5 = new Bank("545445510011973",50000);
        bank.addAccount(bank);
        bank.addAccount(bk2);
        bank.addAccount(ac2);
        bank.addAccount(ac3);
        bank.addAccount(ac5);
        bank.displayAccounts();
        System.out.println(bk2.getBalance());



}
}
