package exception;

public class main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[1]);
            System.out.println("the try block");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println(" final block");


        }
    }
}


