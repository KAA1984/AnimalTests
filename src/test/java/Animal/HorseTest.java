package Animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.*;

class HorseTest {

    @Test
    void testEat() {
        Horse horse = new Horse("testHorse", 100);
        String actualEat = "Horse eats grass";
        String expectedEat = horse.eat();
        Assertions.assertEquals(actualEat, expectedEat);
    }
    @Test
    void testHorseClass(){
        Horse horse = new Horse("testHorse", 100);
        String expectedCatName = "Animal.Horse";
        String actualCatName= horse.getClass().getName();
        Assertions.assertEquals(expectedCatName,actualCatName);
    }
  }