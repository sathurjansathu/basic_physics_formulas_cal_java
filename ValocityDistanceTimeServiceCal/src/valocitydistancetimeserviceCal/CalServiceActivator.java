package valocitydistancetimeserviceCal;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class CalServiceActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceRegistration registration =null;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
     	//CalServiceActivator.context = bundleContext;
		System.out.println("******starting calculation*********");
		valocitydistancetimeInter calcul= new valocitydistancetimeserviceImpl();
		registration=bundleContext.registerService(valocitydistancetimeInter.class.getName(), calcul, null);
		
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//CalServiceActivator.context = null;
		System.out.println("******stoping calculation*********");
		registration.unregister();
	}

}
