package com.kta.strategy;

import com.kta.model.LiquidityResult;

public interface LiquidityStrategy {
    LiquidityResult calculate(String customerId);
}
