package sample;

public class TryCatchException {
    public static void main(String[] args) {
        int a = 10;
        int res = 0;
        try {
            System.out.println("before exception occurs in try block!");
            res = a / 0;
            System.out.println("after exception occurs in try block!");
        } catch(ArithmeticException e1){
            System.out.println("Exception occured :- " + e1.getMessage());
        }
        System.out.println("after try and catch block!");
    }
}
