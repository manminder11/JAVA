public class math {
    public static void  main(String[]args) {
        int coin = 100;
        int price   = 70;

        int change = Math.subtractExact(coin,price);
        System.out.println("The minimum value is: " + change);


        // like this there are many methods in the math class that can be used to perform mathematical operations in java
        // like abs, addExact, subtractExact, multiplyExact, incrementExact, decrementExact, negateExact, floorDiv, floorMod, max, min, random, round, signum, sqrt, toDegrees, toRadians, ulp etc.

    }
}
