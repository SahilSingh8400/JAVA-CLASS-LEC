package inteerface;

interface B {
    public int sumn(int n);
}

public class sumofdirstn {
    public static void main(String[] args) {

        B obj = (n) -> {
            int r = 0;
            for (int i = 1; i <= n; i++) {
                r = r + i;
            }
            return r;
        };

        int stor = obj.sumn(10);
        System.out.println(stor);
    }
}