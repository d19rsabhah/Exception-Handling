package sample;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsException {
    public void demo() throws IllegalAccessError , IOException{
        System.out.println("Inside demo method!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value :- ");
        int a = sc.nextInt();
        if (a == 1){
            throw new RuntimeException("Value of a is 1 & it's an unchecked exception!");
        }else if (a == 2){
            throw new ArithmeticException("Value of a is 2 & it's an unchecked exception!");
        }else if (a == 3){
            throw new IllegalAccessError("Value of a is 3 & it's a checked exception!");
        } else if (a == 4){
            throw new IOException("Value of a is 4 & it's an IOException which is a checked exception!");
        }
    }

    public static void main(String[] args) {
        ThrowsException throwsObj = new ThrowsException();
        try {
            throwsObj.demo();
        } catch (IOException e) {
            System.out.println("Exception occured :- " + e.getMessage());
        }

    }
}
