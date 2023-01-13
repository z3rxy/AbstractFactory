
public class Main {
    interface Animal {
        void speak();
    }

    static class Dog implements Animal {
        public void speak() {
            System.out.println("Гав");
        }
    }

    static class Cat implements Animal {
        public void speak() {
            System.out.println("Мяу");
        }
    }

    abstract static class AnimalFactory {
        abstract Animal createAnimal();
    }

    static class DogFactory extends AnimalFactory {
        Animal createAnimal() {
            return new Dog();
        }
    }

    static class CatFactory extends AnimalFactory {
        Animal createAnimal() {
            return new Cat();
        }
    }


    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.speak();
    }

}
