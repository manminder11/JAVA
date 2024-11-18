public class Strmethods {
    public static void main(String []args) {
        // string is refer to store more than one character
        // and also have datatypes which is make it accessible
        String name = "Dameon";
        boolean result = name.equals("Dameon");
        System.out.println(result);

        // equals ignore method


        // ignorning the case sensitive thing

        String game = "tic-tac-toe";
        boolean r= game.equalsIgnoreCase("Game");
        System.out.println(r);


        // length method
        int l = name.length();
        System.out.println(l);

        // char

        char c = name.charAt(1);// char as method  == D
        // here

        System.out.println(c);

        // index of

        int rr = name.indexOf("D"); // == 0
        System.out.println(rr);


        // checking if empty

        boolean d = name.isEmpty();
        System.out.println(d);

        // To upper case
        String mm = name.toUpperCase();
        System.out.println(mm);


        // toLower case

        String lo = name.toLowerCase();
        System.out.println(lo);


        //  new string for rest of it
        //trim

        String games = "           COD---- Call of Duty                   ";
        String tr = games.trim();
        System.out.println(tr);



        String repl = games.replace("C" , "M");
        System.out.println(repl);
    }
}
