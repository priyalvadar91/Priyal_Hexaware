package Basics;

public class ReverseFirstAndLastDigit {
    public static void main(String[] args) {


        int n = 12345;
        int a=n;
        // 1. Get the last digit
        int last = n % 10;
        System.out.println("last:"+last);
        // 2. Find the "size" of the number (how many zeros it has)
       // int size = (int) Math.pow(10, (int)Math.log10(n));
        int count=1;
        while (a>1){
            a=a/10;
           count=count*10;
        }
        System.out.println(count);

        System.out.println("count:"+count);
        // 3. Get the first digit
        int first = n / count;
        System.out.println("first:"+first);
        // 4. Get the middle part (removes first and last)
        int middle = (n % count) / 10;
            System.out.println("middle:"+middle);
        // 5. Put it back together in reverse order
        int result = (last * count) + (middle * 10) + first;
        System.out.println(result); // 52341



    }

}
