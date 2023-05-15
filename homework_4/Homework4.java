package homework_2.homework_4;

public class Homework4 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Murzik", 10),
                new Cat("Barsik", 7),
                new Cat("Vaska",3 )

        };
        Plate plate = new Plate(19);
        for (Cat cat : cats) {
            if (cat.eat(plate)) {
                System.out.println(cat.name + " has eaten and full now");
            } else {
                System.out.println(cat.name + " has not eaten, because there is not enough food");
            }
        }
        for (Cat cat : cats) {
            System.out.println( cat.name + " " + (cat.isFull() ? "is full" : "hungry"));
        }
    }
}

