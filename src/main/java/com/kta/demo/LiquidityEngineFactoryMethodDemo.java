package com.kta.demo;

import com.kta.engine.LiquidityEngine;
import com.kta.factory.LiquidityStrategyFactoryWithFactoryMethod;
import com.kta.factory.impl.CashOnlyStrategyFactory;
import com.kta.factory.impl.CreditOnlyStrategyFactory;
import com.kta.model.LiquidityRequest;
import com.kta.strategy.LiquidityStrategy;

public class LiquidityEngineFactoryMethodDemo {
    static void main() {
        LiquidityRequest liquidityRequest1 = new LiquidityRequest("123", "CASH");
        LiquidityStrategyFactoryWithFactoryMethod liquidityStrategyFactory1 = new CashOnlyStrategyFactory();
        LiquidityStrategy liquidityStrategy1 = liquidityStrategyFactory1.createLiquidityStrategy();
        LiquidityEngine liquidityEngine = new LiquidityEngine(liquidityStrategy1);

        System.out.println(liquidityEngine.calculate(liquidityRequest1));

        LiquidityRequest liquidityRequest2 = new LiquidityRequest("456", "CREDIT");
        LiquidityStrategyFactoryWithFactoryMethod liquidityStrategyFactory2 = new CreditOnlyStrategyFactory();
        LiquidityStrategy liquidityStrategy2 = liquidityStrategyFactory2.createLiquidityStrategy();
        liquidityEngine.setStrategy(liquidityStrategy2);

        System.out.println(liquidityEngine.calculate(liquidityRequest2));
    }
}
