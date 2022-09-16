package com.kartService.services.order.payment.online;

import com.kartService.data.kart.KartCommercial;
import com.kartService.services.order.payment.PaymentServiceInterface;

public class BHIM extends OnlinePayment {

    private static volatile PaymentServiceInterface instance = null;

    private BHIM() {

    }

    public static PaymentServiceInterface getInstance() {
        if(instance==null) {
            synchronized(BHIM.class) {
                if(instance == null) {
                    instance = new BHIM();
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
