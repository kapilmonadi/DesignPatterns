package com.kta.demo;

import com.kta.factory.LiquidityComponentFactory;
import com.kta.factory.impl.CashLiquidityFactory;
import service.LiquidityService;
import service.impl.LiquidityServiceImpl;

import java.math.BigDecimal;

public class AbstractFactoryDemo {
    static void main() {
        LiquidityComponentFactory factory =
                new CashLiquidityFactory();
        LiquidityService service = new LiquidityServiceImpl(factory);
        service.acquireLiquidity("12345", BigDecimal.valueOf(5000));
    }
}
