package Matma;
import java.util.Scanner;
import java.util.Set;

public class LowerFactorialPower {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Podaj 2 liczby naturalne(pierwsza z nich musi byæ wiêksza od drugiej.)");
	System.out.println("Program zwróci doln¹ potêgê faktorialn¹.");
	long m = input.nextInt();
	long n = input.nextInt();
	long LFP;
	n = m-n+1;

		if (n<=0){
			System.out.println("Podawaj liczby naturalne je³opie!!!"); }
		else
				{ if(m>=n)
			{ 
					for(LFP = m; m>n; n++)
				{
						LFP = LFP * n;
				}
					System.out.println("Twój wynik to "+LFP+"."); 
			}
		
		else System.out.println("Podaj liczby naturalne spe³niaj¹ce warunek m>=n !!!");
		}
		}
		

}
