package randomcodes;

public class staticBlock {

    static{
        System.out.println("Static block executed");
    }   

    class Demo{
        static int x=10;

            public static void main(String[] args){
                System.out.println("Value of x = " + x);
            }
    }
}