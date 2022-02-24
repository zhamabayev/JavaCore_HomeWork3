package HomeWork3.Task2;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    ArrayList<T> fruitList;

    public Box(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public Float getWeight(){
        Float result = 0;
        for(T t: getFruitList()){
            if(t!=null) {
                Float value = t.getFruitWeight();
                result = result + value;
            }
        }
        return result;
    }

    public Boolean compare(Box<T> box){
        if (this.getFruitList().floatValue() == box.getFruitList().floatValue()) return true;
        return false;
    }



    public ArrayList<T> getFruitList() {
        return fruitList;
    }
}
