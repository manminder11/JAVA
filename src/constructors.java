public class constructors {
    public static void main(String[] args) {

       Human human = new Human("manminder", 21, 50.0, "cricket");
       Human h2 = new Human("Arthur", 50 , 120 , "cricket");

        System.out.println(human.age);
        System.out.println(human.name);
        System.out.println(human.weight);
        System.out.println(human.hobby);

        System.out.println(h2.weight);
        System.out.println(h2.name);
        System.out.println(h2.age);
        System.out.println(h2.hobby);

    }
}