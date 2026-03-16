package ST01;

public class inheritanc {
    void sound(){
        System.out.println("animal make sound");
    }
}

class dog extends inheritanc{
    public static void main(String[] args) {
        dog obj=new dog();
        obj.sound();
    }
}
