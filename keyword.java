package exception;

public class keyword {
    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access denied - you must be over 18 years old");

        }
        else {
            System.out.println("Access granted - yor are old");

        }

    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
