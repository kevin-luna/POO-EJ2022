package Tema2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoBufferedReader3 {
    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        try{
            int r = Integer.parseInt(bfr.readLine());
            bfr.read();
            for (int i=0;i<r;i++){
                System.out.println(bfr.readLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
