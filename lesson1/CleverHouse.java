package lesson1;

public abstract class CleverHouse {
    private boolean functionality;
    private boolean behaviour;
    Person person = new Person("Dave", true);
    Light light = new Light(functionality, behaviour);
    Washmachine washmachine = new Washmachine(functionality, behaviour);
    Alarm alarm = new Alarm(functionality, behaviour);

    abstract boolean turnOff();
    abstract boolean turnOn();

    public boolean isFunctionality() {
        return functionality;
    }

    public boolean isBehaviour() {
        return behaviour;
    }

    public CleverHouse(boolean functionality, boolean behaviour) {
        this.functionality = false;
        this.behaviour = false;
    }
}
