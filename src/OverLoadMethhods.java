public class OverLoadMethhods {
    public static void main(String[] args) {
        // methods that share the same name but different parameters
        // method name  + parameters = method signature

        int x = add(1,2);
        System.out.println(x);

        int y = add(1,4,5);
        System.out.println(y);


        int z = add(4,5,6,7);
        System.out.println(z);
    }

    static int add(int a, int b) {
        System.out.println("method #1");
        return a + b;



    }

    static int add(int a, int b, int c) {
        System.out.println(" method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println(" method  #3");
        return a + b + c + d;
    }
}



