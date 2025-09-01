package com.ShikharTheDeveloper.CurrencyConvertor.Controller;

import com.ShikharTheDeveloper.CurrencyConvertor.Entity.CurrencyExchange;
import com.ShikharTheDeveloper.CurrencyConvertor.Service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/{fromCurrency}/{toCurrency}/{quantity}")
    public CurrencyExchange getFromCurrencyAndToCurrency(
            @PathVariable String fromCurrency,
            @PathVariable String toCurrency,
            @PathVariable BigDecimal quantity){
        return currencyService.getFromCurrencyAndToCurrency(fromCurrency, toCurrency, quantity);
    }



}
