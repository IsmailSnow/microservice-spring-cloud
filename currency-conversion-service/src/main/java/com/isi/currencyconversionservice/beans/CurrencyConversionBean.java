

package com.isi.currencyconversionservice.beans;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**  @Author Salmi Ismail**/


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CurrencyConversionBean {
	private Long id;
	 private String from;
	 private String to;
	 private BigDecimal conversionMultiple;
	 private BigDecimal quantity;
	 private BigDecimal totalCalculatedAmount;
	 private int port;
}

