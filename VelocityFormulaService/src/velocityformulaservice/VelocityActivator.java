package velocityformulaservice;

import org.osgi.framework.BundleActivator;


import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class VelocityActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceRegistration registration =null;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		VelocityActivator.context = bundleContext;
		System.out.println("******starting Velocity Formula calculation*********");
	    VelocityFormulaInter calcul= new VelocityFormulaImpl();
		registration=bundleContext.registerService(VelocityFormulaInter.class.getName(), calcul, null);

	}

	public void stop(BundleContext bundleContext) throws Exception {
		VelocityActivator.context = null;
		System.out.println("******stoping Velocity Formula  calculation*********");
		registration.unregister();
	}

}
