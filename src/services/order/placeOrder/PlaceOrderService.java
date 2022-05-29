package services.order.placeOrder;

import data.distributor.DistributorItemOrderInterface;
import data.order.OrderInterface;
import data.order.Order.STATUS;

public abstract class PlaceOrderService implements PlaceOrderServiceInterface {
    public void placeOrder(DistributorItemOrderInterface distributor, OrderInterface order) {
        try {
            if(distributor!=null && order!=null) {
                if(distributor.getOrders().get(order.getId())==null) {
                    order.updateStatus(STATUS.PLACED);
                    distributor.getOrders().put(order.getId(), order);
                } else {
                    throw new Exception("Order already Placed.");
                }
            } else {
                throw new Exception("Invalid Params.");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
