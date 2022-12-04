package valocitydistancetimeserver;

import java.util.Scanner;

public class mainBasicFormulaImpl implements mainBasicFormula {
	

	
	public int getServiceNum() {

		
		Scanner scn= new Scanner(System.in);

		System.out.println("*****Osigi Calculation Service For Physics Formula******");
		System.out.println("------Following Services are available-----");
		System.out.println("Finding Distance,Valocity and Time  Enter number=1");
		System.out.println("Force Formula                       Enter number=2 ");
		System.out.println("Dencity Formula                     Enter number=3");
		System.out.println("Velocity Formula                    Enter number=4");
		
		
		System.out.println("Select your preferred service");
		int service=scn.nextInt();
		return service;
		
	}
	
}
