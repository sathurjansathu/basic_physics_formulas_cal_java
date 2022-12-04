package densityfornulaservice;

import java.util.*;

public class DensityFormulaImpl implements DensityFormulaInter {
	
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
	    double Density;
	    double Mass;
	    double Volume;
		
	
    //--------------------------Start Decision Making-----------------------------------------------//
        Scanner key = new Scanner(System.in);
        System.out.print("What are you trying to calculate?\npress:\n1 "
            + "for Density(Kg/m3):\n2 for Mass(Kg):\n3 for volume(m3):\n");
        
        number = key.nextInt();
       
        
        switch(number){
    
        case 1: 
                                                                          
            Scanner ikey = new Scanner(System.in);
            System.out.print("\n\nPlease enter a Mass in Kg:\n");
            Mass = ikey.nextDouble();
                                                                           

            Scanner ikey1 = new Scanner(System.in);
            System.out.print("Please enter the Volume in m3:\n");
            Volume = ikey1.nextDouble();
                                                                            
           
            Density = Mass*Volume;
            System.out.print("Density equals: " + Density + "Kg/m3");
            break;
            
        case 2:
                                                                           
            Scanner rkey = new Scanner(System.in);
            System.out.print("\n\nPlease enter the Density in kg/m3:\n");
            Density = rkey.nextDouble();

                                                                           
            Scanner ike1 = new Scanner(System.in);
            System.out.print("Please enter the Volume in m3:\n");
            Volume = ike1.nextDouble();

                                                                           
            Mass = Density/Volume;
            System.out.print("Mass euqals: "+ Mass + " Kg");
            break;
            
        case 3: 
                                                                           
            Scanner ik = new Scanner(System.in);
            System.out.print("\n\nPlease enter a Mass in Kg:\n");
            Mass = ik.nextDouble();

                                                                           
            Scanner rkeyq = new Scanner(System.in);
            System.out.print("\n\nPlease enter the Density in kg/m3:\n");
            Density = rkeyq.nextDouble();

                                                                            
            Volume = Density/Mass;
            System.out.print("Volume equals: "+ Volume+" m/s");
            break;
            
        default : System.out.println("Please enter a valid number");
            
       

        }
    
		
	}

}
