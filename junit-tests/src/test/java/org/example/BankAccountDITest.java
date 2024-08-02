package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {
    @Test
    @DisplayName("BankAccount Obj is getting instantiated through DI")
    public void testDeposit(BankAccount bankAccount) throws InterruptedException {
        assertEquals(500, bankAccount.depositMoney(500));
    }
}
