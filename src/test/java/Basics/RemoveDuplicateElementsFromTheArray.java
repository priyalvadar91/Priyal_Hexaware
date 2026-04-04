package Basics;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromTheArray {
    static Set<Integer> arrEle;
    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int []{1,1,2,2,3,4,4,5,6,7,7,8,9,9}));
        System.out.println("Try programiz.p");
    }

    public static Set<Integer> removeDuplicate(int [] a){
        arrEle= new HashSet<>();
        for(int i=0;i<a.length;i++){
            arrEle.add(a[i]);
        }
        return arrEle;

    }
}
