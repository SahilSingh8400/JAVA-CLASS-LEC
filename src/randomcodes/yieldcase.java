package randomcodes;

import java.util.Scanner;

public class yieldcase {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();
        String access=switch(role){
            case "admin"->{
                System.out.println("checking");
                yield "full acces";
            }
            default->{
                yield "no access";
            }
        };
     }

}
