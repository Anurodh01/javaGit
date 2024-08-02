package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class BankAccountAssumptionsTest {
    private BankAccount account;
    @BeforeEach
    public void init(){
        account = new BankAccount(500, 0);
    }

    @Test
    public void testWithDraw(){
        assumingThat(account != null, ()-> assertEquals(200, account.withdrawMoney(300)));
    }
}
