package Matma;
import java.util.Scanner;
import java.util.Set;

public class UpperFactorialPower {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Podaj 2 liczby naturalne.");
	System.out.println("Program zwróci górn¹ potêgê faktorialn¹.");
	long m = input.nextInt();
	long n = input.nextInt();
	long UFP;
	n = n+m;

		if (m<=0){
			System.out.println("Podawaj liczby naturalne je³opie!!!"); }
		else
				{
					for(UFP = 1; m<n; m++)
				{
						UFP = UFP * m;
				}
					System.out.println("Twój wynik to "+UFP+"."); 
			}
		
		}
		

}
