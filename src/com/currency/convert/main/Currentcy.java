package com.currency.convert.main;

public record Currentcy(String base_code,
                        String target_code,
                        double conversion_rate) {


    @Override
    public String toString() {
        return "Base_Code: " +base_code + ", Target_Code: " + target_code +
                ", Conversion_Rate= " + conversion_rate;
    }
}
