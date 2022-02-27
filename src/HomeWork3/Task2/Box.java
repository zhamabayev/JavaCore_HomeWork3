package HomeWork3.Task2;

public class Box <T extends Fruit> {
    private T type;
    private float weightLimit;
    private int amount;

    public Box(T type, float weightLimit, int amount) {
        this.type = type;
        this.weightLimit = weightLimit;
        this.amount = amount;
    }

    public T getType() {
        return type;
    }
    public float getWeightLimit() {
        return weightLimit;
    }
    public int getAmount() {
        return amount;
    }

    public float getBoxWeight() {
        float boxWeight = amount * type.getFruitWeight();
        return  boxWeight;
    }

    public void addFruits (int num) {
        this.amount += num;
    }

    public boolean compare (Box box) {
        return (getBoxWeight() == box.getBoxWeight()) ? true : false;
    }
    public void emptyBox (Box box) {
        int movedFruits = box.getAmount();
        if (amount == box.getAmount()) {
            addFruits(movedFruits);
            box.addFruits(-movedFruits);
        } else {
            System.out.println("В коробку нельзя класть фрукты разных видов");
        }
    }

}


