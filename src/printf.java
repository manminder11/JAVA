public class printf {
    public static void main(String[] args) {
        // optional method to control display format the the console window  with anything
        // different from print and printline

        // elements for this

        // %d is called decimal value  so wherever you put it in the string it will appear there
        System.out.printf("My name is manminder singh and my age is %d", 20);

        // conversion characters
        boolean myboolean = true;
        char mychar = 'A';
        String mystr = "Manminder";
        int myint = 7;
        double md = 100;

        System.out.printf("%b",myboolean);

        // %d = decimal or digit  int
        // %f = double
        // %b = boolean
        // %c = mychar
        // %s = String



        // width
        // precision
        // flags


        // width
        // minimum number of characters to be written in output
        System.out.printf("Hello %-10s",mystr);  // %s we can define spaces like in python
        //%s20 means give a width of 20 spaces
        // like i did in the code

    }
}