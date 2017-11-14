/*
  	ISYS 320
  	Name(s): Timothy James
  	Date: 11/13/2017
*/



public class P1_OutputLoopResult {

	public static void main(String[] args) {
		printSumOfSquaresTo5();
	}
	
	public static void printSumOfSquaresTo5() {
		for( int i = 1; i <= 5; i++ ) {
			int finalResult = 0;
			finalResult = finalResult + i * i;
			
		System.out.println( "Final result is: " + finalResult );
		}
	}

}
