package com.ShikharTheDeveloper.CurrencyConvertor.Service;

import com.ShikharTheDeveloper.CurrencyConvertor.Entity.CurrencyExchange;
import com.ShikharTheDeveloper.CurrencyConvertor.Repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public CurrencyExchange getFromCurrencyAndToCurrency(String fromCurrency , String toCurrency,
                                                         BigDecimal quantity){
        CurrencyExchange currencyExchange = currencyRepository
                .findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);
        if(currencyExchange!=null){
            BigDecimal totalAmount = currencyExchange.getExchangeRate().multiply(quantity);
            currencyExchange.setExchangeRate(totalAmount);
            currencyExchange.setQuantity(quantity);

        }

        return currencyExchange;

    }


}
