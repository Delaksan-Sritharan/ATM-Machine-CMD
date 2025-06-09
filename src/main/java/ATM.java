import java.util.Scanner;

public class ATM {
    private User user;

    public ATM(User user){
        this.user = user;
    }
    public void start() {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Dela ATM");

        String userName;
        while (true) {
            System.out.print("Enter username: ");
            userName = input.nextLine();
            if (!userName.trim().isEmpty() && !userName.matches(".*\\s.*")) {
                break;
            } else {
                System.out.println("Invalid input. Username cannot be empty or contain whitespace characters. Please try again.");
            }
        }

        String pin;
        while (true) {
            System.out.print("Enter PIN: ");
            pin = input.nextLine();
            if (!pin.trim().isEmpty() && !pin.matches(".*\\s.*")) {
                break;
            } else {
                System.out.println("Invalid input. PIN cannot be empty or contain whitespace characters. Please try again.");
            }
        }

        if (userName.equals(user.getUserName()) && pin.equals(user.getPin())) {
            System.out.println("Login Successful!");
            boolean running = true;
            while (running) {
                System.out.println("""
                        Select an option
                        1. Check Balance
                        2. Deposit 
                        3. Withdraw
                        4. Exit
                        """);
                System.out.print("Choice : ");
                if (input.hasNextInt()){
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.printf("Balance: $ %.2f%n", user.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        if (input.hasNextDouble()) {
                            double deposit = input.nextDouble();
                            user.deposit(deposit);
                        } else {
                            System.out.println("Invalid amount.");
                            input.next();
                        }
                        input.nextLine();
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        if (input.hasNextDouble()) {
                            double withdraw = input.nextDouble();
                            user.withdraw(withdraw);
                        } else {
                            System.out.println("Invalid amount.");
                            input.next();
                        }
                        input.nextLine();
                        break;
                    case 4:
                        running = false;
                        System.out.println("Thank you for banking with us");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again");
}
                }else {
                    System.out.println("Please enter a number between 1 and 4.");
                    input.next();
                }
            }
        } else {
            System.out.println("Invalid credentials");

        }
        input.close();
    }

}
