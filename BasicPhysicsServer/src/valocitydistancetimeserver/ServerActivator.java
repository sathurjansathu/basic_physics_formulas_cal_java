package valocitydistancetimeserver;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServerActivator implements BundleActivator {

	
	ServiceRegistration publishServiceRegistration;



	public void start(BundleContext bundleContext) throws Exception {
	//	ServerActivator.context = bundleContext;
		System.out.println("********Starting basic physics calcultion********");
		mainBasicFormula sys= new mainBasicFormulaImpl();
		publishServiceRegistration = bundleContext.registerService(mainBasicFormula.class.getName(), sys, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//ServerActivator.context = null;
		System.out.println("********Stoping basic physics calcultion********");
		publishServiceRegistration.unregister();
	}

}
