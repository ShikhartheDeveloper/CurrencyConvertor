package com.ShikharTheDeveloper.CurrencyConvertor.Repository;

import com.ShikharTheDeveloper.CurrencyConvertor.Entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyExchange , Long> {

    CurrencyExchange findByFromCurrencyAndToCurrency(String fromCurrency , String toCurrency);



}
