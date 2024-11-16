public class Logicalop {
    public static void main(String[] args) {
        // & AND
        // || OR
        // ! NOT

        double temp = 37;

        String x;
        double bodytemp = 37;

        if(temp>= 37 && bodytemp>= 37 ) {
            x = "holy shit ";
            System.out.println(x);
        }


        String me = "man";
        double GPA = 3.7;
        String result;

        if(me == "man" && GPA >=3.7 ) {
            result = "doing good ";
            System.out.println(result);
        }
        else  {
            System.out.println("Doing bad");
        }

        // OR

        String games = "cod ";
        String g2 = "MW";
        String Collection;
         if(games == "cod" || g2 == "MW") {
             Collection = "GOOOD SHIT";
             System.out.println(Collection);
         }


         // !

        String Status;
        String N = "names";

        if(N != "games"){
            Status = " Not----Active";
            System.out.println(Status);
        } else {
            Status = "Active";
            System.out.println(Status);
        }

         }


        }




