package Exceptionhandling;

public class trydemo {
    public static void main(String[] args) {
        int a=0;
        try{
            int result=a/0;
        }catch(ArithmeticException e){
            System.out.println("case is handled");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("seconnd case");
        }
    }
}
