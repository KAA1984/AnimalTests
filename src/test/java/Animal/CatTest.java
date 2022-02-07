package Animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testEat() {
        Cat cat = new Cat("testCat",5);
        String actualCateat = "Cat eats meat";
        String expectedCateat = cat.eat();
        Assertions.assertEquals(actualCateat,expectedCateat);
    }

    @Test
    void testMakeSound() {
        Cat cat = new Cat("testCat",5);
        String actualCatSound = "Meow Meow";
        String expectedCatSound = cat.makeSound();
        Assertions.assertEquals(actualCatSound,expectedCatSound);
    }
    @Test
    void testCatClass(){
        Cat cat = new Cat("testCat",5);
        String expectedCatName = "Cat";
        String actualCatName= cat.getClass().getSimpleName();
        Assertions.assertEquals(expectedCatName,actualCatName);
    }
}