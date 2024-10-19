public class swaptwoVAR {
public static void main(String[] args) {
String a = "Hello";
String b = "World";
String temp;

temp = b; // temp = World
b = a;    // b = Hello
a = temp; // a = World

    //a=b; // this will print World World because a is equal to b
    //b=a;  // this will print Hello Hello because b is equal to a

System.out.println("Before swapping");
System.out.println("a = " +   a);
System.out.println("b = " + b);
}
}
