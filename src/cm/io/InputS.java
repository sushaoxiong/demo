package cm.io;

import java.io.*;

public class InputS {
    public static void main(String[] args) {
        /*try {
                InputStream in = new FileInputStream("D:\\环境变量.txt");
                OutputStream out = new FileOutputStream("D:\\aaa.txt");
                byte[] bytes = new byte[100000];
                int n = -1;
                while ((n = in.read(bytes,0,bytes.length)) != -1){
                    String s = new String(bytes,0,n,"GBK");
                    System.out.println(s);
                    out.write(bytes,0,n);
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\环境变量.txt"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\aaa.txt"));
            byte[] bytes = new byte[2048];
            int n = -1;
            while ((n = in.read(bytes,0,bytes.length)) != -1){
                out.write(bytes,0,n);
            }

            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
