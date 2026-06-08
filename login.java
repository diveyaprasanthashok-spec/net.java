import java.util.Scanner;

public class LoginSystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userId = "Coolboy2002";
        String password = "6969";

        String enteredId;
        System.out.println("Enter id:");
        enteredId = sc.nextLine();

        String enteredPass;
        System.out.println("Enter pass");
        enteredPass = sc.nextLine();

        try {
            if (userId.equals(enteredId) && password.equals(enteredPass)) {
                System.out.println("Login Successful");
            }
            else {
                int error = 10 / 0;
            }
        }
        catch (Exception e) {
            System.out.println("Invalid ID or Password");
        }
        finally {
            System.out.println("Verification Completed");
        }
    }
}
