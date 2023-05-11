package homework_2;

public class Homework2 {
    public static void main(String[] args) {
        Animal [] animals = {new Cat("Murzik"), new Dog("Spayk")};
        for (Animal animal: animals) {
            animal.Run(150);
            animal.Run(600);
            animal.Swim(11);
            animal.Swim(3);
        }
    }

}
