package com.kta.demo;

import com.kta.engine.LiquidityEngine;
import com.kta.enums.LiquidityType;
import com.kta.factory.LiquidityStrategyFactory;
import com.kta.model.LiquidityRequest;
import com.kta.strategy.LiquidityStrategy;

public class LiquidityEngineDemo {
    public static void main(String[] args) {

        LiquidityRequest liquidityRequest1 = new LiquidityRequest("123", "CASH");

        String liquidityType1 = liquidityRequest1.liquidityType();
        LiquidityStrategy liquidityStrategy1 = LiquidityStrategyFactory.getLiquidityStrategy(liquidityType1);
        LiquidityEngine liquidityEngine = new LiquidityEngine(liquidityStrategy1);

        System.out.println(liquidityEngine.calculate(liquidityRequest1));

        LiquidityRequest liquidityRequest2 = new LiquidityRequest("123", "CREDIT");
        LiquidityType liquidityType2 = LiquidityType.fromType(liquidityRequest2.liquidityType());
        LiquidityStrategy liquidityStrategy2 = LiquidityStrategyFactory.getLiquidityStrategy(liquidityType2);
        liquidityEngine.setStrategy(liquidityStrategy2);

        System.out.println(liquidityEngine.calculate(liquidityRequest2));
    }
}
