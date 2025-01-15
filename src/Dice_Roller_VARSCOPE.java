import java.util.Random;

public class Dice_Roller_VARSCOPE {

    Dice_Roller_VARSCOPE(){
        Random random = new Random();
        int number = 0;
        roll(random, number);    // roll method doesnot have the access of the random
    }
    void roll(Random random, int number){
        number = random.nextInt(6)+ 1;
        System.out.println(number);
    }
}
