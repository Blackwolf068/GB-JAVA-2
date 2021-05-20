package Lesson2;

public class HomeWork2 {

    public static int sumArray (String[][] strArr) throws MySizeArrayException, MyArrayDataException {
        int sum = 0;
        int elem;
        if (!(strArr.length == 4 && strArr[0].length == 4)) {
            throw new MySizeArrayException("Вы передали массив размера не 4 х 4");
        }
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[1].length; j++) {
                try {
                    elem = Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке [" + i + "] [" + j + "] не числовое значение");
                }
                sum += elem;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[][] arr = new String[][] {{"1", "2", "3", "0"}, {"4", "5", "6", "0"}, {"7", "8", "9", "0"}, {"0", "0", "0", "5"}};
        try {
            System.out.println(sumArray(arr));
        } catch (MySizeArrayException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
