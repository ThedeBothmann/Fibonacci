package de.meinefirma.meinprojekt;

public class Fibonacci {
    public static void main(String[]args){
        int a = 0;
        int b = 1;
        int c = b;
        for(int i=1;i<=25;i++){
            c = b;
            b=a+b;
            a = c;
            System.out.println(a);
        }
    }
}
