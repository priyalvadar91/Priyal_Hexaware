package Basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class NumbersAndSum1 {
    public static void main(String[] args) {
        int a[]={2,9,5,6,2,1};
        int target=11;
        Set<Integer> seen = new LinkedHashSet<>();
        for (int num : a) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println(num + " " + complement);
            }
            seen.add(num);
        }
    }
}
