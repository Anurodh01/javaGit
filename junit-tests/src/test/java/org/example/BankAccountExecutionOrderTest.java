package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountExecutionOrderTest {
    static BankAccount bankAccount = new BankAccount(0,0);
    @Test
    @Order(2)
    public void withDraw(){
        assertEquals(200, bankAccount.withdrawMoney(300));
    }
    @Test
    @Order(1)
    public void deposit() throws InterruptedException {
        assertEquals(500, bankAccount.depositMoney(500));
    }
}
