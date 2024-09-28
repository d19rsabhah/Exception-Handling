package ownCustomizedException;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :- ");
        int number = sc.nextInt();
        try {
            if(number == 0){
                throw new MyOwnException("Entered number can't be 0!");
            }
            if (number < 0){
                throw new MyOwnException("Entered number can't be negative!", new RuntimeException("Can't accept negative value"));
            }
            if (number > 0){
                throw new MyOwnException(new RuntimeException("Please enter a valid number!"));
            }
        } catch (Exception e) {
            System.out.println("Exception Occured :- " + e.getMessage());
        }
    }
}
