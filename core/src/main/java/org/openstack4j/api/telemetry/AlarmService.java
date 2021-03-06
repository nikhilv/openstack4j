package org.openstack4j.api.telemetry;

import java.util.List;

import org.openstack4j.common.RestService;
import org.openstack4j.model.telemetry.Alarm;

/**
 * Provides alarms within an OpenStack deployment
 * 
 * @author Massimiliano Romano
 */
public interface AlarmService extends RestService {

	/**
	 * Return all alarms.
	 * 
	 * @return list of all alarms
	 */
	List<? extends Alarm> list();

	/**
	 * Return a specified alarm
	 * 
	 * @return the alarm
	 */
	Alarm getById(String id);
	
	/**
	 * Update a specified alarm
	 * 
	 */
	void update(String id, Alarm a);
	
	
}
