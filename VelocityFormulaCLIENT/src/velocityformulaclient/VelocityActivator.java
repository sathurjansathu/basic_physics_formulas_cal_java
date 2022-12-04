package velocityformulaclient;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import velocityformulaservice.VelocityFormulaImpl;
import velocityformulaservice.VelocityFormulaInter;


public class VelocityActivator implements BundleActivator {

	private static BundleContext context;
	ServiceRegistration servicess;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		//VelocityActivator.context = bundleContext;
		System.out.println("*********Starting VelocityFormula service********");
		VelocityFormulaInter systemss= new VelocityFormulaImpl();
		servicess= bundleContext.registerService(VelocityFormulaInter.class.getName(),systemss, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		VelocityActivator.context = null;
		System.out.println("*******Stopping velocityFormula service*****");
		servicess.unregister();
	}

}
