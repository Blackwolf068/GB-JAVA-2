package Lesson1;

public class HomeWork1 {

    public static void main(String[] args) {
        Human H1 = new Human("Иван",250, 80);

        Cat C1 = new Cat("Барсик", 30, 150);

        Robot R1 = new Robot("Борис", 1000, 30);

        Participant[] arrPar = new Participant[] {H1, C1, R1}; // массив участников

        Track T1 = new Track(300);

        Wall W1 = new Wall(50);

        Track T2 = new Track(100);

        Wall W2 = new Wall(120);


        Obstacle[] arrObs = new Obstacle[] {T1, W1, W2, T2}; // массив препятствий

        for (int i = 0; i < arrPar.length; i++) {
            for (int j = 0; j < arrObs.length; j++) {
                if (arrObs[j] instanceof Track) {
                    if (arrObs[j].getSize() <= arrPar[i].getRun()) {
                        System.out.printf("%s %s успешно пробежал %d метров беговой дорожки\n", arrPar[i].getType(), arrPar[i].getName(), arrObs[j].getSize());
                    } else {
                        System.out.printf("%s %s не смог пробежать %d метров беговой дорожки\n", arrPar[i].getType(), arrPar[i].getName(), arrObs[j].getSize());
                    }
                } else {
                    if (arrObs[j].getSize() <= arrPar[i].getJump()) {
                        System.out.printf("%s %s успешно перепрыгнул стену %d сантиметров\n", arrPar[i].getType(), arrPar[i].getName(), arrObs[j].getSize());
                    } else {
                        System.out.printf("%s %s не смог перепрыгнуть стену %d сантиметров\n", arrPar[i].getType(), arrPar[i].getName(), arrObs[j].getSize());
                    }
                }
            }
        }

    }
}
