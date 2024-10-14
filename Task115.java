public class Task115 {
    public static void main (String[] args){

        String a = "Wow";
        String b = "Wow";
        String c = "Different";
        String d = "Wow!";

        boolean b1 = a == b; // true because a and b refer to the same string literal
        boolean b2 = d.equals(b + "!"); // true because d is "Wow!"
        boolean b3 = !c.equals(a); // true because c is "Different" and a is "Wow"

        if (b1 && b2 && b3) {
    System.out.println("Success!");
}


}}
