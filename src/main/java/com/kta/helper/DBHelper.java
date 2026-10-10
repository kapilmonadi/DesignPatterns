package com.kta.helper;

import com.kta.model.LiquiditySnapshot;

import java.math.BigDecimal;

public class DBHelper {

    /**
     * Return the liquidity snapshot for an account
     */
    public static LiquiditySnapshot getLiquiditySnapshot(String accountId) {
        return new LiquiditySnapshot(
                new BigDecimal("50000"),
                new BigDecimal("30000"),
                new BigDecimal("10000"));
    }
}
