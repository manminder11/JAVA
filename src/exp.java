public class exp {
    public static void main (String[]args){
        {
            // expressions are building blocks of java programs that return a value after computation
            // expressions are made up of variables, operators, and methods
            // expressions are used to perform operations on variables

            // operators in java
            // 1. Arithmetic operators
            // 2. Assignment operators
            // 3. Comparison operators
            // 4. Logical operators
            // 5. Bitwise operators
            // 6. Ternary operators
            // 7. Instance of operators
            // 8. new operators

            // 1. Arithmetic operators
            // +, -, *, /, %, ++, --
            int number = 100;
            number = number + 10; // 110   // sum
            number = number - 10; // 100  // difference
            number = number * 10; // 1000  // product
            number = number / 10; // 100  // quotient
            number = number % 15; // 10  // remainder

            // increment and decrement operators
            number++; // 11
            number--; // 10
            System.out.println(number);

            // integer division
            int a = 10;
            int b = 3;
            int result = a/b; // 3
// because the result is an integer, the decimal part is truncated

            System.out.println(result); // 3

// to fix it with double
            double result2 =  (double) a/b; // 3.0
            System.out.println("RESULT is: "+result2); // 3.3333333333333335


            System.out.println();

        }
    }
}


