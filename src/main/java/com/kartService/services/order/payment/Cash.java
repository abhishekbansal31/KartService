package com.kartService.services.order.payment;

import com.kartService.data.kart.KartCommercial;

public class Cash implements PaymentServiceInterface {

    private static volatile PaymentServiceInterface instance = null;

    private Cash() {

    }

    public static PaymentServiceInterface getInstance() {
        if(instance==null) {
            synchronized(Cash.class) {
                if(instance == null) {
                    instance = new Cash();
                }
            }
        }
        return instance;
    }
    
    @Override
    public boolean checkout(KartCommercial kart, float amount) {
        // TODO Auto-generated method stub
        return true;
    }
    
}
