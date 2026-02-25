public class staticBlock {

    static{
        System.out.println("Static block executed");
    }   

    class Demo{
        static int x;
        static{
            x=100;

            public static void main(String[] args){
                System.out.println("Value of x = " + x);
            }
        }
    }
}