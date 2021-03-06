package org.openstack4j.openstack.sahara.domain;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.openstack4j.model.sahara.ServiceInfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * For mapping JSON response to java objects
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class SaharaServiceInfo extends HashMap<String,String> implements ServiceInfo {

	public static final long serialVersionUID = 1L;

        /**
         * {@inheritDoc}
         */
	@Override
	public String get(String name) {
		return this.get(name);
	}

        /**
         * {@inheritDoc}
         */
	@Override
	public Map<String,String> getInfos() {
		return this;
	}

}
