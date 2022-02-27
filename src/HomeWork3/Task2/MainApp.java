package HomeWork3.Task2;

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

        System.out.println(" ");
        System.out.println("Пересыпка яблок из коробки 2 в коробку 1:");
        appleBox1.emptyBox(appleBox2);
        System.out.println("В коробке 1 стало " + appleBox1.getAmount() + ", вес коробки составил : " + appleBox1.getBoxWeight());
        System.out.println("В коробке 2 стало " + appleBox2.getAmount() + ", вес коробки составил : " + appleBox2.getBoxWeight());

        System.out.println("Пересыпка яблок из коробки 1 в коробку c апельсинами: ");
        appleBox1.emptyBox(orangeBox);

    }
}
