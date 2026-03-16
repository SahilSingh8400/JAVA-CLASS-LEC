 package ST01;

// public class exceptionhandle {
//     public static void main(String[] args) {
//         try{
//             int a=10;
//             int b=0;
//             int c=a/b;
//         }
//         // catch(ArithmeticException e){
//         //     System.out.println("file not found");
//         // }
//         finally{
//             System.out.println("always execcuted");
//         }
//         System.out.println("program continues");
        
//     }
// }

public class exceptionhandle {
    public static void main(String[] args) {

        int age = 15;

        if(age < 18){
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible");
    }
}