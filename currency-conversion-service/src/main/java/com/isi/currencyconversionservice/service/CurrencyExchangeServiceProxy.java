

package com.isi.currencyconversionservice.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.isi.currencyconversionservice.beans.CurrencyConversionBean;

/**  @Author Salmi Ismail**/


@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-client")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) ;

}

