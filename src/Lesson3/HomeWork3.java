package Lesson3;

public class HomeWork3 {

    public static void main(String[] args) {

        Apple apple = new Apple(1.0f);
        Orange orange = new Orange(1.5f);
        FruitBox <Apple> aBox1 = new FruitBox<>();
        aBox1.addFruit(apple,6);
        FruitBox <Apple> aBox2 = new FruitBox<>();
        aBox2.addFruit(apple,3);
        FruitBox <Orange> oBox1 = new FruitBox<>();
        oBox1.addFruit(orange, 4);
        System.out.println(aBox1.compare(oBox1));
        aBox1.addBox(aBox2);
        aBox2.addFruit(apple, 5);
        System.out.println(aBox1.getWeight());
        System.out.println(aBox2.getWeight());
    }
}
