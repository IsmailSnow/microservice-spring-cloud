

package com.isi.limitsservice.ressource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isi.limitsservice.beans.LimitConfiguration;
import com.isi.limitsservice.configuration.Configuration;

/**  @Author Salmi Ismail**/
@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveConfigurationFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
	
}

