package Basics;

public class Test1 {

    public static void main(String[] args) {
         int a=1234;
         String s = Integer.toString(a);
        String rev = "";
        int [] arr = new int[s.length()];

        for (int i = 0; i <arr.length ; i++) {

            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));

        }

        System.out.println("Array: " + java.util.Arrays.toString(arr));

        for (int i = arr.length-1; i >=0; i--) {

            rev =rev+arr[i];
        }
        System.out.println("Reversed String: " + rev);

        int result = Integer.parseInt(rev);

        System.out.println(result);




    }


}
