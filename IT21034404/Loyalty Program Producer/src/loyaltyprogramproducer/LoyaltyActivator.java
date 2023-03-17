package loyaltyprogramproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class LoyaltyActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("loyalty service started!");
		LoyaltyActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		LoyaltyActivator.context = null;
	}

}
