package com.kta.model;

import java.math.BigDecimal;

public record LiquidityResult(
        BigDecimal availableAmount,
        String calculationType
) {}
