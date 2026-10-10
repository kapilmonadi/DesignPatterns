package com.kta.demo;

import com.kta.engine.LiquidityEngine;
import com.kta.model.LiquidityRequest;
import com.kta.strategy.LiquidityStrategy;
import com.kta.strategy.impl.CashOnlyStrategy;
import com.kta.strategy.impl.CreditOnlyStrategy;

public class LiquidityEngineDemo {
    public static void main(String[] args) {

        LiquidityRequest liquidityRequest = new LiquidityRequest("123", "CASH");
        LiquidityStrategy cashStrategy = new CashOnlyStrategy();

       // LiquidityStrategy creditStrategy = new CreditOnlyStrategy();
        LiquidityEngine liquidityEngine = new LiquidityEngine(cashStrategy);

        System.out.println(liquidityEngine.calculate(liquidityRequest));

        LiquidityRequest liquidityRequestNew = new LiquidityRequest("123", "CREDIT");
        LiquidityStrategy creditStrategy = new CreditOnlyStrategy();
        liquidityEngine.setStrategy(creditStrategy);
        System.out.println(liquidityEngine.calculate(liquidityRequestNew));

    }
}
