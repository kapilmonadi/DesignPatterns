package com.kta.demo;

import com.kta.engine.BadLiquidityEngine;

public class BadLiquidityEngineWithoutStrategy {
    public static void main(String[] args) {
        BadLiquidityEngine engine = new BadLiquidityEngine();
        System.out.println(engine.calculateLiquidity("CASH"));
    }
}
