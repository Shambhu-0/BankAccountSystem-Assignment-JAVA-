public class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(long num, String name, double balance){
        this.accountNumber = num;
        this.accountHolderName = name;
        this.balance = balance;
    }

    public void deposit(double val){
        this.balance += val; 
    }

    public void withdraw(double amount){
        if(this.balance < amount) {
            System.out.println("Isufficient Balance");
            return;
        }
        this.balance -= amount;
    }

    public void checkBalance(){
        System.out.println("Available Balance: " + this.balance);
    }

    public void displayDetails(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Available Balance: " + this.balance);
    }

}