package Matma;
import java.util.Scanner;
import java.util.Set;

public class LowerFactorialPower {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Podaj 2 liczby naturalne(pierwsza z nich musi by� wi�ksza od drugiej.)");
	System.out.println("Program zwr�ci doln� pot�g� faktorialn�.");
	long m = input.nextInt();
	long n = input.nextInt();
	long LFP;
	n = m-n+1;

		if (n<=0){
			System.out.println("Podawaj liczby naturalne je�opie!!!"); }
		else
				{ if(m>=n)
			{ 
					for(LFP = m; m>n; n++)
				{
						LFP = LFP * n;
				}
					System.out.println("Tw�j wynik to "+LFP+"."); 
			}
		
		else System.out.println("Podaj liczby naturalne spe�niaj�ce warunek m>=n !!!");
		}
		}
		

}
