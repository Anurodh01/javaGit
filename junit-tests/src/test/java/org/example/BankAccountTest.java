package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Bank Account Class")
public class BankAccountTest {
    private BankAccount account;
    @BeforeEach
    public void init(){
        account = new BankAccount(500,-1000);
    }
    @Test
    @DisplayName("200 WithDraw Successfully!")
    public void testWithDrawMoney(){
        assertEquals(300, account.withdrawMoney(200));
    }
    @Test
    @DisplayName("300 Deposit Successfully!")
    public void testDepositMoney() throws InterruptedException {
        assertEquals(800, account.depositMoney(300));
    }
    @Test
    @DisplayName("Test for NonNull values")
    public void testNotNullFields(){
        account.setHolderName("Anurodh");
        assertNotNull(account.getHolderName());
    }

    @Test
    @DisplayName("Speed test for deposit method")
    public void testDepositSpeed(){
        assertTimeout(Duration.ofMillis(3),()-> account.depositMoney(200));
    }

    @Test
    public void testDoubleValues(){
        assertEquals(0.33, (double)1/3, 0.005);
    }
}
