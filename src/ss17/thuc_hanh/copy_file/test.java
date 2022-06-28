package ss17.thuc_hanh.copy_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class test {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("src/ss17/thuc_hanh/copy_file/source.csv");
            int i;

            while ((i = is.read())!=-1){
                System.out.println(i+ " " + (char)i);
            }
            is.close();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
