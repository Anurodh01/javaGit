package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(BankAccountParameterResolver.class)
@Execution(ExecutionMode.CONCURRENT)
public class BankAccountParallelExecutionTest {
    @Test
    @DisplayName("Parallel Test-1")
    public void testDeposit1(BankAccount bankAccount) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        assertEquals(200, bankAccount.depositMoney(200));
    }
    @Test
    @DisplayName("Parallel Test-2")
    public void testDeposit2(BankAccount bankAccount) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        assertEquals(300, bankAccount.depositMoney(300));
    }
    @Test
    @DisplayName("Parallel Test-3")
    public void testDeposit3(BankAccount bankAccount) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        assertEquals(400, bankAccount.depositMoney(400));
    }
    @Test
    @DisplayName("Parallel Test-4")
    public void testDeposit4(BankAccount bankAccount) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        assertEquals(500, bankAccount.depositMoney(500));
    }
}
