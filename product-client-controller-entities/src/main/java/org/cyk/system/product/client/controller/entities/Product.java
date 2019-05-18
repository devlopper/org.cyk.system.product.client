package org.cyk.system.product.client.controller.entities;

import org.cyk.utility.client.controller.data.DataIdentifiedByStringAndCoded;

public interface Product extends DataIdentifiedByStringAndCoded {

	@Override Product setCode(String code);
	
	/**/
	
}
