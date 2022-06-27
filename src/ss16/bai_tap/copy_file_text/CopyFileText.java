package ss16.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public List<String> readFile(String filePath){
        List<String> list = new ArrayList<>();

        File file = new File(filePath);
        FileReader fileReader;
        BufferedReader br;
        String line;
        String[] array;
        int sum= 0;
        try {
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            while ((line = br.readLine())!=null){
                array = line.split("");
                sum += array.length;
                list.add(line);
            }
            br.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Number of character in file: "+ sum);
        return list;
    }

    public void writeFile(List<String> list, String filePath, boolean append){
        File file = new File(filePath);
        FileWriter fileWriter;
        BufferedWriter bw;
        try {
            fileWriter = new FileWriter(file, append);
            bw = new BufferedWriter(fileWriter);
            for (String s: list){
                bw.write(s);
                bw.newLine();
            }
            bw.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> list = copyFileText.readFile("src/ss16/bai_tap/copy_file_text/source.txt");
        copyFileText.writeFile(list, "src/ss16/bai_tap/copy_file_text/target.txt", true);
    }
}
