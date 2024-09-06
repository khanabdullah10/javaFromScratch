
package classesAndObjects.bankAccount;

class BankAccount {

    private String accountNumber;

    private String accountHolderName;

    private double balance;

    public BankAccount(){

    }

    public BankAccount(String accountNumber, String accountHolderName, double balance) {

        this.accountNumber = accountNumber;

        this.accountHolderName = accountHolderName;

        this.balance = balance;

    }

    public double getBalance() {

        return this.balance;

    }

    public void deposit(double amount) {

        if (amount > 0) {

            this.balance += amount;

        }

    }

    public void withdraw(double amount) {

        if (amount > 0 && balance >= amount) {

            this.balance -= amount;

        }

    }

}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(){

    }

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {

        super(accountNumber, accountHolderName, balance);

        this.interestRate = interestRate;

    }

    public double applyInterest() {

        double interest = getBalance() * interestRate / 100;

        deposit(interest);

        return interest;

    }

    public static void main(String[] args) {

        SavingsAccount sa  = new SavingsAccount("686702010011973","Abdullah Ubaid Khan",6.200,12.0);

        sa.deposit(4000);

        System.out.println(sa.getBalance());

        sa.withdraw(2000);

        System.out.println(sa.getBalance());

        double interest =  sa.applyInterest();

        System.out.println(interest);

    }

}
