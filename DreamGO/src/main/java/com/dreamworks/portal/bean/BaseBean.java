package com.dreamworks.portal.bean;

import java.beans.PropertyDescriptor;

import org.apache.commons.beanutils.PropertyUtils;

public class BaseBean {
	public String toString() {
		StringBuffer sb = new StringBuffer();
		try {

			PropertyDescriptor[] propertyDescriptors = PropertyUtils
					.getPropertyDescriptors(this.getClass());
			for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
				if ("class".equals(propertyDescriptor.getName()))
					continue;
				sb.append(propertyDescriptor.getName()
						+ "="
						+ propertyDescriptor.getReadMethod().invoke(this,
								new Object[0]) + "|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
