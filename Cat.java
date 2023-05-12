package homework_2;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, 200, 0);
    }

    @Override
    public void  run(int runLimit) {
        if (runLimit > 200) {
            System.out.println("Cat can not run more than " + 200 + " meters");
        } else {
            System.out.println("Cat run : " + runLimit + " meters");
        }
    }

    @Override
    public void swim(int swimLimit) {

        if (swimLimit > 0) {
            System.out.println("Cat can not swim ");
        } else {
            System.out.println("Cat can not swim");;
        }
    }
}
