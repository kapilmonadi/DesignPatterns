package com.kta.model;

import java.math.BigDecimal;

public record LiquiditySnapshot(
        BigDecimal cashBalance,
        BigDecimal creditLineBalance,
        BigDecimal overdraftBalance
){};