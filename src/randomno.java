//////////////////import java.util.Random;
import java.util.Random;
public class randomno {
    public static void main(String args[]) {
        Random random = new Random();

        double x = random.nextDouble();
        System.out.println(x);


        // make same as with the other variable types like int random
        // or others


        // now lets limit the value

        int y = random.nextInt(6);
        System.out.println(y);
    }
}

