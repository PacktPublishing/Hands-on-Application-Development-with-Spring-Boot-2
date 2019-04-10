package com.tomekl007;

import com.tomekl007.payment.api.PaymentService;
import com.tomekl007.payment.domain.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentServiceIntegrationTest {

    @Autowired
    PaymentService paymentService;

    @Test
    public void shouldMakeAPayment() {
        paymentService.pay(new Payment("user_me", "A1", "TO1", 410L));
    }

}
