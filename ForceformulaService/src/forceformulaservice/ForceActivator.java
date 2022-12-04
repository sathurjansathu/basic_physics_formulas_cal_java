package forceformulaservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ForceActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceRegistration registration =null;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		//ForceActivator.context = bundleContext;
		System.out.println("******starting Force Formula calculation*********");
		ForceFormulaInter calcul= new ForceFormulaImpl();
		registration=bundleContext.registerService(ForceFormulaInter.class.getName(), calcul, null);		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//ForceActivator.context = null;
		System.out.println("******stoping calculation*********");
		registration.unregister();
	}

}
