package services.order;
import data.order.Order;

public interface CostCalculatorServiceInterface {
    public float calculate(Order order);
}
