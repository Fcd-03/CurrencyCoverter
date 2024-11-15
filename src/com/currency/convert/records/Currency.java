package com.currency.convert.records;

public record Currency(String base_code,
                       String target_code,
                       double conversion_rate) {

    @Override
    public String toString() {
        return "One--> " + base_code + " converted to --> " + target_code
                + " is: " + conversion_rate + ". &";
    }
}
