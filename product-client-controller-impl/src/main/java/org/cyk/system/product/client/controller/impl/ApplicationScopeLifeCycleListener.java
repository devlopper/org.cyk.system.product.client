package org.cyk.system.product.client.controller.impl;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.apache.commons.lang3.StringUtils;
import org.cyk.utility.__kernel__.AbstractApplicationScopeLifeCycleListener;
import org.cyk.utility.clazz.Classes;
import org.cyk.utility.clazz.ClassesGetter;
import org.cyk.utility.client.controller.component.menu.MenuBuilderMapGetter;
import org.cyk.utility.client.controller.data.DataIdentifiedByString;
import org.cyk.utility.client.controller.data.DataIdentifiedByStringAndCoded;
import org.cyk.utility.collection.CollectionHelper;
import org.cyk.utility.identifier.resource.UniformResourceIdentifierParameterValueMatrix;

@ApplicationScoped
public class ApplicationScopeLifeCycleListener extends AbstractApplicationScopeLifeCycleListener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void __initialize__(Object object) {
		__setQualifierClassTo__(org.cyk.system.product.server.annotation.Product.class, MenuBuilderMapGetter.class);
		Classes classes = __inject__(ClassesGetter.class).addPackageNames(StringUtils.substringBeforeLast(getClass().getName(), "impl")+"entities" )
				.addBasesClasses(DataIdentifiedByString.class,DataIdentifiedByStringAndCoded.class)
		.execute().getOutput();
		if(__inject__(CollectionHelper.class).isNotEmpty(classes)) {
			for(@SuppressWarnings("rawtypes") Class index : classes.get())
				__inject__(UniformResourceIdentifierParameterValueMatrix.class).setClasses(index);
		}
		//__inject__(UniformResourceIdentifierParameterValueMatrix.class).setClasses(Product.class);
	}
	
	@Override
	public void __destroy__(Object object) {}
	
	/**/
	
	public static final Integer LEVEL = new Integer(org.cyk.system.product.client.controller.api.ApplicationScopeLifeCycleListener.LEVEL+1);
}
