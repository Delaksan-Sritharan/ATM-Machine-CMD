import java.util.Scanner;

public class ATM {
    private User user;

    public ATM(User user){
        this.user = user;
    }
    public void start(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Dela ATM");

        System.out.println("Enter username : ");
        String userName = input.nextLine();

        System.out.println("Enter PIN : ");
        String pin = input.nextLine();

        if (userName.equals(user.getuserName()) && pin.equals(user.getPin())){
            System.out.println("Login Successful!");
            boolean running =  true;
            while (running){
                System.out.println("""
                        Select an option
                        1. Check Balance
                        2. Deposit 
                        3. Withdraw
                        4. Exit
                        """);
                System.out.println("Choice : ");
                int choice = input.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Balance: $"+user.getBalance());
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit : ");
                        double deposit = input.nextDouble();
                        user.deposit(deposit);
                        break;
                    case 3:
                        System.out.println("Enter amount to withdraw : ");
                        double withdraw = input.nextDouble();
                        user.withdraw(withdraw);
                        break;
                    case 4:
                        running = false;
                        System.out.println("Thank you for banking with us");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again");

                }
            }
            }else{
            System.out.println("Invalid credentials");

        }input.close();
    }

}
