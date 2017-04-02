package com.Tomek.math;

import java.util.Scanner;

public class SquarePolynomial
{

	private double a;
	private double b;
	private double c;

	public SquarePolynomial(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String solve()
	{
		String result = "";
		double Delta = b * b - 4 * a * c;

		if (Delta < 0)
		{
			Delta = -Delta;
			Delta = Math.sqrt(Delta);
			double imX1 = -Delta / (2 * a);
			double imX2 = Delta / (2 * a);
			double reX = -b / (2 * a);
			result = "Both roots are complex:" + reX + imX1 + "i" + " and " + reX + "+"
					+ imX2 + "i.";
		} 
		else if (Delta == 0)
		{
			double x = -b / (2 * a);
			result = "Root is " + x + ".";
		} 
		else // delta dodatnia
		{
			Delta = Math.sqrt(Delta);
			double x1 = (-b - Delta) / (2 * a);
			double x2 = (-b + Delta) / (2 * a);
			result = "Both roots are real: " + x1 + " and " + x2;
		}
		return result;
	}

	public String toString()
	{
		return "Square polynomial: " + a + "x^2 + " + b + "x + " + c + ".";
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

	public static void main(String[] args)
	{
		Scanner skaner = new Scanner(System.in);
		System.out.println("Set a:");
		double a = skaner.nextDouble();
		System.out.println("Set b:");
		double b = skaner.nextDouble();
		System.out.println("Set c:");
		double c = skaner.nextDouble();
		SquarePolynomial equation = new SquarePolynomial(a, b, c);
		System.out.println(equation.solve());
	}

}
