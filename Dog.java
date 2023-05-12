package homework_2;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 500, 10);
    }
    @Override
    public void run(int runLimit) {
        if (runLimit > 500) {
            System.out.println("Cat can not run more than " + 500 + "meters");
        } else {
            System.out.println("Dog  run : " + runLimit + " meters");
        }
    }

    @Override
    public void swim(int swimLimit) {
        if (swimLimit > 10) {
            System.out.println("Dog can not swim more than " + 10 + " meters");
        } else {
            System.out.println("Dog  swam " + swimLimit + " meters");
        }
    }
}
