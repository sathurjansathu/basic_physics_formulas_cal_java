package valocitydistancetimeserver;


	

import java.util.Scanner;


import java.util.List;
import java.util.ArrayList;

public class valocitydistancetimeserverImpl {
	
	private List<String> calculationServices =new ArrayList<>();
	public void addCalculations(){
		calculationServices.add("Finding Distance,Valocity and Time");
		calculationServices.add("Force Formula ");
		calculationServices.add("Dencity Formula ");
		calculationServices.add("Velocity Formula ");
		
		
		
	}
	public void removeCalculations(String calculation) {
		calculationServices.remove(calculation);
	}
	
	public void startMenu() {
		Scanner scn=new Scanner(System.in);
		String response =null;
		run();
		
		while(!"N".equalsIgnoreCase(response)) {
			System.out.println("Do you want to continue(Y/N)...?");
			response= scn.next();
			
			if("Y".equalsIgnoreCase(response)) {
			
				run();
				continue;
		   }
			
			else if("N".equalsIgnoreCase(response)){
				System.out.println("*******Pleace enter correct response******");
				 break;
			}
		}
		
	}
	
	public void run() {
	   //--------------------------Start Decision Making-----------------------------------------------//
		Scanner scn= new Scanner(System.in);
		addCalculations();
		System.out.println("*****Osigi Calculation Service For Physics Formula******");
		System.out.println("------Following Services are available-----");
		System.out.println("Finding Distance,Valocity and Time");
		System.out.println("Force Formula ");
		System.out.println("Dencity Formula ");
		System.out.println("Velocity Formula ");
		
		
		System.out.println("Select your preferred service");
		int service=scn.nextInt();
		
	}
}
