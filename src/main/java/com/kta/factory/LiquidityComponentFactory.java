package com.kta.factory;

import com.kta.strategy.EarmarkingPolicy;
import com.kta.strategy.LiquidityStrategy;

public interface LiquidityComponentFactory {
    LiquidityStrategy createLiquidityStrategy();
    EarmarkingPolicy createEarmarkingPolicy();
}
