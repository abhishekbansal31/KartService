package com.kartService.services.order.payment;

import com.kartService.data.kart.KartCommercial;

public interface PaymentServiceInterface {
    boolean checkout(KartCommercial kart, float amount);
}
