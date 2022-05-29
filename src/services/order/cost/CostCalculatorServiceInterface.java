package services.order.cost;
import data.order.OrderInterface;
import services.order.OrderServiceInterface;

public interface CostCalculatorServiceInterface extends OrderServiceInterface {
    public float calculate(OrderInterface order);
}
