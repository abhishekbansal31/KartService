package services.order.cost;
import data.order.Order;
import services.order.OrderServiceInterface;

public interface CostCalculatorServiceInterface extends OrderServiceInterface {
    public float calculate(Order order);
}
