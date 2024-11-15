package com.currency.convert.calculator;

import com.currency.convert.records.Currency;

public class Calculator {


    public double makeCalculation(double mount, double conversion) {
        return mount * conversion;

    }

    public String showMss (Currency trade, double mount, double resultTrade ){

        return trade + " The ammount "  + trade.base_code()+"$" + mount +
                " converted is " + trade.target_code()+"$" + resultTrade ;

    }


}

