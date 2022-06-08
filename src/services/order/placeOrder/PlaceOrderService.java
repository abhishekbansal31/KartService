package services.order.placeOrder;

import data.order.Order;
import data.order.Order.STATUS;
import data.user.distributor.DistributorItemOrder;

public abstract class PlaceOrderService implements PlaceOrderServiceInterface {
    public void placeOrder(DistributorItemOrder distributor, Order order) {
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
