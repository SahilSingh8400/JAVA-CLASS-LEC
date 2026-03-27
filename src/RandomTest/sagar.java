package RandomTest;

class sagar1 {
    int id;
    String name;
    void show(){
        System.out.println(id+name);
    }
}

class sagar{
    public static void main(String[] args) {
        sagar1 obj= new sagar1();
        obj.id=100;
        obj.name="sahil";
        obj.show();
        
    }
}

