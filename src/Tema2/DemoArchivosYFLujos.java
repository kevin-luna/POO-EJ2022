package Tema2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DemoArchivosYFLujos {
    public static void main(String[] args) {
        try{
            File a1 = new File("C:\\Users\\Kevin\\Documents\\a1.txt");
            File a2 = new File("C:\\Users\\Kevin\\Documents\\a2.txt");

            FileReader fr = new FileReader(a1);
            FileWriter fw = new FileWriter(a2);

            int c;
            while((c=fr.read())!=-1){
                fw.write(c);
            }
            fw.close();
        }catch (Exception e){
            System.out.println("Ocurrio un error.");
        }
    }
}
