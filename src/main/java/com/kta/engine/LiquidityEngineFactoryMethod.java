package com.kta.engine;

import com.kta.factory.LiquidityStrategyFactoryWithFactoryMethod;
import com.kta.model.LiquidityRequest;
import com.kta.model.LiquidityResult;
import com.kta.strategy.LiquidityStrategy;

public class LiquidityEngineFactoryMethod {
    private final LiquidityStrategy liquidityStrategy;

    public LiquidityEngineFactoryMethod(LiquidityStrategyFactoryWithFactoryMethod liquidityStrategyFactory) {
        this.liquidityStrategy = liquidityStrategyFactory.createLiquidityStrategy();
    }

    public LiquidityResult calculate(LiquidityRequest request) {
        return liquidityStrategy.calculate(request.customerId());
    }
}
