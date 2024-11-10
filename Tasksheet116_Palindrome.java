package activities;

public class Tasksheet116_Palindrome {
    public static void main(String[] args) {
        
       
        String x = "madam";


       StringBuilder reversedString = new StringBuilder(x).reverse();


       if (x.equals(reversedString.toString())) {
           System.out.println("The input string is a palindrome.");
       } else {
           System.out.println("The input string is not a palindrome.");
       }

    }

}
