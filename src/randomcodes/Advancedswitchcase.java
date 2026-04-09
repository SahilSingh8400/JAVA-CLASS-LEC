package randomcodes;
import java.util.Scanner;

public class Advancedswitchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        String s=switch (str){
            case "admin"->"full access";
            case "user"->"limited access";
            case "guest"->"read only";
            case "other"->"no access";
            default->"no access";
        };
        System.out.println(s);
        sc.close();
    }
}