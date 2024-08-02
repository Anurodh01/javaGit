package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParameterizedTestTest {
    @ParameterizedTest
    @ValueSource(ints = {100,200,300,400})
    public void testDesposit(int amount, BankAccount bankAccount){
        bankAccount.setBalance(amount);
        assertEquals(amount, bankAccount.getBalance());
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"TUESDAY","THURSDAY"})
    public void testWeeksDayStartWithT(DayOfWeek day){
        assertTrue(day.toString().startsWith("T"));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,Anurodh,Singh,Engineer","2,Aviral,Singh,Collector","3,Ajeet,Singh,Teacher"}, delimiter = ',')
    public void testFromCSVFile(int id, String firstName, String lastName, String profession, BankAccount bankAccount){
        bankAccount.setHolderName(firstName);
        assertEquals(firstName, bankAccount.getHolderName());
    }
    @ParameterizedTest
    @CsvFileSource(resources = "")
    public void testFromCSVFilesource(int id, String firstName, String lastName, String profession, BankAccount bankAccount){
        bankAccount.setHolderName(firstName);
        assertEquals(firstName, bankAccount.getHolderName());
    }
}
