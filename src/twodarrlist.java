import java.util.*;
import java.util.ArrayList;

public class twodarrlist {
    public static void main(String [] args){
        // it is list of lists
        // it is dynamic list of lists
        // we can change the size of list during runtime

        // dynamically adding items to arraylist as this step comes after creating the array
        ArrayList<ArrayList<String>> Food = new ArrayList<>();

        ArrayList<String> Bakerylist = new ArrayList<>();
        Bakerylist.add("popcorn");
        Bakerylist.add("Chips");
        Bakerylist.add("Coke");
        Bakerylist.add("Gems");




        System.out.println(Bakerylist);
        System.out.println(Bakerylist.get(0));
        System.out.println(Bakerylist.get(1));
        System.out.println(Bakerylist.get(2));
        Food.add(Bakerylist);





        ArrayList<String> Moreitems = new ArrayList<>();
        Moreitems.add("pasta");
        Moreitems.add("cookies");
        Moreitems.add("fish");
        Moreitems.add("egg");
        System.out.println(Moreitems);
        System.out.println(Moreitems.get(0));
        System.out.println(Moreitems.get(1));
        System.out.println(Moreitems.get(2));
        System.out.println(Moreitems.get(3));

        Food.add(Moreitems);

        System.out.println(Food);

        // to get first list from it
        System.out.println(Food.get(0));
        // for 2nd
        System.out.println(Food.get(1));
        // indexing the whole list as = 0 and = 1
        // by shuffling this we can get each item individually also


    }
 }
