package Basics;

import java.util.HashMap;

public class ReturnIndices_SumOfTwoNumbers3 {
    public static void main(String[] args) {

        int a[] = {2, 4, 1, 8, 3, 7, 6};
        int target = 11;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int n = target - a[i];

            if (hashMap.containsKey(n)) {
                System.out.println(hashMap.get(n) + "," + i);
            }

            hashMap.put(a[i], i);
        }
    }
}
