package com.kta.strategy.impl;

import com.kta.strategy.EarmarkingPolicy;

import java.math.BigDecimal;

public class CreditEarmarkingPolicy implements EarmarkingPolicy {
    @Override
    public BigDecimal earmark(BigDecimal amountToEarmark, BigDecimal availableLiquidity) {
        // Implement the logic for Earmarking the Credit Line
        // business logic goes here
        return amountToEarmark;
    }
}
