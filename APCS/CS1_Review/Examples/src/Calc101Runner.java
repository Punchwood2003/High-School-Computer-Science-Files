import java.util.*;
public class Calc101Runner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * we can make an instance of Calc101 but why? Can't do it with
		 * Math class.
		 * 0
		 */
		// Calc101 calc = new Calc101();
	   
		System.out.print("Enter the first number :: ");
	    double num1 = scan.nextDouble();
	    System.out.print("Enter the second number :: ");
	    double num2 = scan.nextDouble();
	    
	    scan.close();
	    
	    Calc101.add(num1, num2);
	    Calc101.subtract(num1, num2);
	    Calc101.multiply(num1, num2);
	    Calc101.divide(num1, num2);
	} 
}
