package Animal;

public class Cat extends Animal{
    String mustache;
    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String eat() {
       return ("Cat eats meat");
    }

    @Override
    public void sleep() {

    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}
