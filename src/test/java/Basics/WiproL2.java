package Basics;

import java.util.Arrays;

public class WiproL2 {
    public static void main(String[] args) {
        int [] a={'c','e','a','d','b'};
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    int temp=  a[i];
                   a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(a));
        char [] charArray= new char[a.length];
        for (int i = 0; i < a.length; i++) {
            char c=(char)a[i];
            charArray[i]=c;
        }

        System.out.println(Arrays.toString(charArray));
    }
}
