package Lesson1;

public class Cat implements Participant{

    private String type;
    private String name;
    private int run;
    private int jump;

    public Cat(String name, int run, int jump) { // бег в метрах, прыжок в сантиметрах
        this.type = "Кот";
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public String getType() {
        return type;
    }
}
