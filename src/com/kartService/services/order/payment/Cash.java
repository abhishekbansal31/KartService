package com.kartService.services.order.payment;

import com.kartService.data.kart.KartCommercial;

public class Cash implements PaymentServiceInterface {

    @Override
    public boolean checkout(KartCommercial kart, float amount) {
        // TODO Auto-generated method stub
        return true;
    }
    
}
