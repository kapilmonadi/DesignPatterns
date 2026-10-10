package com.kta.factory;

import com.kta.enums.LiquidityType;
import com.kta.strategy.LiquidityStrategy;
import com.kta.strategy.impl.CashAndCreditStrategy;
import com.kta.strategy.impl.CashOnlyStrategy;
import com.kta.strategy.impl.CreditOnlyStrategy;
import com.kta.strategy.impl.FullLiquidityStrategy;

import java.util.EnumMap;
import java.util.Map;

public class LiquidityStrategyFactory {

    private static final Map<LiquidityType, LiquidityStrategy>
            strategies = new EnumMap<>(LiquidityType.class);

    // initialize the strategies when the object is getting loaded
    static {
        strategies.put(
                LiquidityType.CASH,
                new CashOnlyStrategy());

        strategies.put(
                LiquidityType.CREDIT,
                new CreditOnlyStrategy());

        strategies.put(
                LiquidityType.CASH_AND_CREDIT,
                new CashAndCreditStrategy());

        strategies.put(
                LiquidityType.CASH_CREDIT_OVERDRAFT,
                new FullLiquidityStrategy());
    }


    /**
     * Simple Factory implementation  with new object every time
     */
    public static LiquidityStrategy getLiquidityStrategy(String type) {
        return switch (type) {
            case "CASH" -> new CashOnlyStrategy();
            case "CREDIT" -> new CreditOnlyStrategy();
            case "CASH_CREDIT" -> new CashAndCreditStrategy();
            case "ALL" -> new FullLiquidityStrategy();
            default -> throw new IllegalArgumentException("Unexpected argument received, no strategy configured for: "+ type);
        };
    }

    /**
     * Simple Factory implementation  with the same object everytime
     */
    public static LiquidityStrategy getLiquidityStrategy(LiquidityType type) {
        LiquidityStrategy strategy = strategies.get(type);

        if (strategy == null) {
            throw new IllegalArgumentException(
                    "No strategy configured for: " + type);
        }
        return strategy;
    }
}
