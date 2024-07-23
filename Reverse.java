import java.util.*;
public class Reverse {

    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original string: " + str);
        int length=str.length();
        for(int i=length; i>0 ;i--){
            System.out.print(str.charAt(i-1));
        }
        
}}

