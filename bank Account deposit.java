import java.util.Scanner;

/**
 *
 * @author hp
 */

public class Set {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter deposit amount: ");
            int amount = sc.nextInt();

            if (amount < 1000) {
                throw new Exception("Minimum deposit should be Rs.1000");
            }

            System.out.println("Account created successfully.");
            System.out.println("Deposited Amount: Rs." + amount);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
