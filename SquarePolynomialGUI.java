package com.Tomek.math;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SquarePolynomialGUI extends JFrame implements ActionListener
{

	private JTextField tA, tB, tC, tSolution;
	private JLabel lA, lB, lC;
	private JButton bExit, bSolve;

	public SquarePolynomialGUI()
	{
		setSize(1000, 600);
		setTitle("Find zeros of square polynomial Ax^2+Bx+C");
		setLayout(null);

		lA = new JLabel("a=", JLabel.RIGHT);
		lA.setBounds(20, 20, 30, 30);
		add(lA);
		tA = new JTextField();
		tA.setToolTipText("Set A:");
		tA.setBounds(50, 20, 50, 30);
		add(tA);

		lB = new JLabel("b=", JLabel.RIGHT);
		lB.setBounds(20, 60, 30, 30);
		add(lB);
		tB = new JTextField();
		tB.setToolTipText("Set B:");
		tB.setBounds(50, 60, 50, 30);
		add(tB);

		lC = new JLabel("c=", JLabel.RIGHT);
		lC.setBounds(20, 100, 30, 30);
		add(lC);
		tC = new JTextField();
		tC.setToolTipText("Set C:");
		tC.setBounds(50, 100, 50, 30);
		add(tC);

		bRozwi¹¿ = new JButton("Solve equation");
		bRozwi¹¿.setBounds(20, 160, 150, 30);
		add(bRozwi¹¿);
		bRozwi¹¿.addActionListener(this);

		bWyjœcie = new JButton("Exit");
		bWyjœcie.setBounds(180, 160, 150, 30);
		add(bWyjœcie);
		bWyjœcie.addActionListener(this);

		tWynik = new JTextField();
		tWynik.setBounds(50, 220, 800, 40);
		add(tWynik);

	}

	public static void main(String[] args)
	{
		SquarePolynomialGUI app = new SquarePolynomialGUI();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if (source == bSolve)
		{
			double a = Double.parseDouble(tA.getText());
			double b = Double.parseDouble(tB.getText());
			double c = Double.parseDouble(tC.getText());
			
			SquarePolynomial equation = new SquarePolynomial(a, b, c);
			String solution = equation.solve();
			tSolution.setText();
			} 
		else if (source == bExit)
		{
			dispose();
		}

	}
}
