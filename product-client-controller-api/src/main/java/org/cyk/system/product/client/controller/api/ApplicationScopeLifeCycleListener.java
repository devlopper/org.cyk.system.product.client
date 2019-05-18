package org.cyk.system.product.client.controller.api;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.__kernel__.AbstractApplicationScopeLifeCycleListener;
import org.cyk.utility.system.node.SystemNodeClient;

@ApplicationScoped
public class ApplicationScopeLifeCycleListener extends AbstractApplicationScopeLifeCycleListener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void __initialize__(Object object) {
		__inject__(org.cyk.utility.client.controller.ApplicationScopeLifeCycleListener.class).initialize(null);
		__inject__(SystemNodeClient.class).setName("Gestion des produits");	
	}
	
	@Override
	public void __destroy__(Object object) {}
	
	/**/
	
	public static final Integer LEVEL = new Integer(org.cyk.utility.client.controller.ApplicationScopeLifeCycleListener.LEVEL+100);
}
