package com.kartService.services.order.payment.online;

import com.kartService.data.kart.KartCommercial;
import com.kartService.services.order.payment.PaymentServiceInterface;

public class GPay extends OnlinePayment {

    private static volatile PaymentServiceInterface instance = null;

    private GPay() {

    }

    public static PaymentServiceInterface getInstance() {
        if(instance==null) {
            synchronized(GPay.class) {
                if(instance == null) {
                    instance = new GPay();
                }
            }
        }
        return instance;
    }
    
    @Override
    public boolean checkout(KartCommercial kart, float amount) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
