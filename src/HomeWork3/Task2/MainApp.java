package HomeWork3.Task2;
/*Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
Не забываем про метод добавления фрукта в коробку.
*/

public class MainApp {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox1 = new Box <Apple>(apple, 30.0f, 3);
        Box<Orange> orangeBox = new Box<Orange>(orange, 25.0f,4);
        Box<Apple> appleBox2 = new Box <Apple>(apple, 30.0f, 5);

        System.out.println("В яблочной коробке #1 " + appleBox1.getAmount() + " яблок. Вес коробки составляет: " + appleBox1.getBoxWeight());
        System.out.println("В апельсиновой коробке " + orangeBox.getAmount() + " апельсинов. Вес коробки составляет: " + orangeBox.getBoxWeight());
        System.out.println("Равен ли вес коробки с яблоками коробке из апельсинов? -" + appleBox1.compare(orangeBox));

        System.out.println("В яблочной коробке #2 " + appleBox2.getAmount() + " яблок. Вес коробки составляет: " + appleBox2.getBoxWeight());

    }
}
