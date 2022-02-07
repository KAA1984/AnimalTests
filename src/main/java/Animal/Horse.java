package Animal;

public class Horse extends Animal{
    int hooves;
    String mane;
    public Horse(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String  eat() {
      return ("Horse eats grass");
    }

    @Override
    public void sleep() {

    }

    @Override
    public String makeSound() {
        return "Igo - go";
    }
}
