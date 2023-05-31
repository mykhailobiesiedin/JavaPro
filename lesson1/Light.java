package lesson1;

public class Light extends CleverHouse {
    @Override
    boolean turnOff() {
        return isFunctionality();
    }

    @Override
    boolean turnOn() {
        if (person.comes()){
            return true;
        }
        return isFunctionality();
    }

    public Light(boolean functionality, boolean behaviour) {
        super(functionality, behaviour);
    }


}
