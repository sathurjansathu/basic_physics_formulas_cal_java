package valocitydistancetimeserviceCal;

import java.util.Scanner;



import javax.swing.JOptionPane;

import java.util.*;

public class valocitydistancetimeserviceImpl implements valocitydistancetimeInter {


	@Override
	public void StartMenu() {
		Scanner scn=new Scanner(System.in);
		String response =null;
		run();
		
		while(!"N".equalsIgnoreCase(response)) {
			System.out.println("Do you want to continue(Y/N)...?");
			response= scn.next();
			
			if(!"Y".equalsIgnoreCase(response))
				run();
			else if(!"N".equalsIgnoreCase(response)){
				System.out.println("*******Pleace enter correct response******");
				continue;
			}
		}
		
	}

	@Override
	public void run() {
		
		int number;
	    double velocity;
	    double Distance;
	    double Time;
		
	
    //--------------------------Start Decision Making-----------------------------------------------//
        Scanner ekeys = new Scanner(System.in);
        System.out.print("What are you trying to calculate?\npress:\n1 "
            + "for Velocity(m/s):\n2 for Distance(m):\n3 for Time(sec):\n");
        number = ekeys.nextInt();
        //--------------------------Begin SWITCH--------------------------------------------------------//
        switch(number){
    //--------------------------Solving For TIME----------------------------------------------------//
        case 1: 
                                                                          
            Scanner ekey = new Scanner(System.in);
            System.out.print("\n\nPlease enter a velcoity in m/s:\n");
            velocity = ekey.nextDouble();
                                                                           

            Scanner ekeyp = new Scanner(System.in);
            System.out.print("Please enter the distance in Meters:\n");
            Distance = ekeyp.nextDouble();
                                                                            
           
            Time = Distance/velocity;
            System.out.print("Time equals: " + Time + " Seconds");
            break;
            //--------------------------Solving For DISTANCE------------------------------------------------//
        case 2: //distance:
                                                                           
            Scanner key = new Scanner(System.in);
            System.out.print("\n\nPlease enter the velocity in m/s:\n");
            velocity = key.nextDouble();

                                                                           
            System.out.print("Please enter the time in Seconds:\n");
            Scanner keyp = new Scanner(System.in);
            Time = keyp.nextDouble();

                                                                           
            Distance = velocity*Time;
            System.out.print("Distance euqals: "+ Distance + " meters");
            break;
            //--------------------------Solving For VELOCITY-------------------------------------------------//
        case 3: //Velocity:
                                                                           
            Scanner ke = new Scanner(System.in);
            System.out.print("\n\nPlease enter the time in Seconds:\n");
            Time = ke.nextDouble();

                                                                           
            Scanner k = new Scanner(System.in);
            System.out.print("Please enter the distance in Meters:\n");
            Distance = k.nextDouble();

                                                                            
            velocity = Distance/Time;
            System.out.print("Velocity equals: "+ velocity+" m/s");
            break;
            
        default : System.out.println("Please enter a valid number");
          

        }
    
		
	}

	

	
}
