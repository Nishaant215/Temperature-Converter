import java.util.Scanner;

public class temp_console {

	public static void main(String[] args) {
     
		double F, C;
		
		System.out.print("Enter degrees in Fahrenheit ");
		Scanner degF = new Scanner(System.in);
	
		F = degF.nextDouble();
		
		C = ((F - 32.0)* (5.0/9.0) );
		
		double roundOff_deg = Math.round(C * 100.0) / 100.0;
		
		System.out.println(roundOff_deg + " °C");
		
	}

}
