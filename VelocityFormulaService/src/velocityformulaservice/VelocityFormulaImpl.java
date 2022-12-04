package velocityformulaservice;

import java.util.Scanner;

public class VelocityFormulaImpl implements VelocityFormulaInter {
	
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

	
	public void run() {
		
		
		int number;
	    double Velocity;
	    double F_positi;
	    double I_positi;
	    double Time;
		
	
    //--------------------------Start Decision Making-----------------------------------------------//
        Scanner key = new Scanner(System.in);
        System.out.print("What are you trying to calculate?\npress:\n1 "
            + "for Velocity(m/s):\n2 for Final position(kg):\n3 for Initial(sec):\n4  for time(s):\n");
        
        number = key.nextInt();
       
        
        switch(number){
    
        case 1: 
                                                                          
            Scanner ikey = new Scanner(System.in);
            System.out.print("\n\nPlease enter a Final position in m:\n");
            F_positi = ikey.nextDouble();
                                                                           

            Scanner ikey1 = new Scanner(System.in);
            System.out.print("Please enter the Initial Position in m:\n");
            I_positi= ikey1.nextDouble();
                                                
            Scanner ikey2 = new Scanner(System.in);
            System.out.print("Please enter the Time in s:\n");
            Time= ikey2.nextDouble();
           
            Velocity = (F_positi-I_positi)/Time;
            System.out.print("Velocity equals: " + Velocity + "m/s");
            break;
            
        case 2:
                                                                           
            Scanner ike = new Scanner(System.in);
            System.out.print("Please enter the Initial Position in m:\n");
            I_positi= ike.nextDouble();

                                                                           
            System.out.print("Please enter the Velocity in m/s:\n");
            Scanner keyp = new Scanner(System.in);
            Velocity = keyp.nextDouble();
            
            Scanner ikii = new Scanner(System.in);
            System.out.print("Please enter the Time in s:\n");
            Time= ikii.nextDouble();

                                                                           
            F_positi = (Velocity*Time)+I_positi;
            System.out.print("Final Position euqals: "+ F_positi + " m");
            break;
            
        case 3: 
                                                                           
            Scanner ikex = new Scanner(System.in);
            System.out.print("\n\nPlease enter a Final position in m:\n");
            F_positi = ikex.nextDouble();

                                                                           
            System.out.print("Please enter the Velocity in m/s:\n");
            Scanner keya = new Scanner(System.in);
            Velocity = keya.nextDouble();
            
            Scanner ikiz = new Scanner(System.in);
            System.out.print("Please enter the Time in s:\n");
            Time= ikiz.nextDouble();

                                                                            
            I_positi = F_positi-Velocity*Time;
            System.out.print("Initial Position equals: "+ I_positi+" m");
            break;
         
        case 4:
            Scanner ikerr = new Scanner(System.in);
            System.out.print("\n\nPlease enter a Final position in m:\n");
            F_positi = ikerr.nextDouble();
            
            System.out.print("Please enter the Velocity in m/s:\n");
            Scanner keyoo = new Scanner(System.in);
            Velocity = keyoo.nextDouble();
            
            Scanner ikezz = new Scanner(System.in);
            System.out.print("Please enter the Initial Position in m:\n");
            I_positi= ikezz.nextDouble();

            Time = (F_positi-I_positi)/Velocity;
            System.out.print("Time equals: "+ Time+" s");
            break;
            
       
        default : System.out.println("Please enter a valid number");
        
        }
    
		
	
	}

}
