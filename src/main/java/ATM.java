import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("        Dela ATM Machine");
        menu();
    }

    // main menu
    public static void menu(){
        System.out.println("""
                           ATM System
                1. Create Accouunt
                2. Login 
                3. Check Balance
                4. Deposit Money
                5. Withdraw Money
                6. Exit
                """);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String userName = input.nextLine();
    }
}
