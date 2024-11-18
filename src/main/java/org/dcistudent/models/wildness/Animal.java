package org.dcistudent.models.wildness;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Animal {
    private String name;
    private int age;

    /**
     * Constructs a new Animal object with the specified name and age.
     *
     * @param name The name of the animal.
     * @param age The age of the animal.
     */
    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    /**
     * Makes the animal bark.
     */
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}