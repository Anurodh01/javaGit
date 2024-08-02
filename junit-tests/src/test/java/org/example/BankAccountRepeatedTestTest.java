package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatedTestTest {
    @RepeatedTest(5)
    @DisplayName("Repeated Test for BankAccount Deposit!")
    public void testDeposit(BankAccount bankAccount) throws InterruptedException {
        assertEquals(500, bankAccount.depositMoney(500));
    }

    @RepeatedTest(5)
    @DisplayName("Repeated Test for BankAccount Deposit with Repitition Info!")
    public void testDepositRepetitionInfo(BankAccount bankAccount, RepetitionInfo info) throws InterruptedException {
        assertEquals(500, bankAccount.depositMoney(500));
        System.out.println("Nr: "+ info.getCurrentRepetition());
    }

}
