package homework_2;

public abstract class Animal {
    protected int runLimit;
    protected int swimLimit;
    protected String name;

    public Animal(String name, int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.name = name;
    }

 public abstract void run(int distance);

 public abstract void swim(int distance);
}

