package lesson1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CleverHouseImplementations {
    public static void main(String[] args) {

        Person person = new Person("Michael", true);
        Light light = new Light(false, false);
        Washmachine washmachine = new Washmachine(false, false);
        Alarm alarm = new Alarm(false, false);

        List<Object> objectList = new ArrayList<>();
        objectList.add(person);
        objectList.add(light);
        objectList.add(washmachine);
        objectList.add(alarm);






    }
}