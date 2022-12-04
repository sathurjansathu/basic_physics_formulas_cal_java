package basicphysicsclient;

import densityfornulaservice.DensityFormulaInter;



import forceformulaservice.ForceFormulaInter;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.BundleException;

import valocitydistancetimeserver.calculation;
import valocitydistancetimeserver.mainBasicFormula;
import valocitydistancetimeserviceCal.valocitydistancetimeInter;
import velocityformulaservice.VelocityFormulaInter;


public class ClientActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceReference reference =null;
	private ServiceReference CalculationsReference =null;
	private List<String> service = null;
	
	

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
	//	ClientActivator.context = bundleContext;
		System.out.println("***Starting basic physics client*****");
		reference =bundleContext.getServiceReference(mainBasicFormula.class.getName());
		mainBasicFormula sys= (mainBasicFormula)bundleContext.getService(reference);
		calculatorProcedure(sys,bundleContext);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		ClientActivator.context = null;
		bundleContext.ungetService(reference);
		System.out.println("**********Stoping the client********");
	}
	
	public ServiceReference clientProgram(mainBasicFormula calculation, BundleContext bundleContext) {
		
		int serviceNum = calculation.getServiceNum();
		

		if (serviceNum == 1) {
			CalculationsReference = bundleContext.getServiceReference(valocitydistancetimeInter.class.getName());
		}
		
		else if (serviceNum == 2) {
			CalculationsReference = bundleContext.getServiceReference(ForceFormulaInter.class.getName());
		}
			
		else if (serviceNum == 3) {
			CalculationsReference = bundleContext.getServiceReference(DensityFormulaInter.class.getName());
		}
		else if (serviceNum == 4) {
			CalculationsReference = bundleContext.getServiceReference(VelocityFormulaInter.class.getName());
		}
		
		calculation newCal = (calculation) bundleContext.getService(CalculationsReference);
		newCal.StartMenu();
		
		return CalculationsReference;
		
	}
	
	
	public void calculatorProcedure(mainBasicFormula cal, BundleContext bundleContext) {
		String response = null;
		Scanner s = new Scanner(System.in);
		
		//To show the client they have used mentioned services and 
		List<String> serviceNames = new ArrayList<String>();
		serviceNames.add("Distance,Valocity and Time");
		serviceNames.add("Force Formula ");
		serviceNames.add("Dencity Formula ");
		serviceNames.add("Velocity Formula ");
		
		ServiceReference servRef =  clientProgram(cal, bundleContext);	
		Bundle bundle = servRef.getBundle();							
		String calName = bundle.getSymbolicName();						
//				
//		//This process runs continously as long as client says no
		while (!"N".equalsIgnoreCase(response)) {
			serviceNames.remove(calName);
			
			System.out.print("\nDo you want to Continue using other Calculation Services(Y/N)? : ");
			response = s.next();
			
			if ("Y".equalsIgnoreCase(response)) {
				servRef =  clientProgram(cal, bundleContext);
				bundle = servRef.getBundle();
				calName = bundle.getSymbolicName();
			}
			else if (!"N".equalsIgnoreCase(response)) {
				System.out.println("Please enter correct response...");
				continue;
			}
		}
	}

}
