package com.exchange.server.demoexchange.controller;

import com.exchange.server.demoexchange.model.Stock;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface ExchangeController {

    /**
     *  This method returns stock Details based on stock id.
     *
     * @param stockId
     * @return Stock
     */
    @RequestMapping( value = "/stock/{id}" , method = RequestMethod.GET)
    Stock getStock(String stockId);

    /**
     * This method makes entry of stock in DB.
     * @return status
     */
    @RequestMapping (value = "/stock" , method = RequestMethod.POST)
    String createStock(@RequestBody Stock stock);

    /**
     * This method makes updates entry of stock
     * .
     * @return
     */
    @RequestMapping (value = "/stock" , method = RequestMethod.PUT)
    Stock updateStock(@RequestBody Stock stock);
}