package Day7.Abstraction;

import java.util.logging.Logger;

/* Only difference between Interface and Abstraction is that interface uses implements keyword and abstraction uses extends.
* both they do not have method body
* they need to be inherited by others class to provide their body */

public class InterfaceInJava {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.animalEat();
        horse.animalSounds();
        horse.animalSpeed();

    }
}

interface Animals{ // this is a interface
    void animalSounds();  // interface method does not have a method body.
    void animalEat();  // same
    void animalSpeed();  // same
}

class Horse implements Animals {
    @Override
    public void animalEat() {  // It has a body here in inherited class
        Logger.getGlobal().info("Eats Grass and lots of grams.");
    }

    @Override
    public void animalSounds() { //same
        Logger.getGlobal().info("Make a sound of eeaah eaaah.");

    }

    @Override
    public void animalSpeed() { //same
        Logger.getGlobal().info("It can run 60 km/hr.");

    }
}