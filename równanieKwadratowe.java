package Matma;
import java.util.Scanner;

public class r�wnanieKwadratowe {

	public static void main(String[] args) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("Podaj wsp�czynnik przy x^2:");
		double a = skaner.nextDouble();
		System.out.println("Podaj wsp�czynnik przy x:");
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
			System.out.println("Oba pierwiastki r�wnania s� zespolone i wynosz�:"+reX+imX1+"i"+" oraz "+reX+"+"+imX2+"i.");
		}
		else if (Delta == 0)
		{
			double x = -b/(2*a);
			System.out.println("Pierwiastek jest podw�jny i wynosi "+ x+".");
		}
		else //delta dodatnia
		{
			Delta = Math.sqrt(Delta); 
			double x1 = (-b-Delta)/(2*a);
			double x2 = (-b+Delta)/(2*a);
			System.out.println("R�wnanie ma 2 r�ne pierwiastki rzeczywiste: "+x1+" oraz "+ x2);
		}
		}
	

}
