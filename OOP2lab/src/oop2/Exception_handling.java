package oop2;
import java.util.Scanner;

public class Exception_handling {
		   public static int quotient( int numerator, int denominator )
		   {
		      return numerator / denominator; 
		   }
		
		   public static void main( String args[] )
		   {
		      @SuppressWarnings("resource")
			Scanner scanner = new Scanner( System.in ); // scanner for input
		
		      System.out.print( "Please enter an integer numerator: " );
		      int numerator = scanner.nextInt();
		      System.out.print( "Please enter an integer denominator: " );
		      int denominator = scanner.nextInt();
		
		      int result = quotient( numerator, denominator );
		      System.out.printf( 
		         "\nResult: %d / %d = %d\n", numerator, denominator, result );
	   } 
	
}
