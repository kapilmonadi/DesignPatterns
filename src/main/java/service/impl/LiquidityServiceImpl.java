package service.impl;

import com.kta.factory.LiquidityComponentFactory;
import com.kta.model.LiquidityResult;
import com.kta.strategy.EarmarkingPolicy;
import com.kta.strategy.LiquidityStrategy;
import service.LiquidityService;

import java.math.BigDecimal;

public class LiquidityServiceImpl implements LiquidityService {
    private final LiquidityStrategy liquidityStrategy;
    private final EarmarkingPolicy earmarkingPolicy;

    public LiquidityServiceImpl(LiquidityComponentFactory factory) {
        this.liquidityStrategy = factory.createLiquidityStrategy();
        this.earmarkingPolicy = factory.createEarmarkingPolicy();
    }

    @Override
    public void acquireLiquidity(String customerId, BigDecimal inputAmount) {
        LiquidityResult liquidityResult = liquidityStrategy.calculate(customerId);
        System.out.println(liquidityResult.toString());
        earmarkingPolicy.earmark(inputAmount, liquidityResult.availableAmount());
    }
}
