package com.tomekl007.payment.api;

import com.tomekl007.payment.domain.Payment;

public interface PaymentService {
    boolean pay(Payment payment);
}
