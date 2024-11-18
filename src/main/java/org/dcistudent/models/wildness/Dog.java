package org.dcistudent.models.wildness;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Dog extends Animal {
    private String furColor;

    /**
     * Constructs a new Dog object with the specified name, age, and fur color.
     *
     * @param name The name of the dog.
     * @param age The age of the dog.
     * @param furColor The color of the dog's fur.
     */
    public Dog(String name, int age, String furColor) {
        super(name, age);
        this.setFurColor(furColor);
    }

    /**
     * Makes the dog bark.
     */
    @Override
    public void speak() {
        System.out.println("Bark Bark.");
    }
}
