package edu.course.lab02;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {
    @Test
    void shouldCreateAccountWithValidBalance() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
    }
    @Test
    void shouldThrowExceptionForNegativeInitialBalance() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-50);
        });
    }
    @Test
    void shouldDepositSuccessfully() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }
    @Test
    void shouldThrowExceptionForZeroDeposit() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        });
    }
    @Test
    void shouldThrowExceptionForNegativeDeposit() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-20);
        });
    }
    @Test
    void shouldWithdrawSuccessfully() {
        BankAccount account = new BankAccount(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }
    @Test
    void shouldThrowExceptionWhenWithdrawingTooMuch() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(150); 
        });
    }
    @Test
    void shouldThrowExceptionForZeroWithdraw() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(0);
        });
    }
    @Test
    void shouldThrowExceptionForNegativeWithdraw() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-10);
        });
    }
}