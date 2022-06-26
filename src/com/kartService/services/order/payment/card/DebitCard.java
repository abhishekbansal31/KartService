package com.kartService.services.order.payment.card;

import com.kartService.data.kart.KartCommercial;
import com.kartService.services.order.payment.PaymentServiceInterface;

public class DebitCard extends Card {

    private static volatile PaymentServiceInterface instance = null;

    private DebitCard() {

    }

    public static PaymentServiceInterface getInstance() {
        if(instance==null) {
            synchronized(DebitCard.class) {
                if(instance == null) {
                    instance = new DebitCard();
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
