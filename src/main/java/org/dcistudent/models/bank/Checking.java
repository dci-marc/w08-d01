package org.dcistudent.models.bank;

import lombok.NonNull;

public class Checking extends Account{
    private final double overdraftLimit = 75.0;

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount The amount to withdraw.
     * @return True if the withdrawal was successful, false otherwise.
     */
    public Boolean withdraw(@NonNull double amount) {
        if (amount > super.balance + this.overdraftLimit) {
            throw new IllegalArgumentException("Insufficient funds to withdraw $" + amount);
        }
        super.balance -= amount;

        return true;
    }
}
