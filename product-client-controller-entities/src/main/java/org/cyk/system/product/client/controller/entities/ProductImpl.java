package org.cyk.system.product.client.controller.entities;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractDataIdentifiedByStringAndCodedImpl;

public class ProductImpl extends AbstractDataIdentifiedByStringAndCodedImpl implements Product,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Product setCode(String code) {
		return (Product) super.setCode(code);
	}
	
}
