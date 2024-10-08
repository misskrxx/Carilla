public class PrimitiveConcatenation {
    public static void main(String[] args) {
        // Creating all the primitive types except long and double
        byte b = 0;
        short s = 1;
        int i = 3;
        float f = 2.0f;
        char c1 = 'H';
        char c2 = 'r';
        boolean bool = true;

        // Concatenating them into the desired output
        String output = "" + c1 + i + s  + s + "0 " + 'w' + b + c2 + s + 'd' + " " + f + " " + bool;

        // Printing the result
        System.out.println(output);
    }
}
