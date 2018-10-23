package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Health;
import models.Monitoring;

@RestController
@RequestMapping("/api/v1/health")
public class MonitoringController {

	@GetMapping
	public Monitoring allPods(){
		Monitoring monitoring = new Monitoring();
		monitoring.add("ConnectionServer1", Health.GREEN);
		monitoring.add("ConnectionServer2", Health.RED);
		monitoring.add("ConnectionServer3", Health.YELLOW);
		monitoring.add("ConnectionServer4", Health.GREEN);
		return monitoring;
	}
	
	@GetMapping("/{id}")
	public Monitoring pod(@PathVariable("id") String podId){
		Monitoring monitoring = new Monitoring();
		monitoring.add("ConnectionServer1", Health.GREEN);
		monitoring.add("ConnectionServer2", Health.GREEN);
		return monitoring;
	}
}