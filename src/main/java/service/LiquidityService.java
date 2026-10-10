package service;

import java.math.BigDecimal;

public interface LiquidityService {
    void acquireLiquidity(String customerId, BigDecimal inputAmount);
}
