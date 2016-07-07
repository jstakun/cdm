package com.redhat.waw.iot.model;

import org.infinispan.distribution.group.Grouper;

public class SensorDataGrouper implements Grouper<String> {

	@Override
	public String computeGroup(String key, String group) {
		int pos = key.indexOf("-");
		if (pos > 0) {
			return key.substring(0, pos);
		} else {
			return null;
		}
	}

	@Override
	public Class<String> getKeyType() {
		// TODO Auto-generated method stub
		return String.class;
	}

	

	

}
