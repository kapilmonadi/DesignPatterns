package com.kta.factory.impl;

import com.kta.factory.LiquidityComponentFactory;
import com.kta.strategy.EarmarkingPolicy;
import com.kta.strategy.LiquidityStrategy;
import com.kta.strategy.impl.CreditEarmarkingPolicy;
import com.kta.strategy.impl.CreditLiquidityStrategy;

public class CreditLiquidityFactory implements LiquidityComponentFactory {
    @Override
    public LiquidityStrategy createLiquidityStrategy() {
        return new CreditLiquidityStrategy();
    }

    @Override
    public EarmarkingPolicy createEarmarkingPolicy() {
        return new CreditEarmarkingPolicy();
    }
}
