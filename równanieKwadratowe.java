package Matma;
import java.util.Scanner;

public class równanieKwadratowe {

	public static void main(String[] args) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("Podaj wspó³czynnik przy x^2:");
		double a = skaner.nextDouble();
		System.out.println("Podaj wspó³czynnik przy x:");
		double b = skaner.nextDouble();
		System.out.println("Podaj wyraz wolny:");
		double c = skaner.nextDouble();
		double Delta = b*b-4*a*c;
		
		if (Delta<0)
		{
			Delta = -Delta;
			Delta = Math.sqrt(Delta);
			double imX1=-Delta/(2*a);
			double imX2=Delta/(2*a);
			double reX=-b/(2*a);
			System.out.println("Oba pierwiastki równania s¹ zespolone i wynosz¹:"+reX+imX1+"i"+" oraz "+reX+"+"+imX2+"i.");
		}
		else if (Delta == 0)
		{
			double x = -b/(2*a);
			System.out.println("Pierwiastek jest podwójny i wynosi "+ x+".");
		}
		else //delta dodatnia
		{
			Delta = Math.sqrt(Delta); 
			double x1 = (-b-Delta)/(2*a);
			double x2 = (-b+Delta)/(2*a);
			System.out.println("Równanie ma 2 ró¿ne pierwiastki rzeczywiste: "+x1+" oraz "+ x2);
		}
		}
	

}
