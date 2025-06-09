public class User {
    private String userName;
    private String pin;
    private double balance;

    public User(String userName,String pin){
        this.userName = userName;
        this.pin = pin;
        this.balance = 0.0;
    }
    public String getUserName(){
        return userName;
    }
    public String getPin(){
        return pin;
    }
    public Double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }




}
