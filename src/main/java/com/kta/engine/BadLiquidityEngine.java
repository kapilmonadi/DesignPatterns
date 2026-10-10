package com.kta.engine;

import com.kta.model.LiquidityResult;

import java.math.BigDecimal;

public class BadLiquidityEngine {
    public LiquidityResult calculateLiquidity(String type) {
        if ("CASH".equals(type)) {
            return new LiquidityResult(getCashBalance(),"CASH");
        } else if ("CREDIT".equals(type)) {
            return new LiquidityResult(getCreditLineBalance(),"CREDIT");
        } else if ("CASH_CREDIT".equals(type)) {
            return new LiquidityResult(getCashAndCreditLineBalance(),"CASH_CREDIT");
        } else if ("ALL".equals(type)) {
            return new LiquidityResult(getAllBalance(),"ALL");
        }

        throw new IllegalArgumentException(
                "Unknown liquidity type: " + type);
    }

    /**
     * These are dummy methods,
     * in a real world project these values will come from database
     */
    private BigDecimal getCashBalance(){
        return new BigDecimal(3000);
    }
    private BigDecimal getCreditLineBalance(){
        return new BigDecimal(50000);
    }
    private BigDecimal getCashAndCreditLineBalance(){
        return new BigDecimal(50000);
    }
    private BigDecimal getAllBalance(){
        return new BigDecimal(50000);
    }
    private BigDecimal getOverdraftBalance(){
        return new BigDecimal(1000);
    }
}
