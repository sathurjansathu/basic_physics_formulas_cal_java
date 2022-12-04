package densityformulaclient;

import densityfornulaservice.DensityFormulaImpl;
import densityfornulaservice.DensityFormulaInter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class DensityActivator implements BundleActivator {

	private static BundleContext context;
	ServiceRegistration service;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		//DensityActivator.context = bundleContext;
		System.out.println("*********Starting DensityFormula service********");
		DensityFormulaInter system= new DensityFormulaImpl();
		service= bundleContext.registerService(DensityFormulaInter.class.getName(),system, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//DensityActivator.context = null;
		System.out.println("*******Stopping DensityFormula service*****");
		service.unregister();	
		
		
	}

}
