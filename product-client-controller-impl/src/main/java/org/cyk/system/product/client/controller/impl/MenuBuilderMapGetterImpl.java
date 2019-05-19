package org.cyk.system.product.client.controller.impl;

import java.io.Serializable;
import java.security.Principal;

import org.cyk.system.product.client.controller.entities.Product;
import org.cyk.utility.client.controller.component.menu.AbstractMenuBuilderMapGetterImpl;
import org.cyk.utility.client.controller.component.menu.MenuBuilder;
import org.cyk.utility.client.controller.component.menu.MenuItemBuilder;

@org.cyk.system.product.server.annotation.System
public class MenuBuilderMapGetterImpl extends AbstractMenuBuilderMapGetterImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected void ____executePrincipalIsNotNull____(MenuBuilder sessionMenuBuilder, Object request, Principal principal) throws Exception {
		
	}

	@Override
	protected void ____executePrincipalIsNull____(MenuBuilder sessionMenuBuilder, Object request) throws Exception {
		sessionMenuBuilder.addItems(
				__inject__(MenuItemBuilder.class).setCommandableName("Produit").addEntitiesList(Product.class)
			);	
	}

	

}
