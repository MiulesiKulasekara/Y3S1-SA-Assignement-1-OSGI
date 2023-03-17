package com.mtit.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	//we have to register the service
	ServiceRegistration publishServiceRegistration;

	//we have to specify to console when publisher is start 
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Start");
		ServicePublish publisherService = new ServicePublishImpl();
		
		//register it
		publishServiceRegistration = context.registerService(ServicePublish.class.getName(),publisherService,null);
	}

	public void stop(BundleContext context) throws Exception {
		
		//stop the bundle
		System.out.println("Publisher Stop");
		
		//unregister it
		publishServiceRegistration.unregister();
	}

}
