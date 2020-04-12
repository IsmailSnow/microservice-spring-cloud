

package com.isi.currencyexchangeservice.ressource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.isi.currencyexchangeservice.beans.ExchangeValue;
import com.isi.currencyexchangeservice.beans.repo.ExchangeValueRepository;

import lombok.extern.log4j.Log4j2;

/**  @Author Salmi Ismail**/

@RestController
@Log4j2
public class CurrencyExchangeController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeValueRepository repo;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue exchange = repo.findByFromAndTo(from, to);
		log.info("{}",exchange);
		
		exchange.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return exchange;
	}

}

