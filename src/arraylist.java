import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // A resizable array

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.add("chips");
        food.add("coke");


        for(int i = 0; i<food.size() ; i++) {
            // for this we dont use food.length instead we use size


            // set and replace the value in array
            //food.set(0 , "cookies"); // index and value
            //food.remove(1); // removing with index
            food.clear(); // clears everything

            System.out.println(food.get(i));
        }


    }
}
