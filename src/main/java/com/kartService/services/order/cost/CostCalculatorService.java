package com.kartService.services.order.cost;

import com.kartService.data.order.Order;

public class CostCalculatorService implements CostCalculatorServiceInterface {

    private static volatile CostCalculatorServiceInterface instance = null;

    private CostCalculatorService() {

    }

    public static CostCalculatorServiceInterface getInstance() {
        if(instance==null) {
            synchronized(CostCalculatorService.class) {
                if(instance == null) {
                    instance = new CostCalculatorService();
                }
            }
        }
        return instance;
    }
    
    @Override
    public float calculate(Order order) {
        return 0;
    }
    
}
