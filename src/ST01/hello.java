 package ST01;

// public class hello {
//     public static void main(String[] args) {
//         System.out.println("hello");
//     }
// }

class Student{
    int id=100;
    String name="sahil";
    void show(int k){
        System.out.println(k);
    }
    public static void main(String[] args) {
        Student obj= new Student();
        obj.show(4);
    }

}