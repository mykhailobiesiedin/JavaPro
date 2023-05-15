package homework_2.homework_4;

public class Cat {
    private int appetite;
    protected String name;
    protected boolean fullness;

    public Cat(String name, int appetite) {
        this.fullness = false;
        this.appetite = appetite;
        this.name = name;

    }

    public boolean eat(Plate plate){
        if (fullness){
            return false;
        } if (plate.decreaseFood(appetite)){
            fullness = true;
            return true;
        }
        return false;
    }
    public boolean isFull(){
        return fullness;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "appetite=" + appetite +
                ", fullness=" + fullness +
                '}';
    }
}
