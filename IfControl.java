
import java.util.Scanner;

public class IfControl {
	
	public static double factorials() {
		
		//Declare variable
		int n, x;
		int factorial = 1;
		int i = 1;
		double e = 1;
		double result = 1;
		
		//insert information
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		n = input.nextInt();
		if(n < 0) {
			System.out.println("Request re-enter n: ");
			n = input.nextInt();
		}
		
		System.out.println("Enter x: ");
		x = input.nextInt();
		if(x < 0) {
			System.out.println("Request re-enter x: ");
			x = input.nextInt();
		}
		
		if(n >= 0) {
			while(i <= n) {
				
				//factorials
				factorial = factorial * i;
				
				//calculate constant e
				e += 1.0/factorial;
				
				//
				result += (Math.pow(x,i))/factorial;
				i++;
			}
			System.out.printf("Result of the factorial: %s", factorial);
			System.out.printf("\nResult of the factorial: %s", e);
			System.out.printf("\nResulr of the constant: %s", result);
		}
		return i;
	} //end method factorials
	
	public static void main(String[] args) {
		
		IfControl.factorials();
	} //end method main
	
} //end class Ifcontrol
