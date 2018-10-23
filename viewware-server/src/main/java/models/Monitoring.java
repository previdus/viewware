package models;

import java.util.HashMap;
import java.util.Map;

public class Monitoring {
	
	private Map<String, Health> componentHealth;
	
	public Monitoring(Map<String, Health> componentHealth) {
		this.componentHealth = componentHealth;
	}
	
	public Monitoring() {
		componentHealth = new HashMap<>();
	}
	
	public void add(String component, Health health) {
		componentHealth.put(component, health);
	}
	
	public Map<String, Health> getComponentHealth() {
		return componentHealth;
	}
}
