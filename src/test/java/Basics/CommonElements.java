package Basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b[] ={4,5,6,7,8};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <a.length ; i++) {

            list.add(a[i]);
            list.add(b[i]);
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <list.size() ; i++) {

            if (!set.add(list.get(i))) {

                System.out.print(list.get(i)+" ");
            }

        }

    }

}
