package Matma;
import java.util.Scanner;

public class R�wnaniaKwadratowe {

	private double a;
	private double b;
	private double c;
	
	public R�wnaniaKwadratowe(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public String rozwi��() 
	{
		String rozwi�zanie = "";
double Delta = b*b-4*a*c;
		
		if (Delta<0)
		{
			Delta = -Delta;
			Delta = Math.sqrt(Delta);
			double imX1=-Delta/(2*a);
			double imX2=Delta/(2*a);
			double reX=-b/(2*a);
			rozwi�zanie = "Oba pierwiastki r�wnania s� zespolone i wynosz�:"+reX+imX1+"i"+" oraz "+reX+"+"+imX2+"i.";
		}
		else if (Delta == 0)
		{
			double x = -b/(2*a);
			rozwi�zanie = "Pierwiastek jest podw�jny i wynosi "+ x+".";
		}
		else //delta dodatnia
		{
			Delta = Math.sqrt(Delta); 
			double x1 = (-b-Delta)/(2*a);
			double x2 = (-b+Delta)/(2*a);
			rozwi�zanie = "R�wnanie ma 2 r�ne pierwiastki rzeczywiste: "+x1+" oraz "+ x2;
		}
		return rozwi�zanie;
	}
	public String toString()
	{
		return "R�wnanie kwadratowe: "+ a+"x^2 + "+ b+"x + "+c+".";
	}
	public void setA(double a)
	{
		this.a = a;
	}
	public void setB(double b)
	{
		this.b = b;
	}
	public void setC(double c)
	{
		this.c = c;
	}
	
	public static void main(String[] args) {
			Scanner skaner = new Scanner(System.in);
			System.out.println("Podaj wsp�czynnik przy x^2:");
			double a = skaner.nextDouble();
			System.out.println("Podaj wsp�czynnik przy x:");
			double b = skaner.nextDouble();
			System.out.println("Podaj wyraz wolny:");
			double c = skaner.nextDouble();
		R�wnaniaKwadratowe r�wnanie = new R�wnaniaKwadratowe(a, b, c);
		System.out.println(r�wnanie.rozwi��());
	}

}
