package com.kta.factory.impl;

import com.kta.factory.LiquidityComponentFactory;
import com.kta.strategy.EarmarkingPolicy;
import com.kta.strategy.LiquidityStrategy;
import com.kta.strategy.impl.CashEarmarkingPolicy;
import com.kta.strategy.impl.CashLiquidityStrategy;

public class CashLiquidityFactory implements LiquidityComponentFactory {
    @Override
    public LiquidityStrategy createLiquidityStrategy() {
        return new CashLiquidityStrategy();
    }

    @Override
    public EarmarkingPolicy createEarmarkingPolicy() {
        return new CashEarmarkingPolicy();
    }
}
