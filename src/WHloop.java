import  java.util.Scanner;
public class WHloop {
    public static void main(String[] args) {

        // AS LONG AS THE CONDITION MATCHES THE CODE WILL RUNNNNN

        Scanner scanner = new Scanner(System.in);
        String na = "";

        while (na.isBlank()) {
            System.out.println("Enter your name");

            na = scanner.nextLine();
        }
        System.out.println("Hello" + na);
    }

}
