package com.kta.factory;

import com.kta.strategy.LiquidityStrategy;

// this can very well be an interface as well,
// using abstract class gives us scope to add some common logic across subclasses
public abstract class LiquidityStrategyFactoryWithFactoryMethod {
    // Factory Method
    public abstract LiquidityStrategy createLiquidityStrategy();
}
