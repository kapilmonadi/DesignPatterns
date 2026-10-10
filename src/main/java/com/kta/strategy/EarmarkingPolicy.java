package com.kta.strategy;

import java.math.BigDecimal;

public interface EarmarkingPolicy {
    BigDecimal earmark(BigDecimal amountToEarmark, BigDecimal availableLiquidity);
}
