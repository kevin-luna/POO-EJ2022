package Tema2;

import java.io.FileInputStream;

public class DemoFileInputStream {
    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Kevin\\Documents\\a1.txt");
            byte buff[] = new byte[20];
            int nb;
            do{
                nb = fis.read(buff);
                System.out.write(buff,0,nb);
            }while (nb == buff.length);
            //System.out.println(nb);
        }catch (Exception e){
            System.out.println("Ocurrió un error.");
        }

    }
}
