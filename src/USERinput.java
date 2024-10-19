import java.util.Scanner;
public class USERinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name =scanner.nextLine();
        System.out.println("HELLO:"+name);


        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("your age is :"+age);

        scanner.nextLine(); // this is used to clear the buffer

        System.out.println("Enter your Favourite food: ");// this is not working because of the buffer
        String food = scanner.nextLine();
        System.out.println("your favourite food is :"+food);

    }
   }
