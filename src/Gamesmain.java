public class Gamesmain {
    public static void main(String[]args){

        games gaming = new games();
        System.out.println(gaming.name);
        System.out.println(gaming.category);
        System.out.println(gaming.madeby);
        System.out.println(gaming.rating);
        gaming.available();
        gaming.updates();
    }
}
