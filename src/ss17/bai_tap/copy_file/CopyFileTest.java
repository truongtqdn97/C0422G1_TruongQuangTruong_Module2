package ss17.bai_tap.copy_file;

import java.io.*;

public class CopyFileTest {
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int count = 0;
            int length;
            while ((length = is.read(buffer))>0){
                os.write(buffer, 0, length);
                count+=length;
            }
            System.out.println("number of bytes in file: "+ count);
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {

        File sourceFile = new File("src/ss17/bai_tap/product_manager/product.csv");
        File destFile = new File("src/ss17/bai_tap/copy_file/dest.csv");
        try {
            copyFileUsingStream(sourceFile, destFile);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
