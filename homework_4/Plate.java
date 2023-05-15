package homework_2.homework_4;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = Math.max(food, 0);
    }

    public boolean decreaseFood(int amount) {
        if (amount > food) {
            return false;
        }
        this.food -= amount;
        return true;
    }
    public void addFood(int amount){
        food +=amount;
    }

    public int getFood() {
        return food;
    }
}
