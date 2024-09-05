package test.question_1;

import java.util.ArrayList;

public class Bank {

    private String account_holder_name;
    private int acc_no;
    private String bank_name;
    private int balance;

    ArrayList<Bank> account;

    public Bank(){

        account = new ArrayList<>();
    }

    public Bank(String account_holder_name, int acc_no, String  bank_name , int balance) {
        this.account_holder_name = account_holder_name;
        this.acc_no = acc_no;
        this.bank_name = bank_name;
        this.balance =  balance;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getBank_name() {
        return bank_name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setBank_name(String Bank_name) {
        this.bank_name = bank_name;
    }

    @Override
    public String toString() {
        return "\nBank :- " +
                " Account holder name : " + account_holder_name + '\'' +
                ", Acc number : " + acc_no +
                ", Bank name : " + bank_name +
                ", Balance : " + balance;
    }


    public void searchAccountNum(int number){

        for (Bank bank : account) {
            if (bank.acc_no == number) {
                System.out.println("Account number " + number + " found Successfully !");
                break;
            } else {
                System.out.println(" Account number : " + number + " Not found !");
            }
        }

    }

    void addAccount (Bank detail){
        account.add(detail);
    }

    public void deposit(int amount){
        this.balance += amount;
        System.out.print("\nAmmount " + amount + " added successfuly for "+ account_holder_name);
    }

    public void withdraw(int amount){
        if(amount > balance ) System.out.print("No enough balance for "+ account_holder_name);
        else this.balance -= amount;

    }
    public void exit(){
        System.out.println("Have a Good day ! ");
    }



    void display(){
//
        System.out.println(account);
    }

    public static void main(String[] args) {
        Bank bank =  new Bank();

        Bank acc1 = new Bank("ABC",8785,"Union",5000);
        Bank acc2 = new Bank("EFG",1255,"PNB",4000);
        Bank acc3 = new Bank("XYZ",5121,"BOB",8000);

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        System.out.println("Displaying account details \n");
        bank.display();
        System.out.println();
        System.out.println("Deposit");
        acc1.deposit(5000);
        acc2.deposit(2000);
        acc3.deposit(3000);
        System.out.println();
        System.out.println();
        bank.display();
        System.out.println();

        System.out.println("Withdraw");
        acc1.withdraw(1000);
        acc2.withdraw(2000);
        acc3.withdraw(3000);
        System.out.println();
        bank.display();
        System.out.println();

        System.out.println("Searching for Accounts");
        System.out.println();
        bank.searchAccountNum(8785);
        System.out.println();
        bank.exit();




    }





}
