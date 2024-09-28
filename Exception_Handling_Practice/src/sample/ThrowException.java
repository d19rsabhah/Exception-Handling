package sample;

public class ThrowException {
    int a = 10;
    int res = 0;
    public void demo(){
        try{
            System.out.println("Before throwing exception manually!");
            int b = 0;
            if(b == 0){
                throw new ArithmeticException("Arithmetic Exception");
            }
            res = a / b;
            throw new RuntimeException("some random exception");
            //System.out.println("After throwing exception manually!");
        }catch(Exception e1){
            System.out.println("Exception occured : " + e1.getMessage());
        }
        System.out.println("After try & catch block!");
    }

    public static void main(String[] args) {
        ThrowException th = new ThrowException();
        th.demo();
    }
}
