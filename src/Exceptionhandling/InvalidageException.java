package Exceptionhandling;
import java.util.*;;

class InvalidageeException extends Exception {
    InvalidageeException(String msg){
        super(msg);
    }
}

class Myclass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new InvalidageeException("you are not rligible");
            }else{
                System.out.println("you are eligible");
            }
        }catch(InvalidageeException e){
            System.out.println(e);
        }
    }
}
