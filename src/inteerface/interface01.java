package inteerface;

// interface Animal {
//     void sound(); //abstract method
    
// }

// class Dog implements Animal  {
//   public void sound(){
//     System.out.println("this is abstracted interfaced");
//   }
// }

// class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.sound();
//     }
// }

// multiple interfaces
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {
     public void show() {
        System.out.println("Show method");
    }

    public void display() {
        System.out.println("Display method");
    }
}
