package ST01;

public class St {

    int id;
    String name;

    St(int i, String n){
        id = i;
        name = n;
    }

    void show(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        St obj = new St(5, "Sahil");
        obj.show();
    }
}