
import java.util.Scanner;
public class USERinput {
    public static void  main(String[] args) {

        Scanner scanner = new Scanner(System.in); // creating a scanner object
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // reading a string
        System.out.println("Your name is: " + name);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // reading an integer
        System.out.println("Your age is: " + age);

        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble(); // reading a double
        System.out.println("Your salary is: " + salary);

        System.out.println("Enter your position: ");
        String position = scanner.next(); // reading a string
        System.out.println("Your position is: " + position);


        System.out.println(name + " is " + age + " years old and earns " + salary + " as a " + position + ".");
    }
    }