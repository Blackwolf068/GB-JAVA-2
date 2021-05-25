package Lesson3;

import java.util.ArrayList;

public class FruitBox <T extends Fruit>{

    ArrayList<T> fruits = new ArrayList<>();

    public void addFruit (T fruit, int n) {
        for (int i = 0; i < n; i++) {
            this.fruits.add(fruit);
        }
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        } else {
            return fruits.size() * fruits.get(0).getWeight();
        }
    }

    public boolean compare(FruitBox<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void addBox (FruitBox<T> another){
        if (! this.equals(another)) {
            this.addFruit(this.fruits.get(0), another.fruits.size());
            another.fruits.clear();
        } else {
            System.out.println("Нельзя пересыпать коробку саму в себя");
        }
    }
}
