public class NumberChecker {
    public static void main(String[] args) {
    int number1 = 1;
    int number2 = 0;
    int number3 = 0;

    for (number1 = 1; number1 < 10; number1++ ) {
        for ( number2 = 0; number2 < 10; number2++ ) { 
            for ( number3 = 0; number3 < 10; number3++ ){
                int square = ( number1 * number1 ) + ( number2 * number2 ) + ( number3 * number3 );
                int number = ( number1 * 100) + ( number2 * 10 ) + ( number3 );
                if ( square == number ) {
                  System.out.println(number);
                }
            }
        }
    }
    }
}
