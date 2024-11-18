package org.dcistudent.models.wildness;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.dcistudent.models.interfaces.wildness.AnimalInterface;

@Getter @Setter
public class Animal implements AnimalInterface {
    private String name;
    private int age;

    /**
     * Constructs a new Animal object with the specified name and age.
     *
     * @param name The name of the animal.
     * @param age The age of the animal.
     */
    public Animal(@NotBlank String name, @NotNull int age) {
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
