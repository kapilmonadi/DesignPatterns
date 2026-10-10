package com.kta.factory.impl;

import com.kta.factory.LiquidityStrategyFactoryWithFactoryMethod;
import com.kta.strategy.LiquidityStrategy;
import com.kta.strategy.impl.CashOnlyStrategy;

public class CashOnlyStrategyFactory extends LiquidityStrategyFactoryWithFactoryMethod {
    @Override
    public LiquidityStrategy createLiquidityStrategy() {
        return new CashOnlyStrategy();
    }
}
