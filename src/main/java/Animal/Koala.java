package Animal;

    public class Koala extends Animal{
        String countryOfLiving;
        public Koala(String name, int weight) {
            super(name, weight);
        }

        @Override
        public String eat() {
             return ("Koala eats eucalyptus");
        }

        @Override
        public void sleep() {

        }

        @Override
        public String makeSound() {

            return "Hm Hm";
        }
    }
