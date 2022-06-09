package com.kartService.services.order.cost;
import com.kartService.data.order.Order;
import com.kartService.services.order.OrderServiceInterface;

public interface CostCalculatorServiceInterface extends OrderServiceInterface {
    public float calculate(Order order);
}
