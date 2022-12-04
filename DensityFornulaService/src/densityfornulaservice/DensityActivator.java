package densityfornulaservice;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class DensityActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceRegistration registration =null; 

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		//DensityActivator.context = bundleContext;
		System.out.println("******starting Density Formula calculation*********");
	    DensityFormulaInter calculation= new DensityFormulaImpl();
		registration=bundleContext.registerService(DensityFormulaInter.class.getName(), calculation, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//DensityActivator.context = null;
		System.out.println("******stoping Density Formula calculation*********");
		registration.unregister();
	}

}
