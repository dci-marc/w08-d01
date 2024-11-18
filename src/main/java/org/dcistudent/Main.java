package org.dcistudent;

import org.dcistudent.models.bank.Checking;
import org.dcistudent.models.wildness.Dog;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        (new Dog("Fido", 3, "Brown")).speak();

        Checking checking = new Checking();
        checking.setOwner("John Doe");
        checking.setBalance(100.0);

        System.out.println("Balance: " + checking.getBalance());
        try {
            checking.withdraw(225.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: " + checking.getBalance());
        checking.deposit(175.0);
        System.out.println("Balance: " + checking.getBalance());
        checking.withdraw(75.0);
        System.out.println("Balance: " + checking.getBalance());
    }
}