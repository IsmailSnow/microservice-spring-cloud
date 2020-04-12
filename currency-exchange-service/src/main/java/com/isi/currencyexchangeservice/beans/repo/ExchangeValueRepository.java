
package com.isi.currencyexchangeservice.beans.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isi.currencyexchangeservice.beans.ExchangeValue;

/** @Author Salmi Ismail **/

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
