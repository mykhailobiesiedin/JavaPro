package homework_2;

public class Animal {
    protected int runLimit;
    protected int swimLimit;
    protected String name;



    public Animal(String name, int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.name = name;
    }

public void Run(int distance) {
    if (distance <= runLimit) {
        System.out.println( name + " run " + distance + " meters.");
    } else {
        System.out.println(name + " can not run " + distance + " meters.");
    }
}

    public void Swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " swam " + distance + " meters.");
        } else {
            System.out.println(name + " can not swim " + distance + " meters.");
        }
    }
}

