package Basics;

import java.util.Base64;

public class EncodeAndDecode {
    public static void main(String[] args) {
        String encodedString = "QUNBREFMMDkgLSBEZWxpdmVyeSBjb250cm9sbGVyLlRyYWNraW5nX2ludmlzaWJsZVI";
        // Decode the string
        String decodedString = new String(Base64.getDecoder().decode(encodedString));
        // Print the decoded value
        System.out.println("Decoded String: " + decodedString);

    }
}
