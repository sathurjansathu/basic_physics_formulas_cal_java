package forceformulaservice;

import java.util.*;


public class ForceFormulaImpl implements ForceFormulaInter {
	
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
	    double NetForce;
	    double Mass;
	    double Acceleration;
		
	
    //--------------------------Start Decision Making-----------------------------------------------//
        Scanner key = new Scanner(System.in);
        System.out.print("What are you trying to calculate?\npress:\n1 "
            + "for NetForce(m/s):\n2 for Mass(kg):\n3 for Acceleration(sec):\n");
        
        number = key.nextInt();
       
        
        switch(number){
    
        case 1: 
                                                                          
            Scanner ikey = new Scanner(System.in);
            System.out.print("\n\nPlease enter a Mass in Kg:\n");
            Mass = ikey.nextDouble();
                                                                           

            Scanner ikey1 = new Scanner(System.in);
            System.out.print("Please enter the Acceleration in m/s:\n");
            Acceleration = ikey1.nextDouble();
                                                                            
           
            NetForce = Mass*Acceleration;
            System.out.print("NetForce equals: " + NetForce + "N");
            break;
            
        case 2:
                                                                           
            Scanner rkey = new Scanner(System.in);
            System.out.print("\n\nPlease enter the NetForce in N:\n");
            NetForce = rkey.nextDouble();

                                                                           
            System.out.print("Please enter the Acceleration in m/s:\n");
            Scanner keyp = new Scanner(System.in);
            Acceleration = keyp.nextDouble();

                                                                           
            Mass = NetForce/Acceleration;
            System.out.print("Mass euqals: "+ Mass + " Kg");
            break;
            
        case 3: 
                                                                           
            Scanner kei = new Scanner(System.in);
            System.out.print("\n\nPlease enter the NetForce in N:\n");
            NetForce = kei.nextDouble();

                                                                           
            Scanner ikei = new Scanner(System.in);
            System.out.print("\n\nPlease enter a Mass in Kg:\n");
            Mass = ikei.nextDouble();

                                                                            
            Acceleration = NetForce/Mass;
            System.out.print("Acceleration equals: "+ Acceleration+" m/s");
            break;
            
       
        default : System.out.println("Please enter a valid number");
        
        }
    
		
	}

		
}

