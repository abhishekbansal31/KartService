package com.kartService.services.order.payment.card;

import com.kartService.data.kart.KartCommercial;
import com.kartService.services.order.payment.PaymentServiceInterface;

public class CreditCard extends Card {

    private static volatile PaymentServiceInterface instance = null;

    private CreditCard() {

    }

    public static PaymentServiceInterface getInstance() {
        if(instance==null) {
            synchronized(CreditCard.class) {
                if(instance == null) {
                    instance = new CreditCard();
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
