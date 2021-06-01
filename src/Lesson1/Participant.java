package Lesson1;
// Участник
public interface Participant {

    default void canRun(String name, int run) {
        System.out.printf("%s может пробежать %d метров\n", name, run);
    }

    default void canJump(String name, int jump) {
        System.out.printf("%s может подпрыгнуть на %d сантиметров в высоту\n", name, jump);
    }

    default String getName(){
        return null;
    };

    default int getRun() {
        return 0;
    }

    default int getJump() {
        return 0;
    }

    default String getType() {
        return null;
    }
}
