
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fahrenheit;
		System.out.println("Enter the temperature value in Celsis");
		Scanner a= new Scanner(System.in);
		double celsius= a.nextDouble();
		
		fahrenheit = ( celsius*9/5 ) + 32;
		System.out.println("Temperature value in fahrenheit is "+fahrenheit);
		
	}

}
