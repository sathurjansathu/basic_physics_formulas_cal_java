package velocitydistancetimeclient;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import valocitydistancetimeserviceCal.valocitydistancetimeInter;
import valocitydistancetimeserviceCal.valocitydistancetimeserviceImpl;

public class TimeActivator implements BundleActivator {

	private static BundleContext context;
	ServiceRegistration servicesss;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		//TimeActivator.context = bundleContext;
		System.out.println("*********Starting Valocity Distance Time Calculation service********");
		valocitydistancetimeInter systemT= new valocitydistancetimeserviceImpl();
		servicesss= bundleContext.registerService(valocitydistancetimeInter.class.getName(),systemT, null);	
	}

	public void stop(BundleContext bundleContext) throws Exception {
		TimeActivator.context = null;
		System.out.println("*******Stopping Valocity Distance Time Calculation service*****");
		servicesss.unregister();		
	}

}
