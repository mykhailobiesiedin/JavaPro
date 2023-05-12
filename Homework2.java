package homework_2;

/**
*Java Homework #3
* @author Mykhailo Biesiedin
* @version 12 May 2023
*/
public class Homework2 {
    public static void main(String[] args) {
        Animal [] animals = {new Cat("Murzik"), new Dog("Spayk")};
        for (Animal animal: animals) {
            animal.Run(150);
            animal.Run(600);
            animal.Swim(11);
            animal.Swim(3);
        }
        for (int i = 0; i< animals.length; i++){
            if (animals[i].getClass().equals(Dog.class)){
                dogCounter++;
            } else {
                catCounter++;
            }
        }
        System.out.println("Cats : " + catCounter );
        System.out.println("Dogs : " + dogCounter);
        System.out.println("Animals : " + (dogCounter + catCounter));
    }
}
