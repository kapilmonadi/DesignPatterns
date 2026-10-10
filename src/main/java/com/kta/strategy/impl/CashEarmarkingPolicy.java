package com.kta.strategy.impl;

import com.kta.strategy.EarmarkingPolicy;

import java.math.BigDecimal;

public class CashEarmarkingPolicy implements EarmarkingPolicy {
    @Override
    public BigDecimal earmark(BigDecimal amountToEarmark, BigDecimal availableLiquidity) {
        // perform required validations
        if (availableLiquidity.compareTo(amountToEarmark) < 0) {
            throw new IllegalStateException(
                    "Insufficient cash liquidity for earmarking");
        }

        // in real world scenario we will block funds in DB or call an API
        // bypassing that for this demo
        System.out.println("Earmarked amount is " + amountToEarmark + " .Available Liquidity post Earmark is " + availableLiquidity.subtract(amountToEarmark));
        return amountToEarmark;
    }
}
