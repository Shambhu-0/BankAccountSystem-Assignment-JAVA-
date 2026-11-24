public class Main {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount(2347932, "Rajesh", 15039.38);
        BankAccount person2 = new BankAccount(2647345, "Shrishti", 12080.00);
        
        person1.deposit(4500.84);
        person1.deposit(2400.00);
        person1.checkBalance();
        person1.withdraw(10000.29);
        person1.checkBalance();
        person1.displayDetails();
        
        System.out.println();

        person2.deposit(2500.04);
        person2.deposit(8960.80);
        person2.checkBalance();
        person2.withdraw(10000.29);
        person2.checkBalance();
        person2.displayDetails();


    }    
}
