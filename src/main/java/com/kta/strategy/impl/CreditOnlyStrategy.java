package com.kta.strategy.impl;

import com.kta.helper.DBHelper;
import com.kta.model.LiquidityResult;
import com.kta.model.LiquiditySnapshot;
import com.kta.strategy.LiquidityStrategy;

public class CreditOnlyStrategy implements LiquidityStrategy {
    @Override
    public LiquidityResult calculate(String customerId) {
        LiquiditySnapshot liquiditySnapshot = DBHelper.getLiquiditySnapshot(customerId);
        return new LiquidityResult(
                liquiditySnapshot.creditLineBalance(), "CREDIT_ONLY");
    }
}
