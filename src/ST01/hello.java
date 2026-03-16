 package ST01;

// public class hello {
//     public static void main(String[] args) {
//         System.out.println("hello");
//     }
// }

class Student{
    int id=100;
    String name="sahil";
    void show(){
        System.out.println(id+ " "+ name);
    }
    public static void main(String[] args) {
        Student obj= new Student();
        obj.show();
    }

}