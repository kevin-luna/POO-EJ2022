package Tema2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoBufferedReader2 {
    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        try{
            String d[]=bfr.readLine().split(" ");
            bfr.read();
            int rows = Integer.parseInt(d[0]),col= Integer.parseInt(d[1]);
            String values[][]=new String[rows][col];
            for (int i=0;i<rows;i++){
                values[i]=bfr.readLine().split(" ");
                System.out.println(values[i][0]+" "+values[i][1]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
