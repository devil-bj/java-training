package Day6.Polymorphism;

import java.util.logging.Logger;
// Polymorphism is the greek word poly and morphism.(Poly = many, Morphism = forms)
// In this example we create a same method but gives different output.

public class Polymorphism {
    public static void main(String []args){
        Animal animal  = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal human =new Human();
        Animal crow = new Crow();
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
        human.makeSound();
        crow.makeSound();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal{  // makeSound is a method which is same in all classes.
    // when it gets called different output will be initiated.
    public void makeSound(){
        Logger.getGlobal().info("Sound is Meow");
    }

}
class Dog extends Animal{
   public void makeSound(){
        Logger.getGlobal().info("Sound is Bhau Bhau");
    }
}
class Human extends Animal{
   public void makeSound(){
        Logger.getGlobal().info("Can Speak");
    }
}
class Crow extends Animal{
   public void makeSound(){
        Logger.getGlobal().info("Sound is Craw Craw");
    }
}