package Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HomeWork5 {

    public static AppData csvToData(File file) {

        List<String[]> dataList = new ArrayList<>();
        int columns = 0;

        String[] headers = new String[0];
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String str = null;
            str = in.readLine();
            String[] tokens = str.split(";");
            columns = tokens.length;
            headers = tokens;
            while ((str = in.readLine()) != null) {
                tokens = str.split(";");
                dataList.add(tokens);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[][] dataArr = new int[dataList.size()][columns];

        for (int i = 0; i < dataList.size(); i++) {
            for (int j = 0; j < columns; j++) {
                dataArr[i][j] = Integer.parseInt(dataList.get(i)[j]);
            }
        }
        return new AppData(headers, dataArr);
    }

    public static File dataToCsv(AppData appData, File file) {
        String[] headers = appData.getHeaders();
        int[][] data = appData.getData();
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))){
            file.createNewFile();
            int i = 0;
            while (i < headers.length - 1) {
                out.write(headers[i] + ";");
                i++;
            }
            out.write(headers[i] + '\n');
            for (int j = 0; j < data.length; j++) {
                for (int k = 0; k < data[i].length - 1; k++) {
                    out.write(data[j][k] + ";");
                }
                out.write(data[j][data[i].length - 1] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static void main(String[] args) {

        File file = new File("data.csv");
        AppData appData = csvToData(file);
        File fileCsv = new File("data1.csv");
        fileCsv = dataToCsv(appData, fileCsv);

    }
}
