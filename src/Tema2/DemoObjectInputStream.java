package Tema2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DemoObjectInputStream {
    public static void main(String[] args) {
        Book b1=null;
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Kevin\\Downloads\\dataBook.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            b1 = (Book) ois.readObject();
            System.out.println(b1.author);
            System.out.println(b1.title);
            ois.close();
            fis.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
