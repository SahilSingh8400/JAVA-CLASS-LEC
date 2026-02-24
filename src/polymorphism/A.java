package polymorphism;

public class A {
    private int age;
    public void set(int a){
        if(a>0){
            this.age=a;
        }
        else{
            System.out.println("invalid age");
        }
    }
    public int get(){
        return this.age;
    }
}

class test{
    public static void main(String[] args) {
        A obj=new A();
        obj.set(-3);
        System.out.println(obj.get());
    }
}
