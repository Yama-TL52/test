import java.util.Scanner;

public class Sample12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            if (input == null || input.trim().isEmpty()) {
                throw new NullPointerException("Input string is null or empty");
            }
            System.out.println("You entered: " + input);
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("test");

        }
    }
}