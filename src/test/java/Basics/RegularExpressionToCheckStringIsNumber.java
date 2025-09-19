package Basics;

public class RegularExpressionToCheckStringIsNumber {
    public static void main(String[] args) {

        String regex = "[0-9]+";
        String data ="12321845";

        System.out.println("Is Number :"+ data.matches(regex));

    }
}
