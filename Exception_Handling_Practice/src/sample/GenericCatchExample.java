package sample;

public class GenericCatchExample {
    public static void main(String[] args) {
        int a = 10;
        int res = 0;
        try {
            System.out.println("before exception occurs in try block!");
            res = a / 10;
            int arr[] = {1,2 ,3 };
            System.out.println("5th index of the array is : " + arr[5]);
            System.out.println("after exception occurs in try block!");
        } catch(Exception e1){
            System.out.println("Exception occured :- " + e1.getMessage());
        }
        System.out.println("after try and catch block!");
    }
}
