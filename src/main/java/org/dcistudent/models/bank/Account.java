package org.dcistudent.models.bank;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Account {
    protected String owner;
    protected double balance;

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount The amount to withdraw.
     * @return True if the withdrawal was successful, false otherwise.
     */
    public Boolean withdraw(@NonNull double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;

        return true;
    }

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount The amount to deposit.
     * @return True if the deposit was successful, false otherwise.
     */
    public Boolean deposit(@NonNull double amount) {
        balance += amount;

        return true;
    }
}
