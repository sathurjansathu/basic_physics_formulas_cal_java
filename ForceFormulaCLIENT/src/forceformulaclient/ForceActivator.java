package forceformulaclient;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import forceformulaservice.ForceFormulaImpl;
import forceformulaservice.ForceFormulaInter;

public class ForceActivator implements BundleActivator {

	private static BundleContext context;
	ServiceRegistration serviceS;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
	//	ForceActivator.context = bundleContext;
		System.out.println("*********Starting ForceFormula service********");
		ForceFormulaInter systemS= new ForceFormulaImpl();
		serviceS= bundleContext.registerService(ForceFormulaInter.class.getName(),systemS, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//ForceActivator.context = null;
		System.out.println("*******Stopping ForceFormula service*****");
		serviceS.unregister();	
	}

}
