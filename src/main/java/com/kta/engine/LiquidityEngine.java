package com.kta.engine;

import com.kta.model.LiquidityRequest;
import com.kta.model.LiquidityResult;
import com.kta.strategy.LiquidityStrategy;

public class LiquidityEngine {

    private LiquidityStrategy strategy;

    public LiquidityEngine(LiquidityStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(LiquidityStrategy strategy) {
        this.strategy = strategy;
    }

    public LiquidityResult calculate(LiquidityRequest request) {
        return strategy.calculate(request.customerId());
    }
}
