public class Tasksheet114 {
    public static void main(String[] args) {
        // Step 1: Create an int variable with an initial value of 10
        int check_number = 10;

        // Step 2: Create a String variable to store the message
        String message;

        // Step 3: Create a loop that will check and print each number if it is odd or even
        for (int i = 1; i <= check_number; i++) {
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            // Step 4: Print the message value
            System.out.println(message);
        }
    }
}
