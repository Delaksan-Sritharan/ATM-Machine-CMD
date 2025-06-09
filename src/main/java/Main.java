public class Main {
    public static void main(String[] args) {
        User user = new User("Delaksan","1234");
        ATM atm = new ATM(user);
        atm.start();
    }
}
