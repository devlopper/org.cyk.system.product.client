package org.cyk.system.product.client.controller.api;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.system.product.client.controller.entities.Product;
import org.cyk.utility.client.controller.AbstractControllerEntityImpl;

@ApplicationScoped
public class ProductControllerImpl extends AbstractControllerEntityImpl<Product> implements ProductController,Serializable {
	private static final long serialVersionUID = 1L;

}
