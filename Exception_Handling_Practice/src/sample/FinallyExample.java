package sample;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            throw new RuntimeException("Some Example");
        } catch (Exception e){
            System.out.println("Exception occured : " + e.getMessage());
        } finally {
            System.out.println("Finally Block!"); //finally block will always execute
        }
    }
}
