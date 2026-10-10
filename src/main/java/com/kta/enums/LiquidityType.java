package com.kta.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum LiquidityType {
    CASH_ONLY("CASH"),
    CREDIT_ONLY("CREDIT"),
    CASH_AND_CREDIT("CASH_CREDIT"),
    CASH_CREDIT_OVERDRAFT("ALL");

    private final String type;

    private static final Map<String, LiquidityType> LIQUIDITY_TYPE_MAP =
            Arrays.stream(values())
                  .collect(Collectors.toMap(LiquidityType::getType, Function.identity()));

    LiquidityType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static LiquidityType fromType(String type) {
        LiquidityType liquidityType = LIQUIDITY_TYPE_MAP.get(type);
        if (liquidityType == null) {
            throw new IllegalArgumentException("Unknown LiquidityType for type: " + type);
        }
        return liquidityType;
    }
}
