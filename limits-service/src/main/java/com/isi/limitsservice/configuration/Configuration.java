

package com.isi.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**  @Author Salmi Ismail**/


@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
public class Configuration {

	private int minimum;
	private int maximum;
}

