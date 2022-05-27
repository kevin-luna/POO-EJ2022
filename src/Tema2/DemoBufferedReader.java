package Tema2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoBufferedReader {
    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        try{
            n = Integer.parseInt(bfr.readLine());
            System.out.println(n);
            String input = bfr.readLine();
            String []values = new String[n];
            values= input.split(" ");
            for (String e:
                 values) {
                System.out.println(e);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
