
import java.util.Scanner;
public class exercise_1 {
    public static void main(String[] args) {


        // FIND HYPOTENUSE OF A TRIANGLE

       //int  A = 5;
        //int  B = 6;
       //double  C = Math.sqrt(A*A + B*B);
      //  System.out.println("Hypotenuse of a triangle is: " + C;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of firstside: ");
        int A = scanner.nextInt();

        System.out.println("Enter the value of seconder: ");
        int B = scanner.nextInt();

        double C = Math.sqrt(A*A + B*B);
        System.out.println("Hypotenuse of a triangle is: " + C);

    }

}
