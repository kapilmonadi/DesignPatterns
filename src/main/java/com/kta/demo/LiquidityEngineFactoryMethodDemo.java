package com.kta.demo;

import com.kta.engine.LiquidityEngineFactoryMethod;
import com.kta.factory.LiquidityStrategyFactoryWithFactoryMethod;
import com.kta.factory.impl.CashOnlyStrategyFactory;
import com.kta.factory.impl.CreditOnlyStrategyFactory;
import com.kta.model.LiquidityRequest;

public class LiquidityEngineFactoryMethodDemo {
    static void main() {
        LiquidityRequest liquidityRequest1 = new LiquidityRequest("123", "CASH");
        LiquidityStrategyFactoryWithFactoryMethod liquidityStrategyFactory1 = new CashOnlyStrategyFactory();
        LiquidityEngineFactoryMethod liquidityEngineFactoryMethod1 = new LiquidityEngineFactoryMethod(liquidityStrategyFactory1);

        System.out.println(liquidityEngineFactoryMethod1.calculate(liquidityRequest1));

        LiquidityRequest liquidityRequest2 = new LiquidityRequest("456", "CREDIT");
        LiquidityStrategyFactoryWithFactoryMethod liquidityStrategyFactory2 = new CreditOnlyStrategyFactory();
        LiquidityEngineFactoryMethod liquidityEngineFactoryMethod2 = new LiquidityEngineFactoryMethod(liquidityStrategyFactory2);

        System.out.println(liquidityEngineFactoryMethod2.calculate(liquidityRequest2));
    }
}
