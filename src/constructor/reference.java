package constructor;

public class reference {
    public static void says()
    {
        System.out.println("Hello ,Sir ");
    }
    public static void main(String[] args) {
        a ob=reference :: says;
        ob.say();
    }
}
@FunctionalInterface
interface a
{
 void say();
}