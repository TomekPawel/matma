package Matma;
import java.util.Scanner;

public class TestR�wnania {

	public static void main(String[] args) {
		
		Scanner skaner = new Scanner(System.in);
		System.out.println("Podaj wsp�czynnik przy x^2:");
		double a = skaner.nextDouble();
		System.out.println("Podaj wsp�czynnik przy x:");
		double b = skaner.nextDouble();
		System.out.println("Podaj wyraz wolny:");
		double c = skaner.nextDouble();
	R�wnaniaKwadratowe r = new R�wnaniaKwadratowe(a, b, c);
	System.out.println(r.rozwi��());
	System.out.println(r);
	r.setA(100);
	r.setB(-30);
	r.setC(c);
	System.out.println(r.rozwi��());
	System.out.println(r);
	}

}
