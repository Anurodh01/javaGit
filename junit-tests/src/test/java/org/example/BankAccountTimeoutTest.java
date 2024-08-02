package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountTimeoutTest {
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    @Test
    public void testDepositTimeoutTest(BankAccount bankAccount) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(200);
        assertEquals(200, bankAccount.depositMoney(200));
    }
}
