package com.kta.factory.impl;

import com.kta.factory.LiquidityStrategyFactoryWithFactoryMethod;
import com.kta.strategy.LiquidityStrategy;
import com.kta.strategy.impl.CreditLiquidityStrategy;

public class CreditOnlyStrategyFactory extends LiquidityStrategyFactoryWithFactoryMethod {
    @Override
    public LiquidityStrategy createLiquidityStrategy() {
        return new CreditLiquidityStrategy();
    }
}
