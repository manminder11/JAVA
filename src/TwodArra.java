public class TwodArra {
    public static void main(String [] args){

        // 2d array = is like array of arrays
        String[][] cars = new String[3][3];
        cars[0][0] = "camero";
        cars[0][1] = "lambo";
        cars[0][2] = "dameons";
        cars[1][0] = "mero";
        cars[1][1] = "mbo";
        cars[1][2] = "meons";
        cars[2][0] = "amero";
        cars[2][1] = "ambo";
        cars[2][2] = "ameons";


        for(int i= 0; i<cars.length;i++) {
            System.out.println();
            for(int j = 0; j<cars[i].length; j++ ) {
                System.out.print(cars[i][j]+ " ");

            }
        }









    }
}
